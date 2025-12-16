package com.avito.android.crm_candidates.features.add_note.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmAddNoteInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangesSaved", "NoteInputChange", "SetData", "ShowError", "ShowLoading", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$ChangesSaved;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$NoteInputChange;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$SetData;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$ShowError;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$ShowLoading;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface JobCrmAddNoteInternalAction extends n {

    /* compiled from: JobCrmAddNoteInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$ChangesSaved;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangesSaved implements JobCrmAddNoteInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCrmApplicationItem f129423b;

        public ChangesSaved(@k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f129423b = jobCrmApplicationItem;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof ChangesSaved) && L.f(this.f129423b, ((ChangesSaved) obj).f129423b);
        }

        public final int hashCode() {
            return this.f129423b.hashCode();
        }

        @k
        public final String toString() {
            return "ChangesSaved(item=" + this.f129423b + ')';
        }
    }

    /* compiled from: JobCrmAddNoteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$NoteInputChange;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoteInputChange implements JobCrmAddNoteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f129424b;

        public NoteInputChange(@k String str) {
            this.f129424b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoteInputChange) && L.f(this.f129424b, ((NoteInputChange) obj).f129424b);
        }

        public final int hashCode() {
            return this.f129424b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NoteInputChange(text="), this.f129424b, ')');
        }
    }

    /* compiled from: JobCrmAddNoteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$SetData;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetData implements JobCrmAddNoteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f129425b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f129426c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f129427d;

        public SetData(@k String str, @k String str2, @k String str3) {
            this.f129425b = str;
            this.f129426c = str2;
            this.f129427d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetData)) {
                return false;
            }
            SetData setData = (SetData) obj;
            return L.f(this.f129425b, setData.f129425b) && L.f(this.f129426c, setData.f129426c) && L.f(this.f129427d, setData.f129427d);
        }

        public final int hashCode() {
            return this.f129427d.hashCode() + H.d(this.f129425b.hashCode() * 31, 31, this.f129426c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetData(candidateName=");
            sb2.append(this.f129425b);
            sb2.append(", buttonName=");
            sb2.append(this.f129426c);
            sb2.append(", noteText=");
            return C22026a.c(sb2, this.f129427d, ')');
        }
    }

    /* compiled from: JobCrmAddNoteInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$ShowError;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements JobCrmAddNoteInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f129428b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f129429c;

        public ShowError(@k ApiError apiError) {
            this.f129428b = apiError;
            this.f129429c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof ShowError) && L.f(this.f129428b, ((ShowError) obj).f129428b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF125587c() {
            return this.f129429c;
        }

        public final int hashCode() {
            return this.f129428b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f129428b, ')');
        }
    }

    /* compiled from: JobCrmAddNoteInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements JobCrmAddNoteInternalAction {
    }
}
