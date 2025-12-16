package com.avito.android.hotel_available_rooms.konveyor.image;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomImageView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/image/n;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f162985b;

    public d(@Y61.k View view) {
        super(view);
        this.f162985b = new a(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.image.n
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f162985b.a(aVar);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.image.n
    public final void bL(@Y61.k Image image, @Y61.k ImageCorners imageCorners, int i12) {
        this.f162985b.bL(image, imageCorners, i12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f162985b.getClass();
    }
}
