package org.mockito.internal.stubbing;

import e81.InterfaceC39968b;
import e81.InterfaceC39969c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import l81.m;
import org.mockito.quality.Strictness;

/* compiled from: InvocationContainerImpl.java */
/* loaded from: classes7.dex */
public class e implements InterfaceC39969c, Serializable {
    private static final long serialVersionUID = -5334301962749537177L;

    /* renamed from: f, reason: collision with root package name */
    public org.mockito.internal.invocation.i f421727f;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList<h> f421723b = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    public final Object f421725d = new a81.e();

    /* renamed from: e, reason: collision with root package name */
    public final Strictness f421726e = null;

    /* renamed from: c, reason: collision with root package name */
    public final d f421724c = new d();

    public e(N71.a aVar) {
    }

    public final h a(l81.g gVar, boolean z12) {
        h first;
        InterfaceC39968b interfaceC39968b = this.f421727f.f421660b;
        org.mockito.internal.progress.g.a().a();
        if (gVar instanceof m) {
            ((m) gVar).c(interfaceC39968b);
        }
        synchronized (this.f421723b) {
            try {
                if (z12) {
                    this.f421723b.getFirst().f421728d.add(gVar);
                } else {
                    this.f421723b.addFirst(new h(gVar, this.f421727f, this.f421726e));
                }
                first = this.f421723b.getFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return first;
    }

    public final boolean b() {
        return !this.f421724c.f421709b.isEmpty();
    }

    public final void c(org.mockito.internal.invocation.i iVar) {
        this.f421727f = iVar;
        int i12 = 0;
        while (true) {
            d dVar = this.f421724c;
            int size = dVar.f421709b.size();
            ArrayList arrayList = dVar.f421709b;
            if (i12 >= size) {
                arrayList.clear();
                return;
            } else {
                a((l81.g) arrayList.get(i12), i12 != 0);
                i12++;
            }
        }
    }

    public final String toString() {
        return "invocationForStubbing: " + this.f421727f;
    }
}
