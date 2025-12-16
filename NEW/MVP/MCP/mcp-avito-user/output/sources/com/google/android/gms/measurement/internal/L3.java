package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class L3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f354775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f354777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f354778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f354779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f354780g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f354781h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354782i;

    public L3(C36967s3 c36967s3, String str, String str2, long j12, Bundle bundle, boolean z12, boolean z13, boolean z14) {
        this.f354775b = str;
        this.f354776c = str2;
        this.f354777d = j12;
        this.f354778e = bundle;
        this.f354779f = z12;
        this.f354780g = z13;
        this.f354781h = z14;
        this.f354782i = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f354782i.C(this.f354775b, this.f354776c, this.f354777d, this.f354778e, this.f354779f, this.f354780g, this.f354781h);
    }
}
