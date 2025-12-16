package com.avito.android.comfortable_deal.deal.item.commenttabs;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CommentTabsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/commenttabs/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/commenttabs/l;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TabGroup f121331b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f121332c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f121333d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f121334e;

    /* compiled from: CommentTabsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comfortable_deal/deal/item/commenttabs/n$a", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.tab_group.layout.b {
        public a() {
        }

        @Override // com.avito.android.lib.design.tab_group.layout.b
        public final void a(@Y61.l d.c cVar) {
            if (cVar != null) {
                int i12 = cVar.f180792b;
                Y41.l<? super Integer, G0> lVar = n.this.f121333d;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(i12));
                }
            }
        }
    }

    public n(@Y61.k View view) {
        super(view);
        TabGroup tabGroup = (TabGroup) view.findViewById(R.id.comment_tabs);
        this.f121331b = tabGroup;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.add_comment_container);
        this.f121332c = linearLayout;
        Button button = (Button) view.findViewById(R.id.add_comment_button);
        tabGroup.d(new a());
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.deal.item.commenttabs.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f121330c;

            {
                this.f121330c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        Y41.a<G0> aVar = this.f121330c.f121334e;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f121330c.f121334e;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.deal.item.commenttabs.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f121330c;

            {
                this.f121330c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = this.f121330c.f121334e;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f121330c.f121334e;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.comfortable_deal.deal.item.commenttabs.l
    public final void N1(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f121333d = lVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.commenttabs.l
    public final void P0(int i12, @Y61.k List list) {
        TabGroup tabGroup = this.f121331b;
        tabGroup.l();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.avito.android.lib.design.tab_group.b(((CommentTab) it.next()).f121313b, null, false, 6, null));
        }
        com.avito.android.lib.design.tab_group.c.a(tabGroup, arrayList, Integer.valueOf(i12));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.commenttabs.l
    public final void RV(boolean z12) {
        D6.G(this.f121332c, z12);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.commenttabs.l
    public final void qQ(@Y61.k Y41.a<G0> aVar) {
        this.f121334e = aVar;
    }
}
