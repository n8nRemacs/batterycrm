package com.avito.android.campaigns_sale_search;

import com.avito.android.campaigns_sale_search.mvi.entity.Filter;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleSearchFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/r;", "Lcom/avito/android/lib/design/chips/h;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class r implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Filter f114847b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CharSequence f114848c;

    public r(@Y61.k Filter filter) {
        this.f114847b = filter;
        this.f114848c = filter.f114749b;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@Y61.k Object obj) {
        if (!(obj instanceof com.avito.android.lib.design.chips.h)) {
            return false;
        }
        CharSequence charSequence = this.f114848c;
        if (((String) charSequence).length() > 0) {
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
            if (hVar.getF114848c().length() > 0) {
                return L.f(charSequence, hVar.getF114848c());
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.k
    /* renamed from: W, reason: from getter */
    public final CharSequence getF114848c() {
        return this.f114848c;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f114847b == ((r) obj).f114847b;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF262143e() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        return this.f114847b.hashCode();
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF262142d() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        return "FilterChip(filter=" + this.f114847b + ')';
    }
}
