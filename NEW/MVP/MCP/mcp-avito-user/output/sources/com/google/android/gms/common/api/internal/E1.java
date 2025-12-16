package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class E1 implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f349000a;

    public /* synthetic */ E1(E e12, D1 d12) {
        this.f349000a = e12;
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void a(int i12, boolean z12) {
        ConnectionResult connectionResult;
        E e12 = this.f349000a;
        ReentrantLock reentrantLock = e12.f348999z;
        ReentrantLock reentrantLock2 = e12.f348999z;
        reentrantLock.lock();
        try {
            if (e12.f348998y || (connectionResult = e12.f348997x) == null || !connectionResult.i()) {
                e12.f348998y = false;
                e12.f348988b.a(i12, z12);
                e12.f348997x = null;
                e12.f348996w = null;
            } else {
                e12.f348998y = true;
                e12.f348991r.onConnectionSuspended(i12);
            }
            reentrantLock2.unlock();
        } catch (Throwable th2) {
            reentrantLock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void b(@j.P Bundle bundle) {
        E e12 = this.f349000a;
        ReentrantLock reentrantLock = e12.f348999z;
        ReentrantLock reentrantLock2 = e12.f348999z;
        reentrantLock.lock();
        try {
            Bundle bundle2 = e12.f348995v;
            if (bundle2 == null) {
                e12.f348995v = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            e12.f348996w = ConnectionResult.f348858f;
            E.m(e12);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void c(@j.N ConnectionResult connectionResult) {
        E e12 = this.f349000a;
        ReentrantLock reentrantLock = e12.f348999z;
        ReentrantLock reentrantLock2 = e12.f348999z;
        reentrantLock.lock();
        try {
            e12.f348996w = connectionResult;
            E.m(e12);
        } finally {
            reentrantLock2.unlock();
        }
    }
}
