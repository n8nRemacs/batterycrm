package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.I;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42945d implements InterfaceC42944c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a f409782a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C42948e f409783b;

    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C42945d(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E e12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.H h12, @Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar) {
        this.f409782a = aVar;
        this.f409783b = new C42948e(e12, h12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final ArrayList a(@Y61.k I.a aVar) {
        Iterable iterable = (List) aVar.f409746d.g(this.f409782a.f437475c);
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), aVar.f409743a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b(@Y61.k I i12, @Y61.k ProtoBuf.d dVar) {
        Iterable iterable = (List) dVar.g(this.f409782a.f437480h);
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), i12.f409743a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42944c
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c(I i12, ProtoBuf.h hVar, kotlin.reflect.jvm.internal.impl.types.O o12) {
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(hVar, this.f409782a.f437481i);
        if (value == null) {
            return null;
        }
        return this.f409783b.c(o12, value, i12.f409743a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List d(@Y61.k I i12, @Y61.k h.d dVar, @Y61.k AnnotatedCallableKind annotatedCallableKind) {
        boolean z12 = dVar instanceof ProtoBuf.e;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar = this.f409782a;
        if (z12) {
            aVar.getClass();
        } else {
            if (!(dVar instanceof ProtoBuf.h)) {
                throw new IllegalStateException(("Unknown message: " + dVar).toString());
            }
            int iOrdinal = annotatedCallableKind.ordinal();
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + annotatedCallableKind).toString());
            }
            aVar.getClass();
        }
        C42784z0 c42784z0 = C42784z0.f406748b;
        ArrayList arrayList = new ArrayList(C42745f0.q(c42784z0, 10));
        Iterator<E> it = c42784z0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), i12.f409743a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final ArrayList e(@Y61.k ProtoBuf.Type type, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        Iterable iterable = (List) type.g(this.f409782a.f437483k);
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List f(@Y61.k I i12, @Y61.k h.d dVar, @Y61.k AnnotatedCallableKind annotatedCallableKind) {
        List list;
        boolean z12 = dVar instanceof ProtoBuf.b;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar = this.f409782a;
        if (z12) {
            list = (List) ((ProtoBuf.b) dVar).g(aVar.f437474b);
        } else if (dVar instanceof ProtoBuf.e) {
            list = (List) ((ProtoBuf.e) dVar).g(aVar.f437476d);
        } else {
            if (!(dVar instanceof ProtoBuf.h)) {
                throw new IllegalStateException(("Unknown message: " + dVar).toString());
            }
            int iOrdinal = annotatedCallableKind.ordinal();
            if (iOrdinal == 1) {
                list = (List) ((ProtoBuf.h) dVar).g(aVar.f437477e);
            } else if (iOrdinal == 2) {
                list = (List) ((ProtoBuf.h) dVar).g(aVar.f437478f);
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((ProtoBuf.h) dVar).g(aVar.f437479g);
            }
        }
        if (list == null) {
            list = C42784z0.f406748b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), i12.f409743a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42944c
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g(I i12, ProtoBuf.h hVar, kotlin.reflect.jvm.internal.impl.types.O o12) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List h(@Y61.k I i12, @Y61.k h.d dVar, @Y61.k AnnotatedCallableKind annotatedCallableKind, int i13, @Y61.k ProtoBuf.l lVar) {
        Iterable iterable = (List) lVar.g(this.f409782a.f437482j);
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), i12.f409743a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final ArrayList i(@Y61.k ProtoBuf.TypeParameter typeParameter, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        Iterable iterable = (List) typeParameter.g(this.f409782a.f437484l);
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> j(@Y61.k I i12, @Y61.k ProtoBuf.h hVar) {
        this.f409782a.getClass();
        C42784z0 c42784z0 = C42784z0.f406748b;
        ArrayList arrayList = new ArrayList(C42745f0.q(c42784z0, 10));
        Iterator<E> it = c42784z0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), i12.f409743a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42949f
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k(@Y61.k I i12, @Y61.k ProtoBuf.h hVar) {
        this.f409782a.getClass();
        C42784z0 c42784z0 = C42784z0.f406748b;
        ArrayList arrayList = new ArrayList(C42745f0.q(c42784z0, 10));
        Iterator<E> it = c42784z0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f409783b.a((ProtoBuf.Annotation) it.next(), i12.f409743a));
        }
        return arrayList;
    }
}
