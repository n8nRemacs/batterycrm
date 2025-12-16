package net.opacapp.multilinecollapsingtoolbar;

import net.opacapp.multilinecollapsingtoolbar.k;

/* compiled from: ValueAnimatorCompat.java */
/* loaded from: classes7.dex */
class i implements k.e.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f419090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f419091b;

    public i(k kVar, e eVar) {
        this.f419091b = kVar;
        this.f419090a = eVar;
    }

    @Override // net.opacapp.multilinecollapsingtoolbar.k.e.b
    public final void a() {
        e eVar = this.f419090a;
        eVar.f419087a.setScrimAlpha(((Integer) this.f419091b.f419092a.f419099a.getAnimatedValue()).intValue());
    }
}
