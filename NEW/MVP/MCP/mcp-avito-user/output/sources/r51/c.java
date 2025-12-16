package r51;

import Y61.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: ContextReceiver.kt */
/* loaded from: classes8.dex */
public final class c extends AbstractC47495a implements f {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC42871o f429616c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final kotlin.reflect.jvm.internal.impl.name.f f429617d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k O o12, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l h hVar) {
        super(o12, hVar);
        this.f429616c = (AbstractC42871o) interfaceC42848a;
        this.f429617d = fVar;
    }

    @Override // r51.f
    @l
    public final kotlin.reflect.jvm.internal.impl.name.f a() {
        return this.f429617d;
    }

    @Y61.k
    public final String toString() {
        return "Cxt { " + this.f429616c + " }";
    }
}
