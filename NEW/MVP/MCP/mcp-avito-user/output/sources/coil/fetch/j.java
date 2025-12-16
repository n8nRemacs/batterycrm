package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.disk.a;
import coil.fetch.h;
import coil.request.CachePolicy;
import coil.request.t;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.k0;
import java.io.IOException;
import java.util.Map;
import kotlin.C42833p;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okio.AbstractC44811v;
import okio.S;
import okio.Y;

/* compiled from: HttpUriFetcher.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/fetch/j;", "Lcoil/fetch/h;", "a", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements h {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final CacheControl f58389f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final CacheControl f58390g;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f58391a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f58392b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f58393c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<coil.disk.a> f58394d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58395e;

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcoil/fetch/j$a;", "", "<init>", "()V", "Lokhttp3/CacheControl;", "CACHE_CONTROL_FORCE_NETWORK_NO_CACHE", "Lokhttp3/CacheControl;", "CACHE_CONTROL_NO_NETWORK_NO_CACHE", "", "MIME_TYPE_TEXT_PLAIN", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/fetch/j$b;", "Lcoil/fetch/h$a;", "Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements h.a<Uri> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Object f58396a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42726C<coil.disk.a> f58397b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f58398c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k InterfaceC42726C<? extends Call.Factory> interfaceC42726C, @Y61.k InterfaceC42726C<? extends coil.disk.a> interfaceC42726C2, boolean z12) {
            this.f58396a = interfaceC42726C;
            this.f58397b = interfaceC42726C2;
            this.f58398c = z12;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.C] */
        @Override // coil.fetch.h.a
        public final h a(Object obj, t tVar) {
            Uri uri = (Uri) obj;
            if (L.f(uri.getScheme(), "http") || L.f(uri.getScheme(), Constants.SCHEME)) {
                return new j(uri.toString(), tVar, this.f58396a, this.f58397b, this.f58398c);
            }
            return null;
        }
    }

    /* compiled from: HttpUriFetcher.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {0, 0, 0, 1, 1, 1}, l = {77, 106}, m = "fetch", n = {"this", "snapshot", "cacheStrategy", "this", "snapshot", "response"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public j f58399q;

        /* renamed from: r, reason: collision with root package name */
        public a.c f58400r;

        /* renamed from: s, reason: collision with root package name */
        public Object f58401s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58402t;

        /* renamed from: v, reason: collision with root package name */
        public int f58404v;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f58402t = obj;
            this.f58404v |= BeduinInputModel.MIN_TEXT_VERSION;
            return j.this.b(this);
        }
    }

    static {
        new a(null);
        f58389f = new CacheControl.Builder().noCache().noStore().build();
        f58390g = new CacheControl.Builder().noCache().onlyIfCached().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k String str, @Y61.k t tVar, @Y61.k InterfaceC42726C<? extends Call.Factory> interfaceC42726C, @Y61.k InterfaceC42726C<? extends coil.disk.a> interfaceC42726C2, boolean z12) {
        this.f58391a = str;
        this.f58392b = tVar;
        this.f58393c = interfaceC42726C;
        this.f58394d = interfaceC42726C2;
        this.f58395e = z12;
    }

    @k0
    @Y61.l
    public static String d(@Y61.k String str, @Y61.l MediaType mediaType) {
        String strB;
        String mediaType2 = mediaType != null ? mediaType.getMediaType() : null;
        if ((mediaType2 == null || C43066x.h0(mediaType2, "text/plain", false)) && (strB = coil.util.l.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (mediaType2 != null) {
            return C43066x.p0(mediaType2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(okhttp3.Request r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil.fetch.k
            if (r0 == 0) goto L13
            r0 = r6
            coil.fetch.k r0 = (coil.fetch.k) r0
            int r1 = r0.f58407s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58407s = r1
            goto L18
        L13:
            coil.fetch.k r0 = new coil.fetch.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f58405q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f58407s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L76
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            android.graphics.Bitmap$Config[] r6 = coil.util.l.f58781a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
            java.lang.Object r2 = r4.f58393c
            if (r6 == 0) goto L63
            coil.request.t r6 = r4.f58392b
            coil.request.CachePolicy r6 = r6.f58731o
            boolean r6 = r6.f58618b
            if (r6 != 0) goto L5d
            java.lang.Object r6 = r2.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            okhttp3.Response r5 = r5.execute()
            goto L79
        L5d:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L63:
            java.lang.Object r6 = r2.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            r0.f58407s = r3
            java.lang.Object r6 = coil.util.C27261b.a(r5, r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L79:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto Lb4
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto Lb4
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 == 0) goto L90
            coil.util.l.a(r6)
        L90:
            coil.network.HttpException r6 = new coil.network.HttpException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            int r1 = r5.code()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r5 = r5.message()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.j.a(okhttp3.Request, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e6 A[Catch: Exception -> 0x01e3, TryCatch #4 {Exception -> 0x01e3, blocks: (B:97:0x01df, B:98:0x01e2, B:61:0x0123, B:101:0x01e6, B:102:0x01eb), top: B:112:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:87:0x01a7, B:89:0x01af, B:91:0x01d0, B:93:0x01d5, B:92:0x01d3, B:95:0x01d9, B:96:0x01de, B:63:0x012d, B:66:0x0139, B:68:0x0145, B:70:0x0153, B:74:0x015f, B:76:0x0167, B:78:0x0183, B:80:0x0188, B:79:0x0186, B:82:0x018c), top: B:106:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d9 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:87:0x01a7, B:89:0x01af, B:91:0x01d0, B:93:0x01d5, B:92:0x01d3, B:95:0x01d9, B:96:0x01de, B:63:0x012d, B:66:0x0139, B:68:0x0145, B:70:0x0153, B:74:0x015f, B:76:0x0167, B:78:0x0183, B:80:0x0188, B:79:0x0186, B:82:0x018c), top: B:106:0x012d }] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.C] */
    @Override // coil.fetch.h
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.Continuation<? super coil.fetch.g> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.j.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final AbstractC44811v c() {
        return this.f58394d.getValue().a();
    }

    public final Request e() {
        Request.Builder builderUrl = new Request.Builder().url(this.f58391a);
        t tVar = this.f58392b;
        Request.Builder builderHeaders = builderUrl.headers(tVar.f58726j);
        for (Map.Entry<Class<?>, Object> entry : tVar.f58727k.f58747a.entrySet()) {
            builderHeaders.tag(entry.getKey(), entry.getValue());
        }
        CachePolicy cachePolicy = tVar.f58730n;
        boolean z12 = cachePolicy.f58618b;
        boolean z13 = tVar.f58731o.f58618b;
        if (!z13 && z12) {
            builderHeaders.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!z13 || z12) {
            if (!z13 && !z12) {
                builderHeaders.cacheControl(f58390g);
            }
        } else if (cachePolicy.f58619c) {
            builderHeaders.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            builderHeaders.cacheControl(f58389f);
        }
        return builderHeaders.build();
    }

    public final coil.network.c f(a.c cVar) throws Throwable {
        Throwable th2;
        coil.network.c cVar2;
        try {
            Y y12 = new Y(c().i(cVar.getMetadata()));
            try {
                cVar2 = new coil.network.c(y12);
                try {
                    y12.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    y12.close();
                } catch (Throwable th5) {
                    C42833p.a(th4, th5);
                }
                th2 = th4;
                cVar2 = null;
            }
            if (th2 == null) {
                return cVar2;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final coil.decode.m g(a.c cVar) {
        S data = cVar.getData();
        AbstractC44811v abstractC44811vC = c();
        String str = this.f58392b.f58725i;
        if (str == null) {
            str = this.f58391a;
        }
        return new coil.decode.m(data, abstractC44811vC, str, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (kotlin.jvm.internal.L.f(r6.headers().get("Vary"), "*") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil.disk.a.c h(coil.disk.a.c r4, okhttp3.Request r5, okhttp3.Response r6, coil.network.c r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.j.h(coil.disk.a$c, okhttp3.Request, okhttp3.Response, coil.network.c):coil.disk.a$c");
    }
}
