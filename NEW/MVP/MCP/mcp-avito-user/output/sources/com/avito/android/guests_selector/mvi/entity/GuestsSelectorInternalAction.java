package com.avito.android.guests_selector.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import com.avito.android.guests_selector.io.Parameter;
import com.avito.android.guests_selector.mvi.entity.state.entity.ActivePageType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseDialog", "Initial", "Navigate", "NewChildCreated", "RemoveChild", "SetResult", "UpdateBooleanValue", "UpdateGuestsCount", "UpdateSelectedChildAge", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$CloseDialog;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Initial;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Navigate;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$NewChildCreated;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$RemoveChild;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$SetResult;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$UpdateBooleanValue;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$UpdateGuestsCount;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$UpdateSelectedChildAge;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GuestsSelectorInternalAction extends n {

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$CloseDialog;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements GuestsSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDialog f161532b = new CloseDialog();

        private CloseDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return -927955354;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Initial;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Initial implements GuestsSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f161533b;

        /* renamed from: c, reason: collision with root package name */
        public final int f161534c;

        /* renamed from: d, reason: collision with root package name */
        public final int f161535d;

        /* renamed from: e, reason: collision with root package name */
        public final int f161536e;

        /* renamed from: f, reason: collision with root package name */
        public final int f161537f;

        /* renamed from: g, reason: collision with root package name */
        public final int f161538g;

        /* renamed from: h, reason: collision with root package name */
        public final int f161539h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f161540i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final ArrayList f161541j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final ArrayList f161542k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f161543l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public final List<Parameter> f161544m;

        public Initial(int i12, int i13, int i14, int i15, int i16, int i17, int i18, @l String str, @k ArrayList arrayList, @k ArrayList arrayList2, boolean z12, @k List list) {
            ActivePageType activePageType = ActivePageType.f161554b;
            this.f161533b = i12;
            this.f161534c = i13;
            this.f161535d = i14;
            this.f161536e = i15;
            this.f161537f = i16;
            this.f161538g = i17;
            this.f161539h = i18;
            this.f161540i = str;
            this.f161541j = arrayList;
            this.f161542k = arrayList2;
            this.f161543l = z12;
            this.f161544m = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Initial)) {
                return false;
            }
            Initial initial = (Initial) obj;
            initial.getClass();
            ActivePageType activePageType = ActivePageType.f161554b;
            return this.f161533b == initial.f161533b && this.f161534c == initial.f161534c && this.f161535d == initial.f161535d && this.f161536e == initial.f161536e && this.f161537f == initial.f161537f && this.f161538g == initial.f161538g && this.f161539h == initial.f161539h && L.f(this.f161540i, initial.f161540i) && this.f161541j.equals(initial.f161541j) && this.f161542k.equals(initial.f161542k) && this.f161543l == initial.f161543l && L.f(this.f161544m, initial.f161544m);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f161539h, r.e(this.f161538g, r.e(this.f161537f, r.e(this.f161536e, r.e(this.f161535d, r.e(this.f161534c, r.e(this.f161533b, ActivePageType.f161554b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
            String str = this.f161540i;
            return this.f161544m.hashCode() + r.i(e.g(this.f161542k, e.g(this.f161541j, (iE2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f161543l);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Initial(activePage=");
            sb2.append(ActivePageType.f161554b);
            sb2.append(", minGuestsCount=");
            sb2.append(this.f161533b);
            sb2.append(", maxGuestsCount=");
            sb2.append(this.f161534c);
            sb2.append(", maxAdultCount=");
            sb2.append(this.f161535d);
            sb2.append(", maxChildrenCount=");
            sb2.append(this.f161536e);
            sb2.append(", minGuestsStepperCount=");
            sb2.append(this.f161537f);
            sb2.append(", maxGuestsStepperCount=");
            sb2.append(this.f161538g);
            sb2.append(", currentGuestsStepperCount=");
            sb2.append(this.f161539h);
            sb2.append(", currentChildAgeIdSelected=");
            sb2.append(this.f161540i);
            sb2.append(", children=");
            sb2.append(this.f161541j);
            sb2.append(", availableAges=");
            sb2.append(this.f161542k);
            sb2.append(", withChildren=");
            sb2.append(this.f161543l);
            sb2.append(", parameters=");
            return H.p(sb2, this.f161544m, ')');
        }
    }

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Navigate;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "ChildAgePicker", "GuestsList", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Navigate$ChildAgePicker;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Navigate$GuestsList;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Navigate extends GuestsSelectorInternalAction {

        /* compiled from: GuestsSelectorInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Navigate$ChildAgePicker;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Navigate;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ChildAgePicker implements Navigate {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ChildAgePicker f161545b = new ChildAgePicker();

            private ChildAgePicker() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ChildAgePicker);
            }

            public final int hashCode() {
                return 210504436;
            }

            @k
            public final String toString() {
                return "ChildAgePicker";
            }
        }

        /* compiled from: GuestsSelectorInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Navigate$GuestsList;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$Navigate;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class GuestsList implements Navigate {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final GuestsList f161546b = new GuestsList();

            private GuestsList() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof GuestsList);
            }

            public final int hashCode() {
                return -606309220;
            }

            @k
            public final String toString() {
                return "GuestsList";
            }
        }
    }

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$NewChildCreated;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewChildCreated implements GuestsSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f161547b;

        public NewChildCreated(@k ArrayList arrayList) {
            ActivePageType activePageType = ActivePageType.f161554b;
            this.f161547b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewChildCreated)) {
                return false;
            }
            NewChildCreated newChildCreated = (NewChildCreated) obj;
            newChildCreated.getClass();
            ActivePageType activePageType = ActivePageType.f161554b;
            return this.f161547b.equals(newChildCreated.f161547b);
        }

        public final int hashCode() {
            return this.f161547b.hashCode() + (ActivePageType.f161554b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NewChildCreated(activePage=");
            sb2.append(ActivePageType.f161554b);
            sb2.append(", children=");
            return e.p(sb2, this.f161547b, ')');
        }
    }

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$RemoveChild;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveChild implements GuestsSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f161548b;

        public RemoveChild(@k ArrayList arrayList) {
            this.f161548b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveChild) && this.f161548b.equals(((RemoveChild) obj).f161548b);
        }

        public final int hashCode() {
            return this.f161548b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("RemoveChild(children="), this.f161548b, ')');
        }
    }

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$SetResult;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetResult implements GuestsSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GuestsSelectorOutput f161549b;

        public SetResult(@k GuestsSelectorOutput guestsSelectorOutput) {
            this.f161549b = guestsSelectorOutput;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetResult) && L.f(this.f161549b, ((SetResult) obj).f161549b);
        }

        public final int hashCode() {
            return this.f161549b.hashCode();
        }

        @k
        public final String toString() {
            return "SetResult(outputParams=" + this.f161549b + ')';
        }
    }

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$UpdateBooleanValue;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateBooleanValue implements GuestsSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f161550b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f161551c;

        public UpdateBooleanValue(@k String str, boolean z12) {
            this.f161550b = str;
            this.f161551c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateBooleanValue)) {
                return false;
            }
            UpdateBooleanValue updateBooleanValue = (UpdateBooleanValue) obj;
            return L.f(this.f161550b, updateBooleanValue.f161550b) && this.f161551c == updateBooleanValue.f161551c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f161551c) + (this.f161550b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateBooleanValue(itemId=");
            sb2.append(this.f161550b);
            sb2.append(", newValue=");
            return r.x(sb2, this.f161551c, ')');
        }
    }

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$UpdateGuestsCount;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateGuestsCount implements GuestsSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f161552b;

        public UpdateGuestsCount(int i12) {
            this.f161552b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateGuestsCount) && this.f161552b == ((UpdateGuestsCount) obj).f161552b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f161552b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateGuestsCount(currentGuestsStepperCount="), this.f161552b, ')');
        }
    }

    /* compiled from: GuestsSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction$UpdateSelectedChildAge;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedChildAge implements GuestsSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f161553b;

        public UpdateSelectedChildAge(@k String str) {
            this.f161553b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedChildAge) && L.f(this.f161553b, ((UpdateSelectedChildAge) obj).f161553b);
        }

        public final int hashCode() {
            return this.f161553b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateSelectedChildAge(currentChildAgeSelectedId="), this.f161553b, ')');
        }
    }
}
