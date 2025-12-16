package com.avito.android.crm_candidates.di.notes;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.crm_candidates.view.base.JobCrmAddNoteFragment;
import com.avito.android.di.B;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: JobCrmAddNoteComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/di/notes/c;", "", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface c {

    /* compiled from: JobCrmAddNoteComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/di/notes/c$a;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@k e eVar, @h31.b @k @Named("CANDIDATE_NAME") String str, @h31.b @k @Named("BUTTON_NAME") String str2, @h31.b @k @Named("NOTE_TEXT") String str3, @h31.b @k @Named("APPLICANT_ID") String str4, @h31.b @k @Named("APPLICATION_ID") String str5, @h31.b @l @Named("VACANCY_ID") String str6, @h31.b @l @Named("CV_ID") String str7, @h31.b @k C28478k c28478k, @h31.b @k Resources resources);
    }

    void a(@k JobCrmAddNoteFragment jobCrmAddNoteFragment);
}
