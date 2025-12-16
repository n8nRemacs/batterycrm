package kotlinx.datetime.internal.format;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FormatStructure.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/h;", "T", "Lkotlinx/datetime/internal/format/o;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class h<T> implements o<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412524a;

    public h(@Y61.k ArrayList arrayList) {
        this.f412524a = arrayList;
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public J51.e<T> b() {
        ArrayList arrayList = this.f412524a;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t) it.next()).b());
        }
        return arrayList2.size() == 1 ? (J51.e) C42745f0.u0(arrayList2) : new J51.a();
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public kotlinx.datetime.internal.format.parser.v<T> c() {
        ArrayList arrayList = this.f412524a;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t) it.next()).c());
        }
        return kotlinx.datetime.internal.format.parser.r.a(arrayList2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof h) {
            if (L.f(this.f412524a, ((h) obj).f412524a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412524a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ConcatenatedFormatStructure("), C42745f0.O(this.f412524a, ", ", null, null, null, 62), ')');
    }
}
