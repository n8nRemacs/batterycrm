package Zs;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmApplicationsListModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* renamed from: Zs.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C19602c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.crm_candidates.view.list_items.applications_list.application_item.b f20541a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.b f20542b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.crm_candidates.view.list_items.applications_list.error_item.b f20543c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.b f20544d;

    public C19602c(com.avito.android.crm_candidates.view.list_items.applications_list.application_item.b bVar, com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.b bVar2, com.avito.android.crm_candidates.view.list_items.applications_list.error_item.b bVar3, com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.b bVar4) {
        this.f20541a = bVar;
        this.f20542b = bVar2;
        this.f20543c = bVar3;
        this.f20544d = bVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.crm_candidates.view.list_items.applications_list.application_item.a aVar = (com.avito.android.crm_candidates.view.list_items.applications_list.application_item.a) this.f20541a.get();
        com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.a aVar2 = (com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.a) this.f20542b.get();
        com.avito.android.crm_candidates.view.list_items.applications_list.error_item.a aVar3 = (com.avito.android.crm_candidates.view.list_items.applications_list.error_item.a) this.f20543c.get();
        com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.a aVar4 = (com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.a) this.f20544d.get();
        C19600a.f20539a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        return c10493a.a();
    }
}
