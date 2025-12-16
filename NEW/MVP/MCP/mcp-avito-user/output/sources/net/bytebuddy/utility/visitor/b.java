package net.bytebuddy.utility.visitor;

import net.bytebuddy.jar.asm.r;
import net.bytebuddy.jar.asm.s;

/* compiled from: LineNumberPrependingMethodVisitor.java */
/* loaded from: classes7.dex */
public class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final r f418995e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f418996f;

    public b(s sVar) {
        super(net.bytebuddy.utility.e.f418981b, sVar);
        this.f418995e = new r();
        this.f418996f = true;
    }

    @Override // net.bytebuddy.utility.visitor.a
    public final void L() {
        s(this.f418995e);
    }

    @Override // net.bytebuddy.jar.asm.s
    public final void u(int i12, r rVar) {
        if (this.f418996f) {
            this.f418996f = false;
            rVar = this.f418995e;
        }
        super.u(i12, rVar);
    }
}
