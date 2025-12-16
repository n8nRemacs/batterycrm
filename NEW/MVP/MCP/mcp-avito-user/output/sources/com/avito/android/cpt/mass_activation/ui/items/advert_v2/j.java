package com.avito.android.cpt.mass_activation.ui.items.advert_v2;

import KV.a;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptMassActivationAdvertV2View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/ui/items/advert_v2/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cpt/mass_activation/ui/items/advert_v2/g;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f126646i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f126647b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f126648c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f126649d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f126650e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f126651f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f126652g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f126653h;

    public j(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f126647b = aVar;
        this.f126648c = (SimpleDraweeView) view.findViewById(R.id.cpt_mass_activation_advert_image_v2);
        this.f126649d = (TextView) view.findViewById(R.id.cpt_mass_activation_advert_text_title_v2);
        this.f126650e = (TextView) view.findViewById(R.id.cpt_mass_activation_advert_text_description_v2);
        this.f126651f = (TextView) view.findViewById(R.id.cpt_mass_activation_advert_text_fee_v2);
        this.f126652g = (ImageView) view.findViewById(R.id.cpt_mass_activation_advert_fee_info_icon_v2);
        this.f126653h = (TextView) view.findViewById(R.id.cpt_mass_activation_advert_text_fbs_fee_v2);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert_v2.g
    public final void Ms(@l final k kVar) {
        int i12 = kVar != null ? 0 : 8;
        ImageView imageView = this.f126652g;
        imageView.setVisibility(i12);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.cpt.mass_activation.ui.items.advert_v2.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = j.f126646i;
                k kVar2 = kVar;
                if (kVar2 != null) {
                    j jVar = this;
                    com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(jVar.itemView.getContext(), 0, 0, 6, null);
                    r.d dVar = new r.d(new i.a(null, 1, null));
                    dVar.j(y6.b(-10));
                    dVar.m(y6.b(0));
                    a.C0572a c0572a = KV.a.f9464v;
                    Context context = jVar.itemView.getContext();
                    int iJ2 = C35835l0.j(R.attr.tooltipDefault, jVar.itemView.getContext());
                    c0572a.getClass();
                    kVar3.c(KV.a.a(a.C0572a.b(iJ2, context), -2, 0, 0, 2097150));
                    AttributedText attributedText = kVar2.f126654a;
                    com.avito.android.util.text.a aVar = jVar.f126647b;
                    kVar3.b(new TooltipState(dVar, true, null, attributedText != null ? aVar.c(jVar.itemView.getContext(), attributedText) : null, aVar.c(jVar.itemView.getContext(), kVar2.f126655b), null, null, null, null, null, false, new i(kVar3), jVar.f126652g, TooltipState.State.f181285b, 996, null));
                }
            }
        });
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert_v2.g
    public final void b9(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f126651f, attributedText, this.f126647b);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert_v2.g
    public final void e(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f126649d, attributedText, this.f126647b);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert_v2.g
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f126650e, attributedText, this.f126647b);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert_v2.g
    public final void k9(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f126653h, attributedText, this.f126647b);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert_v2.g
    public final void l(@Y61.k Image image) {
        C35949t5.c(this.f126648c, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }
}
