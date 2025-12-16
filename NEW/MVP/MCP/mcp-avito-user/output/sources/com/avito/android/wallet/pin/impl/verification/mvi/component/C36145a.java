package com.avito.android.wallet.pin.impl.verification.mvi.component;

import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationState;
import gj.InterfaceC40691b;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import oP0.C44676a;
import pP0.InterfaceC46989a;
import rP0.C47583b;

/* compiled from: WalletPinVerificationActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/component/a;", "Lcom/avito/android/arch/mvi/a;", "LpP0/a;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationState;", "a", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.component.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36145a implements com.avito.android.arch.mvi.a<InterfaceC46989a, WalletPinVerificationInternalAction, WalletPinVerificationState> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f329133f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f329134a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C44676a f329135b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f329136c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f329137d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f329138e;

    /* compiled from: WalletPinVerificationActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/component/a$a;", "", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.component.a$a, reason: collision with other inner class name */
    public static final class C10224a {
        public /* synthetic */ C10224a(C42822w c42822w) {
            this();
        }

        public C10224a() {
        }
    }

    static {
        new C10224a(null);
    }

    @Inject
    public C36145a(@Y61.k m mVar, @Y61.k C44676a c44676a, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.deep_linking.x xVar) {
        this.f329134a = mVar;
        this.f329135b = c44676a;
        this.f329136c = interfaceC40691b;
        this.f329137d = aVar;
        this.f329138e = xVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new C36147c(new C36146b(kotlinx.coroutines.rx3.y.a(this.f329137d.d9())), null, this)), com.avito.android.arch.mvi.utils.h.e(c43197r1, d.f329153l, new e(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<WalletPinVerificationInternalAction> b(@Y61.k InterfaceC46989a interfaceC46989a, @Y61.k WalletPinVerificationState walletPinVerificationState) {
        CP0.d dVar;
        boolean zEquals = interfaceC46989a.equals(InterfaceC46989a.c.f428523a);
        boolean z12 = walletPinVerificationState.f329299f;
        if (zEquals) {
            return z12 ? C43175k.w() : new C43210w(WalletPinVerificationInternalAction.DeleteLastPinSymbol.f329274b);
        }
        if (interfaceC46989a instanceof InterfaceC46989a.d) {
            return z12 ? C43175k.w() : C43175k.G(new f(walletPinVerificationState, (InterfaceC46989a.d) interfaceC46989a, this, null));
        }
        boolean zEquals2 = interfaceC46989a.equals(InterfaceC46989a.e.f428525a);
        C47583b c47583b = walletPinVerificationState.f329295b;
        if (zEquals2) {
            rP0.f recoverPinButton = c47583b != null ? c47583b.getRecoverPinButton() : null;
            if (recoverPinButton != null && recoverPinButton.c() && recoverPinButton.getDeeplink() != null && !z12) {
                rP0.h events = c47583b.getEvents();
                C44676a.a(this.f329135b, events != null ? events.getDoNotRememberPasscode() : null, Integer.valueOf(walletPinVerificationState.f329301h), null, null, null, 28);
                b.a.a(this.f329137d, recoverPinButton.getDeeplink(), "wallet_pin.verification.recover_pin.request.key", null, 4);
            }
            return C43175k.w();
        }
        boolean zEquals3 = interfaceC46989a.equals(InterfaceC46989a.f.f428526a);
        m mVar = this.f329134a;
        if (zEquals3) {
            mVar.getClass();
            return C43175k.G(new o(mVar, null));
        }
        if (interfaceC46989a.equals(InterfaceC46989a.b.f428522a)) {
            if (z12 || (dVar = walletPinVerificationState.f329302i) == null || c47583b == null) {
                return C43175k.w();
            }
            mVar.getClass();
            return C43175k.G(new s(mVar, dVar, c47583b, walletPinVerificationState.f329301h, null));
        }
        if (!interfaceC46989a.equals(InterfaceC46989a.C12271a.f428521a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<BeduinAction> listF = c47583b != null ? c47583b.f() : null;
        if (listF != null) {
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                this.f329136c.o((BeduinAction) it.next());
            }
        }
        return C43175k.w();
    }
}
