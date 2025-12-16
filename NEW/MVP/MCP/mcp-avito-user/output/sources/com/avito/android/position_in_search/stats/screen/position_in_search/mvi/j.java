package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import androidx.compose.runtime.internal.P;
import c90.InterfaceC26961b;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.AdditionalToast;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PositionInSearchOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lc90/b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements t<PositionInSearchInternalAction, InterfaceC26961b> {

    /* compiled from: PositionInSearchOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f221533a;

        static {
            int[] iArr = new int[AdditionalToast.Type.values().length];
            try {
                iArr[AdditionalToast.Type.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdditionalToast.Type.Default.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f221533a = iArr;
        }
    }

    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC26961b b(PositionInSearchInternalAction positionInSearchInternalAction) {
        InterfaceC26961b c2033b;
        int i12;
        PositionInSearchInternalAction positionInSearchInternalAction2 = positionInSearchInternalAction;
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.Close) {
            return InterfaceC26961b.a.f57697a;
        }
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.PeriodClicked) {
            return InterfaceC26961b.c.f57699a;
        }
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.MainInfo.Content) {
            DeepLink eventDeepLink = ((PositionInSearchInternalAction.MainInfo.Content) positionInSearchInternalAction2).f221501b.getEventDeepLink();
            if (eventDeepLink != null) {
                c2033b = new InterfaceC26961b.C2033b(eventDeepLink);
                return c2033b;
            }
            return null;
        }
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.PeriodInfo.Content) {
            AdditionalToast additionalToast = ((PositionInSearchInternalAction.PeriodInfo.Content) positionInSearchInternalAction2).f221514b.getAdditionalToast();
            AdditionalToast.Type type = additionalToast != null ? additionalToast.getType() : null;
            i12 = type != null ? a.f221533a[type.ordinal()] : -1;
            if (i12 != 1) {
                if (i12 == 2) {
                    c2033b = new InterfaceC26961b.e(additionalToast.getMessage());
                }
                return null;
            }
            c2033b = new InterfaceC26961b.d(additionalToast.getMessage(), additionalToast.getClosable(), additionalToast.getShowRefreshButton());
            return c2033b;
        }
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.NextPageLoaded.Content) {
            AdditionalToast additionalToast2 = ((PositionInSearchInternalAction.NextPageLoaded.Content) positionInSearchInternalAction2).f221507b.getAdditionalToast();
            AdditionalToast.Type type2 = additionalToast2 != null ? additionalToast2.getType() : null;
            i12 = type2 != null ? a.f221533a[type2.ordinal()] : -1;
            if (i12 != 1) {
                if (i12 == 2) {
                    c2033b = new InterfaceC26961b.e(additionalToast2.getMessage());
                }
                return null;
            }
            c2033b = new InterfaceC26961b.d(additionalToast2.getMessage(), additionalToast2.getClosable(), additionalToast2.getShowRefreshButton());
            return c2033b;
        }
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.NextPageLoaded.Error) {
            String message = ((PositionInSearchInternalAction.NextPageLoaded.Error) positionInSearchInternalAction2).f221509b.getMessage();
            if (message == null) {
                message = "";
            }
            c2033b = new InterfaceC26961b.d(message, true, true);
        } else {
            if (!(positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.ShowMessage)) {
                if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.HandleDeeplink) {
                    c2033b = new InterfaceC26961b.C2033b(((PositionInSearchInternalAction.HandleDeeplink) positionInSearchInternalAction2).f221500b);
                }
                return null;
            }
            c2033b = new InterfaceC26961b.e(((PositionInSearchInternalAction.ShowMessage) positionInSearchInternalAction2).f221520b);
        }
        return c2033b;
    }
}
