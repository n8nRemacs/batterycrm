package com.avito.android.work_profile.deeplink_handling;

import Ju.AbstractC14250d;
import com.avito.android.work_profile.deeplink.JobSeekerCvsLink;
import com.avito.android.work_profile.deeplink_handling.a;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;

/* compiled from: JobSeekerCvsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f330624l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JobSeekerCvsLink f330625m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, JobSeekerCvsLink jobSeekerCvsLink) {
        super(0);
        this.f330624l = aVar;
        this.f330625m = jobSeekerCvsLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Object next;
        a aVar = this.f330624l;
        JobSeekerCvsLink jobSeekerCvsLink = this.f330625m;
        String str = jobSeekerCvsLink.f330618b;
        Iterator it = ((AbstractC42738c) a.C10262a.f330623a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WorkProfileTab) next).f330699b.equals(str)) {
                break;
            }
        }
        WorkProfileTab workProfileTab = (WorkProfileTab) next;
        if (workProfileTab == null) {
            workProfileTab = WorkProfileTab.f330693d;
        }
        aVar.f330621g.R(aVar.f330620f.a(workProfileTab, jobSeekerCvsLink.f330619c), com.avito.android.deeplink_handler.view.b.f134588l);
        aVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
