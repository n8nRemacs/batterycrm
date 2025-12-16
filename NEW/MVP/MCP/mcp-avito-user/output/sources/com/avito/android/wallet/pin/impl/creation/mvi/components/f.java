package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationState;
import eP0.InterfaceC40037a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletPinCreationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationActor$processPinSymbolEntered$1", f = "WalletPinCreationActor.kt", i = {0, 1, 1, 3, 3}, l = {76, 84, 89, 96, 103, 105}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "pinLength", "$this$flow", "pinLength"}, s = {"L$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPinCreationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f328547q;

    /* renamed from: r, reason: collision with root package name */
    public int f328548r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f328549s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WalletPinCreationState f328550t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40037a.c f328551u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.wallet.pin.impl.creation.mvi.components.a f328552v;

    /* compiled from: WalletPinCreationActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[WalletPinCreationState.InputState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WalletPinCreationState.InputState inputState = WalletPinCreationState.InputState.f328652b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WalletPinCreationState walletPinCreationState, InterfaceC40037a.c cVar, com.avito.android.wallet.pin.impl.creation.mvi.components.a aVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f328550t = walletPinCreationState;
        this.f328551u = cVar;
        this.f328552v = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f328550t, this.f328551u, this.f328552v, continuation);
        fVar.f328549s = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletPinCreationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.creation.mvi.components.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
