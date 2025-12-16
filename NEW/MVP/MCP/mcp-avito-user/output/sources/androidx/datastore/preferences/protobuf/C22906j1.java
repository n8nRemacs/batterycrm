package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22884c0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SmallSortedMap.java */
/* renamed from: androidx.datastore.preferences.protobuf.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22906j1 extends C22909k1<Object, Object> {
    @Override // androidx.datastore.preferences.protobuf.C22909k1
    public final void f() {
        if (!this.f45853e) {
            for (int i12 = 0; i12 < this.f45851c.size(); i12++) {
                ((C22884c0.c) c(i12).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = d().iterator();
            while (it.hasNext()) {
                ((C22884c0.c) it.next().getKey()).getClass();
            }
        }
        super.f();
    }

    @Override // androidx.datastore.preferences.protobuf.C22909k1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C22884c0.c) obj, obj2);
    }
}
