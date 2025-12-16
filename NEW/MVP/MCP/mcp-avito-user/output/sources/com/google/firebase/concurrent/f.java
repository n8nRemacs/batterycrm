package com.google.firebase.concurrent;

import com.google.firebase.concurrent.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f360827c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f360828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i.a f360829e;

    public /* synthetic */ f(h hVar, Runnable runnable, i.a aVar, int i12) {
        this.f360826b = i12;
        this.f360827c = hVar;
        this.f360828d = runnable;
        this.f360829e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f360826b) {
            case 0:
                h hVar = this.f360827c;
                final i.a aVar = this.f360829e;
                final Runnable runnable = this.f360828d;
                final int i12 = 0;
                hVar.f360833b.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e12) {
                                    aVar.b(e12);
                                    throw e12;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e13) {
                                    aVar.b(e13);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i.a aVar2 = aVar;
                                try {
                                    runnable2.run();
                                    aVar2.a(null);
                                    return;
                                } catch (Exception e14) {
                                    aVar2.b(e14);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                h hVar2 = this.f360827c;
                final i.a aVar2 = this.f360829e;
                final Runnable runnable2 = this.f360828d;
                final int i13 = 2;
                hVar2.f360833b.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i13) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e12) {
                                    aVar2.b(e12);
                                    throw e12;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e13) {
                                    aVar2.b(e13);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i.a aVar22 = aVar2;
                                try {
                                    runnable22.run();
                                    aVar22.a(null);
                                    return;
                                } catch (Exception e14) {
                                    aVar22.b(e14);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                h hVar3 = this.f360827c;
                final i.a aVar3 = this.f360829e;
                final Runnable runnable3 = this.f360828d;
                final int i14 = 1;
                hVar3.f360833b.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i14) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e12) {
                                    aVar3.b(e12);
                                    throw e12;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e13) {
                                    aVar3.b(e13);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i.a aVar22 = aVar3;
                                try {
                                    runnable22.run();
                                    aVar22.a(null);
                                    return;
                                } catch (Exception e14) {
                                    aVar22.b(e14);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
