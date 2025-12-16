package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42782y0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Annotations.kt */
/* loaded from: classes8.dex */
public interface g extends Iterable<c>, Z41.a {

    /* renamed from: s2, reason: collision with root package name */
    @Y61.k
    public static final a f407522s2 = a.f407523a;

    /* compiled from: Annotations.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f407523a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C11652a f407524b = new C11652a();

        /* compiled from: Annotations.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a, reason: collision with other inner class name */
        public static final class C11652a implements g {
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public final /* bridge */ /* synthetic */ c F(kotlin.reflect.jvm.internal.impl.name.c cVar) {
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public final boolean i3(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            @Y61.k
            public final Iterator<c> iterator() {
                C42784z0.f406748b.getClass();
                return C42782y0.f406747b;
            }

            @Y61.k
            public final String toString() {
                return "EMPTY";
            }
        }

        @Y61.k
        public static g a(@Y61.k List list) {
            return list.isEmpty() ? f407524b : new h(list);
        }
    }

    /* compiled from: Annotations.kt */
    @s0
    public static final class b {
    }

    @Y61.l
    c F(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar);

    boolean i3(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar);

    boolean isEmpty();
}
