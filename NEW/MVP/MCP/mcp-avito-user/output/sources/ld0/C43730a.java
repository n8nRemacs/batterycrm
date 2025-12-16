package ld0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: PromoUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lld0/a;", "", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ld0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C43730a {

    /* renamed from: a, reason: collision with root package name */
    public final int f413951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f413952b;

    public C43730a(@InterfaceC42150f int i12, @InterfaceC42150f int i13) {
        this.f413951a = i12;
        this.f413952b = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43730a)) {
            return false;
        }
        C43730a c43730a = (C43730a) obj;
        return this.f413951a == c43730a.f413951a && this.f413952b == c43730a.f413952b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f413952b) + (Integer.hashCode(this.f413951a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerThemeWithGradient(styleRes=");
        sb2.append(this.f413951a);
        sb2.append(", gradientRes=");
        return r.t(sb2, this.f413952b, ')');
    }
}
