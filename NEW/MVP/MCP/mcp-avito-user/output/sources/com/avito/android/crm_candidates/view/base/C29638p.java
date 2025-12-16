package com.avito.android.crm_candidates.view.base;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Vacancy;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmCandidatesFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.crm_candidates.view.base.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29638p extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmApplicationItem f129930l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129931m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29638p(JobCrmApplicationItem jobCrmApplicationItem, JobCrmCandidatesFragment jobCrmCandidatesFragment) {
        super(0);
        this.f129930l = jobCrmApplicationItem;
        this.f129931m = jobCrmCandidatesFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str;
        JobCrmApplicationItem jobCrmApplicationItem = this.f129930l;
        Vacancy vacancy = jobCrmApplicationItem.f130015m;
        if (vacancy != null && (str = vacancy.f130032d) != null) {
            JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129931m;
            InterfaceC28373a interfaceC28373a = jobCrmCandidatesFragment.f129818z0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            com.avito.android.account.E e12 = jobCrmCandidatesFragment.f129792A0;
            if (e12 == null) {
                e12 = null;
            }
            interfaceC28373a.c(new Ls.m(e12.a(), str, jobCrmApplicationItem.f130017o, jobCrmApplicationItem.f130018p));
            com.avito.android.deeplink_handler.handler.composite.a aVar = jobCrmCandidatesFragment.f129794C0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, new AdvertDetailsLink(str, null, null, null, null, null, null, null, null, null, null, 2044, null), null, null, 6);
        }
        return G0.f406611a;
    }
}
