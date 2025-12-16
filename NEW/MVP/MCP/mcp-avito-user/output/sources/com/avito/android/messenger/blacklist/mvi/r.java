package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class r implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186516b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31683m.a f186517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C31686p f186518d;

    public /* synthetic */ r(InterfaceC31683m.a aVar, C31686p c31686p) {
        this.f186517c = aVar;
        this.f186518d = c31686p;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f186516b) {
            case 0:
                this.f186518d.f186485X.accept(com.avito.android.messenger.util.q.a(th2));
                return InterfaceC31683m.a.a(this.f186517c, null, null, new InterfaceC31683m.a.b.C5470a(com.avito.android.messenger.util.q.a(th2)), null, false, null, 59);
            default:
                InterfaceC31683m.a aVar = this.f186517c;
                boolean z12 = aVar.f186471a instanceof InterfaceC31683m.a.b.c;
                C31686p c31686p = this.f186518d;
                if (z12) {
                    c31686p.f186486Y.e();
                    return InterfaceC31683m.a.a(aVar, new InterfaceC31683m.a.b.C5470a(com.avito.android.messenger.util.q.a(th2)), null, null, null, false, null, 62);
                }
                c31686p.f186485X.accept(com.avito.android.messenger.util.q.a(th2));
                return InterfaceC31683m.a.a(aVar, null, new InterfaceC31683m.a.b.C5470a(com.avito.android.messenger.util.q.a(th2)), null, null, false, null, 61);
        }
    }

    public /* synthetic */ r(C31686p c31686p, InterfaceC31683m.a aVar) {
        this.f186518d = c31686p;
        this.f186517c = aVar;
    }
}
