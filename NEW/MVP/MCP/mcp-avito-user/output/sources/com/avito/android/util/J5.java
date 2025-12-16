package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: Initializable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/J5;", "Lcom/avito/android/util/r2;", "<init>", "()V", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class J5 implements InterfaceC35881r2 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f318637a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f318638b = new Object();

    @Override // com.avito.android.util.InterfaceC35881r2
    public final void a() {
        if (this.f318637a) {
            return;
        }
        synchronized (this.f318638b) {
            if (this.f318637a) {
                return;
            }
            o();
            this.f318637a = true;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized, reason: from getter */
    public final boolean getF318637a() {
        return this.f318637a;
    }

    public abstract void o();
}
