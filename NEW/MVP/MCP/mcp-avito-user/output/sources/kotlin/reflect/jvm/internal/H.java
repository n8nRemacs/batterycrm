package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.calls.j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;

/* compiled from: KParameterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class H extends kotlin.jvm.internal.N implements Y41.a<Type> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G f407011l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(G g12) {
        super(0);
        this.f407011l = g12;
    }

    @Override // Y41.a
    public final Type invoke() {
        kotlin.ranges.l lVar;
        kotlin.reflect.n<Object>[] nVarArr = G.f407003f;
        G g12 = this.f407011l;
        kotlin.reflect.jvm.internal.impl.descriptors.Q qH2 = g12.h();
        boolean z12 = qH2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.X;
        AbstractC43003l<?> abstractC43003l = g12.f407004b;
        if (z12) {
            CallableMemberDescriptor callableMemberDescriptorN = abstractC43003l.n();
            kotlin.reflect.jvm.internal.impl.name.c cVar = i0.f407157a;
            if (kotlin.jvm.internal.L.f(callableMemberDescriptorN.F() != null ? ((InterfaceC42851d) callableMemberDescriptorN.f()).p0() : null, qH2) && abstractC43003l.n().getKind() == CallableMemberDescriptor.Kind.f407409c) {
                Class<?> clsI = i0.i((InterfaceC42851d) abstractC43003l.n().f());
                if (clsI != null) {
                    return clsI;
                }
                throw new X("Cannot determine receiver Java type of inherited declaration: " + qH2);
            }
        }
        kotlin.reflect.jvm.internal.calls.e<?> eVarJ = abstractC43003l.j();
        boolean z13 = eVarJ instanceof kotlin.reflect.jvm.internal.calls.j;
        int i12 = g12.f407005c;
        if (!z13) {
            if (!(eVarJ instanceof j.b)) {
                return eVarJ.a().get(i12);
            }
            Class[] clsArr = (Class[]) ((Collection) ((j.b) eVarJ).f407147d.get(i12)).toArray(new Class[0]);
            return G.f(g12, (Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        kotlin.ranges.l[] lVarArr = ((kotlin.reflect.jvm.internal.calls.j) eVarJ).f407139e;
        if (i12 >= 0 && i12 < lVarArr.length) {
            lVar = lVarArr[i12];
        } else if (lVarArr.length == 0) {
            lVar = new kotlin.ranges.l(i12, i12, 1);
        } else {
            int length = ((kotlin.ranges.l) C42756l.Q(lVarArr)).f406906c + 1 + (i12 - lVarArr.length);
            lVar = new kotlin.ranges.l(length, length, 1);
        }
        Type[] typeArr = (Type[]) C42745f0.x0(((kotlin.reflect.jvm.internal.calls.j) eVarJ).f407136b.a(), lVar).toArray(new Type[0]);
        return G.f(g12, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }
}
