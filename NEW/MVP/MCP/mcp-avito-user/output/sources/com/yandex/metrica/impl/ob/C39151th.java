package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.th, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39151th implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C38758di f381890a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ File f381891b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Eh f381892c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C39175uh f381893d;

    public C39151th(C39175uh c39175uh, C38758di c38758di, File file, Eh eh2) {
        this.f381893d = c39175uh;
        this.f381890a = c38758di;
        this.f381891b = file;
        this.f381892c = eh2;
    }

    @Override // com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client
    @j.P
    public String getOldETag() {
        return this.f381893d.f381971e.b();
    }

    @Override // com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client
    public void onError() {
        C39175uh.a(this.f381893d, this.f381890a.f380410h);
        C39175uh.c(this.f381893d);
    }

    @Override // com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client
    public void onNotModified() {
        C39175uh.a(this.f381893d, this.f381890a.f380411i);
        C39175uh.c(this.f381893d);
        this.f381892c.a(this.f381891b);
    }

    @Override // com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client
    public void onResponse(@j.N String str, @j.N byte[] bArr) {
        FileOutputStream fileOutputStream;
        C39175uh.a(this.f381893d, this.f381890a.f380411i);
        C39175uh.c(this.f381893d);
        this.f381893d.f381971e.b(str);
        C39175uh c39175uh = this.f381893d;
        File file = this.f381891b;
        c39175uh.getClass();
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        A2.a((Closeable) fileOutputStream);
        this.f381892c.a(this.f381891b);
    }
}
