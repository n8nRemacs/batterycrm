package com.avito.android.crm_candidates.di.change_status;

import Y41.l;
import Y61.k;
import com.avito.android.crm_candidates.view.dialogs.JobCrmChangeStatusDialog;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.di.B;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmChangeStatusComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/di/change_status/b;", "", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: JobCrmChangeStatusComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/di/change_status/b$a;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k l<? super JobCrmListFilterItem, G0> lVar);
    }

    void a(@k JobCrmChangeStatusDialog jobCrmChangeStatusDialog);
}
