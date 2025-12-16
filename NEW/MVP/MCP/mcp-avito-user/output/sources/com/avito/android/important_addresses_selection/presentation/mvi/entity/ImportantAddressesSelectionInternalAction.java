package com.avito.android.important_addresses_selection.presentation.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseWithResult", "CloseWithoutResult", "FollowDeepLink", "InitState", "ShowError", "UpdateAddressCheckedMark", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$CloseWithResult;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$CloseWithoutResult;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$FollowDeepLink;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$InitState;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$ShowError;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$UpdateAddressCheckedMark;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ImportantAddressesSelectionInternalAction extends n {

    /* compiled from: ImportantAddressesSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$CloseWithResult;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithResult implements ImportantAddressesSelectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ImportantAddressesData f169881b;

        public CloseWithResult(@k ImportantAddressesData importantAddressesData) {
            this.f169881b = importantAddressesData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWithResult) && L.f(this.f169881b, ((CloseWithResult) obj).f169881b);
        }

        public final int hashCode() {
            return this.f169881b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(importantAddressesData=" + this.f169881b + ')';
        }
    }

    /* compiled from: ImportantAddressesSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$CloseWithoutResult;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "()V", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseWithoutResult implements ImportantAddressesSelectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseWithoutResult f169882b = new CloseWithoutResult();

        private CloseWithoutResult() {
        }
    }

    /* compiled from: ImportantAddressesSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$FollowDeepLink;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FollowDeepLink implements ImportantAddressesSelectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f169883b;

        public FollowDeepLink(@k DeepLink deepLink) {
            this.f169883b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FollowDeepLink) && L.f(this.f169883b, ((FollowDeepLink) obj).f169883b);
        }

        public final int hashCode() {
            return this.f169883b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FollowDeepLink(deepLink="), this.f169883b, ')');
        }
    }

    /* compiled from: ImportantAddressesSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$InitState;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements ImportantAddressesSelectionInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ImportantAddressesSelectionData f169884b;

        public InitState(@k ImportantAddressesSelectionData importantAddressesSelectionData) {
            this.f169884b = importantAddressesSelectionData;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF107656d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitState) && L.f(this.f169884b, ((InitState) obj).f169884b);
        }

        public final int hashCode() {
            return this.f169884b.hashCode();
        }

        @k
        public final String toString() {
            return "InitState(data=" + this.f169884b + ')';
        }
    }

    /* compiled from: ImportantAddressesSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$ShowError;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ImportantAddressesSelectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f169885b;

        public ShowError(@k PrintableText printableText) {
            this.f169885b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f169885b, ((ShowError) obj).f169885b);
        }

        public final int hashCode() {
            return this.f169885b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowError(message="), this.f169885b, ')');
        }
    }

    /* compiled from: ImportantAddressesSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction$UpdateAddressCheckedMark;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateAddressCheckedMark implements ImportantAddressesSelectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f169886b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f169887c;

        public UpdateAddressCheckedMark(int i12, boolean z12) {
            this.f169886b = i12;
            this.f169887c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateAddressCheckedMark)) {
                return false;
            }
            UpdateAddressCheckedMark updateAddressCheckedMark = (UpdateAddressCheckedMark) obj;
            return this.f169886b == updateAddressCheckedMark.f169886b && this.f169887c == updateAddressCheckedMark.f169887c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f169887c) + (Integer.hashCode(this.f169886b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateAddressCheckedMark(id=");
            sb2.append(this.f169886b);
            sb2.append(", checked=");
            return r.x(sb2, this.f169887c, ')');
        }
    }
}
