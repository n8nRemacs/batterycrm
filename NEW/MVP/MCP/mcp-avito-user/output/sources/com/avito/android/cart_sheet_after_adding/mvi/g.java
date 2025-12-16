package com.avito.android.cart_sheet_after_adding.mvi;

import Hr.InterfaceC14024a;
import androidx.compose.runtime.internal.P;
import bn.C25680a;
import cn.C27227f;
import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import com.avito.android.cart_sheet_after_adding.ui.CartSheetAfterAddingArguments;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CartSheetAfterAddingBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements com.avito.android.arch.mvi.b<CartSheetAfterAddingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CartSheetAfterAddingArguments f115386a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f115387b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C25680a f115388c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Object, G0> f115389d;

    /* compiled from: CartSheetAfterAddingBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.mvi.CartSheetAfterAddingBootstrap$produce$1", f = "CartSheetAfterAddingBootstrap.kt", i = {1, 1, 2, 2}, l = {AvailableCode.ERROR_NO_ACTIVITY, 31, 40}, m = "invokeSuspend", n = {"$this$flow", "content", "content", "recommendations"}, s = {"L$0", "L$1", "L$0", "L$2"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSheetAfterAddingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f115390q;

        /* renamed from: r, reason: collision with root package name */
        public C27227f f115391r;

        /* renamed from: s, reason: collision with root package name */
        public int f115392s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f115393t;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f115393t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CartSheetAfterAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00db A[LOOP:0: B:38:0x00d5->B:40:0x00db, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_sheet_after_adding.mvi.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public g(@Y61.k CartSheetAfterAddingArguments cartSheetAfterAddingArguments, @Y61.k InterfaceC14024a interfaceC14024a, @Y61.k C25680a c25680a, @Y61.k Y41.l<Object, G0> lVar) {
        this.f115386a = cartSheetAfterAddingArguments;
        this.f115387b = interfaceC14024a;
        this.f115388c = c25680a;
        this.f115389d = lVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CartSheetAfterAddingInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
