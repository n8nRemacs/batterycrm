package com.avito.android.developments_agency_search.screen.deal_room.adapter.note;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NoteView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/note/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/note/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f137411e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f137412b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f137413c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f137414d;

    public i(@k View view) {
        super(view);
        this.f137412b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137413c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.action_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f137414d = (Button) viewFindViewById2;
        float fB2 = y6.b(16);
        Ow.f.a(view, fB2, fB2, fB2, fB2, C35835l0.e(R.attr.warmGray75, view.getContext()));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.note.h
    public final void L0(@k Y41.a<G0> aVar) {
        this.f137414d.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(19, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.note.h
    public final void xH(@k PrintableText printableText) {
        I5.a(this.f137413c, printableText.k0(this.f137412b), false);
    }
}
