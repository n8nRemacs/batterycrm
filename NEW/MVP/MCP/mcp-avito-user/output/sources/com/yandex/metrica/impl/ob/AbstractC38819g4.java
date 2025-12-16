package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.g4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38819g4 implements InterfaceC38918k4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final X3 f380616a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Vc f380617b;

    public AbstractC38819g4(@j.N Context context, @j.N X3 x32) {
        this(context, x32, new Vc(C39194vc.a(context), H2.a(context), F0.g().s()));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38918k4
    public void a(@j.N C38715c0 c38715c0, @j.N D3 d32) {
        b(c38715c0, d32);
    }

    @j.N
    public X3 b() {
        return this.f380616a;
    }

    public abstract void b(@j.N C38715c0 c38715c0, @j.N D3 d32);

    @j.N
    public Vc c() {
        return this.f380617b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38918k4
    public void a() {
        this.f380616a.b(this);
        this.f380617b.b(this);
    }

    @j.k0
    public AbstractC38819g4(@j.N Context context, @j.N X3 x32, @j.N Vc vc2) {
        context.getApplicationContext();
        this.f380616a = x32;
        this.f380617b = vc2;
        x32.a(this);
        vc2.a(this);
    }
}
