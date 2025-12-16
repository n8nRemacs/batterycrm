package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.L;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes8.dex */
public final class x extends L implements c {

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final ProtoBuf.h f409878B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f409879C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f409880D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f409881E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.t f409882F;

    public x(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.l U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, boolean z12, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k CallableMemberDescriptor.Kind kind, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, @Y61.k ProtoBuf.h hVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar2, @Y61.l kotlin.reflect.jvm.internal.impl.load.kotlin.t tVar) {
        super(interfaceC42882k, u12, gVar, modality, abstractC42900s, z12, fVar, kind, b0.f407539a, z13, z14, z17, z15, z16);
        this.f409878B = hVar;
        this.f409879C = cVar;
        this.f409880D = gVar2;
        this.f409881E = hVar2;
        this.f409882F = tVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c D() {
        return this.f409879C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.l
    public final j E() {
        return this.f409882F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.L
    @Y61.k
    public final L I0(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, @Y61.l U u12, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k b0 b0Var) {
        return new x(interfaceC42882k, u12, getAnnotations(), modality, abstractC42900s, this.f407639g, fVar, kind, this.f407588o, this.f407589p, isExternal(), this.f407592s, this.f407590q, this.f409878B, this.f409879C, this.f409880D, this.f409881E, this.f409882F);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g a0() {
        return this.f409880D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.L, kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409100E.e(this.f409878B.f408988e).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    public final kotlin.reflect.jvm.internal.impl.protobuf.o v() {
        return this.f409878B;
    }
}
