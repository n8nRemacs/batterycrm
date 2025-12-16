package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Platform.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final SerialDescriptor[] f412762a = new SerialDescriptor[0];

    @Y61.k
    public static final Set<String> a(@Y61.k SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof InterfaceC43417n) {
            return ((InterfaceC43417n) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getF412801c());
        int f412801c = serialDescriptor.getF412801c();
        for (int i12 = 0; i12 < f412801c; i12++) {
            hashSet.add(serialDescriptor.d(i12));
        }
        return hashSet;
    }

    @Y61.k
    public static final SerialDescriptor[] b(@Y61.l List<? extends SerialDescriptor> list) {
        SerialDescriptor[] serialDescriptorArr;
        List<? extends SerialDescriptor> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f412762a : serialDescriptorArr;
    }

    @Y61.k
    public static final kotlin.reflect.d<Object> c(@Y61.k kotlin.reflect.r rVar) {
        kotlin.reflect.g gVarK = rVar.K();
        if (gVarK instanceof kotlin.reflect.d) {
            return (kotlin.reflect.d) gVarK;
        }
        if (!(gVarK instanceof kotlin.reflect.s)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + gVarK);
        }
        throw new IllegalArgumentException("Captured type parameter " + gVarK + " from generic non-reified function. Such functionality cannot be supported because " + gVarK + " is erased, either specify serializer explicitly or make calling function inline with reified " + gVarK + '.');
    }
}
