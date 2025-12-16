package com.yandex.metrica.impl.ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.t6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC39140t6<Output> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final File f381854a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC39011nm<File, Output> f381855b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC38986mm<File> f381856c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC38986mm<Output> f381857d;

    public RunnableC39140t6(@j.N File file, @j.N InterfaceC39011nm<File, Output> interfaceC39011nm, @j.N InterfaceC38986mm<File> interfaceC38986mm, @j.N InterfaceC38986mm<Output> interfaceC38986mm2) {
        this.f381854a = file;
        this.f381855b = interfaceC39011nm;
        this.f381856c = interfaceC38986mm;
        this.f381857d = interfaceC38986mm2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f381854a.exists()) {
            try {
                Output outputA = this.f381855b.a(this.f381854a);
                if (outputA != null) {
                    this.f381857d.b(outputA);
                }
            } catch (Throwable unused) {
            }
            this.f381856c.b(this.f381854a);
        }
    }
}
