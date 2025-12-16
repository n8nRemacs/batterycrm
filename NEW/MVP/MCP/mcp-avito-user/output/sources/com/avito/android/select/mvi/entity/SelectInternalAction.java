package com.avito.android.select.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import Zp0.e;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.bottom_sheet.blueprints.group.a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearSelection", "Error", "GroupExpanded", "GroupItemClicked", "HideKeyboard", "Loading", "QueryChanged", "RemoveChip", "RequestSearchFocus", "Reset", "Submit", "UpdatePaginationItem", "UpdateSelected", "VariantItemClicked", "VariantsLoaded", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$ClearSelection;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$Error;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$GroupExpanded;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$GroupItemClicked;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$HideKeyboard;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$Loading;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$QueryChanged;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$RemoveChip;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$RequestSearchFocus;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$Reset;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$Submit;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$UpdatePaginationItem;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$UpdateSelected;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$VariantItemClicked;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction$VariantsLoaded;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectInternalAction extends n {

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$ClearSelection;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearSelection implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearSelection f265580b = new ClearSelection();

        private ClearSelection() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearSelection);
        }

        public final int hashCode() {
            return -625763832;
        }

        @k
        public final String toString() {
            return "ClearSelection";
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$Error;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements SelectInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f265581b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f265582c;

        public Error(@k Throwable th2) {
            this.f265581b = th2;
            this.f265582c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f265581b, ((Error) obj).f265581b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF211602c() {
            return this.f265582c;
        }

        public final int hashCode() {
            return this.f265581b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f265581b, ')');
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$GroupExpanded;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GroupExpanded implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f265583b;

        public GroupExpanded(@k a aVar) {
            this.f265583b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GroupExpanded) && L.f(this.f265583b, ((GroupExpanded) obj).f265583b);
        }

        public final int hashCode() {
            return this.f265583b.hashCode();
        }

        @k
        public final String toString() {
            return "GroupExpanded(item=" + this.f265583b + ')';
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$GroupItemClicked;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GroupItemClicked implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f265584b;

        public GroupItemClicked(@k a aVar) {
            this.f265584b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GroupItemClicked) && L.f(this.f265584b, ((GroupItemClicked) obj).f265584b);
        }

        public final int hashCode() {
            return this.f265584b.hashCode();
        }

        @k
        public final String toString() {
            return "GroupItemClicked(item=" + this.f265584b + ')';
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$HideKeyboard;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideKeyboard implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideKeyboard f265585b = new HideKeyboard();

        private HideKeyboard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideKeyboard);
        }

        public final int hashCode() {
            return 1314376146;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$Loading;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements SelectInternalAction {
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$QueryChanged;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class QueryChanged implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f265586b;

        public QueryChanged(@k String str) {
            this.f265586b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QueryChanged) && L.f(this.f265586b, ((QueryChanged) obj).f265586b);
        }

        public final int hashCode() {
            return this.f265586b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("QueryChanged(query="), this.f265586b, ')');
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$RemoveChip;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveChip implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ParcelableEntity<String> f265587b;

        public RemoveChip(@k ParcelableEntity<String> parcelableEntity) {
            this.f265587b = parcelableEntity;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveChip) && L.f(this.f265587b, ((RemoveChip) obj).f265587b);
        }

        public final int hashCode() {
            return this.f265587b.hashCode();
        }

        @k
        public final String toString() {
            return "RemoveChip(item=" + this.f265587b + ')';
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$RequestSearchFocus;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestSearchFocus implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestSearchFocus f265588b = new RequestSearchFocus();

        private RequestSearchFocus() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestSearchFocus);
        }

        public final int hashCode() {
            return -1455961654;
        }

        @k
        public final String toString() {
            return "RequestSearchFocus";
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$Reset;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Reset implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f265589b;

        public Reset(@k String str) {
            this.f265589b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Reset) && L.f(this.f265589b, ((Reset) obj).f265589b);
        }

        public final int hashCode() {
            return this.f265589b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Reset(requestId="), this.f265589b, ')');
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$Submit;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Submit implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f265590b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f265591c;

        /* JADX WARN: Multi-variable type inference failed */
        public Submit(@k List<? extends ParcelableEntity<String>> list, @l String str) {
            this.f265590b = list;
            this.f265591c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) obj;
            return L.f(this.f265590b, submit.f265590b) && L.f(this.f265591c, submit.f265591c);
        }

        public final int hashCode() {
            int iHashCode = this.f265590b.hashCode() * 31;
            String str = this.f265591c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Submit(selected=");
            sb2.append(this.f265590b);
            sb2.append(", sectionTitle=");
            return C22026a.c(sb2, this.f265591c, ')');
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$UpdatePaginationItem;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePaginationItem implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f265592b;

        public UpdatePaginationItem(boolean z12) {
            this.f265592b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePaginationItem) && this.f265592b == ((UpdatePaginationItem) obj).f265592b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f265592b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdatePaginationItem(isError="), this.f265592b, ')');
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$UpdateSelected;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelected implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Set<ParcelableEntity<String>> f265593b;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateSelected(@k Set<? extends ParcelableEntity<String>> set) {
            this.f265593b = set;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelected) && L.f(this.f265593b, ((UpdateSelected) obj).f265593b);
        }

        public final int hashCode() {
            return this.f265593b.hashCode();
        }

        @k
        public final String toString() {
            return c.u(new StringBuilder("UpdateSelected(selected="), this.f265593b, ')');
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$VariantItemClicked;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VariantItemClicked implements SelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.select.variant.a f265594b;

        public VariantItemClicked(@k com.avito.android.select.variant.a aVar) {
            this.f265594b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VariantItemClicked) && L.f(this.f265594b, ((VariantItemClicked) obj).f265594b);
        }

        public final int hashCode() {
            return this.f265594b.hashCode();
        }

        @k
        public final String toString() {
            return "VariantItemClicked(item=" + this.f265594b + ')';
        }
    }

    /* compiled from: SelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/mvi/entity/SelectInternalAction$VariantsLoaded;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VariantsLoaded implements SelectInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e f265595b;

        public VariantsLoaded(@k e eVar) {
            this.f265595b = eVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VariantsLoaded) && L.f(this.f265595b, ((VariantsLoaded) obj).f265595b);
        }

        public final int hashCode() {
            return this.f265595b.hashCode();
        }

        @k
        public final String toString() {
            return "VariantsLoaded(result=" + this.f265595b + ')';
        }
    }
}
