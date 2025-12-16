package com.google.android.play.core.splitcompat;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashSet f358681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f358682c;

    public t(a aVar, HashSet hashSet) {
        this.f358682c = aVar;
        this.f358681b = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a aVar = this.f358682c;
            HashSet hashSet = this.f358681b;
            AtomicReference atomicReference = a.f358652e;
            aVar.a(hashSet);
        } catch (Exception unused) {
        }
    }
}
