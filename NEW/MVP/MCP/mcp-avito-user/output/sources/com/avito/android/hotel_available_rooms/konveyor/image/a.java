package com.avito.android.hotel_available_rooms.konveyor.image;

import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomImageView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image/a;", "Lcom/avito/android/hotel_available_rooms/konveyor/image/n;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageView f162979b;

    public a(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f162979b = (ImageView) viewFindViewById;
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.image.n
    public final void a(@Y61.k Y41.a<G0> aVar) {
        D6.a(aVar, this.f162979b);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.image.n
    public final void bL(@Y61.k Image image, @Y61.k ImageCorners imageCorners, int i12) {
        ImageView imageView = this.f162979b;
        imageView.setForeground(D6.u(imageView, R.drawable.ic_hotels_placeholder));
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.d(com.avito.android.image_loader.b.b(image));
        aVar.f169491i = true;
        aVar.f169494l = true;
        aVar.f169485c = Integer.valueOf(i12);
        aVar.f169492j = D6.u(imageView, i12);
        aVar.f169493k = null;
        aVar.f169486d = true;
        aVar.f169488f = new ImageRequest.b(y6.b(imageCorners.f162970b), y6.b(imageCorners.f162971c), y6.b(imageCorners.f162973e), y6.b(imageCorners.f162972d));
        aVar.f169490h = new C4763a();
        aVar.c();
    }

    @Override // TV0.e
    public final void j5() {
        throw null;
    }

    /* compiled from: ImageRequests.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.hotel_available_rooms.konveyor.image.a$a, reason: collision with other inner class name */
    public static final class C4763a implements com.avito.android.image_loader.i {
        public C4763a() {
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            a.this.f162979b.setForeground(null);
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@Y61.l Throwable th2) {
        }
    }
}
