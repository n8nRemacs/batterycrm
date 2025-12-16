package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.P;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes8.dex */
public final class y extends P implements c {

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final ProtoBuf.e f409883F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f409884G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f409885H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f409886I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final j f409887J;

    public /* synthetic */ y(InterfaceC42882k interfaceC42882k, a0 a0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.name.f fVar, CallableMemberDescriptor.Kind kind, ProtoBuf.e eVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, j jVar, b0 b0Var, int i12, C42822w c42822w) {
        this(interfaceC42882k, a0Var, gVar, fVar, kind, eVar, cVar, gVar2, hVar, jVar, (i12 & 1024) != 0 ? null : b0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c D() {
        return this.f409884G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.l
    public final j E() {
        return this.f409887J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @Y61.k
    public final AbstractC42878w F0(@Y61.k CallableMemberDescriptor.Kind kind, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.l InterfaceC42905x interfaceC42905x, @Y61.k b0 b0Var, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        y yVar = new y(interfaceC42882k, (a0) interfaceC42905x, gVar, fVar == null ? getName() : fVar, kind, this.f409883F, this.f409884G, this.f409885H, this.f409886I, this.f409887J, b0Var);
        yVar.f407725x = this.f407725x;
        return yVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g a0() {
        return this.f409885H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    public final kotlin.reflect.jvm.internal.impl.protobuf.o v() {
        return this.f409883F;
    }

    public y(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.l a0 a0Var, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k ProtoBuf.e eVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @Y61.l j jVar, @Y61.l b0 b0Var) {
        super(interfaceC42882k, a0Var, gVar, fVar, kind, b0Var == null ? b0.f407539a : b0Var);
        this.f409883F = eVar;
        this.f409884G = cVar;
        this.f409885H = gVar2;
        this.f409886I = hVar;
        this.f409887J = jVar;
    }
}
