package jt;

import com.avito.android.crm_paid_cvs.features.cv_list.logics.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CrmPaidCvsViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C42424c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.crm_paid_cvs.features.cv_list.logics.h f405867a;

    public d(com.avito.android.crm_paid_cvs.features.cv_list.logics.h hVar) {
        this.f405867a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42424c((g) this.f405867a.get(), null, 2, null);
    }
}
