package com.avito.android.messenger.map.viewing;

import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lW.C43692b;

/* compiled from: PlatformMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.viewing.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32551d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196811b;

    public C32551d(PlatformMapFragment platformMapFragment) {
        this.f196811b = platformMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        C43692b c43692b = this.f196811b.f196800t0;
        if (c43692b == null) {
            c43692b = null;
        }
        c43692b.f(null, th2.getMessage());
        V2.f318762a.f(th2);
    }
}
