package com.avito.android.cpx_promo.impl.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.impl.di.a;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import fs.InterfaceC40470a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/n;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements com.avito.android.arch.mvi.b<CpxPromoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f127214a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f127215b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f127216c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo.impl.interactor.a f127217d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f127218e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40470a f127219f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f127220g;

    /* compiled from: CpxPromoBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpx_promo.impl.mvi.CpxPromoBootstrap$produce$1", f = "CpxPromoBootstrap.kt", i = {0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 32, 35, 36, 37, 46, 53, 65}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "cpxPromo", "$this$flow", "cpxPromo", "isAuto", "$this$flow", "cpxPromo", "isAuto", "$this$flow", "cpxPromo", "isAuto", "$this$flow", "isAuto", "isAuto"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "I$0", "I$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public CpxPromo f127221q;

        /* renamed from: r, reason: collision with root package name */
        public int f127222r;

        /* renamed from: s, reason: collision with root package name */
        public int f127223s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f127224t;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = n.this.new a(continuation);
            aVar.f127224t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CpxPromoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ff A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0146 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0157 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r1v18 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.mvi.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public n(@a.InterfaceC3782a @Y61.k String str, @a.c @Y61.k String str2, @Y61.k @a.b String str3, @Y61.k com.avito.android.cpx_promo.impl.interactor.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC40470a interfaceC40470a, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f127214a = str;
        this.f127215b = str2;
        this.f127216c = str3;
        this.f127217d = aVar;
        this.f127218e = r02;
        this.f127219f = interfaceC40470a;
        this.f127220g = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CpxPromoInternalAction> a() {
        return C43175k.I(this.f127218e.a(), C43175k.G(new a(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
