package com.avito.android.crm_candidates.features.full_filters.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: FiltersInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplyFilters", "ChipsClicked", "DropFilters", "DropSelectFilterOptions", "OptionsSelected", "RangeChanged", "ShowFilters", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$ApplyFilters;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$ChipsClicked;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$DropFilters;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$DropSelectFilterOptions;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$OptionsSelected;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$RangeChanged;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$ShowFilters;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FiltersInternalAction extends n {

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$ApplyFilters;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyFilters implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f129575b;

        public ApplyFilters(@k ArrayList arrayList) {
            this.f129575b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyFilters) && this.f129575b.equals(((ApplyFilters) obj).f129575b);
        }

        public final int hashCode() {
            return this.f129575b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ApplyFilters(filters="), this.f129575b, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$ChipsClicked;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChipsClicked implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f129576b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final JobCrmListFilterItem f129577c;

        public ChipsClicked(@k String str, @k JobCrmListFilterItem jobCrmListFilterItem) {
            this.f129576b = str;
            this.f129577c = jobCrmListFilterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChipsClicked)) {
                return false;
            }
            ChipsClicked chipsClicked = (ChipsClicked) obj;
            return L.f(this.f129576b, chipsClicked.f129576b) && L.f(this.f129577c, chipsClicked.f129577c);
        }

        public final int hashCode() {
            return this.f129577c.hashCode() + (this.f129576b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ChipsClicked(filterId=" + this.f129576b + ", clickedOption=" + this.f129577c + ')';
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$DropFilters;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DropFilters implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DropFilters f129578b = new DropFilters();

        private DropFilters() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DropFilters);
        }

        public final int hashCode() {
            return 1424593605;
        }

        @k
        public final String toString() {
            return "DropFilters";
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$DropSelectFilterOptions;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DropSelectFilterOptions implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f129579b;

        public DropSelectFilterOptions(@k String str) {
            this.f129579b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DropSelectFilterOptions) && L.f(this.f129579b, ((DropSelectFilterOptions) obj).f129579b);
        }

        public final int hashCode() {
            return this.f129579b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DropSelectFilterOptions(filterId="), this.f129579b, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$OptionsSelected;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionsSelected implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f129580b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<JobCrmListFilterItem> f129581c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<FilterItem> f129582d;

        public OptionsSelected(@k String str, @k List<JobCrmListFilterItem> list, @k List<FilterItem> list2) {
            this.f129580b = str;
            this.f129581c = list;
            this.f129582d = list2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionsSelected)) {
                return false;
            }
            OptionsSelected optionsSelected = (OptionsSelected) obj;
            return L.f(this.f129580b, optionsSelected.f129580b) && L.f(this.f129581c, optionsSelected.f129581c) && L.f(this.f129582d, optionsSelected.f129582d);
        }

        public final int hashCode() {
            return this.f129582d.hashCode() + H.e(this.f129580b.hashCode() * 31, 31, this.f129581c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OptionsSelected(filterId=");
            sb2.append(this.f129580b);
            sb2.append(", selectedOptions=");
            sb2.append(this.f129581c);
            sb2.append(", filters=");
            return H.p(sb2, this.f129582d, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$RangeChanged;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RangeChanged implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f129583b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Q<Long, Long> f129584c;

        public RangeChanged(@k String str, @k Q<Long, Long> q12) {
            this.f129583b = str;
            this.f129584c = q12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RangeChanged)) {
                return false;
            }
            RangeChanged rangeChanged = (RangeChanged) obj;
            return L.f(this.f129583b, rangeChanged.f129583b) && L.f(this.f129584c, rangeChanged.f129584c);
        }

        public final int hashCode() {
            return this.f129584c.hashCode() + (this.f129583b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RangeChanged(filterId=");
            sb2.append(this.f129583b);
            sb2.append(", range=");
            return b.i(sb2, this.f129584c, ')');
        }
    }

    /* compiled from: FiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction$ShowFilters;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFilters implements FiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<FilterItem> f129585b;

        public ShowFilters(@k List<FilterItem> list) {
            this.f129585b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowFilters) && L.f(this.f129585b, ((ShowFilters) obj).f129585b);
        }

        public final int hashCode() {
            return this.f129585b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowFilters(filters="), this.f129585b, ')');
        }
    }
}
