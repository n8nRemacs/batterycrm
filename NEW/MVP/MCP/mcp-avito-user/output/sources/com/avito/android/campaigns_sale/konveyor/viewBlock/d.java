package com.avito.android.campaigns_sale.konveyor.viewBlock;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.campaigns_sale.view.images_row.ImagesRowView;
import com.avito.android.util.D6;
import gm.C40704a;
import gm.C40705b;
import im.InterfaceC41424a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SaleViewBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/konveyor/viewBlock/d;", "LTV0/d;", "Lcom/avito/android/campaigns_sale/konveyor/viewBlock/f;", "Lgm/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<f, C40705b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC41424a, G0> f114036b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC41424a, G0> lVar) {
        this.f114036b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws Resources.NotFoundException {
        View.OnClickListener onClickListener;
        f fVar = (f) eVar;
        final C40705b c40705b = (C40705b) aVar;
        List<Long> list = c40705b.f396777f;
        int size = list != null ? list.size() : 0;
        Context context = fVar.f114043g;
        Integer num = c40705b.f396779h;
        String string = num != null ? context.getResources().getString(R.string.campaigns_sale_discount, num) : context.getResources().getString(R.string.campaigns_sale_choose_discount);
        TextView textView = fVar.f114039c;
        textView.setText(string);
        C40704a c40704a = c40705b.f396781j;
        boolean z12 = c40705b.f396783l && num == null;
        boolean z13 = c40704a.f396771d;
        int i13 = fVar.f114045i;
        int i14 = fVar.f114046j;
        textView.setTextColor(z13 ? i14 : z12 ? fVar.f114044h : i13);
        ImageButton imageButton = fVar.f114040d;
        D6.G(imageButton, !z13);
        final int i15 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.campaigns_sale.konveyor.viewBlock.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f114034c;

            {
                this.f114034c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.f114034c.f114036b.invoke(new InterfaceC41424a.i(c40705b.f396773b));
                        break;
                    default:
                        this.f114034c.f114036b.invoke(new InterfaceC41424a.i(c40705b.f396773b));
                        break;
                }
            }
        });
        if (z13) {
            onClickListener = null;
        } else {
            final int i16 = 1;
            onClickListener = new View.OnClickListener(this) { // from class: com.avito.android.campaigns_sale.konveyor.viewBlock.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f114034c;

                {
                    this.f114034c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.f114034c.f114036b.invoke(new InterfaceC41424a.i(c40705b.f396773b));
                            break;
                        default:
                            this.f114034c.f114036b.invoke(new InterfaceC41424a.i(c40705b.f396773b));
                            break;
                    }
                }
            };
        }
        fVar.f114038b.setOnClickListener(onClickListener);
        String quantityString = context.getResources().getQuantityString(R.plurals.items, size, Integer.valueOf(size));
        TextView textView2 = fVar.f114041e;
        textView2.setText(quantityString);
        if (z13) {
            i13 = i14;
        }
        textView2.setTextColor(i13);
        List list2 = c40705b.f396778g;
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        int size2 = list != null ? list.size() : 0;
        boolean zIsEmpty = list2.isEmpty();
        ImagesRowView imagesRowView = fVar.f114042f;
        if (zIsEmpty) {
            D6.w(imagesRowView);
        } else {
            D6.H(imagesRowView);
            imagesRowView.L0(size2, list2, z13);
        }
    }
}
