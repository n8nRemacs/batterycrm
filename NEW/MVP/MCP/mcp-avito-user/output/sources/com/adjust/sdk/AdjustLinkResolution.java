package com.adjust.sdk;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class AdjustLinkResolution {
    private static volatile ExecutorService executor = null;
    private static final String[] expectedUrlHostSuffixArray = {"adjust.com", "adj.st", "go.link"};
    private static final int maxRecursions = 10;

    public interface AdjustLinkResolutionCallback {
        void resolvedLinkCallback(Uri uri);
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ URL f58926a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdjustLinkResolutionCallback f58927b;

        public a(URL url, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
            this.f58926a = url;
            this.f58927b = adjustLinkResolutionCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdjustLinkResolution.requestAndResolve(this.f58926a, 0, this.f58927b);
        }
    }

    private AdjustLinkResolution() {
    }

    private static URL convertToHttps(URL url) {
        String externalForm;
        if (url == null || (externalForm = url.toExternalForm()) == null || !externalForm.startsWith("http:")) {
            return url;
        }
        try {
            return new URL("https:" + externalForm.substring(5));
        } catch (MalformedURLException unused) {
            return url;
        }
    }

    private static Uri convertToUri(URL url) {
        if (url == null) {
            return null;
        }
        return Uri.parse(url.toString());
    }

    private static boolean isTerminalUrl(String str) {
        return urlMatchesSuffix(str, expectedUrlHostSuffixArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestAndResolve(URL url, int i12, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        HttpURLConnection httpURLConnection;
        URL urlConvertToHttps = convertToHttps(url);
        URL url2 = null;
        try {
            httpURLConnection = (HttpURLConnection) urlConvertToHttps.openConnection();
        } catch (Throwable unused) {
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.connect();
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField != null) {
                url2 = new URL(headerField);
            }
        } catch (Throwable unused2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            resolveLink(url2, urlConvertToHttps, i12 + 1, adjustLinkResolutionCallback);
        }
        httpURLConnection.disconnect();
        resolveLink(url2, urlConvertToHttps, i12 + 1, adjustLinkResolutionCallback);
    }

    public static void resolveLink(String str, String[] strArr, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        URL url;
        if (adjustLinkResolutionCallback == null) {
            return;
        }
        if (str == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        if (!urlMatchesSuffix(url.getHost(), strArr)) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
            return;
        }
        if (executor == null) {
            synchronized (expectedUrlHostSuffixArray) {
                try {
                    if (executor == null) {
                        executor = Executors.newSingleThreadExecutor();
                    }
                } finally {
                }
            }
        }
        executor.execute(new a(url, adjustLinkResolutionCallback));
    }

    private static boolean urlMatchesSuffix(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static void resolveLink(URL url, URL url2, int i12, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        Uri uriConvertToUri;
        if (url == null) {
            uriConvertToUri = convertToUri(url2);
        } else {
            if (!isTerminalUrl(url.getHost()) && i12 <= 10) {
                requestAndResolve(url, i12, adjustLinkResolutionCallback);
                return;
            }
            uriConvertToUri = convertToUri(url);
        }
        adjustLinkResolutionCallback.resolvedLinkCallback(uriConvertToUri);
    }
}
