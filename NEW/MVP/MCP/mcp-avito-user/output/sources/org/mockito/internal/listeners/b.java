package org.mockito.internal.listeners;

import e81.InterfaceC39968b;
import g81.e;
import g81.f;
import h81.InterfaceC40782a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import l81.l;
import org.mockito.internal.stubbing.h;

/* compiled from: StubbingLookupNotifier.java */
/* loaded from: classes7.dex */
public final class b {

    /* compiled from: StubbingLookupNotifier.java */
    public static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final org.mockito.internal.invocation.e f421687a;

        /* renamed from: b, reason: collision with root package name */
        public final h f421688b;

        /* renamed from: c, reason: collision with root package name */
        public final LinkedList f421689c;

        /* renamed from: d, reason: collision with root package name */
        public final N71.a f421690d;

        public a(org.mockito.internal.invocation.e eVar, h hVar, LinkedList linkedList, N71.a aVar) {
            this.f421687a = eVar;
            this.f421688b = hVar;
            this.f421689c = linkedList;
            this.f421690d = aVar;
        }

        @Override // g81.e
        public final InterfaceC39968b a() {
            return this.f421687a;
        }

        @Override // g81.e
        public final Collection<l> b() {
            return this.f421689c;
        }

        @Override // g81.e
        public final l c() {
            return this.f421688b;
        }

        @Override // g81.e
        public final InterfaceC40782a j0() {
            return this.f421690d;
        }
    }

    public static void a(org.mockito.internal.invocation.e eVar, h hVar, LinkedList linkedList, N71.a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = aVar.f11217h;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        a aVar2 = new a(eVar, hVar, linkedList, aVar);
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(aVar2);
        }
    }
}
