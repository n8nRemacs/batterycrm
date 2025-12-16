package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: annotationUtil.kt */
/* loaded from: classes8.dex */
final class e extends N implements Y41.l<E, O> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.k f407516l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.reflect.jvm.internal.impl.builtins.k kVar) {
        super(1);
        this.f407516l = kVar;
    }

    @Override // Y41.l
    public final O invoke(E e12) {
        kotlin.reflect.jvm.internal.impl.builtins.k kVarM = e12.m();
        Variance variance = Variance.f410069d;
        return kVarM.g(this.f407516l.t());
    }
}
