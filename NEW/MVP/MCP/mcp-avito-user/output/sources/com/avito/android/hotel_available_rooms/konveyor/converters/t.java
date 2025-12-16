package com.avito.android.hotel_available_rooms.konveyor.converters;

import com.avito.android.R;
import com.avito.android.hotel_available_rooms.konveyor.image_redesign.HotelRoomImageRedesignItem;
import com.avito.android.hotel_available_rooms.konveyor.image_redesign.ImageRedesignCorners;
import com.avito.android.hotel_available_rooms.konveyor.image_redesign.ImageRedesignSize;
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

/* compiled from: HotelRoomGalleryRedesignItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/converters/t;", "Lcom/avito/android/hotel_available_rooms/konveyor/converters/q;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImageRedesignCorners f162896a = new ImageRedesignCorners(20.0f, 20.0f, 20.0f, 20.0f);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageRedesignCorners f162897b = new ImageRedesignCorners(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageRedesignCorners f162898c = new ImageRedesignCorners(20.0f, 0.0f, 20.0f, 0.0f);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageRedesignCorners f162899d = new ImageRedesignCorners(0.0f, 20.0f, 0.0f, 20.0f);

    @Inject
    public t() {
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.converters.q
    @Y61.k
    public final List a(@Y61.k String str, @Y61.l List list) {
        Size size;
        if (list != null && list.size() == 1) {
            return Collections.singletonList(new HotelRoomImageRedesignItem("hotel_room_image_item", str, (Image) C42745f0.E(list), ImageRedesignSize.f163014d, this.f162896a, R.drawable.bg_image_single_placeholder));
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
                    arrayList.add(new HotelRoomImageRedesignItem("hotel_room_image_item", str, image, (list.size() != 2 || ((size = (Size) C42745f0.F(image.getVariants().keySet())) != null && size.getWidth() > size.getHeight())) ? ImageRedesignSize.f163012b : ImageRedesignSize.f163013c, i12 == 0 ? this.f162898c : i12 == list.size() - 1 ? this.f162899d : this.f162897b, i12 == 0 ? R.drawable.bg_image_start_placeholder : i12 == list.size() - 1 ? R.drawable.bg_image_end_placeholder : R.drawable.bg_image_middle_placeholder));
                    i12 = i13;
                }
                return arrayList;
            }
        }
        return Collections.singletonList(new HotelRoomImageRedesignItem("hotel_room_image_item", str, new Image(P0.c()), ImageRedesignSize.f163014d, this.f162896a, R.drawable.bg_image_single_placeholder));
    }
}
