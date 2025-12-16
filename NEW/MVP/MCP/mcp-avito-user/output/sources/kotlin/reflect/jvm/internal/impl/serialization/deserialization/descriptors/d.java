package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes8.dex */
public final class d extends C42866j implements c {

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final ProtoBuf.b f409795G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f409796H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f409797I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f409798J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final j f409799K;

    public /* synthetic */ d(InterfaceC42851d interfaceC42851d, InterfaceC42881j interfaceC42881j, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z12, CallableMemberDescriptor.Kind kind, ProtoBuf.b bVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, j jVar, b0 b0Var, int i12, C42822w c42822w) {
        this(interfaceC42851d, interfaceC42881j, gVar, z12, kind, bVar, cVar, gVar2, hVar, jVar, (i12 & 1024) != 0 ? null : b0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c D() {
        return this.f409796H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.l
    public final j E() {
        return this.f409799K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    public final AbstractC42878w F0(CallableMemberDescriptor.Kind kind, InterfaceC42882k interfaceC42882k, InterfaceC42905x interfaceC42905x, b0 b0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        d dVar = new d((InterfaceC42851d) interfaceC42882k, (InterfaceC42881j) interfaceC42905x, gVar, this.f407673F, kind, this.f409795G, this.f409796H, this.f409797I, this.f409798J, this.f409799K, b0Var);
        dVar.f407725x = this.f407725x;
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j
    /* renamed from: O0 */
    public final C42866j F0(CallableMemberDescriptor.Kind kind, InterfaceC42882k interfaceC42882k, InterfaceC42905x interfaceC42905x, b0 b0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        d dVar = new d((InterfaceC42851d) interfaceC42882k, (InterfaceC42881j) interfaceC42905x, gVar, this.f407673F, kind, this.f409795G, this.f409796H, this.f409797I, this.f409798J, this.f409799K, b0Var);
        dVar.f407725x = this.f407725x;
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean Z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g a0() {
        return this.f409797I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    public final kotlin.reflect.jvm.internal.impl.protobuf.o v() {
        return this.f409795G;
    }

    public d(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.l InterfaceC42881j interfaceC42881j, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z12, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k ProtoBuf.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @Y61.l j jVar, @Y61.l b0 b0Var) {
        super(interfaceC42851d, interfaceC42881j, gVar, z12, kind, b0Var == null ? b0.f407539a : b0Var);
        this.f409795G = bVar;
        this.f409796H = cVar;
        this.f409797I = gVar2;
        this.f409798J = hVar;
        this.f409799K = jVar;
    }
}
