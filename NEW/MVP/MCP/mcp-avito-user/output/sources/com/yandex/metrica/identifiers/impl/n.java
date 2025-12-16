package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.N;

/* loaded from: classes7.dex */
final class n extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public static final n f377733l = new n();

    public n() {
        super(1);
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i12 = b.f377714a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof c)) {
            return (c) iInterfaceQueryLocalInterface;
        }
        a aVar = new a();
        aVar.f377713a = iBinder;
        return aVar;
    }
}
