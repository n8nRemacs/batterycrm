package androidx.privacysandbox.ads.adservices.adselection;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.credentials.provider.utils.f;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42164u;
import j.Y;
import j.a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: AdSelectionManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/b;", "", "<init>", "()V", "a", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: AdSelectionManager.kt */
    @s0
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/b$a;", "Landroidx/privacysandbox/ads/adservices/adselection/b;", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/c;", "b", "(Landroidx/privacysandbox/ads/adservices/adselection/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/d;", "reportImpressionRequest", "Lkotlin/G0;", "a", "(Landroidx/privacysandbox/ads/adservices/adselection/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Y
    public static final class a extends b {

        /* compiled from: AdSelectionManager.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl", f = "AdSelectionManager.kt", i = {}, l = {92}, m = "selectAds", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.adselection.b$a$a, reason: collision with other inner class name */
        public static final class C1884a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f53507q;

            /* renamed from: s, reason: collision with root package name */
            public int f53509s;

            public C1884a(Continuation<? super C1884a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f53507q = obj;
                this.f53509s |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.b(null, this);
            }
        }

        @InterfaceC42164u
        @l
        @a0
        public Object a(@k d dVar, @k Continuation<? super G0> continuation) {
            new r(1, IntrinsicsKt.intercepted(continuation)).p();
            f.A();
            dVar.getClass();
            f.t();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @j.InterfaceC42164u
        @Y61.l
        @j.a0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(@Y61.k androidx.privacysandbox.ads.adservices.adselection.a r5, @Y61.k kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.c> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.b.a.C1884a
                if (r0 == 0) goto L13
                r0 = r6
                androidx.privacysandbox.ads.adservices.adselection.b$a$a r0 = (androidx.privacysandbox.ads.adservices.adselection.b.a.C1884a) r0
                int r1 = r0.f53509s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53509s = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adselection.b$a$a r0 = new androidx.privacysandbox.ads.adservices.adselection.b$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f53507q
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r0.f53509s
                r1 = 0
                if (r0 == 0) goto L34
                r5 = 1
                if (r0 != r5) goto L2c
                kotlin.C42729a0.b(r6)
                androidx.credentials.provider.utils.f.c(r6)
                throw r1
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                kotlin.C42729a0.b(r6)
                androidx.credentials.provider.utils.f.t()
                r5.getClass()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.b.a.b(androidx.privacysandbox.ads.adservices.adselection.a, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* compiled from: AdSelectionManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/b$b;", "", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.adselection.b$b, reason: collision with other inner class name */
    public static final class C1885b {
        public /* synthetic */ C1885b(C42822w c42822w) {
            this();
        }

        public C1885b() {
        }
    }

    static {
        new C1885b(null);
    }
}
