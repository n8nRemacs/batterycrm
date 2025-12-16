package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: ClassData.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42950g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f409900a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProtoBuf.Class f409901b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f409902c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b0 f409903d;

    public C42950g(@Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k ProtoBuf.Class r22, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @Y61.k b0 b0Var) {
        this.f409900a = cVar;
        this.f409901b = r22;
        this.f409902c = aVar;
        this.f409903d = b0Var;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42950g)) {
            return false;
        }
        C42950g c42950g = (C42950g) obj;
        return kotlin.jvm.internal.L.f(this.f409900a, c42950g.f409900a) && kotlin.jvm.internal.L.f(this.f409901b, c42950g.f409901b) && kotlin.jvm.internal.L.f(this.f409902c, c42950g.f409902c) && kotlin.jvm.internal.L.f(this.f409903d, c42950g.f409903d);
    }

    public final int hashCode() {
        return this.f409903d.hashCode() + ((this.f409902c.hashCode() + ((this.f409901b.hashCode() + (this.f409900a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ClassData(nameResolver=" + this.f409900a + ", classProto=" + this.f409901b + ", metadataVersion=" + this.f409902c + ", sourceElement=" + this.f409903d + ')';
    }
}
