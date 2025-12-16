package com.avito.android.photo_gallery.nav_bar;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35763c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBarMenuItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/k;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f217564a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryNavBarMenuItemType f217565b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Drawable f217566c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final C35763c0 f217567d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Drawable f217568e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f217569f;

    public k(int i12, @Y61.k PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType, @Y61.l Drawable drawable, @Y61.l C35763c0 c35763c0, @Y61.l Drawable drawable2, @Y61.l DeepLink deepLink) {
        this.f217564a = i12;
        this.f217565b = photoGalleryNavBarMenuItemType;
        this.f217566c = drawable;
        this.f217567d = c35763c0;
        this.f217568e = drawable2;
        this.f217569f = deepLink;
    }

    public static k a(k kVar, Drawable drawable, C35763c0 c35763c0, int i12) {
        if ((i12 & 8) != 0) {
            c35763c0 = kVar.f217567d;
        }
        return new k(kVar.f217564a, kVar.f217565b, drawable, c35763c0, kVar.f217568e, kVar.f217569f);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f217564a == kVar.f217564a && this.f217565b == kVar.f217565b && L.f(this.f217566c, kVar.f217566c) && L.f(this.f217567d, kVar.f217567d) && L.f(this.f217568e, kVar.f217568e) && L.f(this.f217569f, kVar.f217569f);
    }

    public final int hashCode() {
        int iHashCode = (this.f217565b.hashCode() + (Integer.hashCode(this.f217564a) * 31)) * 31;
        Drawable drawable = this.f217566c;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        C35763c0 c35763c0 = this.f217567d;
        int iHashCode3 = (iHashCode2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        Drawable drawable2 = this.f217568e;
        int iHashCode4 = (iHashCode3 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        DeepLink deepLink = this.f217569f;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryNavBarMenuItem(index=");
        sb2.append(this.f217564a);
        sb2.append(", type=");
        sb2.append(this.f217565b);
        sb2.append(", icon=");
        sb2.append(this.f217566c);
        sb2.append(", tint=");
        sb2.append(this.f217567d);
        sb2.append(", foreground=");
        sb2.append(this.f217568e);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f217569f, ')');
    }

    public /* synthetic */ k(int i12, PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType, Drawable drawable, C35763c0 c35763c0, Drawable drawable2, DeepLink deepLink, int i13, C42822w c42822w) {
        this(i12, photoGalleryNavBarMenuItemType, drawable, (i13 & 8) != 0 ? null : c35763c0, (i13 & 16) != 0 ? null : drawable2, (i13 & 32) != 0 ? null : deepLink);
    }
}
