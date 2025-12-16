package com.avito.android.user_advert.advert.items.service_booking;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbStatusBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_booking/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/service_booking/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f310138f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f310139b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f310140c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ListItem f310141d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Button f310142e;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f310139b = view;
        this.f310140c = aVar;
        ListItem listItem = (ListItem) view.findViewById(R.id.sb_status_block_list_item);
        this.f310141d = listItem;
        this.f310142e = (Button) view.findViewById(R.id.sb_status_block_button);
        listItem.setLeftIconColor(ColorStateList.valueOf(C35835l0.d(R.attr.black, view.getContext())));
    }

    @Override // com.avito.android.user_advert.advert.items.service_booking.h
    public final void a0(@k Y41.a<G0> aVar) {
        Button button = this.f310142e;
        if (button != null) {
            button.setOnClickListener(new i(0, aVar));
        }
    }

    @Override // com.avito.android.user_advert.advert.items.service_booking.h
    public final void oo(@l String str, boolean z12) {
        Button button = this.f310142e;
        D6.G(button, z12);
        if (str == null || button == null) {
            return;
        }
        button.setText(str);
    }

    @Override // com.avito.android.user_advert.advert.items.service_booking.h
    public final void setTitle(@k String str) {
        this.f310141d.setTitle(str);
    }

    @Override // com.avito.android.user_advert.advert.items.service_booking.h
    public final void u10(@k AttributedText attributedText) {
        CharSequence charSequenceC = this.f310140c.c(this.f310139b.getContext(), attributedText);
        ListItem listItem = this.f310141d;
        listItem.setLink(charSequenceC);
        listItem.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }
}
