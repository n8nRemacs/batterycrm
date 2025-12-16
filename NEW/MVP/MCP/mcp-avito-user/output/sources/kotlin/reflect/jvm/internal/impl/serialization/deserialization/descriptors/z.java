package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42861e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.C0;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.Q;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes8.dex */
public final class z extends AbstractC42861e implements k {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ProtoBuf.j f409888l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f409889m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f409890n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f409891o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.t f409892p;

    /* renamed from: q, reason: collision with root package name */
    public Y f409893q;

    /* renamed from: r, reason: collision with root package name */
    public Y f409894r;

    /* renamed from: s, reason: collision with root package name */
    public List<? extends g0> f409895s;

    /* renamed from: t, reason: collision with root package name */
    public Y f409896t;

    public z(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k AbstractC42887p abstractC42887p, @Y61.k ProtoBuf.j jVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @Y61.l kotlin.reflect.jvm.internal.impl.load.kotlin.t tVar) {
        super(pVar, interfaceC42882k, gVar, fVar, b0.f407539a, abstractC42887p);
        this.f409888l = jVar;
        this.f409889m = cVar;
        this.f409890n = gVar2;
        this.f409891o = hVar;
        this.f409892p = tVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @Y61.k
    public final Y B0() {
        Y y12 = this.f409893q;
        if (y12 != null) {
            return y12;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @Y61.k
    public final Y C() {
        Y y12 = this.f409894r;
        if (y12 != null) {
            return y12;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c D() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.l
    public final j E() {
        return this.f409892p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42861e
    @Y61.k
    public final List<g0> F0() {
        List list = this.f409895s;
        if (list == null) {
            return null;
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g a0() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final InterfaceC42883l b(E0 e02) {
        if (e02.f410010a.e()) {
            return this;
        }
        z zVar = new z(this.f407651f, f(), getAnnotations(), getName(), this.f407652g, this.f409888l, this.f409889m, this.f409890n, this.f409891o, this.f409892p);
        List<g0> listR = r();
        Y y12 = this.f409893q;
        if (y12 == null) {
            y12 = null;
        }
        Variance variance = Variance.f410069d;
        Y yA2 = C0.a(e02.h(y12, variance));
        Y y13 = this.f409894r;
        Y yA3 = C0.a(e02.h(y13 != null ? y13 : null, variance));
        zVar.f407654i = listR;
        zVar.f409893q = yA2;
        zVar.f409894r = yA3;
        zVar.f409895s = h0.b(zVar);
        zVar.f409896t = zVar.n0();
        return zVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @Y61.l
    public final InterfaceC42851d k() {
        Y y12 = this.f409894r;
        if (y12 == null) {
            y12 = null;
        }
        if (Q.a(y12)) {
            return null;
        }
        Y y13 = this.f409894r;
        if (y13 == null) {
            y13 = null;
        }
        InterfaceC42853f interfaceC42853fB = y13.H0().b();
        if (interfaceC42853fB instanceof InterfaceC42851d) {
            return (InterfaceC42851d) interfaceC42853fB;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final Y q() {
        Y y12 = this.f409896t;
        if (y12 == null) {
            return null;
        }
        return y12;
    }
}
