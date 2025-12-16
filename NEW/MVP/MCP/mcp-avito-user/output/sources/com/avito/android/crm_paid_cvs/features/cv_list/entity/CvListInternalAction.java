package com.avito.android.crm_paid_cvs.features.cv_list.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.dto.SearchItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CvListInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplyAllFilters", "ApplyFilter", "ChangeTab", "CloseStatus", "DropFilters", "LoadType", "OpenFilter", "ShowContent", "ShowError", "ShowLoading", "ShowNote", "ShowStatus", "ToggleComparison", "ToggleFavorites", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ApplyAllFilters;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ApplyFilter;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ChangeTab;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$CloseStatus;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$DropFilters;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$OpenFilter;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowContent;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowError;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowLoading;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowNote;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowStatus;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ToggleComparison;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ToggleFavorites;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CvListInternalAction extends n {

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ApplyAllFilters;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyAllFilters implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f130457b;

        public ApplyAllFilters(@k ArrayList arrayList) {
            this.f130457b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyAllFilters) && this.f130457b.equals(((ApplyAllFilters) obj).f130457b);
        }

        public final int hashCode() {
            return this.f130457b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ApplyAllFilters(filters="), this.f130457b, ')');
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ApplyFilter;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyFilter implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f130458b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<OptionItem> f130459c;

        public ApplyFilter(@k String str, @k List<OptionItem> list) {
            this.f130458b = str;
            this.f130459c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplyFilter)) {
                return false;
            }
            ApplyFilter applyFilter = (ApplyFilter) obj;
            return L.f(this.f130458b, applyFilter.f130458b) && L.f(this.f130459c, applyFilter.f130459c);
        }

        public final int hashCode() {
            return this.f130459c.hashCode() + (this.f130458b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplyFilter(filterId=");
            sb2.append(this.f130458b);
            sb2.append(", selectedOptions=");
            return H.p(sb2, this.f130459c, ')');
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ChangeTab;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeTab implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CvListState.Tab f130460b;

        public ChangeTab(@k CvListState.Tab tab) {
            this.f130460b = tab;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeTab) && this.f130460b == ((ChangeTab) obj).f130460b;
        }

        public final int hashCode() {
            return this.f130460b.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeTab(tab=" + this.f130460b + ')';
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$CloseStatus;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseStatus implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CvItem f130461b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f130462c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final CvStatus f130463d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f130464e;

        public CloseStatus(@k CvItem cvItem, boolean z12, @k CvStatus cvStatus, @k String str) {
            this.f130461b = cvItem;
            this.f130462c = z12;
            this.f130463d = cvStatus;
            this.f130464e = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseStatus)) {
                return false;
            }
            CloseStatus closeStatus = (CloseStatus) obj;
            return L.f(this.f130461b, closeStatus.f130461b) && this.f130462c == closeStatus.f130462c && L.f(this.f130463d, closeStatus.f130463d) && L.f(this.f130464e, closeStatus.f130464e);
        }

        public final int hashCode() {
            return this.f130464e.hashCode() + ((this.f130463d.hashCode() + r.i(this.f130461b.hashCode() * 31, 31, this.f130462c)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseStatus(item=");
            sb2.append(this.f130461b);
            sb2.append(", isFavorite=");
            sb2.append(this.f130462c);
            sb2.append(", status=");
            sb2.append(this.f130463d);
            sb2.append(", noteText=");
            return C22026a.c(sb2, this.f130464e, ')');
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$DropFilters;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DropFilters implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DropFilters f130465b = new DropFilters();

        private DropFilters() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DropFilters);
        }

        public final int hashCode() {
            return 1989442349;
        }

        @k
        public final String toString() {
            return "DropFilters";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$LoadType;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadType f130466b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadType f130467c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadType f130468d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoadType f130469e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ LoadType[] f130470f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f130471g;

        static {
            LoadType loadType = new LoadType("RELOAD", 0);
            f130466b = loadType;
            LoadType loadType2 = new LoadType("REFRESH", 1);
            f130467c = loadType2;
            LoadType loadType3 = new LoadType("PAGING", 2);
            f130468d = loadType3;
            LoadType loadType4 = new LoadType("CHANGE_STATUS", 3);
            f130469e = loadType4;
            LoadType[] loadTypeArr = {loadType, loadType2, loadType3, loadType4};
            f130470f = loadTypeArr;
            f130471g = c.a(loadTypeArr);
        }

        public LoadType() {
            throw null;
        }

        public static LoadType valueOf(String str) {
            return (LoadType) Enum.valueOf(LoadType.class, str);
        }

        public static LoadType[] values() {
            return (LoadType[]) f130470f.clone();
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$OpenFilter;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFilter implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FilterItem f130472b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<FilterItem> f130473c;

        public OpenFilter(@k FilterItem filterItem, @k List<FilterItem> list) {
            this.f130472b = filterItem;
            this.f130473c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenFilter)) {
                return false;
            }
            OpenFilter openFilter = (OpenFilter) obj;
            return L.f(this.f130472b, openFilter.f130472b) && L.f(this.f130473c, openFilter.f130473c);
        }

        public final int hashCode() {
            return this.f130473c.hashCode() + (this.f130472b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenFilter(filter=");
            sb2.append(this.f130472b);
            sb2.append(", filters=");
            return H.p(sb2, this.f130473c, ')');
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowError;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements CvListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LoadType f130479b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f130480c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f130481d;

        public ShowError(@k LoadType loadType, @k ApiError apiError) {
            this.f130479b = loadType;
            this.f130480c = apiError;
            this.f130481d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return this.f130479b.name();
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f130479b.name();
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) obj;
            return this.f130479b == showError.f130479b && L.f(this.f130480c, showError.f130480c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF111986c() {
            return this.f130481d;
        }

        public final int hashCode() {
            return this.f130480c.hashCode() + (this.f130479b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(type=");
            sb2.append(this.f130479b);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f130480c, ')');
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading extends TrackableLoadingStarted implements CvListInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final LoadType f130482d;

        public ShowLoading(@k LoadType loadType) {
            this.f130482d = loadType;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return this.f130482d.name();
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLoading) && this.f130482d == ((ShowLoading) obj).f130482d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f130482d.hashCode();
        }

        @k
        public final String toString() {
            return "ShowLoading(type=" + this.f130482d + ')';
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowNote;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowNote implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CvItem f130483b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f130484c;

        public ShowNote(@k CvItem cvItem, boolean z12) {
            this.f130483b = cvItem;
            this.f130484c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowNote)) {
                return false;
            }
            ShowNote showNote = (ShowNote) obj;
            return L.f(this.f130483b, showNote.f130483b) && this.f130484c == showNote.f130484c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f130484c) + (this.f130483b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowNote(item=");
            sb2.append(this.f130483b);
            sb2.append(", isFavorite=");
            return r.x(sb2, this.f130484c, ')');
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowStatus;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowStatus implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CvItem f130485b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f130486c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final CvStatus f130487d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<CvStatus> f130488e;

        public ShowStatus(@k CvItem cvItem, @k String str, @k CvStatus cvStatus, @k List<CvStatus> list) {
            this.f130485b = cvItem;
            this.f130486c = str;
            this.f130487d = cvStatus;
            this.f130488e = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowStatus)) {
                return false;
            }
            ShowStatus showStatus = (ShowStatus) obj;
            return L.f(this.f130485b, showStatus.f130485b) && L.f(this.f130486c, showStatus.f130486c) && L.f(this.f130487d, showStatus.f130487d) && L.f(this.f130488e, showStatus.f130488e);
        }

        public final int hashCode() {
            return this.f130488e.hashCode() + ((this.f130487d.hashCode() + H.d(this.f130485b.hashCode() * 31, 31, this.f130486c)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowStatus(item=");
            sb2.append(this.f130485b);
            sb2.append(", noteText=");
            sb2.append(this.f130486c);
            sb2.append(", status=");
            sb2.append(this.f130487d);
            sb2.append(", statusList=");
            return H.p(sb2, this.f130488e, ')');
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ToggleComparison;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleComparison implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CvItem f130489b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f130490c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f130491d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final com.avito.android.toggle_comparison_state.a f130492e;

        public ToggleComparison(@k CvItem cvItem, boolean z12, boolean z13, @l com.avito.android.toggle_comparison_state.a aVar) {
            this.f130489b = cvItem;
            this.f130490c = z12;
            this.f130491d = z13;
            this.f130492e = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleComparison)) {
                return false;
            }
            ToggleComparison toggleComparison = (ToggleComparison) obj;
            return L.f(this.f130489b, toggleComparison.f130489b) && this.f130490c == toggleComparison.f130490c && this.f130491d == toggleComparison.f130491d && L.f(this.f130492e, toggleComparison.f130492e);
        }

        public final int hashCode() {
            int i12 = r.i(r.i(this.f130489b.hashCode() * 31, 31, this.f130490c), 31, this.f130491d);
            com.avito.android.toggle_comparison_state.a aVar = this.f130492e;
            return i12 + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "ToggleComparison(item=" + this.f130489b + ", isError=" + this.f130490c + ", isLimitReached=" + this.f130491d + ", message=" + this.f130492e + ')';
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ToggleFavorites;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleFavorites implements CvListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CvItem f130493b;

        public ToggleFavorites(@k CvItem cvItem) {
            this.f130493b = cvItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleFavorites) && L.f(this.f130493b, ((ToggleFavorites) obj).f130493b);
        }

        public final int hashCode() {
            return this.f130493b.hashCode();
        }

        @k
        public final String toString() {
            return "ToggleFavorites(item=" + this.f130493b + ')';
        }
    }

    /* compiled from: CvListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction$ShowContent;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements CvListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LoadType f130474b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<CvItem> f130475c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<SearchItem> f130476d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<FilterItem> f130477e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Long f130478f;

        public ShowContent(@k LoadType loadType, @k List<CvItem> list, @k List<SearchItem> list2, @k List<FilterItem> list3, @l Long l12) {
            this.f130474b = loadType;
            this.f130475c = list;
            this.f130476d = list2;
            this.f130477e = list3;
            this.f130478f = l12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return this.f130474b.name();
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f130474b.name();
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return this.f130474b == showContent.f130474b && L.f(this.f130475c, showContent.f130475c) && L.f(this.f130476d, showContent.f130476d) && L.f(this.f130477e, showContent.f130477e) && L.f(this.f130478f, showContent.f130478f);
        }

        public final int hashCode() {
            int iE2 = H.e(H.e(H.e(this.f130474b.hashCode() * 31, 31, this.f130475c), 31, this.f130476d), 31, this.f130477e);
            Long l12 = this.f130478f;
            return iE2 + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(type=");
            sb2.append(this.f130474b);
            sb2.append(", cvs=");
            sb2.append(this.f130475c);
            sb2.append(", searches=");
            sb2.append(this.f130476d);
            sb2.append(", filters=");
            sb2.append(this.f130477e);
            sb2.append(", cursor=");
            return m.m(sb2, this.f130478f, ')');
        }

        public ShowContent(LoadType loadType, List list, List list2, List list3, Long l12, int i12, C42822w c42822w) {
            this(loadType, list, (i12 & 4) != 0 ? C42784z0.f406748b : list2, (i12 & 8) != 0 ? C42784z0.f406748b : list3, (i12 & 16) != 0 ? null : l12);
        }
    }
}
