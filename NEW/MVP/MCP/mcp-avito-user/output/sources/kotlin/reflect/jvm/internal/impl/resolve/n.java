package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes8.dex */
public abstract class n {
    public abstract void a(@Y61.k CallableMemberDescriptor callableMemberDescriptor);

    public void b(@Y61.k CallableMemberDescriptor callableMemberDescriptor, @Y61.k Collection<? extends CallableMemberDescriptor> collection) {
        callableMemberDescriptor.l0(collection);
    }
}
