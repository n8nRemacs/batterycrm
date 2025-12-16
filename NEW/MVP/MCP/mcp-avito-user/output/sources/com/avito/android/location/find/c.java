package com.avito.android.location.find;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: DefaultLocationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/c;", "Lcom/avito/android/location/find/a;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements InterfaceC31503a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo.j f181745a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public K<Location> f181746b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public WeakReference<Activity> f181747c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo.c f181748d = new com.avito.android.geo.c(new C31504b(this));

    public c(@Y61.k com.avito.android.geo.j jVar) {
        this.f181745a = jVar;
    }

    @Override // com.avito.android.location.find.InterfaceC31503a
    @Y61.k
    public final C42006d F0() {
        return new C42006d(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 23));
    }

    @Override // com.avito.android.location.find.InterfaceC31503a
    public final void a(@Y61.k Context context) {
        androidx.localbroadcastmanager.content.a aVarA = androidx.localbroadcastmanager.content.a.a(context);
        com.avito.android.geo.c.f159300b.getClass();
        aVarA.b(this.f181748d, new IntentFilter("ACTION_GEO_UPDATE"));
    }

    @Override // com.avito.android.location.find.InterfaceC31503a
    public final void c(@Y61.k Context context) {
        androidx.localbroadcastmanager.content.a.a(context).d(this.f181748d);
        this.f181747c = null;
    }

    @Override // com.avito.android.location.find.InterfaceC31503a
    public final void d(@Y61.k Activity activity) {
        this.f181747c = new WeakReference<>(activity);
    }

    @Override // com.avito.android.location.find.InterfaceC31503a
    public final boolean e() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f181747c;
        return (weakReference == null || (activity = weakReference.get()) == null || C36687f.f349287e.c(C36688g.f349288a, activity) != 0) ? false : true;
    }
}
