package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import com.yandex.metrica.impl.ob.ResultReceiverC38790f0;

/* renamed from: com.yandex.metrica.impl.ob.ii, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38882ii implements ResultReceiverC38790f0.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Yh f380790a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C38858hi f380791b;

    public C38882ii(C38858hi c38858hi, Yh yh2) {
        this.f380791b = c38858hi;
        this.f380790a = yh2;
    }

    @Override // com.yandex.metrica.impl.ob.ResultReceiverC38790f0.a
    public void a(int i12, Bundle bundle) {
        this.f380791b.a(bundle, this.f380790a);
    }
}
