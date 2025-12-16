package com.avito.android.cpx_promo.v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.v2.di.a;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ls.InterfaceC43822a;

/* compiled from: CpxPromoV2Bootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/p;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p implements com.avito.android.arch.mvi.b<CpxPromoV2InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f127748a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f127749b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f127750c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo.v2.domain.a f127751d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f127752e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43822a f127753f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f127754g;

    /* compiled from: CpxPromoV2Bootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Bootstrap$produce$1", f = "CpxPromoV2Bootstrap.kt", i = {0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 7}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 32, 35, 38, 45, 53, 60, 72}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "cpxPromo", "$this$flow", "cpxPromo", "isAuto", "$this$flow", "cpxPromo", "selectedBudget", "isAuto", "$this$flow", "cpxPromo", "isAuto", "$this$flow", "isAuto", "isAuto"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "L$0", "I$0", "I$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public CpxPromoV2 f127755q;

        /* renamed from: r, reason: collision with root package name */
        public CpxPromoV2.Auto.Budget.Value.BudgetId f127756r;

        /* renamed from: s, reason: collision with root package name */
        public int f127757s;

        /* renamed from: t, reason: collision with root package name */
        public int f127758t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f127759u;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = p.this.new a(continuation);
            aVar.f127759u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x010e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0185 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0196 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01aa  */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r1v18 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 482
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.mvi.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public p(@Y61.k @a.InterfaceC3791a String str, @a.c @Y61.k String str2, @a.b @Y61.k String str3, @Y61.k com.avito.android.cpx_promo.v2.domain.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC43822a interfaceC43822a, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f127748a = str;
        this.f127749b = str2;
        this.f127750c = str3;
        this.f127751d = aVar;
        this.f127752e = r02;
        this.f127753f = interfaceC43822a;
        this.f127754g = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CpxPromoV2InternalAction> a() {
        return C43175k.I(this.f127752e.a(), C43175k.G(new a(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
