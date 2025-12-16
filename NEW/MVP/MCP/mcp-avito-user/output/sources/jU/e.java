package JU;

import Y61.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FlexibleLine.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJU/e;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f9008a;

    /* renamed from: b, reason: collision with root package name */
    public int f9009b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Integer> f9010c;

    public e() {
        this(0, 0, null, 7, null);
    }

    public e(int i12, int i13, List list, int i14, C42822w c42822w) {
        i12 = (i14 & 1) != 0 ? 0 : i12;
        i13 = (i14 & 2) != 0 ? 0 : i13;
        list = (i14 & 4) != 0 ? new ArrayList() : list;
        this.f9008a = i12;
        this.f9009b = i13;
        this.f9010c = list;
    }
}
