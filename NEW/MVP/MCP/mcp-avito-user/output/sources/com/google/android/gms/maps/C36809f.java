package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.maps.zze;
import com.google.android.gms.maps.model.C36818b;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import dY0.InterfaceC39645a;
import dY0.o0;
import dY0.r0;

/* renamed from: com.google.android.gms.maps.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36809f {

    /* renamed from: a, reason: collision with root package name */
    @J41.a
    public static boolean f354363a = false;

    public static synchronized void a(Context context) {
        C36729v.k(context, "Context is null");
        if (f354363a) {
            return;
        }
        try {
            r0 r0VarA = o0.a(context);
            try {
                InterfaceC39645a interfaceC39645aZze = r0VarA.zze();
                C36729v.j(interfaceC39645aZze);
                C36805b.f354353a = interfaceC39645aZze;
                zze zzeVarZzf = r0VarA.zzf();
                if (C36818b.f354485a == null) {
                    C36729v.j(zzeVarZzf);
                    C36818b.f354485a = zzeVarZzf;
                }
                f354363a = true;
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
