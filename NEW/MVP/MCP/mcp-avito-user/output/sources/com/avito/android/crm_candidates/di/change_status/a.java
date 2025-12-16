package com.avito.android.crm_candidates.di.change_status;

import Y41.l;
import com.avito.android.crm_candidates.di.change_status.b;
import com.avito.android.crm_candidates.view.dialogs.JobCrmChangeStatusDialog;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.crm_candidates.view.list_items.list_filter.f;
import com.avito.android.crm_candidates.view.list_items.list_filter.i;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerJobCrmChangeStatusComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerJobCrmChangeStatusComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.crm_candidates.di.change_status.b.a
        public final com.avito.android.crm_candidates.di.change_status.b a(l<? super JobCrmListFilterItem, G0> lVar) {
            return new c(lVar, null);
        }
    }

    /* compiled from: DaggerJobCrmChangeStatusComponent.java */
    public static final class c implements com.avito.android.crm_candidates.di.change_status.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<f> f129247a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f129248b;

        public c() {
            throw null;
        }

        public c(l lVar, C3836a c3836a) {
            u<f> uVarD = g.d(new i(dagger.internal.l.a(lVar)));
            this.f129247a = uVarD;
            this.f129248b = g.d(new com.avito.android.crm_candidates.view.list_items.list_filter.e(new com.avito.android.crm_candidates.view.list_items.list_filter.b(uVarD)));
        }

        @Override // com.avito.android.crm_candidates.di.change_status.b
        public final void a(JobCrmChangeStatusDialog jobCrmChangeStatusDialog) {
            jobCrmChangeStatusDialog.f129956h0 = this.f129248b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
