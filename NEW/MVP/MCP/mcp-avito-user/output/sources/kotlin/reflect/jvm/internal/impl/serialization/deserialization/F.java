package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes8.dex */
final class F extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f409733l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I f409734m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h.d f409735n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AnnotatedCallableKind f409736o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f409737p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ProtoBuf.l f409738q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(z zVar, I i12, h.d dVar, AnnotatedCallableKind annotatedCallableKind, int i13, ProtoBuf.l lVar) {
        super(0);
        this.f409733l = zVar;
        this.f409734m = i12;
        this.f409735n = dVar;
        this.f409736o = annotatedCallableKind;
        this.f409737p = i13;
        this.f409738q = lVar;
    }

    @Override // Y41.a
    public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
        InterfaceC42944c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> interfaceC42944c = this.f409733l.f409968a.f409936a.f409918e;
        AnnotatedCallableKind annotatedCallableKind = this.f409736o;
        return C42745f0.M0(interfaceC42944c.h(this.f409734m, this.f409735n, annotatedCallableKind, this.f409737p, this.f409738q));
    }
}
