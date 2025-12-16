package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.maps.zze;

/* renamed from: com.google.android.gms.maps.model.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36818b {

    /* renamed from: a, reason: collision with root package name */
    public static zze f354485a;

    public static C36817a a(Bitmap bitmap) {
        try {
            zze zzeVar = f354485a;
            C36729v.k(zzeVar, "IBitmapDescriptorFactory is not initialized");
            return new C36817a(zzeVar.zza(bitmap));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
