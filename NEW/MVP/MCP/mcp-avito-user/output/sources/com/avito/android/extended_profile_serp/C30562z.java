package com.avito.android.extended_profile_serp;

import androidx.fragment.app.Fragment;
import bB.InterfaceC25487a;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.extended_profile_serp.f0;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.search.filter.InterfaceC34598u;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/z;", "Lcom/avito/android/extended_profile_serp/x;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30562z implements InterfaceC30560x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC25487a, G0> f153123a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34598u f153124b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<f0.a> f153125c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C30562z(@Y61.k Fragment fragment, @Y61.k Y41.l<? super InterfaceC25487a, G0> lVar, @Y61.k InterfaceC34598u interfaceC34598u) {
        this.f153123a = lVar;
        this.f153124b = interfaceC34598u;
        this.f153125c = fragment.registerForActivityResult(new C30561y(this), new C28629h(0));
    }

    @Override // com.avito.android.extended_profile_serp.InterfaceC30560x
    public final void a(@Y61.k SearchParams searchParams, @Y61.l String str, @Y61.k FilterAnalyticsData filterAnalyticsData) {
        this.f153125c.b(new f0.a(searchParams, str, filterAnalyticsData));
    }
}
