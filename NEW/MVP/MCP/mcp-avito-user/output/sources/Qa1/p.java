package Qa1;

import android.app.Application;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f13852a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f13853b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Ua1.b f13854c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C42784z0 f13855d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C42784z0 f13856e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final T11.e f13857f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final T11.e f13858g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final T11.a f13859h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<T11.a> f13860i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f13861j;

    public p(@Y61.k Application application, @Y61.k String str, @Y61.k Ua1.b bVar, @Y61.k C42784z0 c42784z0, @Y61.k C42784z0 c42784z02, @Y61.l T11.e eVar, @Y61.l T11.e eVar2, @Y61.k T11.a aVar, @Y61.k List list, @Y61.k String str2) {
        this.f13852a = application;
        this.f13853b = str;
        this.f13854c = bVar;
        this.f13855d = c42784z0;
        this.f13856e = c42784z02;
        this.f13857f = eVar;
        this.f13858g = eVar2;
        this.f13859h = aVar;
        this.f13860i = list;
        this.f13861j = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f13852a.equals(pVar.f13852a) && this.f13853b.equals(pVar.f13853b) && L.f(null, null) && this.f13854c.equals(pVar.f13854c) && L.f(this.f13855d, pVar.f13855d) && L.f(this.f13856e, pVar.f13856e) && L.f(this.f13857f, pVar.f13857f) && L.f(this.f13858g, pVar.f13858g) && this.f13859h.equals(pVar.f13859h) && L.f(this.f13860i, pVar.f13860i) && this.f13861j.equals(pVar.f13861j) && L.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.f13854c.hashCode() + H.d(this.f13852a.hashCode() * 31, 961, this.f13853b)) * 31;
        this.f13855d.getClass();
        this.f13856e.getClass();
        int i12 = (1 + ((iHashCode + 1) * 31)) * 31;
        T11.e eVar = this.f13857f;
        int iHashCode2 = (i12 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        T11.e eVar2 = this.f13858g;
        return H.d(r.i(H.e((this.f13859h.hashCode() + ((iHashCode2 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31)) * 31, 31, this.f13860i), 31, false), 31, this.f13861j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VkpnsConfig(application=");
        sb2.append(this.f13852a);
        sb2.append(", projectId=");
        sb2.append(this.f13853b);
        sb2.append(", clientIdCallback=null, logger=");
        sb2.append(this.f13854c);
        sb2.append(", additionalAuthProviders=");
        sb2.append(this.f13855d);
        sb2.append(", additionalPushProviders=");
        sb2.append(this.f13856e);
        sb2.append(", hostInfoProvider=");
        sb2.append(this.f13857f);
        sb2.append(", topicHostInfoProvider=");
        sb2.append(this.f13858g);
        sb2.append(", default=");
        sb2.append(this.f13859h);
        sb2.append(", providers=");
        sb2.append(this.f13860i);
        sb2.append(", testModeEnabled=false, sdkType=");
        return AK.c.s(sb2, this.f13861j, ", pushAdsProvider=null)");
    }
}
