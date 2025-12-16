package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ServiceConnectionC37178t0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.F f358501b = new com.google.android.play.core.assetpacks.internal.F("ExtractionForegroundServiceConnection");

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f358502c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Context f358503d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public ExtractionForegroundService f358504e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public Notification f358505f;

    public ServiceConnectionC37178t0(Context context) {
        this.f358503d = context;
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f358502c) {
            arrayList = new ArrayList(this.f358502c);
            this.f358502c.clear();
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            com.google.android.play.core.assetpacks.internal.B b12 = (com.google.android.play.core.assetpacks.internal.B) arrayList.get(i12);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel parcelE4 = b12.e4();
                int i13 = com.google.android.play.core.assetpacks.internal.t.f358383a;
                parcelE4.writeInt(1);
                bundle.writeToParcel(parcelE4, 0);
                parcelE4.writeInt(1);
                bundle2.writeToParcel(parcelE4, 0);
                b12.f4(parcelE4, 2);
            } catch (RemoteException unused) {
                this.f358501b.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f358501b.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((BinderC37175s0) iBinder).f358490a;
        this.f358504e = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f358505f);
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
