package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineList.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/internal/w;", "E", "", "holder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43252w<E> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Object f411933a;

    @Y61.k
    public static final Object a(Object obj, E e12) {
        if (obj == null) {
            return e12;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e12);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e12);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C43252w) {
            return kotlin.jvm.internal.L.f(this.f411933a, ((C43252w) obj).f411933a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f411933a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "InlineList(holder=" + this.f411933a + ')';
    }
}
