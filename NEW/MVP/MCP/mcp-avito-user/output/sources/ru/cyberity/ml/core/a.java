package ru.cyberity.ml.core;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import ru.cyberity.log.logger.Logger;

/* compiled from: MlModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/cyberity/ml/core/a;", "", "Ljava/nio/ByteBuffer;", "a", "<init>", "()V", "b", "c", "Lru/cyberity/ml/core/a$a;", "Lru/cyberity/ml/core/a$c;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class a {

    /* compiled from: MlModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/cyberity/ml/core/a$a;", "Lru/cyberity/ml/core/a;", "Landroid/content/Context;", "context", "", "path", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "c", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "Ljava/lang/String;", "e", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.core.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12567a extends a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @k
        private final Context context;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @k
        private final String path;

        public C12567a(@k Context context, @k String str) {
            super(null);
            this.context = context;
            this.path = str;
        }

        @Override // ru.cyberity.ml.core.a
        @k
        public ByteBuffer a() throws IOException {
            Logger.d$default(ru.cyberity.log.a.f436064a, "MlModel", AK.c.s(new StringBuilder("Loading MlModel "), this.path, " from assets"), null, 4, null);
            AssetFileDescriptor assetFileDescriptorOpenFd = this.context.getAssets().openFd(this.path);
            return new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C12567a)) {
                return false;
            }
            C12567a c12567a = (C12567a) other;
            return L.f(this.context, c12567a.context) && L.f(this.path, c12567a.path);
        }

        public int hashCode() {
            return this.path.hashCode() + (this.context.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Assets(context=");
            sb2.append(this.context);
            sb2.append(", path=");
            return C22026a.c(sb2, this.path, ')');
        }
    }

    /* compiled from: MlModel.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lru/cyberity/ml/core/a$c;", "Lru/cyberity/ml/core/a;", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "", ContextActionHandler.Link.URL, "", "allowCache", "<init>", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;Z)V", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "c", "Landroid/content/Context;", "g", "()Landroid/content/Context;", "d", "Lokhttp3/OkHttpClient;", "h", "()Lokhttp3/OkHttpClient;", "e", "Ljava/lang/String;", "i", "f", "Z", "()Z", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c extends a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @k
        private final Context context;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @k
        private final OkHttpClient okHttpClient;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final String url;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean allowCache;

        public c(@k Context context, @k OkHttpClient okHttpClient, @k String str, boolean z12) {
            super(null);
            this.context = context;
            this.okHttpClient = okHttpClient;
            this.url = str;
            this.allowCache = z12;
        }

        @Override // ru.cyberity.ml.core.a
        @k
        public ByteBuffer a() {
            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
            Logger.d$default(aVar, "MlModel", "Loading model " + this.url, null, 4, null);
            Request.Builder builderUrl = new Request.Builder().url(this.url);
            if (!this.allowCache) {
                builderUrl = builderUrl.cacheControl(CacheControl.FORCE_NETWORK);
            }
            Response responseExecute = this.okHttpClient.newCall(builderUrl.build()).execute();
            try {
                if (responseExecute.isSuccessful()) {
                    if (responseExecute.cacheResponse() != null) {
                        Logger.d$default(aVar, "MlModel", "Got MlModel from cache", null, 4, null);
                    } else {
                        Logger.d$default(aVar, "MlModel", "Got MlModel from the server", null, 4, null);
                    }
                    byte[] bArrBytes = responseExecute.body().bytes();
                    ByteBuffer byteBufferPut = ByteBuffer.allocateDirect(bArrBytes.length).put(bArrBytes);
                    kotlin.io.c.a(responseExecute, null);
                    return byteBufferPut;
                }
                Logger.d$default(aVar, "MlModel", "Failed to load model", null, 4, null);
                if (responseExecute.code() == 404) {
                    Logger.d$default(aVar, "MlModel", "Model file NOT found", null, 4, null);
                    throw new ru.cyberity.ml.core.c();
                }
                throw new IOException("Unexpected code " + responseExecute);
            } finally {
            }
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.context, cVar.context) && L.f(this.okHttpClient, cVar.okHttpClient) && L.f(this.url, cVar.url) && this.allowCache == cVar.allowCache;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iD2 = H.d((this.okHttpClient.hashCode() + (this.context.hashCode() * 31)) * 31, 31, this.url);
            boolean z12 = this.allowCache;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            return iD2 + i12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Remote(context=");
            sb2.append(this.context);
            sb2.append(", okHttpClient=");
            sb2.append(this.okHttpClient);
            sb2.append(", url=");
            sb2.append(this.url);
            sb2.append(", allowCache=");
            return r.x(sb2, this.allowCache, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @k
    public abstract ByteBuffer a();

    private a() {
    }
}
