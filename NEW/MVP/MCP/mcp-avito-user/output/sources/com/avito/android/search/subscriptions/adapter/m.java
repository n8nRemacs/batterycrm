package com.avito.android.search.subscriptions.adapter;

import android.content.Context;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.campaigns_sale.y;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.TypefaceType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSubscriptionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/subscriptions/adapter/m;", "Lcom/avito/android/search/subscriptions/adapter/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f263885h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f263886b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MenuInflater f263887c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f263888d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f263889e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f263890f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f263891g;

    public m(@Y61.k View view) {
        super(view);
        this.f263886b = view;
        this.f263887c = new MenuInflater(view.getContext());
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f263888d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.view_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f263889e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.date);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f263890f = (TextView) viewFindViewById3;
        this.f263891g = (Button) view.findViewById(R.id.saved_search_btn_more);
    }

    @Override // com.avito.android.search.subscriptions.adapter.k
    public final void J0(@Y61.k Y41.a<G0> aVar) {
        this.f263886b.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(18, aVar));
    }

    @Override // com.avito.android.search.subscriptions.adapter.k
    public final void VQ(@Y61.k final Y41.a<G0> aVar) {
        this.f263886b.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() { // from class: com.avito.android.search.subscriptions.adapter.l
            @Override // android.view.View.OnCreateContextMenuListener
            public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                this.f263883b.f263887c.inflate(R.menu.item_context_menu, contextMenu);
                com.avito.android.ui.d.a(contextMenu.findItem(R.id.delete_favorite_item), new y(1, aVar));
            }
        });
    }

    @Override // com.avito.android.search.subscriptions.adapter.k
    public final void VR(boolean z12) {
        TextView textView = this.f263888d;
        if (z12) {
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.circle_blue, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.avito.android.search.subscriptions.adapter.k
    public final void b0(@Y61.l String str) {
        I5.a(this.f263890f, str, false);
    }

    @Override // com.avito.android.search.subscriptions.adapter.k
    public final void h(@Y61.l String str) {
        I5.a(this.f263889e, str, false);
    }

    @Override // com.avito.android.search.subscriptions.adapter.k
    public final void ig(@Y61.k Y41.a<G0> aVar) {
        this.f263891g.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(19, aVar));
    }

    @Override // com.avito.android.search.subscriptions.adapter.k
    public final void setTitle(@Y61.l String str) {
        if (str != null) {
            this.f263888d.setText(str);
        }
    }

    @Override // com.avito.android.search.subscriptions.adapter.k
    public final void t50(boolean z12) {
        TextView textView = this.f263888d;
        if (z12) {
            Context context = textView.getContext();
            TypefaceType typefaceType = TypefaceType.f318743c;
            int i12 = C35777d6.f318863a;
            textView.setTypeface(androidx.core.content.res.i.c(C35835l0.j(R.attr.fontHeavy, context), context));
            return;
        }
        Context context2 = textView.getContext();
        TypefaceType typefaceType2 = TypefaceType.f318743c;
        int i13 = C35777d6.f318863a;
        textView.setTypeface(androidx.core.content.res.i.c(C35835l0.j(R.attr.fontRegular, context2), context2));
    }
}
