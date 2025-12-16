package com.google.android.play.core.splitinstall;

import com.google.android.gms.tasks.Task;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class a0 implements InterfaceC37201c {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.X f358703a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.X f358704b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.X f358705c;

    public a0(com.google.android.play.core.splitinstall.internal.X x12, com.google.android.play.core.splitinstall.internal.X x13, com.google.android.play.core.splitinstall.internal.X x14) {
        this.f358703a = x12;
        this.f358704b = x13;
        this.f358705c = x14;
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final Task<Integer> a(@j.N C37203e c37203e) {
        return f().a(c37203e);
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final void b(@j.N InterfaceC37205g interfaceC37205g) {
        f().b(interfaceC37205g);
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final void c(@j.N InterfaceC37205g interfaceC37205g) {
        f().c(interfaceC37205g);
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final boolean d(@j.N AbstractC37204f abstractC37204f, @j.N Ae0.c cVar) {
        return f().d(abstractC37204f, cVar);
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    @j.N
    public final Set<String> e() {
        return f().e();
    }

    public final InterfaceC37201c f() {
        return this.f358705c.zza() == null ? (InterfaceC37201c) this.f358703a.zza() : (InterfaceC37201c) this.f358704b.zza();
    }
}
