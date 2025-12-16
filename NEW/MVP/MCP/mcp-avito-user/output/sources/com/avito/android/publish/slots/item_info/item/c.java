package com.avito.android.publish.slots.item_info.item;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoField;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemInfoCarParamsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/item_info/item/c;", "Lcom/avito/android/publish/slots/item_info/item/q;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f244371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f244372c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f244373d;

    public c(@Y61.k View view) {
        super(view);
        this.f244371b = (TextView) view.findViewById(R.id.title);
        this.f244372c = (TextView) view.findViewById(R.id.description);
        this.f244373d = (SimpleDraweeView) view.findViewById(R.id.image);
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void b(@Y61.l String str) {
        I5.a(this.f244371b, str, false);
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void l(@Y61.k Image image) {
        C35949t5.c(this.f244373d, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void n(@Y61.l String str) {
        I5.a(this.f244372c, str, false);
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void p40(boolean z12, boolean z13, @Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void TL(@Y61.k List<ItemInfoField> list, @Y61.l Integer num, boolean z12, @Y61.l Y41.a<G0> aVar) {
    }
}
