package com.avito.android.device_orientation;

import android.view.Display;
import com.avito.android.device_orientation.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RotationProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/device_orientation/g;", "Lcom/avito/android/device_orientation/f;", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Display f139239a;

    @Inject
    public g(@Y61.k Display display) {
        this.f139239a = display;
    }

    @Override // com.avito.android.device_orientation.f
    @Y61.k
    public final c getRotation() {
        int rotation = this.f139239a.getRotation();
        return rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? new c.a() : new c.C4199c() : new c.b() : new c.d() : new c.a();
    }
}
