package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22939y0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
class B0 implements A0 {
    @Override // androidx.datastore.preferences.protobuf.A0
    public final C22941z0 a() {
        return C22941z0.f45986c.k();
    }

    @Override // androidx.datastore.preferences.protobuf.A0
    public final C22941z0 forMapData(Object obj) {
        return (C22941z0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.A0
    public final C22939y0.b<?, ?> forMapMetadata(Object obj) {
        return ((C22939y0) obj).f45943a;
    }

    @Override // androidx.datastore.preferences.protobuf.A0
    public final C22941z0 forMutableMapData(Object obj) {
        return (C22941z0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.A0
    public final int getSerializedSize(int i12, Object obj, Object obj2) {
        C22941z0 c22941z0 = (C22941z0) obj;
        C22939y0 c22939y0 = (C22939y0) obj2;
        int iW2 = 0;
        if (!c22941z0.isEmpty()) {
            for (Map.Entry entry : c22941z0.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c22939y0.getClass();
                int iB2 = CodedOutputStream.B(i12);
                int iA2 = C22939y0.a(c22939y0.f45943a, key, value);
                iW2 = androidx.compose.ui.graphics.colorspace.e.w(iA2, iA2, iB2, iW2);
            }
        }
        return iW2;
    }

    @Override // androidx.datastore.preferences.protobuf.A0
    public final boolean isImmutable(Object obj) {
        return !((C22941z0) obj).f45987b;
    }

    @Override // androidx.datastore.preferences.protobuf.A0
    public final C22941z0 mergeFrom(Object obj, Object obj2) {
        C22941z0 c22941z0K = (C22941z0) obj;
        C22941z0 c22941z0 = (C22941z0) obj2;
        if (!c22941z0.isEmpty()) {
            if (!c22941z0K.f45987b) {
                c22941z0K = c22941z0K.k();
            }
            c22941z0K.e();
            if (!c22941z0.isEmpty()) {
                c22941z0K.putAll(c22941z0);
            }
        }
        return c22941z0K;
    }

    @Override // androidx.datastore.preferences.protobuf.A0
    public final Object toImmutable(Object obj) {
        ((C22941z0) obj).f45987b = false;
        return obj;
    }
}
