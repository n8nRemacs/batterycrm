package com.avito.android.auto_select.confirmation_dialog.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.AutoSelectContactConfirmation;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectConfirmationBottomSheetInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "DeeplinkClicked", "Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction$ContentLoaded;", "Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction$DeeplinkClicked;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutoSelectConfirmationBottomSheetInternalAction extends n {

    /* compiled from: AutoSelectConfirmationBottomSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction$ContentLoaded;", "Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements AutoSelectConfirmationBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AutoSelectContactConfirmation f95901b;

        public ContentLoaded(@k AutoSelectContactConfirmation autoSelectContactConfirmation) {
            this.f95901b = autoSelectContactConfirmation;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f95901b, ((ContentLoaded) obj).f95901b);
        }

        public final int hashCode() {
            return this.f95901b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(openParams=" + this.f95901b + ')';
        }
    }

    /* compiled from: AutoSelectConfirmationBottomSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction$DeeplinkClicked;", "Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeeplinkClicked implements AutoSelectConfirmationBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f95902b;

        public DeeplinkClicked(@k DeepLink deepLink) {
            this.f95902b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeeplinkClicked) && L.f(this.f95902b, ((DeeplinkClicked) obj).f95902b);
        }

        public final int hashCode() {
            return this.f95902b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("DeeplinkClicked(uri="), this.f95902b, ')');
        }
    }
}
