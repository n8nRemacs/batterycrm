package com.avito.android.user_advert.advert.items.job_list_item;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobListItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/job_list_item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/job_list_item/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f309555d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f309556b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f309557c;

    public i(@k View view) {
        super(view);
        ListItem listItem = (ListItem) view;
        this.f309556b = listItem;
        this.f309557c = listItem.getContext();
    }

    @Override // com.avito.android.user_advert.advert.items.job_list_item.h
    public final void Hi(@k String str) {
        Integer numA;
        Context context = this.f309557c;
        Drawable drawable = androidx.core.content.d.getDrawable(context, R.drawable.bg_job_list_item_icon);
        LayerDrawable layerDrawable = null;
        if (drawable != null && (numA = q.a(str)) != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{drawable, C35835l0.m(context, numA.intValue(), R.attr.black)});
            layerDrawable.setLayerSize(1, y6.b(16), y6.b(16));
            layerDrawable.setLayerGravity(1, 17);
        }
        this.f309556b.g(layerDrawable, C35835l0.m(context, R.attr.ic_arrowRight20, R.attr.black));
    }

    @Override // com.avito.android.user_advert.advert.items.job_list_item.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f309556b.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(16, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.job_list_item.h
    public final void cR(@k kV.f fVar) {
        this.f309556b.setState((kV.b) fVar);
    }
}
