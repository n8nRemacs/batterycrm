package com.avito.android.messenger.map.search;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GeoSearchView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class C implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f196482b;

    public C(B b12) {
        this.f196482b = b12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B b12 = this.f196482b;
        if (b12.f196478l) {
            b12.f196472f.setLoading(true);
        }
    }
}
