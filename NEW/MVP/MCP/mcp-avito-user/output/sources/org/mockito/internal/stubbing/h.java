package org.mockito.internal.stubbing;

import e81.InterfaceC39968b;
import java.io.Serializable;
import java.util.concurrent.ConcurrentLinkedQueue;
import l81.l;
import org.mockito.quality.Strictness;

/* compiled from: StubbedInvocationMatcher.java */
/* loaded from: classes7.dex */
public class h extends org.mockito.internal.invocation.i implements Serializable, l {
    private static final long serialVersionUID = 4919105134123672727L;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f421728d;

    /* renamed from: e, reason: collision with root package name */
    public final Strictness f421729e;

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f421730f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC39968b f421731g;

    public h(l81.g gVar, org.mockito.internal.invocation.i iVar, Strictness strictness) {
        super(iVar.f421660b, iVar.f421661c);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.f421728d = concurrentLinkedQueue;
        this.f421730f = new Object[0];
        this.f421729e = strictness;
        concurrentLinkedQueue.add(gVar);
    }

    @Override // l81.l
    public final boolean b() {
        boolean z12;
        synchronized (this.f421730f) {
            z12 = this.f421731g != null;
        }
        return z12;
    }

    @Override // l81.l
    public final Strictness d() {
        return this.f421729e;
    }

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        l81.g gVar;
        synchronized (this.f421728d) {
            try {
                gVar = (l81.g) (this.f421728d.size() == 1 ? this.f421728d.peek() : this.f421728d.poll());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar.f(interfaceC39968b);
    }

    @Override // org.mockito.internal.invocation.i, e81.InterfaceC39967a
    public final String toString() {
        return super.toString() + " stubbed with: " + this.f421728d;
    }
}
