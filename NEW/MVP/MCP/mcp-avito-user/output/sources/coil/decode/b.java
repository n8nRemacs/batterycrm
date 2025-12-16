package coil.decode;

import coil.decode.h;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.InterfaceC42733c0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okio.AbstractC44815z;
import okio.C44802l;

/* compiled from: BitmapFactoryDecoder.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcoil/decode/b;", "Lcoil/decode/h;", "Lcoil/decode/n;", SearchParamsConverterKt.SOURCE, "Lcoil/request/t;", "options", "<init>", "(Lcoil/decode/n;Lcoil/request/t;)V", "Lkotlinx/coroutines/sync/k;", "parallelismLock", "(Lcoil/decode/n;Lcoil/request/t;Lkotlinx/coroutines/sync/k;)V", "a", "b", "c", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f58277a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final coil.request.t f58278b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.k f58279c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ExifOrientationPolicy f58280d;

    /* compiled from: BitmapFactoryDecoder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/decode/b$a;", "", "<init>", "()V", "", "DEFAULT_MAX_PARALLELISM", "I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/b$b;", "Lokio/z;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.decode.b$b, reason: collision with other inner class name */
    public static final class C2069b extends AbstractC44815z {

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public Exception f58281g;

        @Override // okio.AbstractC44815z, okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) throws Exception {
            try {
                return super.read(c44802l, j12);
            } catch (Exception e12) {
                this.f58281g = e12;
                throw e12;
            }
        }
    }

    static {
        new a(null);
    }

    public b(@Y61.k n nVar, @Y61.k coil.request.t tVar, @Y61.k kotlinx.coroutines.sync.k kVar, @Y61.k ExifOrientationPolicy exifOrientationPolicy) {
        this.f58277a = nVar;
        this.f58278b = tVar;
        this.f58279c = kVar;
        this.f58280d = exifOrientationPolicy;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil.decode.h
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil.decode.c
            if (r0 == 0) goto L13
            r0 = r7
            coil.decode.c r0 = (coil.decode.c) r0
            int r1 = r0.f58288u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58288u = r1
            goto L18
        L13:
            coil.decode.c r0 = new coil.decode.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f58286s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f58288u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f58284q
            kotlinx.coroutines.sync.k r0 = (kotlinx.coroutines.sync.k) r0
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L6e
        L30:
            r7 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            kotlinx.coroutines.sync.k r2 = r0.f58285r
            java.lang.Object r4 = r0.f58284q
            coil.decode.b r4 = (coil.decode.b) r4
            kotlin.C42729a0.b(r7)
            r7 = r2
            goto L58
        L45:
            kotlin.C42729a0.b(r7)
            r0.f58284q = r6
            kotlinx.coroutines.sync.k r7 = r6.f58279c
            r0.f58285r = r7
            r0.f58288u = r4
            java.lang.Object r2 = r7.c(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r4 = r6
        L58:
            coil.decode.d r2 = new coil.decode.d     // Catch: java.lang.Throwable -> L78
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L78
            r0.f58284q = r7     // Catch: java.lang.Throwable -> L78
            r4 = 0
            r0.f58285r = r4     // Catch: java.lang.Throwable -> L78
            r0.f58288u = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = kotlinx.coroutines.K0.a(r2, r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r5 = r0
            r0 = r7
            r7 = r5
        L6e:
            coil.decode.f r7 = (coil.decode.f) r7     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r7
        L74:
            r5 = r0
            r0 = r7
            r7 = r5
            goto L7a
        L78:
            r0 = move-exception
            goto L74
        L7a:
            r0.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/decode/b$c;", "Lcoil/decode/h$a;", "<init>", "()V", "", "maxParallelism", "(I)V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements h.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExifOrientationPolicy f58282a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.sync.l f58283b;

        public c(int i12, @Y61.k ExifOrientationPolicy exifOrientationPolicy) {
            this.f58282a = exifOrientationPolicy;
            int i13 = kotlinx.coroutines.sync.p.f412281a;
            this.f58283b = new kotlinx.coroutines.sync.l(i12);
        }

        @Override // coil.decode.h.a
        @Y61.k
        public final b a(@Y61.k coil.fetch.m mVar, @Y61.k coil.request.t tVar) {
            return new b(mVar.f58410a, tVar, this.f58283b, this.f58282a);
        }

        public final boolean equals(@Y61.l Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return c.class.hashCode();
        }

        public /* synthetic */ c(int i12, ExifOrientationPolicy exifOrientationPolicy, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 4 : i12, (i13 & 2) != 0 ? ExifOrientationPolicy.f58274b : exifOrientationPolicy);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC42733c0
        public c() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC42830m
        public /* synthetic */ c(int i12) {
            this(i12, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ c(int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 4 : i12);
        }
    }

    public b(n nVar, coil.request.t tVar, kotlinx.coroutines.sync.k kVar, ExifOrientationPolicy exifOrientationPolicy, int i12, C42822w c42822w) {
        if ((i12 & 4) != 0) {
            int i13 = kotlinx.coroutines.sync.p.f412281a;
            kVar = new kotlinx.coroutines.sync.l(Integer.MAX_VALUE);
        }
        this(nVar, tVar, kVar, (i12 & 8) != 0 ? ExifOrientationPolicy.f58274b : exifOrientationPolicy);
    }

    @InterfaceC42830m
    public /* synthetic */ b(n nVar, coil.request.t tVar) {
        this(nVar, tVar, null, null, 12, null);
    }

    public b(n nVar, coil.request.t tVar, kotlinx.coroutines.sync.k kVar, int i12, C42822w c42822w) {
        if ((i12 & 4) != 0) {
            int i13 = kotlinx.coroutines.sync.p.f412281a;
            kVar = new kotlinx.coroutines.sync.l(Integer.MAX_VALUE);
        }
        this(nVar, tVar, kVar);
    }

    @InterfaceC42830m
    public /* synthetic */ b(n nVar, coil.request.t tVar, kotlinx.coroutines.sync.k kVar) {
        this(nVar, tVar, kVar, null, 8, null);
    }
}
