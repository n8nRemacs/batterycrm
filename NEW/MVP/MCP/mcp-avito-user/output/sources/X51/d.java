package X51;

import androidx.appcompat.app.r;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.jvm.internal.L;
import s2.AbstractC47961a;
import sberid.sdk.global.models.StandName;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f18603a;

    /* renamed from: b, reason: collision with root package name */
    public final StandName f18604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18605c;

    /* renamed from: d, reason: collision with root package name */
    public final m f18606d;

    /* renamed from: e, reason: collision with root package name */
    public final p f18607e;

    /* renamed from: f, reason: collision with root package name */
    public final j f18608f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f18609g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18610h;

    /* renamed from: i, reason: collision with root package name */
    public final long f18611i;

    public d(Set set, StandName standName, String str, m mVar, p pVar, j jVar, Set set2, int i12, long j12) {
        this.f18603a = set;
        this.f18604b = standName;
        this.f18605c = str;
        this.f18606d = mVar;
        this.f18607e = pVar;
        this.f18608f = jVar;
        this.f18609g = set2;
        this.f18610h = i12;
        this.f18611i = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f18603a, dVar.f18603a) && this.f18604b == dVar.f18604b && L.f(this.f18605c, dVar.f18605c) && L.f(this.f18606d, dVar.f18606d) && L.f(this.f18607e, dVar.f18607e) && L.f(this.f18608f, dVar.f18608f) && L.f(this.f18609g, dVar.f18609g) && this.f18610h == dVar.f18610h && this.f18611i == dVar.f18611i;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18611i) + r.e(this.f18610h, androidx.media3.exoplayer.analytics.m.g(this.f18609g, AbstractC47961a.a(this.f18608f.f18629a, (this.f18607e.f18639a.hashCode() + ((this.f18606d.hashCode() + AbstractC47961a.a(this.f18605c, (this.f18604b.hashCode() + (this.f18603a.hashCode() * 31)) * 31)) * 31)) * 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigModel(blackList=");
        sb2.append(this.f18603a);
        sb2.append(", stand=");
        sb2.append(this.f18604b);
        sb2.append(", oidcWebUrl=");
        sb2.append(this.f18605c);
        sb2.append(", toggles=");
        sb2.append(this.f18606d);
        sb2.append(", versionData=");
        sb2.append(this.f18607e);
        sb2.append(", defaults=");
        sb2.append(this.f18608f);
        sb2.append(", hostWhiteList=");
        sb2.append(this.f18609g);
        sb2.append(", updateTimeAppToken=");
        sb2.append(this.f18610h);
        sb2.append(", cacheTime=");
        return AK.c.j(this.f18611i, ")", sb2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d() {
        B0 b02 = B0.f406639b;
        this(b02, StandName.f437764e, "https://online.sberbank.ru/CSAFront/oidc/authorize.do", new m(false, 31), new p(), new j("browser"), b02, 1, -1L);
    }
}
