package com.avito.android.brand_global_rubricator;

import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandGlobalRubricatorItemImpl.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brand_global_rubricator/i;", "Lcom/avito/android/brand_global_rubricator/h;", "_avito_bx-content_widget_brand-global-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f107450a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f107451b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f107452c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f107453d;

    public i(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l UniversalImage universalImage, boolean z12) {
        this.f107450a = str;
        this.f107451b = deepLink;
        this.f107452c = universalImage;
        this.f107453d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f107450a, iVar.f107450a) && L.f(this.f107451b, iVar.f107451b) && L.f(this.f107452c, iVar.f107452c) && this.f107453d == iVar.f107453d;
    }

    @Override // com.avito.android.brand_global_rubricator.h
    @Y61.k
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF107451b() {
        return this.f107451b;
    }

    @Override // com.avito.android.brand_global_rubricator.h
    @Y61.l
    /* renamed from: getImage, reason: from getter */
    public final UniversalImage getF107452c() {
        return this.f107452c;
    }

    @Override // com.avito.android.brand_global_rubricator.h
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF107450a() {
        return this.f107450a;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f107451b, this.f107450a.hashCode() * 31, 31);
        UniversalImage universalImage = this.f107452c;
        return Boolean.hashCode(this.f107453d) + ((iE2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31);
    }

    @Override // com.avito.android.brand_global_rubricator.h
    /* renamed from: m0, reason: from getter */
    public final boolean getF107453d() {
        return this.f107453d;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandGlobalRubricatorItemImpl(title=");
        sb2.append(this.f107450a);
        sb2.append(", deepLink=");
        sb2.append(this.f107451b);
        sb2.append(", image=");
        sb2.append(this.f107452c);
        sb2.append(", isAllCategoriesItem=");
        return r.x(sb2, this.f107453d, ')');
    }
}
