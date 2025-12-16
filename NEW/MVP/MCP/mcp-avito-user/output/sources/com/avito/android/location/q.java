package com.avito.android.location;

import com.avito.android.remote.model.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SavedLocation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/q;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Location f181849a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f181850b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f181851c;

    public q(@Y61.k Location location, boolean z12, boolean z13) {
        this.f181849a = location;
        this.f181850b = z12;
        this.f181851c = z13;
    }

    public /* synthetic */ q(Location location, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(location, z12, (i12 & 4) != 0 ? false : z13);
    }
}
