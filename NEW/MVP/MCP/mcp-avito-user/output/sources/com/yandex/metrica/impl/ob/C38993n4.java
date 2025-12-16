package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.n4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38993n4 implements K, InterfaceC38918k4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private F3 f381142a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final ResultReceiver f381143b;

    public C38993n4(@j.N Context context, @j.N F3 f32, @j.N D3 d32) {
        this.f381142a = f32;
        this.f381143b = d32.f377931c;
        f32.a(this);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38918k4
    public void a(@j.N C38715c0 c38715c0, @j.N D3 d32) {
        this.f381142a.a(d32.f377930b);
        this.f381142a.a(c38715c0, this);
    }

    @j.N
    public F3 b() {
        return this.f381142a;
    }

    @Override // com.yandex.metrica.impl.ob.K
    public void a(@j.N L l12) {
        ResultReceiver resultReceiver = this.f381143b;
        int i12 = ResultReceiverC38790f0.f380512b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            l12.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38918k4
    public void a() {
        this.f381142a.b(this);
    }
}
