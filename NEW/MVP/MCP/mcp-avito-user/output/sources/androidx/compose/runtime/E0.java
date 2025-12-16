package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/E0;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public ArrayList<Object> f37964a;

    public final boolean a(C22068g c22068g) {
        ArrayList<Object> arrayList = this.f37964a;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = arrayList.get(i12);
            if (kotlin.jvm.internal.L.f(obj, c22068g) || ((obj instanceof E0) && ((E0) obj).a(c22068g))) {
                return true;
            }
        }
        return false;
    }

    public final E0 b() {
        Object obj;
        ArrayList<Object> arrayList = this.f37964a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if (obj instanceof E0) {
                    ((E0) obj).getClass();
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        E0 e02 = obj instanceof E0 ? (E0) obj : null;
        return e02 != null ? e02.b() : this;
    }

    public final boolean c(@Y61.k C22068g c22068g) {
        ArrayList<Object> arrayList = this.f37964a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C22068g) {
                    if (kotlin.jvm.internal.L.f(obj, c22068g)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof E0) && !((E0) obj).c(c22068g)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f37964a = null;
                return false;
            }
        }
        return true;
    }
}
