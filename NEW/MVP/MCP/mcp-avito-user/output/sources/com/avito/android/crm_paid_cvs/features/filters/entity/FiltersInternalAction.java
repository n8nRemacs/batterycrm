package com.avito.android.crm_paid_cvs.features.filters.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: FiltersInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplyFilters", "ChipsClicked", "DropFilters", "DropSelectFilterOptions", "OptionsSelected", "RangeChanged", "ShowFilters", "ToggleSwitch", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$ApplyFilters;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$ChipsClicked;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$DropFilters;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$DropSelectFilterOptions;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$OptionsSelected;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$RangeChanged;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$ShowFilters;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$ToggleSwitch;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FiltersInternalAction extends n {

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$ApplyFilters;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyFilters implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f130618b;

        public ApplyFilters(@k ArrayList arrayList) {
            this.f130618b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyFilters) && this.f130618b.equals(((ApplyFilters) obj).f130618b);
        }

        public final int hashCode() {
            return this.f130618b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ApplyFilters(filters="), this.f130618b, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$ChipsClicked;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChipsClicked implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f130619b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final OptionItem f130620c;

        public ChipsClicked(@k String str, @k OptionItem optionItem) {
            this.f130619b = str;
            this.f130620c = optionItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChipsClicked)) {
                return false;
            }
            ChipsClicked chipsClicked = (ChipsClicked) obj;
            return L.f(this.f130619b, chipsClicked.f130619b) && L.f(this.f130620c, chipsClicked.f130620c);
        }

        public final int hashCode() {
            return this.f130620c.hashCode() + (this.f130619b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ChipsClicked(filterId=" + this.f130619b + ", clickedOption=" + this.f130620c + ')';
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$DropFilters;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DropFilters implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DropFilters f130621b = new DropFilters();

        private DropFilters() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DropFilters);
        }

        public final int hashCode() {
            return 312124112;
        }

        @k
        public final String toString() {
            return "DropFilters";
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$DropSelectFilterOptions;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DropSelectFilterOptions implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f130622b;

        public DropSelectFilterOptions(@k String str) {
            this.f130622b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DropSelectFilterOptions) && L.f(this.f130622b, ((DropSelectFilterOptions) obj).f130622b);
        }

        public final int hashCode() {
            return this.f130622b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DropSelectFilterOptions(filterId="), this.f130622b, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$OptionsSelected;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionsSelected implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f130623b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<OptionItem> f130624c;

        public OptionsSelected(@k String str, @k List<OptionItem> list) {
            this.f130623b = str;
            this.f130624c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionsSelected)) {
                return false;
            }
            OptionsSelected optionsSelected = (OptionsSelected) obj;
            return L.f(this.f130623b, optionsSelected.f130623b) && L.f(this.f130624c, optionsSelected.f130624c);
        }

        public final int hashCode() {
            return this.f130624c.hashCode() + (this.f130623b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OptionsSelected(filterId=");
            sb2.append(this.f130623b);
            sb2.append(", selectedOptions=");
            return H.p(sb2, this.f130624c, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$RangeChanged;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RangeChanged implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f130625b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Q<Integer, Integer> f130626c;

        public RangeChanged(@k String str, @k Q<Integer, Integer> q12) {
            this.f130625b = str;
            this.f130626c = q12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RangeChanged)) {
                return false;
            }
            RangeChanged rangeChanged = (RangeChanged) obj;
            return L.f(this.f130625b, rangeChanged.f130625b) && L.f(this.f130626c, rangeChanged.f130626c);
        }

        public final int hashCode() {
            return this.f130626c.hashCode() + (this.f130625b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RangeChanged(filterId=");
            sb2.append(this.f130625b);
            sb2.append(", range=");
            return b.i(sb2, this.f130626c, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$ShowFilters;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFilters implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<FilterItem> f130627b;

        public ShowFilters(@k List<FilterItem> list) {
            this.f130627b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowFilters) && L.f(this.f130627b, ((ShowFilters) obj).f130627b);
        }

        public final int hashCode() {
            return this.f130627b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowFilters(filters="), this.f130627b, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction$ToggleSwitch;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleSwitch implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f130628b;

        public ToggleSwitch(@k String str) {
            this.f130628b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSwitch) && L.f(this.f130628b, ((ToggleSwitch) obj).f130628b);
        }

        public final int hashCode() {
            return this.f130628b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToggleSwitch(filterId="), this.f130628b, ')');
        }
    }
}
