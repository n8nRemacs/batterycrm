package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: TypeParameterDescriptor.java */
/* loaded from: classes8.dex */
public interface g0 extends InterfaceC42853f, u51.n {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    g0 a();

    int getIndex();

    @Y61.k
    kotlin.reflect.jvm.internal.impl.storage.p getStorageManager();

    @Y61.k
    List<kotlin.reflect.jvm.internal.impl.types.O> getUpperBounds();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    q0 l();

    @Y61.k
    Variance o();

    boolean s();

    boolean u();
}
