package org.mockito.internal.stubbing.defaultanswers;

import e81.InterfaceC39968b;
import java.io.Serializable;

/* compiled from: ReturnsMocks.java */
/* loaded from: classes7.dex */
public class g implements l81.g<Object>, Serializable {
    private static final long serialVersionUID = -6755257986994634579L;

    /* renamed from: b, reason: collision with root package name */
    public final h f421716b = new h();

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        Object objF = this.f421716b.f(interfaceC39968b);
        return objF != null ? objF : c.a(interfaceC39968b, new f(this));
    }
}
