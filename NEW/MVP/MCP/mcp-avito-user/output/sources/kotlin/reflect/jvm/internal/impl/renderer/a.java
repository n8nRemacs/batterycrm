package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.compose.foundation.H;
import java.util.ArrayList;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;

/* compiled from: ClassifierNamePolicy.kt */
/* loaded from: classes8.dex */
public interface a {

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.a$a, reason: collision with other inner class name */
    public static final class C11681a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C11681a f409465a = new C11681a();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @Y61.k
        public final String a(@Y61.k InterfaceC42853f interfaceC42853f, @Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            return interfaceC42853f instanceof g0 ? cVar.Q(((g0) interfaceC42853f).getName(), false) : cVar.I(kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42853f));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f409466a = new b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.f] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.G, kotlin.reflect.jvm.internal.impl.descriptors.k] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.k] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @Y61.k
        public final String a(@Y61.k InterfaceC42853f interfaceC42853f, @Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            if (interfaceC42853f instanceof g0) {
                return cVar.Q(((g0) interfaceC42853f).getName(), false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(interfaceC42853f.getName());
                interfaceC42853f = interfaceC42853f.f();
            } while (interfaceC42853f instanceof InterfaceC42851d);
            return m.b(C42745f0.l(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f409467a = new c();

        public static String b(InterfaceC42853f interfaceC42853f) {
            String strA = m.a(interfaceC42853f.getName());
            if (interfaceC42853f instanceof g0) {
                return strA;
            }
            InterfaceC42882k interfaceC42882kF = interfaceC42853f.f();
            String strB = interfaceC42882kF instanceof InterfaceC42851d ? b((InterfaceC42853f) interfaceC42882kF) : interfaceC42882kF instanceof K ? m.b(((K) interfaceC42882kF).d().i().e()) : null;
            return (strB == null || strB.equals("")) ? strA : H.i('.', strB, strA);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @Y61.k
        public final String a(@Y61.k InterfaceC42853f interfaceC42853f, @Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            return b(interfaceC42853f);
        }
    }

    @Y61.k
    String a(@Y61.k InterfaceC42853f interfaceC42853f, @Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar);
}
