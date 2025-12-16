package com.avito.beduin.v2.repository.environment;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Environment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/h;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f338235a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Orientation f338236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f338237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f338238d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f338239e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final k f338240f;

    public h(@Y61.k String str, @Y61.k Orientation orientation, int i12, int i13, @Y61.k String str2, @Y61.k k kVar) {
        Platform platform = Platform.f338205b;
        this.f338235a = str;
        this.f338236b = orientation;
        this.f338237c = i12;
        this.f338238d = i13;
        this.f338239e = str2;
        this.f338240f = kVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.getClass();
        Platform platform = Platform.f338205b;
        return L.f(this.f338235a, hVar.f338235a) && this.f338236b == hVar.f338236b && this.f338237c == hVar.f338237c && this.f338238d == hVar.f338238d && this.f338239e.equals(hVar.f338239e) && this.f338240f.equals(hVar.f338240f);
    }

    public final int hashCode() {
        return this.f338240f.hashCode() + H.d(r.i(r.e(this.f338238d, r.e(this.f338237c, (this.f338236b.hashCode() + r.i(H.d(Platform.f338205b.hashCode() * 31, 31, this.f338235a), 31, false)) * 31, 31), 31), 31, true), 31, this.f338239e);
    }

    @Y61.k
    public final String toString() {
        return "Environment(platform=" + Platform.f338205b + ", osVersion=" + this.f338235a + ", hasLidar=false, orientation=" + this.f338236b + ", screenWidthDp=" + this.f338237c + ", screenHeightDp=" + this.f338238d + ", isProduction=true, appVersion=" + this.f338239e + ", safeAreaInsets=" + this.f338240f + ')';
    }
}
