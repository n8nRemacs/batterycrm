package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sc.InterfaceC48155d;

/* compiled from: IacFinishedFallbackScreenActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenState;", "a", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<IacFinishedFallbackScreenAction, IacFinishedFallbackScreenInternalAction, IacFinishedFallbackScreenState> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f166574e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f166575a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AW.b f166576b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48155d f166577c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C29640d f166578d;

    /* compiled from: IacFinishedFallbackScreenActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.a$a, reason: collision with other inner class name */
    public static final class C4950a {
        public /* synthetic */ C4950a(C42822w c42822w) {
            this();
        }

        public C4950a() {
        }
    }

    static {
        new C4950a(null);
    }

    @Inject
    public a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k AW.b bVar, @Y61.k InterfaceC48155d interfaceC48155d, @Y61.k C29640d c29640d) {
        this.f166575a = interfaceC28373a;
        this.f166576b = bVar;
        this.f166577c = interfaceC48155d;
        this.f166578d = c29640d;
    }

    public static final void c(a aVar, IacFinishedFallbackScreenAction iacFinishedFallbackScreenAction, String str) {
        aVar.getClass();
        aVar.f166576b.j("IacFinishedFallbackScreenActor", "Wrong state in reducible " + iacFinishedFallbackScreenAction + ' ' + ": ".concat(str), null);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<IacFinishedFallbackScreenInternalAction> b(IacFinishedFallbackScreenAction iacFinishedFallbackScreenAction, IacFinishedFallbackScreenState iacFinishedFallbackScreenState) {
        C43210w c43210w;
        IacFinishedFallbackScreenAction iacFinishedFallbackScreenAction2 = iacFinishedFallbackScreenAction;
        IacFinishedFallbackScreenState iacFinishedFallbackScreenState2 = iacFinishedFallbackScreenState;
        this.f166576b.c("IacFinishedFallbackScreenActor", "process action->: " + iacFinishedFallbackScreenAction2 + ", OLD_STATE: " + iacFinishedFallbackScreenState2, null);
        if (iacFinishedFallbackScreenAction2.equals(IacFinishedFallbackScreenAction.OnBackOrCloseClicked.INSTANCE)) {
            IacPiiDeepLink closingActionInterceptorLink = iacFinishedFallbackScreenState2.getArgument().getClosingActionInterceptorLink();
            if (closingActionInterceptorLink != null && !iacFinishedFallbackScreenState2.getWasClosingActionIntercepted()) {
                return new C43210w(new IacFinishedFallbackScreenInternalAction.HandleClosingActionInterceptorLink(closingActionInterceptorLink));
            }
            c43210w = new C43210w(IacFinishedFallbackScreenInternalAction.CloseScreen.INSTANCE);
        } else {
            if (iacFinishedFallbackScreenAction2.equals(IacFinishedFallbackScreenAction.OnMessengerClicked.INSTANCE)) {
                return C43175k.G(new c(iacFinishedFallbackScreenState2, this, iacFinishedFallbackScreenAction2, null));
            }
            if (iacFinishedFallbackScreenAction2.equals(IacFinishedFallbackScreenAction.OnRecallByGsmClicked.INSTANCE)) {
                return C43175k.G(new d(iacFinishedFallbackScreenState2, this, iacFinishedFallbackScreenAction2, null));
            }
            if (iacFinishedFallbackScreenAction2.equals(IacFinishedFallbackScreenAction.OnRecallByIacClicked.INSTANCE)) {
                return C43175k.G(new e(iacFinishedFallbackScreenState2, this, null));
            }
            if (iacFinishedFallbackScreenAction2.equals(IacFinishedFallbackScreenAction.OnScreenCreated.INSTANCE)) {
                return C43175k.G(new b(iacFinishedFallbackScreenState2, this, iacFinishedFallbackScreenAction2, null));
            }
            if (!iacFinishedFallbackScreenAction2.equals(IacFinishedFallbackScreenAction.OnResultForClosingActionInterceptorLinkObserved.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(IacFinishedFallbackScreenInternalAction.CloseScreen.INSTANCE);
        }
        return c43210w;
    }
}
