package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.R;
import j.InterfaceC42150f;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfilePromoConstructorParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/c;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87182a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ProfilePromoConstructorImagePosition f87183b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87184c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87185d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42150f
    public final int f87186e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42165v
    public final int f87187f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC42165v
    public final int f87188g;

    public c(boolean z12, @k ProfilePromoConstructorImagePosition profilePromoConstructorImagePosition, @InterfaceC42161q int i12, @InterfaceC42161q int i13) {
        this.f87182a = z12;
        this.f87183b = profilePromoConstructorImagePosition;
        this.f87184c = i12;
        this.f87185d = i13;
        this.f87186e = R.attr.warmGray4;
        this.f87187f = R.drawable.ad_profile_promo_constructor_image_overlay_bottom;
        this.f87188g = R.drawable.ad_profile_promo_constructor_image_overlay_left;
    }

    public final boolean a() {
        return this.f87183b == ProfilePromoConstructorImagePosition.f87158c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f87182a == cVar.f87182a && this.f87183b == cVar.f87183b && this.f87184c == cVar.f87184c && this.f87185d == cVar.f87185d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87185d) + r.e(this.f87184c, (this.f87183b.hashCode() + (Boolean.hashCode(this.f87182a) * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfilePromoConstructorParams(withSpaceBetweenTitleAndDescription=");
        sb2.append(this.f87182a);
        sb2.append(", imagePosition=");
        sb2.append(this.f87183b);
        sb2.append(", badgeInsetRes=");
        sb2.append(this.f87184c);
        sb2.append(", cornerRadiusRes=");
        return r.t(sb2, this.f87185d, ')');
    }

    public /* synthetic */ c(boolean z12, ProfilePromoConstructorImagePosition profilePromoConstructorImagePosition, int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? false : z12, profilePromoConstructorImagePosition, i12, i13);
    }
}
