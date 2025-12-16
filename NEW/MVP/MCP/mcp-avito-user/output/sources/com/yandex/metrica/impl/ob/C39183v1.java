package com.yandex.metrica.impl.ob;

import android.content.Intent;
import com.yandex.metrica.impl.ob.A1;

/* renamed from: com.yandex.metrica.impl.ob.v1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39183v1 implements A1.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C39087r1 f382028a;

    public C39183v1(C39087r1 c39087r1) {
        this.f382028a = c39087r1;
    }

    @Override // com.yandex.metrica.impl.ob.A1.e
    public void a(@j.N Intent intent) {
        if (this.f382028a.f381699a != null) {
            C39087r1 c39087r1 = this.f382028a;
            C39087r1.b(c39087r1, c39087r1.f381699a);
            C39087r1.d(this.f382028a);
            this.f382028a.f381703e.a(this.f382028a.f381699a);
        }
    }
}
