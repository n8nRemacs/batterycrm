package com.avito.android.crm_candidates.features.notes_list.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmNotesListInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddNewNote", "ShowContent", "Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction$AddNewNote;", "Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction$ShowContent;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface JobCrmNotesListInternalAction extends n {

    /* compiled from: JobCrmNotesListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction$AddNewNote;", "Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddNewNote implements JobCrmNotesListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f129702b;

        public AddNewNote(@l String str) {
            this.f129702b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddNewNote) && L.f(this.f129702b, ((AddNewNote) obj).f129702b);
        }

        public final int hashCode() {
            String str = this.f129702b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddNewNote(noteText="), this.f129702b, ')');
        }
    }

    /* compiled from: JobCrmNotesListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction$ShowContent;", "Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements JobCrmNotesListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f129703b;

        public ShowContent(@k ArrayList arrayList) {
            this.f129703b = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
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
            return (obj instanceof ShowContent) && this.f129703b.equals(((ShowContent) obj).f129703b);
        }

        public final int hashCode() {
            return this.f129703b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ShowContent(notes="), this.f129703b, ')');
        }
    }
}
