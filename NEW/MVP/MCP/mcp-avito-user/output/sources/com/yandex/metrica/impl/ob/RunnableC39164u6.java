package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.u6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC39164u6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final File f381923a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC38986mm<File> f381924b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39180um f381925c;

    public RunnableC39164u6(@j.N Context context, @j.N File file, @j.N InterfaceC38986mm<File> interfaceC38986mm) {
        this(file, interfaceC38986mm, C39180um.a(context));
    }

    @Override // java.lang.Runnable
    public void run() {
        File[] fileArrListFiles;
        if (this.f381923a.exists() && this.f381923a.isDirectory() && (fileArrListFiles = this.f381923a.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C39132sm c39132smA = this.f381925c.a(file.getName());
                try {
                    c39132smA.a();
                    this.f381924b.b(file);
                } catch (Throwable unused) {
                }
                c39132smA.c();
            }
        }
    }

    @j.k0
    public RunnableC39164u6(@j.N File file, @j.N InterfaceC38986mm<File> interfaceC38986mm, @j.N C39180um c39180um) {
        this.f381923a = file;
        this.f381924b = interfaceC38986mm;
        this.f381925c = c39180um;
    }
}
