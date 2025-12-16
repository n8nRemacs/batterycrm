package com.yandex.metrica.impl.ob;

import android.os.FileObserver;
import java.io.File;

/* loaded from: classes7.dex */
public class Y6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final FileObserver f379953a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final File f379954b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38970m6 f379955c;

    public Y6(@j.N File file, @j.N InterfaceC38986mm<File> interfaceC38986mm) {
        this(new FileObserverC38945l6(file, interfaceC38986mm), file, new C38970m6());
    }

    public void a() {
        this.f379955c.a(this.f379954b);
        this.f379953a.startWatching();
    }

    @j.k0
    public Y6(@j.N FileObserver fileObserver, @j.N File file, @j.N C38970m6 c38970m6) {
        this.f379953a = fileObserver;
        this.f379954b = file;
        this.f379955c = c38970m6;
    }
}
