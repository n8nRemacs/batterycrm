package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes8.dex */
final class y extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f409965l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h.d f409966m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AnnotatedCallableKind f409967n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, h.d dVar, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.f409965l = zVar;
        this.f409966m = dVar;
        this.f409967n = annotatedCallableKind;
    }

    @Override // Y41.a
    public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
        z zVar = this.f409965l;
        I iA2 = zVar.a(zVar.f409968a.f409938c);
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> listM0 = iA2 != null ? C42745f0.M0(zVar.f409968a.f409936a.f409918e.f(iA2, this.f409966m, this.f409967n)) : null;
        return listM0 == null ? C42784z0.f406748b : listM0;
    }
}
