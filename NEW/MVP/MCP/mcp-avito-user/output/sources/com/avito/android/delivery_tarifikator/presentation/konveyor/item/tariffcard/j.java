package com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard;

import Rv.C15084a;
import Y61.k;
import Y61.l;
import Yv.C18330a;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/h;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f135478b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f135479c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f135480d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f135481e;

    /* renamed from: f, reason: collision with root package name */
    public long f135482f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public String f135483g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public d f135484h;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.item_tariff_card_name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135478b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_tariff_card_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135479c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.item_tariff_card_edit_btn);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        this.f135480d = button;
        View viewFindViewById4 = view.findViewById(R.id.item_tariff_card_delete_btn);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById4;
        this.f135481e = button2;
        this.f135483g = "";
        C18330a.c(this.itemView);
        final int i12 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f135477c;

            {
                this.f135477c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        j jVar = this.f135477c;
                        d dVar = jVar.f135484h;
                        if (dVar != null) {
                            dVar.U2(jVar.f135482f, jVar.f135483g);
                            break;
                        }
                        break;
                    default:
                        j jVar2 = this.f135477c;
                        d dVar2 = jVar2.f135484h;
                        if (dVar2 != null) {
                            dVar2.z(jVar2.f135482f);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f135477c;

            {
                this.f135477c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        j jVar = this.f135477c;
                        d dVar = jVar.f135484h;
                        if (dVar != null) {
                            dVar.U2(jVar.f135482f, jVar.f135483g);
                            break;
                        }
                        break;
                    default:
                        j jVar2 = this.f135477c;
                        d dVar2 = jVar2.f135484h;
                        if (dVar2 != null) {
                            dVar2.z(jVar2.f135482f);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.h
    public final void YK(@k c cVar, @l C15084a.c cVar2) {
        this.f135482f = cVar.f135468c;
        String str = cVar.f135469d;
        this.f135483g = str;
        if (cVar2 == null || cVar2.f14739a.f318649a) {
            this.f135478b.setText(str);
        }
        if (cVar2 == null || cVar2.f14740b.f318649a) {
            this.f135479c.setText(cVar.f135470e);
        }
        Button button = this.f135480d;
        if (cVar2 == null || cVar2.f14741c.f318649a) {
            boolean z12 = cVar.f135472g;
            button.setEnabled(!z12);
            this.f135481e.setEnabled(!z12);
        }
        button.setVisibility(cVar.f135471f ? 0 : 8);
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.h
    public final void eA(@k d dVar) {
        this.f135484h = dVar;
    }
}
