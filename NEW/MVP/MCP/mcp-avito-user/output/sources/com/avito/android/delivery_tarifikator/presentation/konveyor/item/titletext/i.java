package com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext;

import Y61.k;
import Yv.C18330a;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.w;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TitleTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/h;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f135512b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f135513c;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.item_title_tv);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135512b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_title_attributed_tv);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f135513c = textView;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.h
    public final void Ng(@k d dVar, @k w wVar) {
        c cVar = dVar.f135508c;
        boolean z12 = cVar instanceof c.b;
        int i12 = z12 ? 0 : 8;
        TextView textView = this.f135512b;
        textView.setVisibility(i12);
        boolean z13 = cVar instanceof c.a;
        int i13 = z13 ? 0 : 8;
        TextView textView2 = this.f135513c;
        textView2.setVisibility(i13);
        if (z13) {
            C18330a.b(textView2, ((c.a) cVar).f135505a, wVar);
        } else if (z12) {
            textView.setText(((c.b) cVar).f135506a.k0(this.itemView.getContext()));
        }
    }
}
