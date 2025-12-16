package com.avito.android.lib.design.picker;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WheelStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/picker/m;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WheelGravity f180050a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f180051b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180052c;

    public m() {
        this(null, false, 0, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f180050a == mVar.f180050a && this.f180051b == mVar.f180051b && this.f180052c == mVar.f180052c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180052c) + r.i(this.f180050a.hashCode() * 31, 31, this.f180051b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WheelStyle(textPositon=");
        sb2.append(this.f180050a);
        sb2.append(", isCycled=");
        sb2.append(this.f180051b);
        sb2.append(", explicitWidth=");
        return r.t(sb2, this.f180052c, ')');
    }

    public m(@Y61.k WheelGravity wheelGravity, boolean z12, int i12) {
        this.f180050a = wheelGravity;
        this.f180051b = z12;
        this.f180052c = i12;
    }

    public /* synthetic */ m(WheelGravity wheelGravity, boolean z12, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? WheelGravity.f179989d : wheelGravity, (i13 & 2) != 0 ? true : z12, (i13 & 4) != 0 ? 0 : i12);
    }
}
