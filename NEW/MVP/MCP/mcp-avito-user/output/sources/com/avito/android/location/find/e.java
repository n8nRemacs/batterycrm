package com.avito.android.location.find;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultLocationProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/e;", "Lcom/avito/android/location/find/d;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31503a f181749a;

    public e(@Y61.k InterfaceC31503a interfaceC31503a) {
        this.f181749a = interfaceC31503a;
    }

    @Override // com.avito.android.location.find.d
    public final void a(@Y61.k Context context) {
        this.f181749a.a(context);
    }

    @Override // com.avito.android.location.find.z
    public final boolean b() {
        return !this.f181749a.e();
    }

    @Override // com.avito.android.location.find.d
    public final void c(@Y61.k Context context) {
        this.f181749a.c(context);
    }

    @Override // com.avito.android.location.find.z
    public final void d(@Y61.k Activity activity) {
        this.f181749a.d(activity);
    }

    @Override // com.avito.android.location.find.z
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> e(boolean z12) {
        return this.f181749a.F0().F().C0(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
    }
}
