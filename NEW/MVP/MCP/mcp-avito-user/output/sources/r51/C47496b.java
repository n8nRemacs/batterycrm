package r51;

import Y61.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: ContextClassReceiver.kt */
/* renamed from: r51.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47496b extends AbstractC47495a implements f {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42851d f429614c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final kotlin.reflect.jvm.internal.impl.name.f f429615d;

    public C47496b(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k O o12, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(o12, null);
        this.f429614c = interfaceC42851d;
        this.f429615d = fVar;
    }

    @Override // r51.f
    @l
    public final kotlin.reflect.jvm.internal.impl.name.f a() {
        return this.f429615d;
    }

    @Y61.k
    public final String toString() {
        return getType() + ": Ctx { " + this.f429614c + " }";
    }
}
