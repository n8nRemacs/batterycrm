package com.avito.android.seller_coach.hints_dialog.item.hint;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.seller_coach.hints_dialog.item.hint.d;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HintItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/hint/h;", "Lcom/avito/android/seller_coach/hints_dialog/item/hint/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f267499j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f267500b;

    /* renamed from: c, reason: collision with root package name */
    public final SimpleDraweeView f267501c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f267502d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f267503e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f267504f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f267505g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f267506h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f267507i;

    public h(@k View view) {
        super(view);
        this.f267500b = view;
        this.f267501c = (SimpleDraweeView) view.findViewById(R.id.sdv_advice_detail);
        this.f267502d = (TextView) view.findViewById(R.id.tv_advice_detail_title);
        this.f267503e = (TextView) view.findViewById(R.id.tv_advice_detail_description);
        this.f267504f = (TextView) view.findViewById(R.id.tv_advice_detail_views);
        this.f267505g = (TextView) view.findViewById(R.id.tv_advice_detail_contacts);
        this.f267506h = (TextView) view.findViewById(R.id.tv_advice_detail_funnel);
        this.f267507i = (Button) view.findViewById(R.id.btn_advice_detail);
    }

    @Override // com.avito.android.seller_coach.hints_dialog.item.hint.g
    public final void XE(@k a aVar, @k d.a aVar2) {
        Image image = aVar.f267491h;
        SimpleDraweeView simpleDraweeView = this.f267501c;
        simpleDraweeView.e(C35829k2.c(image, simpleDraweeView, 2, 22).d());
        this.f267502d.setText(aVar.f267486c);
        this.f267503e.setText(aVar.f267487d);
        i iVar = aVar.f267492i;
        int i12 = iVar != null ? 0 : 8;
        TextView textView = this.f267504f;
        textView.setVisibility(i12);
        int i13 = iVar != null ? 0 : 8;
        TextView textView2 = this.f267505g;
        textView2.setVisibility(i13);
        int i14 = iVar != null ? 0 : 8;
        TextView textView3 = this.f267506h;
        textView3.setVisibility(i14);
        if (iVar != null) {
            textView.setText(C5.d(iVar.f267508a));
            textView2.setText(C5.d(iVar.f267509b));
            textView3.setText(C5.d(iVar.f267510c) + '%');
        }
        int i15 = aVar.f267489f == null ? 8 : 0;
        Button button = this.f267507i;
        button.setVisibility(i15);
        button.setText(aVar.f267490g);
        button.setOnClickListener(new m(7, aVar2, aVar));
    }
}
