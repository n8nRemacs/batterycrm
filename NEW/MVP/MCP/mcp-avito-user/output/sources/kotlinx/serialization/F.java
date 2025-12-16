package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.internal.D0;

/* compiled from: Serializers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes8.dex */
final /* synthetic */ class F {

    /* compiled from: Serializers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/g;", "invoke", "()Lkotlin/reflect/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<kotlin.reflect.g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f412701l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(0);
            this.f412701l = arrayList;
        }

        @Override // Y41.a
        public final kotlin.reflect.g invoke() {
            return ((kotlin.reflect.r) this.f412701l.get(0)).getF406862b();
        }
    }

    public static final KSerializer<Object> a(kotlinx.serialization.modules.f fVar, kotlin.reflect.r rVar, boolean z12) {
        KSerializer<? extends Object> kSerializerA;
        KSerializer<Object> kSerializerB;
        kotlin.reflect.d<Object> dVarC = D0.c(rVar);
        boolean zD2 = rVar.d();
        List<kotlin.reflect.t> listD = rVar.D();
        ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            kotlin.reflect.r rVar2 = ((kotlin.reflect.t) it.next()).f410466b;
            if (rVar2 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + rVar2).toString());
            }
            arrayList.add(rVar2);
        }
        if (!arrayList.isEmpty()) {
            Object objA = !zD2 ? A.f412691c.a(dVarC, arrayList) : A.f412692d.a(dVarC, arrayList);
            int i12 = Z.f406624c;
            if (objA instanceof Z.b) {
                objA = null;
            }
            kSerializerA = (KSerializer) objA;
        } else if (zD2) {
            kSerializerA = A.f412690b.a(dVarC);
        } else {
            kSerializerA = A.f412689a.a(dVarC);
            if (kSerializerA == null) {
                kSerializerA = null;
            }
        }
        if (kSerializerA != null) {
            return kSerializerA;
        }
        if (arrayList.isEmpty()) {
            kSerializerB = fVar.b(dVarC, C42784z0.f406748b);
        } else {
            ArrayList arrayListH = C.h(fVar, arrayList, z12);
            if (arrayListH == null) {
                return null;
            }
            KSerializer<Object> kSerializerB2 = C.b(dVarC, arrayListH, new a(arrayList));
            kSerializerB = kSerializerB2 == null ? fVar.b(dVarC, arrayListH) : kSerializerB2;
        }
        if (kSerializerB == null) {
            return null;
        }
        if (zD2) {
            kSerializerB = L51.a.a(kSerializerB);
        }
        return kSerializerB;
    }
}
