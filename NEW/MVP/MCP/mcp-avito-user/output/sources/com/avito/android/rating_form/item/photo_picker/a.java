package com.avito.android.rating_form.item.photo_picker;

import com.avito.android.R;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.InterfaceC33218l;
import com.avito.android.photo_list_view.L;
import com.avito.android.rating_form.RatingFormArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;

/* compiled from: RatingFormImageConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/a;", "Lcom/avito/android/photo_list_view/l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements InterfaceC33218l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingFormArguments f248499a;

    public a(@Y61.k RatingFormArguments ratingFormArguments) {
        this.f248499a = ratingFormArguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.photo_list_view.InterfaceC33218l
    @Y61.k
    public final List a(int i12, @Y61.k List list, boolean z12) {
        if (list.size() >= i12) {
            return list;
        }
        List list2 = list;
        Q q12 = this.f248499a instanceof RatingFormArguments.RatingSellerArguments ? new Q(null, Integer.valueOf(R.drawable.ic_rating_form_redesign_camera)) : new Q(Integer.valueOf(R.string.image_placeholder_text), Integer.valueOf(R.drawable.common_ic_camera_filled_24));
        return C42745f0.i0(new L("9223372036854775806", null, z12 ? new InterfaceC33208b.InterfaceC6540b.C6541b(false) : InterfaceC33208b.InterfaceC6540b.d.f218120a, null, (Integer) q12.f406619b, Integer.valueOf(((Number) q12.f406620c).intValue()), null, 72, null), list2);
    }
}
