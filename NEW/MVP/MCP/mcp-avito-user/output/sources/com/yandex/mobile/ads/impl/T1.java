package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class T1 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f383313c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f383314d;

    public /* synthetic */ T1(String str, boolean z12, int i12) {
        this.f383312b = i12;
        this.f383313c = str;
        this.f383314d = z12;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f383312b) {
            case 0:
                return qc1.a(this.f383313c, this.f383314d, runnable);
            default:
                return Util.threadFactory$lambda$1(this.f383313c, this.f383314d, runnable);
        }
    }
}
