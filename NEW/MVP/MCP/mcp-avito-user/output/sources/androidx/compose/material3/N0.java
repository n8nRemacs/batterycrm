package androidx.compose.material3;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/N0;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class N0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.l f35158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Ce f35159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C21715m2 f35160c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<C21784p2> f35161d;

    public N0(@Y61.l Long l12, @Y61.k kotlin.ranges.l lVar, @Y61.k Ce ce2, @Y61.k Locale locale) {
        C21784p2 c21784p2G;
        this.f35158a = lVar;
        this.f35159b = ce2;
        C21715m2 c21715m2 = new C21715m2(locale);
        this.f35160c = c21715m2;
        if (l12 != null) {
            c21784p2G = c21715m2.f(l12.longValue());
            int i12 = c21784p2G.f37010a;
            if (!lVar.h(i12)) {
                throw new IllegalArgumentException(("The initial display month's year (" + i12 + ") is out of the years range of " + lVar + '.').toString());
            }
        } else {
            c21784p2G = c21715m2.g(c21715m2.h());
        }
        this.f35161d = C22126m3.g(c21784p2G);
    }

    public final long a() {
        return ((C21784p2) ((C22082i3) this.f35161d).getF42167b()).f37014e;
    }
}
