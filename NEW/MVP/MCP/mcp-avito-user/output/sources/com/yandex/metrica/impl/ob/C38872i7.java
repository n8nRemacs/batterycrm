package com.yandex.metrica.impl.ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.i7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38872i7 implements InterfaceC39011nm<File, String> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C38722c7 f380770a;

    /* renamed from: b, reason: collision with root package name */
    private final C38847h7 f380771b;

    public C38872i7(@Y61.k C38722c7 c38722c7, @Y61.k C38847h7 c38847h7) {
        this.f380770a = c38722c7;
        this.f380771b = c38847h7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
    public String a(File file) {
        return this.f380771b.a(file, this.f380770a);
    }
}
