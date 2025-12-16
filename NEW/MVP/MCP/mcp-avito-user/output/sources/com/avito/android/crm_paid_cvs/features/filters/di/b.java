package com.avito.android.crm_paid_cvs.features.filters.di;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.res.Resources;
import androidx.view.C22977J;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsFiltersFragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import java.util.List;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: FiltersComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/di/b;", "", "a", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: FiltersComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/di/b$a;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k d dVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k C28478k c28478k, @h31.b @k Resources resources, @h31.b @k C22977J c22977j, @h31.b @k List list, @h31.b @k p pVar, @h31.b @k p pVar2, @h31.b @k l lVar, @h31.b @k @Named("SWITCH_TOGGLE") l lVar2, @h31.b @k @Named("DROP_CLICK") l lVar3, @h31.b @k l lVar4);
    }

    void a(@k CrmPaidCvsFiltersFragment crmPaidCvsFiltersFragment);
}
