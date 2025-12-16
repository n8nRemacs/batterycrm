package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: CalendarModel.kt */
@InterfaceC21537e7
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/M3;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class M3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f35104a;

    /* renamed from: b, reason: collision with root package name */
    public final char f35105b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f35106c;

    public M3(@Y61.k String str, char c12) {
        this.f35104a = str;
        this.f35105b = c12;
        this.f35106c = C43066x.a0(str, String.valueOf(c12), "", false);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M3)) {
            return false;
        }
        M3 m32 = (M3) obj;
        return kotlin.jvm.internal.L.f(this.f35104a, m32.f35104a) && this.f35105b == m32.f35105b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f35105b) + (this.f35104a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f35104a + ", delimiter=" + this.f35105b + ')';
    }
}
