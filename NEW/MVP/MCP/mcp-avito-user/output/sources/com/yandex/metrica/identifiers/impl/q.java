package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.N;

/* loaded from: classes7.dex */
final class q extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public static final q f377736l = new q();

    public q() {
        super(1);
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i12 = u.f377740a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof v)) {
            return (v) iInterfaceQueryLocalInterface;
        }
        t tVar = new t();
        tVar.f377739a = iBinder;
        return tVar;
    }
}
