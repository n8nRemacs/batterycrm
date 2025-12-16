package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import k51.InterfaceC42522g;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JavaClassFinder.kt */
/* loaded from: classes8.dex */
public interface r {

    /* compiled from: JavaClassFinder.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.b f408298a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final byte[] f408299b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final InterfaceC42522g f408300c;

        public a(kotlin.reflect.jvm.internal.impl.name.b bVar, byte[] bArr, InterfaceC42522g interfaceC42522g, int i12, C42822w c42822w) {
            bArr = (i12 & 2) != 0 ? null : bArr;
            interfaceC42522g = (i12 & 4) != 0 ? null : interfaceC42522g;
            this.f408298a = bVar;
            this.f408299b = bArr;
            this.f408300c = interfaceC42522g;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f408298a, aVar.f408298a) && L.f(this.f408299b, aVar.f408299b) && L.f(this.f408300c, aVar.f408300c);
        }

        public final int hashCode() {
            int iHashCode = this.f408298a.hashCode() * 31;
            byte[] bArr = this.f408299b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC42522g interfaceC42522g = this.f408300c;
            return iHashCode2 + (interfaceC42522g != null ? interfaceC42522g.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Request(classId=" + this.f408298a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f408299b) + ", outerClass=" + this.f408300c + ')';
        }
    }

    @Y61.l
    kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.E a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar);

    @Y61.l
    kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t b(@Y61.k a aVar);
}
