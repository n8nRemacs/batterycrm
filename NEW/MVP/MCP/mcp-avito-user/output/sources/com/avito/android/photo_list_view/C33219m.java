package com.avito.android.photo_list_view;

import com.avito.android.R;
import com.avito.android.photo_list_view.InterfaceC33208b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ImageListItemsConverterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/m;", "Lcom/avito/android/photo_list_view/l;", "<init>", "()V", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_list_view.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33219m implements InterfaceC33218l {
    @Override // com.avito.android.photo_list_view.InterfaceC33218l
    @Y61.k
    public final List a(int i12, @Y61.k List list, boolean z12) {
        if (list.size() < i12) {
            return C42745f0.i0(new L("9223372036854775806", null, z12 ? new InterfaceC33208b.InterfaceC6540b.C6541b(false) : InterfaceC33208b.InterfaceC6540b.d.f218120a, null, Integer.valueOf(R.string.add_photo), Integer.valueOf(R.drawable.common_ic_camera_filled_24), null, 72, null), list);
        }
        return list;
    }
}
