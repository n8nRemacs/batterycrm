package f51;

import Y61.k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.y;

/* compiled from: PlatformDependentDeclarationFilter.kt */
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395658a = new a();

        @Override // f51.c
        public final boolean b(@k InterfaceC42851d interfaceC42851d, @k y yVar) {
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395659a = new b();

        @Override // f51.c
        public final boolean b(@k InterfaceC42851d interfaceC42851d, @k y yVar) {
            return !yVar.getAnnotations().i3(d.f395660a);
        }
    }

    boolean b(@k InterfaceC42851d interfaceC42851d, @k y yVar);
}
