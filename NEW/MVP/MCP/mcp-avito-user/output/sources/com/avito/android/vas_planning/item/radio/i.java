package com.avito.android.vas_planning.item.radio;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.vas_planning.model.VasPlanningItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningRadioView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/item/radio/i;", "Lcom/avito/android/vas_planning/item/radio/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemRadio f322400b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f322401c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Badge f322402d;

    public i(@k ListItemRadio listItemRadio) {
        super(listItemRadio);
        this.f322400b = listItemRadio;
        this.f322402d = (Badge) LayoutInflater.from(listItemRadio.getContext()).inflate(R.layout.vas_planning_badge, (ViewGroup) null, false);
    }

    @Override // com.avito.android.vas_planning.item.radio.h
    @SuppressLint({"UdfComponentUsage"})
    public final void Nq(@k VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem) {
        boolean z12 = vasPlanningRadioItem.f322435j;
        ListItemRadio listItemRadio = this.f322400b;
        listItemRadio.setChecked(z12);
        listItemRadio.setToggleByClickEnabled(false);
        listItemRadio.setTitle(vasPlanningRadioItem.f322430e);
        String str = vasPlanningRadioItem.f322432g;
        if (str != null) {
            Badge badge = this.f322402d;
            badge.setTitleText(str);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            badge.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            badge.layout(0, 0, badge.getMeasuredWidth(), badge.getMeasuredHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(badge.getMeasuredWidth(), badge.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            badge.draw(new Canvas(bitmapCreateBitmap));
            listItemRadio.setImageBitmap(bitmapCreateBitmap);
        } else {
            listItemRadio.setImageDrawable(null);
        }
        listItemRadio.setMessage(vasPlanningRadioItem.f322431f);
        listItemRadio.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 11));
    }

    @Override // com.avito.android.vas_planning.item.radio.h
    public final void kK(@k Y41.a<G0> aVar) {
        this.f322401c = aVar;
    }
}
