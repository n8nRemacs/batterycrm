package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class C2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashSet f383186c;

    public /* synthetic */ C2(HashSet hashSet, int i12) {
        this.f383185b = i12;
        this.f383186c = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383185b) {
            case 0:
                xh1.e((Set) this.f383186c);
                break;
            case 1:
                xh1.a((Set) this.f383186c);
                break;
            case 2:
                xh1.b((Set) this.f383186c);
                break;
            case 3:
                xh1.c((Set) this.f383186c);
                break;
            default:
                xh1.d((Set) this.f383186c);
                break;
        }
    }
}
