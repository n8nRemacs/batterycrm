package org.chromium.net;

import android.content.Context;
import android.util.Log;
import j.k0;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* loaded from: classes7.dex */
public abstract class CronetEngine {
    private static final String TAG = "CronetEngine";

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        protected final ICronetEngineBuilder mBuilderDelegate;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public class a implements Comparator<CronetProvider> {
            @Override // java.util.Comparator
            public final int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
                CronetProvider cronetProvider3 = cronetProvider;
                CronetProvider cronetProvider4 = cronetProvider2;
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider3.getName())) {
                    return 1;
                }
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider4.getName())) {
                    return -1;
                }
                return -Builder.compareVersions(cronetProvider3.getVersion(), cronetProvider4.getVersion());
            }
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        @k0
        public static int compareVersions(String str, String str2) throws NumberFormatException {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] strArrSplit = str.split("\\.");
            String[] strArrSplit2 = str2.split("\\.");
            for (int i12 = 0; i12 < strArrSplit.length && i12 < strArrSplit2.length; i12++) {
                try {
                    int i13 = Integer.parseInt(strArrSplit[i12]);
                    int i14 = Integer.parseInt(strArrSplit2[i12]);
                    if (i13 != i14) {
                        return Integer.signum(i13 - i14);
                    }
                } catch (NumberFormatException e12) {
                    throw new IllegalArgumentException("Unable to convert version segments into integers: " + strArrSplit[i12] + " & " + strArrSplit2[i12], e12);
                }
            }
            return Integer.signum(strArrSplit.length - strArrSplit2.length);
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            CronetProvider cronetProvider = getEnabledCronetProviders(context, new ArrayList(CronetProvider.getAllProviders(context))).get(0);
            if (Log.isLoggable(CronetEngine.TAG, 3)) {
                String unused = CronetEngine.TAG;
                String.format("Using '%s' provider for creating CronetEngine.Builder.", cronetProvider);
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        @k0
        public static List<CronetProvider> getEnabledCronetProviders(Context context, List<CronetProvider> list) {
            if (list.size() == 0) {
                throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            Iterator<CronetProvider> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().isEnabled()) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            Collections.sort(list, new a());
            return list;
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z12, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z12, date);
            return this;
        }

        public Builder addQuicHint(String str, int i12, int i13) {
            this.mBuilderDelegate.addQuicHint(str, i12, i13);
            return this;
        }

        public CronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z12) {
            this.mBuilderDelegate.enableBrotli(z12);
            return this;
        }

        public Builder enableHttp2(boolean z12) {
            this.mBuilderDelegate.enableHttp2(z12);
            return this;
        }

        public Builder enableHttpCache(int i12, long j12) {
            this.mBuilderDelegate.enableHttpCache(i12, j12);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z12) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z12);
            return this;
        }

        public Builder enableQuic(boolean z12) {
            this.mBuilderDelegate.enableQuic(z12);
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        @Deprecated
        public Builder enableSdch(boolean z12) {
            return this;
        }
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract String getVersionString();

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url);

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z12);

    public abstract void stopNetLog();
}
