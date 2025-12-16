package com.yandex.metrica.impl.ob;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.l6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class FileObserverC38945l6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC38986mm<File> f380952a;

    /* renamed from: b, reason: collision with root package name */
    private final File f380953b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final B0 f380954c;

    public FileObserverC38945l6(@j.N File file, @j.N InterfaceC38986mm<File> interfaceC38986mm) {
        this(file, interfaceC38986mm, new B0());
    }

    @Override // android.os.FileObserver
    public void onEvent(int i12, @j.P String str) {
        if (i12 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        InterfaceC38986mm<File> interfaceC38986mm = this.f380952a;
        B0 b02 = this.f380954c;
        File file = this.f380953b;
        b02.getClass();
        interfaceC38986mm.b(new File(file, str));
    }

    @j.k0
    public FileObserverC38945l6(@j.N File file, @j.N InterfaceC38986mm<File> interfaceC38986mm, @j.N B0 b02) {
        super(file.getAbsolutePath(), 8);
        this.f380952a = interfaceC38986mm;
        this.f380953b = file;
        this.f380954c = b02;
    }
}
