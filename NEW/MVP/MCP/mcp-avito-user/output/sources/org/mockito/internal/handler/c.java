package org.mockito.internal.handler;

import e81.InterfaceC39969c;
import e81.h;
import h81.InterfaceC40782a;
import org.mockito.internal.invocation.l;

/* compiled from: MockHandlerImpl.java */
/* loaded from: classes7.dex */
public class c<T> implements h<T> {
    private static final long serialVersionUID = -2917871070982574165L;

    /* renamed from: b, reason: collision with root package name */
    public final org.mockito.internal.stubbing.e f421642b;

    /* renamed from: c, reason: collision with root package name */
    public final l f421643c;

    /* renamed from: d, reason: collision with root package name */
    public final N71.a f421644d;

    public c(N71.a aVar) {
        this.f421643c = new l();
        this.f421644d = aVar;
        this.f421643c = new l();
        this.f421642b = new org.mockito.internal.stubbing.e(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        r1 = r5.f421730f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        r5.f421731g = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r8.f421659j = new org.mockito.internal.invocation.p(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [a81.m, java.lang.Object] */
    @Override // e81.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(org.mockito.internal.invocation.e r8) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.handler.c.N0(org.mockito.internal.invocation.e):java.lang.Object");
    }

    @Override // e81.h
    public final InterfaceC39969c T5() {
        return this.f421642b;
    }

    @Override // e81.h
    public final InterfaceC40782a<T> j0() {
        return this.f421644d;
    }
}
