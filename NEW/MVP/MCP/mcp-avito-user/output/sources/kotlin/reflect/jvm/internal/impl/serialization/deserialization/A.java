package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes8.dex */
final class A extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f409713l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h.d f409714m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AnnotatedCallableKind f409715n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(z zVar, h.d dVar, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.f409713l = zVar;
        this.f409714m = dVar;
        this.f409715n = annotatedCallableKind;
    }

    @Override // Y41.a
    public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
        z zVar = this.f409713l;
        I iA2 = zVar.a(zVar.f409968a.f409938c);
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> listD = iA2 != null ? zVar.f409968a.f409936a.f409918e.d(iA2, this.f409714m, this.f409715n) : null;
        return listD == null ? C42784z0.f406748b : listD;
    }
}
