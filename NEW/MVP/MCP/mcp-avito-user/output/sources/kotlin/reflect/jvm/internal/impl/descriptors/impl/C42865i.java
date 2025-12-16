package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.r;

/* compiled from: AbstractTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C42865i implements Y41.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC42864h.b f407672b;

    public C42865i(AbstractC42864h.b bVar) {
        this.f407672b = bVar;
    }

    @Override // Y41.a
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j invoke() {
        StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
        AbstractC42864h.b bVar = this.f407672b;
        sb2.append(bVar.f407668b.b());
        String string = sb2.toString();
        List<kotlin.reflect.jvm.internal.impl.types.O> upperBounds = AbstractC42864h.this.getUpperBounds();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.r.f409702c.getClass();
        return r.a.a(string, upperBounds);
    }
}
