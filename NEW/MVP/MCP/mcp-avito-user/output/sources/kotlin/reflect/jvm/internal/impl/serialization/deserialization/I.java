package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: ProtoContainer.kt */
/* loaded from: classes8.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f409743a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f409744b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final b0 f409745c;

    /* compiled from: ProtoContainer.kt */
    public static final class a extends I {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ProtoBuf.Class f409746d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final a f409747e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.b f409748f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final ProtoBuf.Class.Kind f409749g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f409750h;

        public a(@Y61.k ProtoBuf.Class r22, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @Y61.l b0 b0Var, @Y61.l a aVar) {
            super(cVar, gVar, b0Var, null);
            this.f409746d = r22;
            this.f409747e = aVar;
            this.f409748f = G.a(cVar, r22.f408642f);
            ProtoBuf.Class.Kind kindC = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409115f.c(r22.f408641e);
            this.f409749g = kindC == null ? ProtoBuf.Class.Kind.CLASS : kindC;
            this.f409750h = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409116g.e(r22.f408641e).booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.I
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.c a() {
            return this.f409748f.b();
        }
    }

    /* compiled from: ProtoContainer.kt */
    public static final class b extends I {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.c f409751d;

        public b(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @Y61.l kotlin.reflect.jvm.internal.impl.load.kotlin.t tVar) {
            super(cVar2, gVar, tVar, null);
            this.f409751d = cVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.I
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.c a() {
            return this.f409751d;
        }
    }

    public I(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, b0 b0Var, C42822w c42822w) {
        this.f409743a = cVar;
        this.f409744b = gVar;
        this.f409745c = b0Var;
    }

    @Y61.k
    public abstract kotlin.reflect.jvm.internal.impl.name.c a();

    @Y61.k
    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
