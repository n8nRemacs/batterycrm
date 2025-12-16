package com.avito.android.bxcontent;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.remote.model.SerpDisplayType;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxContentResourcesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/V0;", "Lcom/avito/android/bxcontent/U0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class V0 implements U0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f109434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f109435b;

    @Inject
    public V0(@Y61.k Resources resources, @com.avito.android.serp.adapter.d1 int i12) throws Resources.NotFoundException {
        this.f109434a = resources;
        this.f109435b = i12;
        resources.getBoolean(R.bool.is_tablet);
    }

    @Override // com.avito.android.home.InterfaceC30768c
    /* renamed from: a, reason: from getter */
    public final int getF109435b() {
        return this.f109435b;
    }

    @Override // com.avito.android.bxcontent.U0
    @Y61.k
    public final String e() {
        return this.f109434a.getString(R.string.serp_all_categories);
    }

    @Override // com.avito.android.bxcontent.U0
    @Y61.k
    public final String g() {
        return this.f109434a.getString(R.string.serp_select_category);
    }

    @Override // com.avito.android.bxcontent.U0
    @Y61.k
    public final String h() {
        return this.f109434a.getString(R.string.empty_search);
    }

    @Override // com.avito.android.bxcontent.U0
    @Y61.k
    public final String i() {
        return this.f109434a.getString(R.string.serp_navbar_onboarding_text);
    }

    @Override // com.avito.android.bxcontent.U0
    public final int j(@Y61.k SerpDisplayType serpDisplayType) {
        if (serpDisplayType.isSingleColumn()) {
            return 1;
        }
        return this.f109435b;
    }

    @Override // com.avito.android.bxcontent.U0
    @Y61.k
    public final String m() {
        return this.f109434a.getString(R.string.search);
    }
}
