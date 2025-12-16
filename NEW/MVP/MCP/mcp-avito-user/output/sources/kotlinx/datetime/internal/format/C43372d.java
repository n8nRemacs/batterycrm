package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Builder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/internal/format/d;", "T", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.internal.format.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43372d<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412518a = new ArrayList();

    public final void a(@Y61.k o<? super T> oVar) {
        boolean z12 = oVar instanceof t;
        ArrayList arrayList = this.f412518a;
        if (z12) {
            arrayList.add(oVar);
        } else if (oVar instanceof h) {
            Iterator<T> it = ((h) oVar).f412524a.iterator();
            while (it.hasNext()) {
                arrayList.add((t) it.next());
            }
        }
    }
}
