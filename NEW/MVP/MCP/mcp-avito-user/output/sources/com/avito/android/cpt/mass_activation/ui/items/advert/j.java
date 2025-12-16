package com.avito.android.cpt.mass_activation.ui.items.advert;

import KV.a;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptMassActivationAdvertView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/ui/items/advert/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cpt/mass_activation/ui/items/advert/g;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f126620i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f126621b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f126622c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f126623d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f126624e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f126625f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f126626g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f126627h;

    public j(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f126621b = aVar;
        this.f126622c = (SimpleDraweeView) view.findViewById(R.id.cpt_mass_activation_advert_image);
        this.f126623d = (TextView) view.findViewById(R.id.cpt_mass_activation_advert_text_title);
        this.f126624e = (TextView) view.findViewById(R.id.cpt_mass_activation_advert_text_description);
        this.f126625f = (TextView) view.findViewById(R.id.cpt_mass_activation_advert_text_fee);
        this.f126626g = (TextView) view.findViewById(R.id.cpt_mass_activation_advert_text_fbs_fee);
        this.f126627h = (ImageView) view.findViewById(R.id.cpt_mass_activation_advert_fee_info_icon);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert.g
    public final void Ks(@l final k kVar) {
        int i12 = kVar != null ? 0 : 8;
        ImageView imageView = this.f126627h;
        imageView.setVisibility(i12);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.cpt.mass_activation.ui.items.advert.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = j.f126620i;
                k kVar2 = kVar;
                if (kVar2 != null) {
                    j jVar = this;
                    com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(jVar.itemView.getContext(), 0, 0, 6, null);
                    a.C0572a c0572a = KV.a.f9464v;
                    Context context = jVar.itemView.getContext();
                    int iJ2 = C35835l0.j(R.attr.tooltipDefault, jVar.itemView.getContext());
                    c0572a.getClass();
                    kVar3.c(KV.a.a(a.C0572a.b(iJ2, context), -2, 0, 0, 2097150));
                    r.d dVar = new r.d(new i.a(new b.a()));
                    AttributedText attributedText = kVar2.f126628a;
                    com.avito.android.util.text.a aVar = jVar.f126621b;
                    kVar3.b(new TooltipState(dVar, true, null, attributedText != null ? aVar.c(jVar.itemView.getContext(), attributedText) : null, aVar.c(jVar.itemView.getContext(), kVar2.f126629b), null, null, null, null, null, false, new i(kVar3), jVar.f126627h, TooltipState.State.f181285b, 996, null));
                }
            }
        });
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert.g
    public final void b9(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f126625f, attributedText, this.f126621b);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert.g
    public final void e(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f126623d, attributedText, this.f126621b);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert.g
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f126624e, attributedText, this.f126621b);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert.g
    public final void k9(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f126626g, attributedText, this.f126621b);
    }

    @Override // com.avito.android.cpt.mass_activation.ui.items.advert.g
    public final void l(@Y61.k Image image) {
        C35949t5.c(this.f126622c, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }
}
