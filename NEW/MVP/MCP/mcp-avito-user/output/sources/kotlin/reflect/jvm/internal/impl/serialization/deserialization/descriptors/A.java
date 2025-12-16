package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42859c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42956m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.G;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.J;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
@s0
/* loaded from: classes8.dex */
public final class A extends AbstractC42859c {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C42956m f409784l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ProtoBuf.TypeParameter f409785m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C42947b f409786n;

    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    public static final class a extends N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            A a12 = A.this;
            C42956m c42956m = a12.f409784l;
            return C42745f0.M0(c42956m.f409936a.f409918e.i(a12.f409785m, c42956m.f409937b));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(@Y61.k C42956m c42956m, @Y61.k ProtoBuf.TypeParameter typeParameter, int i12) {
        Variance variance;
        C42954k c42954k = c42956m.f409936a;
        kotlin.reflect.jvm.internal.impl.storage.p pVar = c42954k.f409914a;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        kotlin.reflect.jvm.internal.impl.name.f fVarB = G.b(c42956m.f409937b, typeParameter.f408835f);
        J j12 = J.f409752a;
        ProtoBuf.TypeParameter.Variance variance2 = typeParameter.f408837h;
        j12.getClass();
        int iOrdinal = variance2.ordinal();
        if (iOrdinal == 0) {
            variance = Variance.f410070e;
        } else if (iOrdinal == 1) {
            variance = Variance.f410071f;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            variance = Variance.f410069d;
        }
        Variance variance3 = variance;
        super(pVar, c42956m.f409938c, c11652a, fVarB, variance3, typeParameter.f408836g, i12, b0.f407539a, e0.a.f407541a);
        this.f409784l = c42956m;
        this.f409785m = typeParameter;
        this.f409786n = new C42947b(c42954k.f409914a, new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h
    public final void F0(O o12) {
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h
    @Y61.k
    public final List<O> G0() {
        C42956m c42956m = this.f409784l;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = c42956m.f409939d;
        ProtoBuf.TypeParameter typeParameter = this.f409785m;
        List<ProtoBuf.Type> list = typeParameter.f408838i;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = typeParameter.f408839j;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.a(((Integer) it.next()).intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.singletonList(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(this).n());
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c42956m.f409943h.g((ProtoBuf.Type) it2.next()));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f409786n;
    }
}
