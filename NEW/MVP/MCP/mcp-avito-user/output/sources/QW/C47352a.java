package qW;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.appcompat.app.l;
import com.avito.android.R;
import com.avito.android.async_phone.impl_module.phone_request_link.confirmation_dialog_fragment.c;
import com.avito.android.favorites.i1;
import com.avito.android.lib.util.g;
import com.avito.android.location.find.f;
import com.avito.android.util.L6;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.B;
import java.lang.ref.WeakReference;
import java.util.Timer;
import kotlin.Metadata;

/* compiled from: DetectLocationHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LqW/a;", "Landroid/location/LocationListener;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qW.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47352a implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L6 f429287a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WeakReference<Activity> f429288b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final WeakReference<com.avito.android.ui.a> f429289c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LocationManager f429290d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public f f429291e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Timer f429292f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Location f429293g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f429294h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f429295i;

    /* compiled from: DetectLocationHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqW/a$a;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qW.a$a, reason: collision with other inner class name */
    public interface InterfaceC12329a {
    }

    public C47352a(@k Activity activity, @k com.avito.android.ui.a aVar, @k L6 l62) {
        this.f429287a = l62;
        this.f429288b = new WeakReference<>(activity);
        this.f429289c = new WeakReference<>(aVar);
        this.f429290d = (LocationManager) activity.getApplicationContext().getSystemService("location");
    }

    public final void a() {
        Activity activity = this.f429288b.get();
        com.avito.android.ui.a aVar = this.f429289c.get();
        if (activity == null || aVar == null) {
            return;
        }
        g.a(new l.a(activity).setMessage(activity.getString(R.string.loc_providers_unavailable_message)).setPositiveButton(R.string.settings, new c(aVar, 1)).setNegativeButton(R.string.cancel, new i1(2)).create());
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(@k Location location) {
        f fVar;
        this.f429290d.removeUpdates(this);
        this.f429293g = location;
        if (location != null && (fVar = this.f429291e) != null) {
            B<Location> b12 = fVar.f181750a;
            if (!b12.getF318621e()) {
                fVar.f181751b.f181755d.m(location);
                V2.f318762a.b("Get network Coordinates: " + location, null);
                b12.onNext(location);
                b12.e();
            }
        }
        this.f429295i = false;
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(@k String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(@k String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(@k String str, int i12, @k Bundle bundle) {
    }
}
