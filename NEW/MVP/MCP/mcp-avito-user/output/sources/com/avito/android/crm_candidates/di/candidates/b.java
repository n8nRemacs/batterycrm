package com.avito.android.crm_candidates.di.candidates;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: JobCrmApplicationsListComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/di/candidates/b;", "", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: JobCrmApplicationsListComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/di/candidates/b$a;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k C28478k c28478k, @h31.b @k Resources resources, @h31.b @k l lVar, @h31.b @k l lVar2, @h31.b @k l lVar3, @h31.b @k l lVar4, @h31.b @k l lVar5, @h31.b @k l lVar6);
    }

    void a(@k JobCrmCandidatesFragment jobCrmCandidatesFragment);
}
