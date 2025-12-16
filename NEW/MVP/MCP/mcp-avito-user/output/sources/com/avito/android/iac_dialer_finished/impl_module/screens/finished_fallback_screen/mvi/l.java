package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenOneTimeEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacFinishedFallbackScreenOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "a", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements t<IacFinishedFallbackScreenInternalAction, IacFinishedFallbackScreenOneTimeEvent> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AW.b f166616b;

    /* compiled from: IacFinishedFallbackScreenOneTimeEventProducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l(@Y61.k AW.b bVar) {
        this.f166616b = bVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final IacFinishedFallbackScreenOneTimeEvent b(IacFinishedFallbackScreenInternalAction iacFinishedFallbackScreenInternalAction) {
        IacFinishedFallbackScreenOneTimeEvent iacFinishedFallbackScreenOneTimeEvent;
        IacFinishedFallbackScreenOneTimeEvent handleClosingActionInterceptorLink;
        IacFinishedFallbackScreenInternalAction iacFinishedFallbackScreenInternalAction2 = iacFinishedFallbackScreenInternalAction;
        if (iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.OnBootstrap) {
            iacFinishedFallbackScreenOneTimeEvent = IacFinishedFallbackScreenOneTimeEvent.OnBootstrap.INSTANCE;
        } else if (iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.CloseScreen) {
            iacFinishedFallbackScreenOneTimeEvent = IacFinishedFallbackScreenOneTimeEvent.CloseScreenImmediately.INSTANCE;
        } else {
            if (iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.HandleDeeplink) {
                handleClosingActionInterceptorLink = new IacFinishedFallbackScreenOneTimeEvent.HandleDeeplink(((IacFinishedFallbackScreenInternalAction.HandleDeeplink) iacFinishedFallbackScreenInternalAction2).getLink());
            } else if (iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.HandleGsmLink) {
                IacFinishedFallbackScreenInternalAction.HandleGsmLink handleGsmLink = (IacFinishedFallbackScreenInternalAction.HandleGsmLink) iacFinishedFallbackScreenInternalAction2;
                handleClosingActionInterceptorLink = new IacFinishedFallbackScreenOneTimeEvent.HandleGsmLink(handleGsmLink.getLink(), handleGsmLink.getAnalyticsData());
            } else if (iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.HandleClosingActionInterceptorLink) {
                handleClosingActionInterceptorLink = new IacFinishedFallbackScreenOneTimeEvent.HandleClosingActionInterceptorLink(((IacFinishedFallbackScreenInternalAction.HandleClosingActionInterceptorLink) iacFinishedFallbackScreenInternalAction2).getLink());
            } else {
                if (!(iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.OnNeedToEmitClosingAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                iacFinishedFallbackScreenOneTimeEvent = IacFinishedFallbackScreenOneTimeEvent.OnNeedToEmitClosingAction.INSTANCE;
            }
            iacFinishedFallbackScreenOneTimeEvent = handleClosingActionInterceptorLink;
        }
        this.f166616b.c("IacFinishedFallbackScreenOneTimeEventProducer", "one time event posted: " + iacFinishedFallbackScreenOneTimeEvent, null);
        return iacFinishedFallbackScreenOneTimeEvent;
    }
}
