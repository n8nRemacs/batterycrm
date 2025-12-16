package com.yandex.div.core.player;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

/* compiled from: DivPlayerPlaybackConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/player/d;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f367618a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f367619b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f367620c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final JSONObject f367621d;

    public d() {
        this(false, false, false, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f367618a == dVar.f367618a && this.f367619b == dVar.f367619b && this.f367620c == dVar.f367620c && L.f(this.f367621d, dVar.f367621d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z12 = this.f367618a;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = i12 * 31;
        boolean z13 = this.f367619b;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z14 = this.f367620c;
        int i16 = (i15 + (z14 ? 1 : z14 ? 1 : 0)) * 31;
        JSONObject jSONObject = this.f367621d;
        return i16 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @k
    public final String toString() {
        return "DivPlayerPlaybackConfig(autoplay=" + this.f367618a + ", isMuted=" + this.f367619b + ", repeatable=" + this.f367620c + ", payload=" + this.f367621d + ')';
    }

    public d(boolean z12, boolean z13, boolean z14, JSONObject jSONObject, int i12, C42822w c42822w) {
        z12 = (i12 & 1) != 0 ? false : z12;
        z13 = (i12 & 2) != 0 ? false : z13;
        z14 = (i12 & 4) != 0 ? false : z14;
        jSONObject = (i12 & 8) != 0 ? null : jSONObject;
        this.f367618a = z12;
        this.f367619b = z13;
        this.f367620c = z14;
        this.f367621d = jSONObject;
    }
}
