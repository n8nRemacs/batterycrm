package com.avito.android.work_profile.profile.cvs.mvi;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import com.avito.android.work_profile.profile.cvs.mvi.entity.CvsInternalAction;
import fQ0.InterfaceC40329a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mQ0.AbstractC44002a;
import mQ0.C44003b;

/* compiled from: CvsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LmQ0/a;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "LmQ0/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.a<AbstractC44002a, CvsInternalAction, C44003b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.domain.j f331042a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f331043b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40329a f331044c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f331045d;

    @Inject
    public d(@Y61.k com.avito.android.work_profile.domain.j jVar, @Y61.k h hVar, @Y61.k InterfaceC40329a interfaceC40329a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f331042a = jVar;
        this.f331043b = hVar;
        this.f331044c = interfaceC40329a;
        this.f331045d = aVar;
    }

    public static final void c(d dVar, DeepLink deepLink) {
        dVar.getClass();
        Intent intentA = dVar.f331044c.a(WorkProfileTab.f330693d, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("up_intent", intentA);
        b.a.a(dVar.f331045d, deepLink, null, bundle, 2);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CvsInternalAction> b(AbstractC44002a abstractC44002a, C44003b c44003b) {
        AbstractC44002a abstractC44002a2 = abstractC44002a;
        if (abstractC44002a2 instanceof AbstractC44002a.C11828a) {
            return C43175k.G(new b(this, abstractC44002a2, null));
        }
        if (abstractC44002a2.equals(AbstractC44002a.c.f414499a)) {
            return C43175k.G(new a(true, this, null));
        }
        if (abstractC44002a2.equals(AbstractC44002a.d.f414500a)) {
            return C43175k.G(new a(false, this, null));
        }
        if (abstractC44002a2 instanceof AbstractC44002a.b) {
            return C43175k.G(new c(this, abstractC44002a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
