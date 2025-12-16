package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42756l;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43026i;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Annotations.kt */
@s0
/* loaded from: classes8.dex */
public final class l implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<g> f407531b;

    /* compiled from: Annotations.kt */
    public static final class a extends N implements Y41.l<g, c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c f407532l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(1);
            this.f407532l = cVar;
        }

        @Override // Y41.l
        public final c invoke(g gVar) {
            return gVar.F(this.f407532l);
        }
    }

    /* compiled from: Annotations.kt */
    public static final class b extends N implements Y41.l<g, InterfaceC43030m<? extends c>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f407533l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43030m<? extends c> invoke(g gVar) {
            return new C42770s0(gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k List<? extends g> list) {
        this.f407531b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @Y61.l
    public final c F(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return (c) C43033p.n(C43033p.y(new C42770s0(this.f407531b), new a(cVar)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean i3(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Iterator<T> it = this.f407531b.iterator();
        while (it.hasNext()) {
            if (((g) it.next()).i3(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean isEmpty() {
        List<g> list = this.f407531b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<c> iterator() {
        return new C43026i.b(C43033p.o(new C42770s0(this.f407531b), b.f407533l));
    }

    public l(@Y61.k g... gVarArr) {
        this((List<? extends g>) C42756l.g0(gVarArr));
    }
}
