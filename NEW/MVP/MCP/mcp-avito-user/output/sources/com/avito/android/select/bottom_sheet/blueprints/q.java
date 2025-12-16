package com.avito.android.select.bottom_sheet.blueprints;

import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/q;", "LTV0/e;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface q extends TV0.e {

    /* compiled from: CheckableItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void HC(boolean z12);

    void Kd(boolean z12);

    void a(@Y61.k Y41.a<G0> aVar);

    void c3(boolean z12);

    void f(@Y61.l String str);

    void gA(@Y61.l UniversalImage universalImage, @Y61.l Size size);

    void iw(@Y61.l BaseListItem.Alignment alignment);

    void l(@Y61.l Image image);

    void l00(@Y61.k String str);

    void p0();

    void s(@Y61.k String str);

    void setChecked(boolean z12);

    void setImage(int i12);

    void setTitle(@Y61.k String str);
}
