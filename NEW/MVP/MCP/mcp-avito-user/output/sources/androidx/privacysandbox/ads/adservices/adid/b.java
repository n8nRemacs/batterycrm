package androidx.privacysandbox.ads.adservices.adid;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.Y;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdIdManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/b;", "", "<init>", "()V", "a", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: AdIdManager.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/b$a;", "Landroidx/privacysandbox/ads/adservices/adid/b;", "Landroidx/privacysandbox/ads/adservices/adid/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @Y
    public static final class a extends b {

        /* compiled from: AdIdManager.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl", f = "AdIdManager.kt", i = {}, l = {62}, m = "getAdId", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.adid.b$a$a, reason: collision with other inner class name */
        public static final class C1882a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f53503q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f53504r;

            /* renamed from: t, reason: collision with root package name */
            public int f53506t;

            public C1882a(Continuation<? super C1882a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f53504r = obj;
                this.f53506t |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.a(this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @j.InterfaceC42164u
        @Y61.l
        @j.a0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@Y61.k kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.a> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.b.a.C1882a
                if (r0 == 0) goto L13
                r0 = r5
                androidx.privacysandbox.ads.adservices.adid.b$a$a r0 = (androidx.privacysandbox.ads.adservices.adid.b.a.C1882a) r0
                int r1 = r0.f53506t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53506t = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adid.b$a$a r0 = new androidx.privacysandbox.ads.adservices.adid.b$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f53504r
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r0.f53506t
                r2 = 1
                if (r1 == 0) goto L48
                if (r1 != r2) goto L40
                java.lang.Object r0 = r0.f53503q
                androidx.privacysandbox.ads.adservices.adid.b$a r0 = (androidx.privacysandbox.ads.adservices.adid.b.a) r0
                kotlin.C42729a0.b(r5)
                android.adservices.adid.AdId r5 = androidx.credentials.provider.utils.f.b(r5)
                r0.getClass()
                androidx.privacysandbox.ads.adservices.adid.a r0 = new androidx.privacysandbox.ads.adservices.adid.a
                java.lang.String r1 = androidx.credentials.provider.utils.f.r(r5)
                boolean r5 = androidx.credentials.provider.utils.f.w(r5)
                r0.<init>(r1, r5)
                return r0
            L40:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L48:
                kotlin.C42729a0.b(r5)
                r0.f53503q = r4
                r0.f53506t = r2
                kotlinx.coroutines.r r5 = new kotlinx.coroutines.r
                kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
                r5.<init>(r2, r0)
                r5.p()
                androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
                r1 = 1
                r0.<init>(r1)
                androidx.core.os.v.a(r5)
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.b.a.a(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* compiled from: AdIdManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/b$b;", "", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.adid.b$b, reason: collision with other inner class name */
    public static final class C1883b {
        public /* synthetic */ C1883b(C42822w c42822w) {
            this();
        }

        public C1883b() {
        }
    }

    static {
        new C1883b(null);
    }
}
