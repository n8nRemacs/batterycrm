package com.avito.android.advert.item.gig.documents;

import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigPersonalInfoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/gig/documents/d;", "Lcom/avito/android/advert/item/gig/documents/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f75727b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f75728c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f75729d;

    public d(@k View view) {
        super(view);
        this.f75727b = view;
        this.f75728c = (TextView) view.findViewById(R.id.gig_personal_info_title);
        this.f75729d = (LinearLayout) view.findViewById(R.id.gig_documents_container);
    }

    @Override // com.avito.android.advert.item.gig.documents.c
    public final void XD(@k l lVar, @k String str, @k List list) {
        LinearLayout linearLayout = this.f75729d;
        linearLayout.removeAllViews();
        this.f75728c.setText(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DocumentButtonItem documentButtonItem = (DocumentButtonItem) it.next();
            View viewInflate = LayoutInflater.from(this.f75727b.getContext()).inflate(R.layout.document_button_item, (ViewGroup) null);
            com.avito.android.confirm_documents_bottom_sheet.list.a aVar = new com.avito.android.confirm_documents_bottom_sheet.list.a(viewInflate);
            aVar.b(documentButtonItem.f125589b);
            aVar.n(documentButtonItem.f125590c);
            aVar.FI(documentButtonItem.f125591d);
            aVar.Iq(documentButtonItem, lVar);
            linearLayout.addView(viewInflate);
        }
    }
}
