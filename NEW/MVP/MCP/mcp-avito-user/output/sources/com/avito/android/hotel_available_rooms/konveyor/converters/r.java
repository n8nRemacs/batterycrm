package com.avito.android.hotel_available_rooms.konveyor.converters;

import com.avito.android.R;
import com.avito.android.hotel_available_rooms.konveyor.image.HotelRoomImageItem;
import com.avito.android.hotel_available_rooms.konveyor.image.ImageCorners;
import com.avito.android.hotel_available_rooms.konveyor.image.ImageSize;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomGalleryItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/converters/r;", "Lcom/avito/android/hotel_available_rooms/konveyor/converters/q;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImageCorners f162891a = new ImageCorners(16, 16, 16, 16);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageCorners f162892b = new ImageCorners(6, 6, 6, 6);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageCorners f162893c = new ImageCorners(16, 6, 16, 6);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageCorners f162894d = new ImageCorners(6, 16, 6, 16);

    @Inject
    public r() {
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.converters.q
    @Y61.k
    public final List a(@Y61.k String str, @Y61.l List list) {
        if (list != null && list.size() == 1) {
            return Collections.singletonList(new HotelRoomImageItem("hotel_room_image_item", str, (Image) C42745f0.E(list), ImageSize.f162976d, this.f162891a, R.drawable.bg_image_single_placeholder));
        }
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
                int i12 = 0;
                for (Object obj : list3) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    Image image = (Image) obj;
                    ImageCorners imageCorners = i12 == 0 ? this.f162893c : i12 == list.size() - 1 ? this.f162894d : this.f162892b;
                    int i14 = i12 == 0 ? R.drawable.bg_image_start_placeholder : i12 == list.size() - 1 ? R.drawable.bg_image_end_placeholder : R.drawable.bg_image_middle_placeholder;
                    Size size = (Size) C42745f0.F(image.getVariants().keySet());
                    ImageSize imageSize = (size != null && size.getWidth() <= size.getHeight()) ? ImageSize.f162974b : ImageSize.f162975c;
                    arrayList.add(new HotelRoomImageItem("hotel_room_image_item", str, image, imageSize, imageCorners, i14));
                    i12 = i13;
                }
                return arrayList;
            }
        }
        return Collections.singletonList(new HotelRoomImageItem("hotel_room_image_item", str, new Image(P0.c()), ImageSize.f162976d, this.f162891a, R.drawable.bg_image_single_placeholder));
    }
}
