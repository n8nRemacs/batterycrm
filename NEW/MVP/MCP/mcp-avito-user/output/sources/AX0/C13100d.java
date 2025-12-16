package Ax0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigStatusDocState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAx0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ax0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C13100d extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Image f723b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C13102f f724c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C13102f f725d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f726e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f727f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f728g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f729h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f730i;

    public C13100d(@k Image image, @k C13102f c13102f, @l C13102f c13102f2, @k List<C13097a> list, @l DeepLink deepLink, boolean z12, boolean z13, boolean z14) {
        this.f723b = image;
        this.f724c = c13102f;
        this.f725d = c13102f2;
        this.f726e = list;
        this.f727f = deepLink;
        this.f728g = z12;
        this.f729h = z13;
        this.f730i = z14;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    public static C13100d a(C13100d c13100d, boolean z12, boolean z13) {
        Image image = c13100d.f723b;
        C13102f c13102f = c13100d.f724c;
        C13102f c13102f2 = c13100d.f725d;
        ?? r42 = c13100d.f726e;
        DeepLink deepLink = c13100d.f727f;
        c13100d.getClass();
        return new C13100d(image, c13102f, c13102f2, r42, deepLink, false, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13100d)) {
            return false;
        }
        C13100d c13100d = (C13100d) obj;
        return L.f(this.f723b, c13100d.f723b) && L.f(this.f724c, c13100d.f724c) && L.f(this.f725d, c13100d.f725d) && L.f(this.f726e, c13100d.f726e) && L.f(this.f727f, c13100d.f727f) && this.f728g == c13100d.f728g && this.f729h == c13100d.f729h && this.f730i == c13100d.f730i;
    }

    public final int hashCode() {
        int iHashCode = (this.f724c.hashCode() + (this.f723b.hashCode() * 31)) * 31;
        C13102f c13102f = this.f725d;
        int iA2 = C23088b.a((iHashCode + (c13102f == null ? 0 : c13102f.hashCode())) * 31, 31, this.f726e);
        DeepLink deepLink = this.f727f;
        return Boolean.hashCode(this.f730i) + r.i(r.i((iA2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.f728g), 31, this.f729h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigStatusDocState(image=");
        sb2.append(this.f723b);
        sb2.append(", mainInfo=");
        sb2.append(this.f724c);
        sb2.append(", additionalInfo=");
        sb2.append(this.f725d);
        sb2.append(", actionButtons=");
        sb2.append(this.f726e);
        sb2.append(", supportButtonDeepLink=");
        sb2.append(this.f727f);
        sb2.append(", needShowNavBarRightButtons=");
        sb2.append(this.f728g);
        sb2.append(", isLoading=");
        sb2.append(this.f729h);
        sb2.append(", isError=");
        return r.x(sb2, this.f730i, ')');
    }
}
