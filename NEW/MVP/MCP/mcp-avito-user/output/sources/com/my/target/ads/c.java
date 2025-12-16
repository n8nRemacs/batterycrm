package com.my.target.ads;

import com.my.target.AbstractC37792j;
import com.my.target.H0;
import com.my.target.k1;
import e11.W0;
import e11.X0;
import e11.p2;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class c extends com.my.target.ads.b {

    /* renamed from: g, reason: collision with root package name */
    @P
    public InterfaceC10785c f364685g;

    public class b implements k1.a {
        public b(a aVar) {
        }

        @Override // com.my.target.k1.a
        public final void b() {
            InterfaceC10785c interfaceC10785c = c.this.f364685g;
            if (interfaceC10785c != null) {
                interfaceC10785c.b();
            }
        }

        @Override // com.my.target.k1.a
        public final void c() {
            InterfaceC10785c interfaceC10785c = c.this.f364685g;
            if (interfaceC10785c != null) {
                interfaceC10785c.a("No data for available ad networks");
            }
        }

        @Override // com.my.target.k1.a
        public final void onClick() {
            InterfaceC10785c interfaceC10785c = c.this.f364685g;
            if (interfaceC10785c != null) {
                interfaceC10785c.onClick();
            }
        }

        @Override // com.my.target.k1.a
        public final void onVideoCompleted() {
            InterfaceC10785c interfaceC10785c = c.this.f364685g;
            if (interfaceC10785c != null) {
                interfaceC10785c.onVideoCompleted();
            }
        }
    }

    /* renamed from: com.my.target.ads.c$c, reason: collision with other inner class name */
    public interface InterfaceC10785c {
        void a(@N String str);

        void b();

        void onClick();

        void onVideoCompleted();
    }

    @Override // com.my.target.ads.b
    public final void a() {
        super.a();
        this.f364685g = null;
    }

    @Override // com.my.target.ads.b
    public final void b(@P W0 w02, @P String str) {
        p2 p2Var;
        X0 x02;
        InterfaceC10785c interfaceC10785c = this.f364685g;
        if (interfaceC10785c == null) {
            return;
        }
        if (w02 != null) {
            p2Var = w02.f394498b;
            x02 = w02.f394557a;
        } else {
            p2Var = null;
            x02 = null;
        }
        if (p2Var != null) {
            AbstractC37792j abstractC37792jA = AbstractC37792j.a(p2Var, w02, this.f364684f, new b(null));
            this.f364683e = abstractC37792jA;
            if (abstractC37792jA != null) {
                this.f364685g.b();
                return;
            } else {
                this.f364685g.a("no ad");
                return;
            }
        }
        if (x02 == null) {
            if (str == null) {
                str = "no ad";
            }
            interfaceC10785c.a(str);
        } else {
            H0 h02 = new H0(x02, this.f395639a, this.f395640b, new b(null));
            this.f364683e = h02;
            h02.n(this.f364682d);
        }
    }
}
