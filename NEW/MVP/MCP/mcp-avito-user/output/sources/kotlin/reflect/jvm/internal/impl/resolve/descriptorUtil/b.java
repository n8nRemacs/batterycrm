package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.Collection;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.b;

/* loaded from: classes8.dex */
class b implements b.d {
    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public final Iterable a(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        int i12 = c.f409615a;
        Collection<? extends CallableMemberDescriptor> collectionP = callableMemberDescriptor != null ? callableMemberDescriptor.p() : null;
        return collectionP == null ? C42784z0.f406748b : collectionP;
    }
}
