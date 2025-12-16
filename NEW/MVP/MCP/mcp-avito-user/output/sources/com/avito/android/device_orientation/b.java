package com.avito.android.device_orientation;

import android.content.Context;
import android.view.OrientationEventListener;
import kotlin.Metadata;

/* compiled from: DeviceOrientationProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/device_orientation/b;", "Lcom/avito/android/device_orientation/a;", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.device_orientation.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Integer> f139235a = new com.jakewharton.rxrelay3.b<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f139236b;

    /* compiled from: DeviceOrientationProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/device_orientation/b$a", "Landroid/view/OrientationEventListener;", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends OrientationEventListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f139237a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, b bVar) {
            super(context);
            this.f139237a = bVar;
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i12) {
            this.f139237a.f139235a.accept(Integer.valueOf(i12));
        }
    }

    public b(@Y61.k Context context) {
        this.f139236b = new a(context, this);
    }
}
