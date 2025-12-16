package androidx.versionedparcelable;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* compiled from: VersionedParcel.java */
/* loaded from: classes10.dex */
class e extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
        return cls != null ? cls : super.resolveClass(objectStreamClass);
    }
}
