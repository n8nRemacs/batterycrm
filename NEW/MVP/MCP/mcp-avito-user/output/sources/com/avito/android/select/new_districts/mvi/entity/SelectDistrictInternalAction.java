package com.avito.android.select.new_districts.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.select.new_districts.SelectDistrictParams;
import com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearSelection", "Confirm", "DistrictSelectionChange", "GoBack", "InitScreen", "RegionExpandChange", "RegionSelectionChange", "SearchUpdate", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$ClearSelection;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$Confirm;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$DistrictSelectionChange;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$GoBack;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$InitScreen;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$RegionExpandChange;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$RegionSelectionChange;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$SearchUpdate;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectDistrictInternalAction extends n {

    /* compiled from: SelectDistrictInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$ClearSelection;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearSelection implements SelectDistrictInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearSelection f265805b = new ClearSelection();

        private ClearSelection() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearSelection);
        }

        public final int hashCode() {
            return -2051310846;
        }

        @k
        public final String toString() {
            return "ClearSelection";
        }
    }

    /* compiled from: SelectDistrictInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$Confirm;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Confirm implements SelectDistrictInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f265806b;

        public Confirm(@k ArrayList arrayList) {
            this.f265806b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Confirm) && this.f265806b.equals(((Confirm) obj).f265806b);
        }

        public final int hashCode() {
            return this.f265806b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("Confirm(selected="), this.f265806b, ')');
        }
    }

    /* compiled from: SelectDistrictInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$DistrictSelectionChange;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DistrictSelectionChange implements SelectDistrictInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f265807b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f265808c;

        /* renamed from: d, reason: collision with root package name */
        public final int f265809d;

        public DistrictSelectionChange(int i12, int i13, boolean z12) {
            this.f265807b = i12;
            this.f265808c = z12;
            this.f265809d = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DistrictSelectionChange)) {
                return false;
            }
            DistrictSelectionChange districtSelectionChange = (DistrictSelectionChange) obj;
            return this.f265807b == districtSelectionChange.f265807b && this.f265808c == districtSelectionChange.f265808c && this.f265809d == districtSelectionChange.f265809d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f265809d) + r.i(Integer.hashCode(this.f265807b) * 31, 31, this.f265808c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DistrictSelectionChange(index=");
            sb2.append(this.f265807b);
            sb2.append(", isSelected=");
            sb2.append(this.f265808c);
            sb2.append(", stateIndex=");
            return r.t(sb2, this.f265809d, ')');
        }
    }

    /* compiled from: SelectDistrictInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$GoBack;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GoBack implements SelectDistrictInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GoBack f265810b = new GoBack();

        private GoBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 615816754;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: SelectDistrictInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$InitScreen;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitScreen implements SelectDistrictInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectDistrictParams f265811b;

        public InitScreen(@k SelectDistrictParams selectDistrictParams) {
            this.f265811b = selectDistrictParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitScreen) && L.f(this.f265811b, ((InitScreen) obj).f265811b);
        }

        public final int hashCode() {
            return this.f265811b.hashCode();
        }

        @k
        public final String toString() {
            return "InitScreen(initParams=" + this.f265811b + ')';
        }
    }

    /* compiled from: SelectDistrictInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$RegionExpandChange;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RegionExpandChange implements SelectDistrictInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f265812b;

        public RegionExpandChange(int i12) {
            this.f265812b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegionExpandChange) && this.f265812b == ((RegionExpandChange) obj).f265812b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f265812b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("RegionExpandChange(index="), this.f265812b, ')');
        }
    }

    /* compiled from: SelectDistrictInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$RegionSelectionChange;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RegionSelectionChange implements SelectDistrictInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f265813b;

        /* renamed from: c, reason: collision with root package name */
        public final int f265814c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final CheckBoxExpandableLineState f265815d;

        public RegionSelectionChange(int i12, int i13, @k CheckBoxExpandableLineState checkBoxExpandableLineState) {
            this.f265813b = i12;
            this.f265814c = i13;
            this.f265815d = checkBoxExpandableLineState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegionSelectionChange)) {
                return false;
            }
            RegionSelectionChange regionSelectionChange = (RegionSelectionChange) obj;
            return this.f265813b == regionSelectionChange.f265813b && this.f265814c == regionSelectionChange.f265814c && this.f265815d == regionSelectionChange.f265815d;
        }

        public final int hashCode() {
            return this.f265815d.hashCode() + r.e(this.f265814c, Integer.hashCode(this.f265813b) * 31, 31);
        }

        @k
        public final String toString() {
            return "RegionSelectionChange(index=" + this.f265813b + ", regionStateIndex=" + this.f265814c + ", previousCheckedState=" + this.f265815d + ')';
        }
    }

    /* compiled from: SelectDistrictInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction$SearchUpdate;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchUpdate implements SelectDistrictInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f265816b;

        public SearchUpdate(@k String str) {
            this.f265816b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchUpdate) && L.f(this.f265816b, ((SearchUpdate) obj).f265816b);
        }

        public final int hashCode() {
            return this.f265816b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchUpdate(newQuery="), this.f265816b, ')');
        }
    }
}
