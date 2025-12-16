package com.avito.android.advert.navbar;

import android.graphics.drawable.Drawable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35763c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsNavBarDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/p;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f80862a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f80863b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Drawable f80864c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f80865d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final C35763c0 f80866e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f80867f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final DeepLink f80868g;

    public p(int i12, @Y61.k q qVar, @Y61.k Drawable drawable, boolean z12, @Y61.l C35763c0 c35763c0, @Y61.l Drawable drawable2, @Y61.l DeepLink deepLink) {
        this.f80862a = i12;
        this.f80863b = qVar;
        this.f80864c = drawable;
        this.f80865d = z12;
        this.f80866e = c35763c0;
        this.f80867f = drawable2;
        this.f80868g = deepLink;
    }

    public static p a(p pVar, Drawable drawable, boolean z12, C35763c0 c35763c0, int i12) {
        if ((i12 & 4) != 0) {
            drawable = pVar.f80864c;
        }
        Drawable drawable2 = drawable;
        if ((i12 & 8) != 0) {
            z12 = pVar.f80865d;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            c35763c0 = pVar.f80866e;
        }
        return new p(pVar.f80862a, pVar.f80863b, drawable2, z13, c35763c0, pVar.f80867f, pVar.f80868g);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f80862a == pVar.f80862a && L.f(this.f80863b, pVar.f80863b) && L.f(this.f80864c, pVar.f80864c) && this.f80865d == pVar.f80865d && L.f(this.f80866e, pVar.f80866e) && L.f(this.f80867f, pVar.f80867f) && L.f(this.f80868g, pVar.f80868g);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i((this.f80864c.hashCode() + ((this.f80863b.hashCode() + (Integer.hashCode(this.f80862a) * 31)) * 31)) * 31, 31, this.f80865d);
        C35763c0 c35763c0 = this.f80866e;
        int iHashCode = (i12 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        Drawable drawable = this.f80867f;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        DeepLink deepLink = this.f80868g;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompositeBarMenuItem(index=");
        sb2.append(this.f80862a);
        sb2.append(", type=");
        sb2.append(this.f80863b);
        sb2.append(", icon=");
        sb2.append(this.f80864c);
        sb2.append(", visible=");
        sb2.append(this.f80865d);
        sb2.append(", tint=");
        sb2.append(this.f80866e);
        sb2.append(", foreground=");
        sb2.append(this.f80867f);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f80868g, ')');
    }

    public /* synthetic */ p(int i12, q qVar, Drawable drawable, boolean z12, C35763c0 c35763c0, Drawable drawable2, DeepLink deepLink, int i13, C42822w c42822w) {
        this(i12, qVar, drawable, (i13 & 8) != 0 ? true : z12, (i13 & 16) != 0 ? null : c35763c0, (i13 & 32) != 0 ? null : drawable2, (i13 & 64) != 0 ? null : deepLink);
    }
}
