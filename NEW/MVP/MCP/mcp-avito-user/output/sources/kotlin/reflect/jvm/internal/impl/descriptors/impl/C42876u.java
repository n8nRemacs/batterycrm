package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: FunctionDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C42876u implements Y41.a<Collection<InterfaceC42905x>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f407699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC42878w f407700c;

    public C42876u(AbstractC42878w abstractC42878w, E0 e02) {
        this.f407700c = abstractC42878w;
        this.f407699b = e02;
    }

    @Override // Y41.a
    public final Collection<InterfaceC42905x> invoke() {
        kotlin.reflect.jvm.internal.impl.utils.f fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
        Iterator<? extends InterfaceC42905x> it = this.f407700c.p().iterator();
        while (it.hasNext()) {
            fVar.add(it.next().b(this.f407699b));
        }
        return fVar;
    }
}
