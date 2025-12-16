package shark;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import shark.M1;

/* compiled from: ObjectReporter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/U2;", "", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class U2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet<String> f438215a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f438216b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f438217c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final M1 f438218d;

    public U2(@Y61.k M1 m12) {
        this.f438218d = m12;
    }

    public final void a(@Y61.k Y41.p pVar, @Y61.k String str) {
        M1 m12 = this.f438218d;
        if ((m12 instanceof M1.c) && ((M1.c) m12).h(str)) {
            pVar.invoke(this, m12);
        }
    }
}
