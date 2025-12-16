package org.mockito.internal.handler;

import V71.k;
import org.mockito.internal.invocation.p;

/* compiled from: NotifiedMethodInvocationReport.java */
/* loaded from: classes7.dex */
public class d implements g81.b {

    /* renamed from: a, reason: collision with root package name */
    public final org.mockito.internal.invocation.e f421645a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f421646b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f421647c;

    public d(org.mockito.internal.invocation.e eVar, Object obj) {
        this.f421645a = eVar;
        this.f421646b = obj;
        this.f421647c = null;
    }

    public final String a() {
        p pVar = this.f421645a.f421659j;
        if (pVar == null) {
            return null;
        }
        return pVar.f421675b.f421660b.j().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.f421645a, dVar.f421645a) && k.a(this.f421646b, dVar.f421646b) && k.a(this.f421647c, dVar.f421647c);
    }

    public final int hashCode() {
        Object obj = this.f421646b;
        int iHashCode = ((obj != null ? obj.hashCode() : 0) + 31) * 31;
        Throwable th2 = this.f421647c;
        return iHashCode + (th2 != null ? th2.hashCode() : 0);
    }

    public d(org.mockito.internal.invocation.e eVar, Throwable th2) {
        this.f421645a = eVar;
        this.f421646b = null;
        this.f421647c = th2;
    }
}
