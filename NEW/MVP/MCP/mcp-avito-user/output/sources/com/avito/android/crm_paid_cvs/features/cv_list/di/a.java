package com.avito.android.crm_paid_cvs.features.cv_list.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsFragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: CvListComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/di/a;", "", "a", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CvListComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/di/a$a;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.crm_paid_cvs.features.cv_list.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3876a {
        @Y61.k
        a a(@Y61.k c cVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k Resources resources, @h31.b @Y61.k @Named("CV_ACTION") Y41.l lVar, @h31.b @Y61.k @Named("FAVORITES_ACTION") Y41.l lVar2, @h31.b @Y61.k @Named("COMPARISON_ACTION") Y41.l lVar3, @h31.b @Y61.k Y41.l lVar4, @h31.b @Y61.k Y41.l lVar5, @h31.b @Y61.k Y41.l lVar6);
    }

    void a(@Y61.k CrmPaidCvsFragment crmPaidCvsFragment);
}
