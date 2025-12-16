package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC36699e;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36717n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC36662p implements C36616a.f, ServiceConnection {
    @Override // com.google.android.gms.common.api.C36616a.f
    @j.l0
    public final void connect(@j.N AbstractC36699e.c cVar) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.l0
    public final void disconnect() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.N
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.N
    public final String getEndpointPackageName() {
        C36729v.j(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.P
    public final String getLastDisconnectMessage() {
        return null;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.N
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.N
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.l0
    public final boolean isConnected() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.l0
    public final boolean isConnecting() {
        Thread.currentThread();
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@j.N ComponentName componentName, @j.N final IBinder iBinder) {
        new Runnable() { // from class: com.google.android.gms.common.api.internal.N0
            @Override // java.lang.Runnable
            public final void run() {
                this.f349038b.getClass();
                String.valueOf(iBinder);
                new Bundle();
                throw null;
            }
        };
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@j.N ComponentName componentName) {
        new Runnable() { // from class: com.google.android.gms.common.api.internal.M0
            @Override // java.lang.Runnable
            public final void run() {
                this.f349035b.getClass();
                throw null;
            }
        };
        throw null;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    public final boolean providesSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    public final boolean requiresSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.l0
    public final void disconnect(@j.N String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    public final void onUserSignOut(@j.N AbstractC36699e.InterfaceC10622e interfaceC10622e) {
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    public final void getRemoteService(@j.P InterfaceC36717n interfaceC36717n, @j.P Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    public final void dump(@j.N String str, @j.P FileDescriptor fileDescriptor, @j.N PrintWriter printWriter, @j.P String[] strArr) {
    }
}
