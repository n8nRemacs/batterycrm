package com.avito.android.beduin.data;

import io.reactivex.rxjava3.core.I;
import kotlin.jvm.internal.L;
import l41.s;
import qi.InterfaceC47401b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f103891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f103892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f103893d;

    public /* synthetic */ a(d dVar, String str, int i12) {
        this.f103891b = i12;
        this.f103892c = dVar;
        this.f103893d = str;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f103891b) {
            case 0:
                return this.f103892c.f103896a.get().f(this.f103893d);
            default:
                d dVar = this.f103892c;
                String str = this.f103893d;
                InterfaceC47401b interfaceC47401b = dVar.f103898c;
                return L.f(interfaceC47401b != null ? interfaceC47401b.getId() : null, str) ? I.q(interfaceC47401b) : I.l(new IllegalStateException());
        }
    }
}
