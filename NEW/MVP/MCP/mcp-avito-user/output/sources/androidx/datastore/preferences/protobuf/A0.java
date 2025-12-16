package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22939y0;

/* compiled from: MapFieldSchema.java */
/* loaded from: classes.dex */
interface A0 {
    C22941z0 a();

    C22941z0 forMapData(Object obj);

    C22939y0.b<?, ?> forMapMetadata(Object obj);

    C22941z0 forMutableMapData(Object obj);

    int getSerializedSize(int i12, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    C22941z0 mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
