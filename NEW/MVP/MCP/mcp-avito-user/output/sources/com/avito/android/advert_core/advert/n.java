package com.avito.android.advert_core.advert;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.remote.model.AdvertParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsGroupView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/n;", "Lcom/avito/android/advert_core/advert/m;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutInflater f82690a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f82691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public List<AdvertParameters.Group> f82692c = C42784z0.f406748b;

    /* renamed from: d, reason: collision with root package name */
    public final int f82693d = R.layout.rds_divider_1_gray150;

    /* renamed from: e, reason: collision with root package name */
    public final int f82694e = R.layout.rds_advert_group_title;

    /* renamed from: f, reason: collision with root package name */
    public final int f82695f = R.layout.rds_list_item_1_0_dense_title;

    /* renamed from: g, reason: collision with root package name */
    public final int f82696g = R.layout.rds_list_item_1_0_dense_subtitle;

    /* renamed from: h, reason: collision with root package name */
    public final int f82697h = R.layout.rds_advert_group_value_description;

    /* renamed from: i, reason: collision with root package name */
    public final int f82698i = R.layout.rds_list_item_1_0_dense;

    public n(@Y61.k View view, @Y61.l o oVar) {
        this.f82690a = LayoutInflater.from(view.getContext());
        View viewFindViewById = view.findViewById(R.id.groups_stub);
        viewFindViewById = viewFindViewById == null ? view.findViewById(R.id.groups_container) : viewFindViewById;
        if (viewFindViewById instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) viewFindViewById;
            viewStub.setInflatedId(R.id.groups_container);
            this.f82691b = (ViewGroup) viewStub.inflate();
        } else if (viewFindViewById instanceof ViewGroup) {
            this.f82691b = (ViewGroup) viewFindViewById;
        }
        ViewGroup viewGroup = this.f82691b;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new B(oVar, 9));
        }
    }
}
