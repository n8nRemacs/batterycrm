package androidx.privacysandbox.ads.adservices.measurement;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.InputEvent;
import j.X;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WebSourceRegistrationRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/e;", "", "a", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<d> f53582a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f53583b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InputEvent f53584c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Uri f53585d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Uri f53586e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Uri f53587f;

    /* compiled from: WebSourceRegistrationRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/e$a;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    public e() {
        throw null;
    }

    public e(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i12, C42822w c42822w) {
        inputEvent = (i12 & 4) != 0 ? null : inputEvent;
        uri2 = (i12 & 8) != 0 ? null : uri2;
        uri3 = (i12 & 16) != 0 ? null : uri3;
        uri4 = (i12 & 32) != 0 ? null : uri4;
        this.f53582a = list;
        this.f53583b = uri;
        this.f53584c = inputEvent;
        this.f53585d = uri2;
        this.f53586e = uri3;
        this.f53587f = uri4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f53582a, eVar.f53582a) && L.f(this.f53586e, eVar.f53586e) && L.f(this.f53585d, eVar.f53585d) && L.f(this.f53583b, eVar.f53583b) && L.f(this.f53584c, eVar.f53584c) && L.f(this.f53587f, eVar.f53587f);
    }

    public final int hashCode() {
        int iHashCode = this.f53582a.hashCode() * 31;
        Uri uri = this.f53583b;
        int iHashCode2 = uri.hashCode() + iHashCode;
        InputEvent inputEvent = this.f53584c;
        if (inputEvent != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent.hashCode();
        }
        Uri uri2 = this.f53585d;
        if (uri2 != null) {
            iHashCode2 = (iHashCode2 * 31) + uri2.hashCode();
        }
        Uri uri3 = this.f53586e;
        if (uri3 != null) {
            iHashCode2 = (iHashCode2 * 31) + uri3.hashCode();
        }
        int iHashCode3 = uri.hashCode() + (iHashCode2 * 31);
        if (inputEvent != null) {
            iHashCode3 = (iHashCode3 * 31) + inputEvent.hashCode();
        }
        Uri uri4 = this.f53587f;
        return uri4 != null ? (iHashCode3 * 31) + uri4.hashCode() : iHashCode3;
    }

    @k
    public final String toString() {
        return AK.c.k("WebSourceRegistrationRequest { ", "WebSourceParams=[" + this.f53582a + "], TopOriginUri=" + this.f53583b + ", InputEvent=" + this.f53584c + ", AppDestination=" + this.f53585d + ", WebDestination=" + this.f53586e + ", VerifiedDestination=" + this.f53587f, " }");
    }
}
