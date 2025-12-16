package com.avito.android.services_transportation_widget.location_sheet;

import Y41.l;
import Y61.k;
import androidx.view.InterfaceC23040h0;
import com.avito.android.remote.model.Location;
import com.avito.android.util.architecture_components.D;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceTransportationLocationSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/location_sheet/f;", "", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final D<Location> f280678a = new D<>();

    /* compiled from: ServiceTransportationLocationSheetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f280679b;

        public a(l lVar) {
            this.f280679b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f280679b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f280679b;
        }

        public final int hashCode() {
            return this.f280679b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f280679b.invoke(obj);
        }
    }

    public f(@k ServiceTransportationLocationSheet serviceTransportationLocationSheet, @k String str) {
    }
}
