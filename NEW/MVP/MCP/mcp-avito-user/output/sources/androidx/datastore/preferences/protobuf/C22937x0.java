package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory.java */
/* renamed from: androidx.datastore.preferences.protobuf.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22937x0 implements InterfaceC22900h1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f45940b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f45941a;

    /* compiled from: ManifestSchemaFactory.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x0$a */
    public static class a implements E0 {
        @Override // androidx.datastore.preferences.protobuf.E0
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.E0
        public final D0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x0$b */
    public static class b implements E0 {

        /* renamed from: a, reason: collision with root package name */
        public E0[] f45942a;

        @Override // androidx.datastore.preferences.protobuf.E0
        public final boolean isSupported(Class<?> cls) {
            for (E0 e02 : this.f45942a) {
                if (e02.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.E0
        public final D0 messageInfoFor(Class<?> cls) {
            for (E0 e02 : this.f45942a) {
                if (e02.isSupported(cls)) {
                    return e02.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public C22937x0() {
        E0 e02;
        try {
            e02 = (E0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            e02 = f45940b;
        }
        E0[] e0Arr = {C22896g0.f45840a, e02};
        b bVar = new b();
        bVar.f45942a = e0Arr;
        Charset charset = C22914m0.f45874a;
        this.f45941a = bVar;
    }
}
