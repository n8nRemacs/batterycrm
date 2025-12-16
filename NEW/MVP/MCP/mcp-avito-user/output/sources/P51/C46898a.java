package p51;

import Y61.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.L;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;

/* compiled from: SyntheticJavaPartsProvider.kt */
@s0
/* renamed from: p51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46898a implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C42784z0 f428196b;

    public C46898a(@k C42784z0 c42784z0) {
        this.f428196b = c42784z0;
    }

    @Override // p51.e
    public final void a(@k h hVar, @k InterfaceC42851d interfaceC42851d, @k ArrayList arrayList) {
        Iterator<E> it = this.f428196b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(hVar, interfaceC42851d, arrayList);
        }
    }

    @Override // p51.e
    @k
    public final ArrayList b(@k h hVar, @k f fVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.f428196b.iterator();
        while (it.hasNext()) {
            C42745f0.h(((e) it.next()).b(hVar, fVar), arrayList);
        }
        return arrayList;
    }

    @Override // p51.e
    public final void c(@k h hVar, @k InterfaceC42851d interfaceC42851d, @k kotlin.reflect.jvm.internal.impl.name.f fVar, @k kotlin.collections.builders.b bVar) {
        Iterator<E> it = this.f428196b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).c(hVar, interfaceC42851d, fVar, bVar);
        }
    }

    @Override // p51.e
    public final void d(@k h hVar, @k InterfaceC42851d interfaceC42851d, @k kotlin.reflect.jvm.internal.impl.name.f fVar, @k ArrayList arrayList) {
        Iterator<E> it = this.f428196b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).d(hVar, interfaceC42851d, fVar, arrayList);
        }
    }

    @Override // p51.e
    @k
    public final ArrayList e(@k h hVar, @k InterfaceC42851d interfaceC42851d) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.f428196b.iterator();
        while (it.hasNext()) {
            C42745f0.h(((e) it.next()).e(hVar, interfaceC42851d), arrayList);
        }
        return arrayList;
    }

    @Override // p51.e
    public final void f(@k h hVar, @k f fVar, @k kotlin.reflect.jvm.internal.impl.name.f fVar2, @k ArrayList arrayList) {
        Iterator<E> it = this.f428196b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).f(hVar, fVar, fVar2, arrayList);
        }
    }

    @Override // p51.e
    @k
    public final ArrayList g(@k h hVar, @k InterfaceC42851d interfaceC42851d) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.f428196b.iterator();
        while (it.hasNext()) {
            C42745f0.h(((e) it.next()).g(hVar, interfaceC42851d), arrayList);
        }
        return arrayList;
    }

    @Override // p51.e
    @k
    public final L h(@k h hVar, @k InterfaceC42851d interfaceC42851d, @k L l12) {
        Iterator<E> it = this.f428196b.iterator();
        while (it.hasNext()) {
            l12 = ((e) it.next()).h(hVar, interfaceC42851d, l12);
        }
        return l12;
    }
}
