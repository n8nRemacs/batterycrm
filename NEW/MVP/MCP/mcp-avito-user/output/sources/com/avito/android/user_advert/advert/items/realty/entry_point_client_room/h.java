package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EntryPointToAccountOwnerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f309913h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f309914b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f309915c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f309916d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f309917e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f309918f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageButton f309919g;

    public h(@Y61.k View view, @Y61.k a aVar) {
        super(view);
        this.f309914b = aVar;
        this.f309915c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309916d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.main_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f309917e = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advantages_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f309918f = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image_close_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f309919g = (ImageButton) viewFindViewById4;
    }

    @Override // com.avito.android.user_advert.advert.items.realty.entry_point_client_room.g
    public final void dj(@Y61.k ArrayList arrayList, @Y61.k Y41.l lVar, @Y61.k Y41.a aVar) {
        this.f309919g.setOnClickListener(new com.avito.android.advert_core.advert.f(this, arrayList, lVar, aVar, 12));
    }

    @Override // com.avito.android.user_advert.advert.items.realty.entry_point_client_room.g
    public final void n1(@Y61.k List<MyAdvertDetails.Advantage> list) {
        LinearLayout linearLayout = this.f309918f;
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f309915c);
        for (MyAdvertDetails.Advantage advantage : list) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.my_adverty_entry_point_advantage_item, (ViewGroup) linearLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.subtitle);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(R.id.image);
            I5.a(textView, advantage.getTitle(), false);
            I5.a(textView2, advantage.getSubtitle(), false);
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.n.a(advantage.getUniversalImage().getImage()), null, null, null, 14);
            linearLayout.addView(viewInflate);
            D6.c(viewInflate, null, null, null, Integer.valueOf(y6.b(16)), 7);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.realty.entry_point_client_room.g
    public final void sP(@Y61.k MyAdvertDetails.MainButtonAction mainButtonAction, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        String text = mainButtonAction.getText();
        Button button = this.f309917e;
        button.setText(text);
        button.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(14, lVar, mainButtonAction));
    }

    @Override // com.avito.android.user_advert.advert.items.realty.entry_point_client_room.g
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f309916d, str, false);
    }
}
