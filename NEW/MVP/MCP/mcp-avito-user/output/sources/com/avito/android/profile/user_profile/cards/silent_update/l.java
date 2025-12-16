package com.avito.android.profile.user_profile.cards.silent_update;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SilentUpdateView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/silent_update/l;", "Lcom/avito/android/profile/user_profile/cards/silent_update/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f225537g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f225538b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f225539c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f225540d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f225541e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f225542f;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.silent_update_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225538b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.silent_update_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225539c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.silent_update_update_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f225540d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.silent_update_description_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f225541e = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.silent_update_close_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f225542f = (ImageView) viewFindViewById5;
    }

    @Override // com.avito.android.profile.user_profile.cards.silent_update.k
    public final void rE(@Y61.k CardItem.SilentUpdateItem silentUpdateItem, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        CardItem.PromoBlockItem promoBlockItem = silentUpdateItem.f224581c;
        I5.a(this.f225538b, promoBlockItem.f224501e, false);
        I5.a(this.f225539c, promoBlockItem.f224502f, false);
        TnsPromoBlockItem.Button button = promoBlockItem.f224508l;
        String f231757b = button != null ? button.getF229143e() : null;
        Button button2 = this.f225540d;
        com.avito.android.lib.design.button.b.a(button2, f231757b, false);
        button2.setOnClickListener(new com.avito.android.profile.edit.adapter.c(23, aVar));
        TnsPromoBlockItem.Button button3 = promoBlockItem.f224509m;
        String f231757b2 = button3 != null ? button3.getF229143e() : null;
        Button button4 = this.f225541e;
        com.avito.android.lib.design.button.b.a(button4, f231757b2, false);
        button4.setOnClickListener(new com.avito.android.profile.edit.adapter.c(24, aVar2));
        ImageView imageView = this.f225542f;
        D6.G(imageView, promoBlockItem.f224505i);
        imageView.setOnClickListener(new com.avito.android.profile.edit.adapter.c(25, aVar3));
    }
}
