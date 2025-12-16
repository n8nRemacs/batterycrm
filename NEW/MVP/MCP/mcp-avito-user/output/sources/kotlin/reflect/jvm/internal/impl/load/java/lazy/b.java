package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import k51.InterfaceC42522g;
import k51.z;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42852e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.load.java.A;

/* compiled from: context.kt */
/* loaded from: classes8.dex */
public final class b {

    /* compiled from: context.kt */
    public static final class a extends N implements Y41.a<A> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f408074l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f408075m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            super(0);
            this.f408074l = hVar;
            this.f408075m = gVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final A invoke() {
            h hVar = this.f408074l;
            c cVar = hVar.f408253a;
            return cVar.f408092q.b((A) hVar.f408256d.getValue(), this.f408075m);
        }
    }

    public static final h a(h hVar, InterfaceC42883l interfaceC42883l, z zVar, int i12, InterfaceC42726C interfaceC42726C) {
        return new h(hVar.f408253a, zVar != null ? new j(hVar, interfaceC42883l, zVar, i12) : hVar.f408254b, interfaceC42726C);
    }

    public static h b(h hVar, InterfaceC42852e interfaceC42852e, InterfaceC42522g interfaceC42522g, int i12) {
        if ((i12 & 2) != 0) {
            interfaceC42522g = null;
        }
        return a(hVar, interfaceC42852e, interfaceC42522g, 0, C42727D.b(LazyThreadSafetyMode.f406616d, new kotlin.reflect.jvm.internal.impl.load.java.lazy.a(hVar, interfaceC42852e)));
    }

    @Y61.k
    public static final h c(@Y61.k h hVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (gVar.isEmpty()) {
            return hVar;
        }
        return new h(hVar.f408253a, hVar.f408254b, C42727D.b(LazyThreadSafetyMode.f406616d, new a(hVar, gVar)));
    }
}
