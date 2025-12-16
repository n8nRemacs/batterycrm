package com.avito.android.comfortable_deal.submitting.recycler.items.selectItem;

import Rh.C15041a;
import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.y;
import com.avito.android.R;
import com.avito.android.calltracking.item.m;
import com.avito.android.comfortable_deal.deal.item.agent.h;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/recycler/items/selectItem/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/submitting/recycler/items/selectItem/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f123246j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f123247b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f123248c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f123249d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f123250e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f123251f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f123252g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Checkmark f123253h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final y.b f123254i;

    public g(@k View view) {
        super(view);
        this.f123247b = view;
        this.f123248c = view.getContext();
        this.f123249d = (ConstraintLayout) view.findViewById(R.id.selector_container);
        this.f123250e = (ImageView) view.findViewById(R.id.selector_image);
        this.f123251f = (TextView) view.findViewById(R.id.selector_title);
        this.f123252g = (LinearLayout) view.findViewById(R.id.descriptions_container);
        this.f123253h = (Checkmark) view.findViewById(R.id.selector_checkmark);
        this.f123254i = new y.b(10);
        new y.b(10);
    }

    @Override // com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.f
    public final void J9(@k UniversalImage universalImage) {
        com.avito.android.image_loader.glide.utils.b.d(this.f123250e, n.a(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f123248c))));
    }

    @Override // com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.f
    public final void X20(boolean z12) {
        this.f123253h.setChecked(z12);
    }

    @Override // com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f123249d.setOnClickListener(new m(20, aVar));
    }

    @Override // com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.f
    public final void lT(@k Y41.a aVar, @k List list) {
        LinearLayout linearLayout = this.f123252g;
        linearLayout.removeAllViews();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            y.b bVar = this.f123254i;
            if (!zHasNext) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bVar.a((View) it2.next());
                }
                return;
            }
            DescriptionItem descriptionItem = (DescriptionItem) it.next();
            View viewInflate = (View) bVar.b();
            Context context = this.f123248c;
            if (viewInflate == null) {
                viewInflate = View.inflate(context, R.layout.selector_description_item, null);
            }
            View viewFindViewById = viewInflate.findViewById(R.id.text_icon);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            j.a((TextView) viewFindViewById, descriptionItem.f123229b, null);
            View viewFindViewById2 = viewInflate.findViewById(R.id.text_title);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById2;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnClickListener(new h(this, 6));
            AttributedText attributedText = descriptionItem.f123230c;
            j.a(textView, attributedText, null);
            attributedText.setOnDeepLinkClickListener(new C15041a(aVar, 25));
            linearLayout.addView(viewInflate);
            linearLayout.addView(View.inflate(context, R.layout.description_item_divider, null));
            arrayList.add(viewInflate);
        }
    }

    @Override // com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.f
    public final void setTitle(@k String str) {
        this.f123251f.setText(str);
    }
}
