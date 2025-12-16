package org.mockito.internal.stubbing.defaultanswers;

import Y71.l;
import e81.InterfaceC39968b;
import java.io.Serializable;
import org.mockito.exceptions.verification.SmartNullPointerException;

/* compiled from: ReturnsSmartNulls.java */
/* loaded from: classes7.dex */
public class j implements l81.g<Object>, Serializable {
    private static final long serialVersionUID = 7618312406617949441L;

    /* renamed from: b, reason: collision with root package name */
    public final h f421719b = new h();

    /* compiled from: ReturnsSmartNulls.java */
    public static class a implements l81.g {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC39968b f421720b;

        /* renamed from: c, reason: collision with root package name */
        public final P71.d f421721c;

        public a(InterfaceC39968b interfaceC39968b, P71.d dVar) {
            this.f421720b = interfaceC39968b;
            this.f421721c = dVar;
        }

        @Override // l81.g
        public final Object f(InterfaceC39968b interfaceC39968b) {
            boolean zA2 = Y71.i.a(interfaceC39968b.getMethod());
            InterfaceC39968b interfaceC39968b2 = this.f421720b;
            if (!zA2) {
                throw new SmartNullPointerException(l.b("You have a NullPointerException here:", new P71.d(), "because this method call was *not* stubbed correctly:", this.f421721c, interfaceC39968b2.toString(), ""));
            }
            return "SmartNull returned by this unstubbed method call on a mock:\n" + interfaceC39968b2;
        }
    }

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        Object objF = this.f421719b.f(interfaceC39968b);
        return objF != null ? objF : c.a(interfaceC39968b, new i(interfaceC39968b));
    }
}
