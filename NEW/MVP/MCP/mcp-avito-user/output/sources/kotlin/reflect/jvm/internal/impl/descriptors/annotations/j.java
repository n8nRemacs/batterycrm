package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes8.dex */
final class j extends N implements Y41.a<Y> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f407526l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(0);
        this.f407526l = kVar;
    }

    @Override // Y41.a
    public final Y invoke() {
        k kVar = this.f407526l;
        return kVar.f407527a.i(kVar.f407528b).q();
    }
}
