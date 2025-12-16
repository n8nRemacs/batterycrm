package com.avito.android.rubricator.items.linear_service;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.util.C35829k2;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: SerpRubricatorLinearServiceItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rubricator/items/linear_service/i;", "Lcom/avito/android/rubricator/items/linear_service/h;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f255808b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f255809c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f255810d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f255811e;

    public i(@k View view) {
        super(view);
        this.f255808b = view;
        this.f255809c = (TextView) view.findViewById(R.id.title);
        this.f255810d = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f255811e = (ViewGroup) view.findViewById(R.id.rubricator_item_root);
    }

    @Override // com.avito.android.rubricator.items.linear_service.h
    public final void GW(@k RubricatorRefinedItem.SerpRubricatorLinearServiceItem serpRubricatorLinearServiceItem) {
        this.f255809c.setText(serpRubricatorLinearServiceItem.f255771d);
        UniversalImage universalImage = serpRubricatorLinearServiceItem.f255774g;
        if (universalImage != null) {
            Image imageQ = com.avito.android.actions_sheet.a.q(this.f255808b, universalImage);
            SimpleDraweeView simpleDraweeView = this.f255810d;
            simpleDraweeView.e(C35829k2.c(imageQ, simpleDraweeView, 0, 30).d());
        }
    }

    @Override // com.avito.android.rubricator.items.linear_service.h
    public final void x0(@k View.OnClickListener onClickListener) {
        this.f255811e.setOnClickListener(onClickListener);
    }
}
