package com.avito.android.wallet.pin.impl.settings.mvi.component;

import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsInternalAction;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsState;
import kP0.InterfaceC42615a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nP0.C44316c;

/* compiled from: WalletSecuritySettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsActor$process$3", f = "WalletSecuritySettingsActor.kt", i = {0, 1, 4, 5, 7, 7, 8, 9, 10, 10, 11, 11, 12}, l = {60, 61, 63, 66, 74, 75, 76, 79, 80, 81, 86, 87, 88}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "switch", "switch", "switch", "$this$flow", "switch", "$this$flow", "switch", "switch"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes5.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletSecuritySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C44316c f328801q;

    /* renamed from: r, reason: collision with root package name */
    public int f328802r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f328803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42615a f328804t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f328805u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ WalletSecuritySettingsState f328806v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC42615a interfaceC42615a, a aVar, WalletSecuritySettingsState walletSecuritySettingsState, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f328804t = interfaceC42615a;
        this.f328805u = aVar;
        this.f328806v = walletSecuritySettingsState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f328804t, this.f328805u, this.f328806v, continuation);
        gVar.f328803s = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletSecuritySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.settings.mvi.component.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
