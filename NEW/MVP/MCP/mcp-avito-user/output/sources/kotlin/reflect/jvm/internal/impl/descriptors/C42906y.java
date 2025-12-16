package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.s0;
import u51.i;

/* compiled from: InlineClassRepresentation.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42906y<Type extends u51.i> extends i0<Type> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f f407881a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f407882b;

    public C42906y(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Type type) {
        super(null);
        this.f407881a = fVar;
        this.f407882b = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i0
    public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return kotlin.jvm.internal.L.f(this.f407881a, fVar);
    }

    @Y61.k
    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f407881a + ", underlyingType=" + this.f407882b + ')';
    }
}
