package com.avito.android.lib.compose.design.shared.stepsbar;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StepsBarContent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/stepsbar/b;", "", "_design-modules_compose_shared_stepsbar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f177704a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f177705b;

    public b(@k String str, @l String str2) {
        this.f177704a = str;
        this.f177705b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f177704a, bVar.f177704a) && L.f(this.f177705b, bVar.f177705b);
    }

    public final int hashCode() {
        int iHashCode = this.f177704a.hashCode() * 31;
        String str = this.f177705b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Step(title=");
        sb2.append(this.f177704a);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f177705b, ')');
    }

    public /* synthetic */ b(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }
}
