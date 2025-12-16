package com.avito.android.publish.slots.promoblock.item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.category_parameters.slot.promoblock.PromoblockSlotItemMargins;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: PromoblockSlotItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/promoblock/item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/promoblock/item/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f244728b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f244729c;

    public h(@k View view) {
        super(view);
        Banner banner = (Banner) view;
        this.f244728b = banner;
        TextView textView = new TextView(banner.getThemedContext(), null, R.attr.textM1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, y6.b(8), 0, 0);
        textView.setLayoutParams(marginLayoutParams);
        this.f244729c = textView;
        banner.setContentView(textView);
    }

    @Override // com.avito.android.publish.slots.promoblock.item.g
    public final void A8(@InterfaceC42150f @l Integer num) {
        if (num != null) {
            this.f244728b.setAppearanceFromAttr(num.intValue());
        }
    }

    @Override // com.avito.android.publish.slots.promoblock.item.g
    public final void setText(@l String str) {
        I5.a(this.f244729c, str, false);
    }

    @Override // com.avito.android.publish.slots.promoblock.item.g
    public final void setTitle(@l String str) {
        this.f244728b.setTitle(str);
    }

    @Override // com.avito.android.publish.slots.promoblock.item.g
    public final void tp(@l PromoblockSlotItemMargins promoblockSlotItemMargins) {
        if (promoblockSlotItemMargins != null) {
            int iB2 = y6.b(promoblockSlotItemMargins.getLeft());
            int iB3 = y6.b(promoblockSlotItemMargins.getRight());
            int iB4 = y6.b(promoblockSlotItemMargins.getTop());
            int iB5 = y6.b(promoblockSlotItemMargins.getBottom());
            D6.b(this.f244728b, Integer.valueOf(iB2), Integer.valueOf(iB4), Integer.valueOf(iB3), Integer.valueOf(iB5));
        }
    }
}
