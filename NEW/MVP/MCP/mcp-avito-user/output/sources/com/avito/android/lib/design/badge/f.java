package com.avito.android.lib.design.badge;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BadgeState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/badge/f;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final CharSequence f178392a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f178393b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f178394c;

    public f() {
        this(null, null, false, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f178392a, fVar.f178392a) && L.f(this.f178393b, fVar.f178393b) && this.f178394c == fVar.f178394c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f178392a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Boolean bool = this.f178393b;
        return Boolean.hashCode(this.f178394c) + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeState(text=");
        sb2.append((Object) this.f178392a);
        sb2.append(", isPulsing=");
        sb2.append(this.f178393b);
        sb2.append(", shouldShowAnimated=");
        return r.x(sb2, this.f178394c, ')');
    }

    public f(@l CharSequence charSequence, @l Boolean bool, boolean z12) {
        this.f178392a = charSequence;
        this.f178393b = bool;
        this.f178394c = z12;
    }

    public /* synthetic */ f(CharSequence charSequence, Boolean bool, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? true : z12);
    }
}
