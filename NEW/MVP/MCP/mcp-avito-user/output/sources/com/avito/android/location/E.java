package com.avito.android.location;

import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SavedLocationMigrationHelper.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/E;", "Lcom/avito/android/location/D;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f181703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f181704b = new Gson();

    @Inject
    public E(@Y61.k AK0.l lVar) {
        this.f181703a = lVar;
    }

    @Override // com.avito.android.location.D
    public final void a() {
        Gson gson = this.f181704b;
        AK0.e.f299a.getClass();
        String str = AK0.e.f303e;
        AK0.l lVar = this.f181703a;
        String string = lVar.getString(str);
        if (string != null) {
            try {
                C31498b c31498b = (C31498b) gson.d(C31498b.class, string);
                if (c31498b != null) {
                    lVar.a(3, AK0.e.f302d);
                    LocationSource locationSource = LocationSource.f181711c;
                    lVar.putString("location_from_list", gson.l(c31498b));
                }
            } catch (Throwable unused) {
            }
        }
        AK0.e.f299a.getClass();
        lVar.remove(AK0.e.f303e);
    }
}
