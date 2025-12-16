package com.avito.android.comfortable_deal.deal.item.seller;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35787f0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SellerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/seller/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/seller/i;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Context f121514b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f121515c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FrameLayout f121516d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Bp.d f121517e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DockingBadge f121518f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f121519g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f121520h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LinearLayout f121521i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f121522j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Y41.a<G0> f121523k;

    public j(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f121514b = context;
        this.f121515c = LayoutInflater.from(context);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.seller_item);
        this.f121516d = (FrameLayout) view.findViewById(R.id.gallery_container);
        this.f121517e = new Bp.d((RecyclerView) view.findViewById(R.id.gallery), context);
        this.f121518f = (DockingBadge) view.findViewById(R.id.average_price);
        this.f121519g = (TextView) view.findViewById(R.id.seller_item_price);
        this.f121520h = (TextView) view.findViewById(R.id.seller_item_title);
        this.f121521i = (LinearLayout) view.findViewById(R.id.seller_item_geo_references);
        this.f121522j = (TextView) view.findViewById(R.id.seller_item_address);
        linearLayout.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(this, 3));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.i
    public final void C(@k String str) {
        this.f121522j.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.i
    public final void DI(@k Y41.a<G0> aVar) {
        this.f121523k = aVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.i
    public final void G0(@k List<com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.c> list) {
        boolean zIsEmpty = list.isEmpty();
        FrameLayout frameLayout = this.f121516d;
        Bp.d dVar = this.f121517e;
        if (zIsEmpty) {
            D6.w(dVar.f1718a);
            com.avito.konveyor.adapter.a aVar = dVar.f1720c;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(C42784z0.f406748b));
            com.avito.konveyor.adapter.j jVar = dVar.f1719b;
            (jVar != null ? jVar : null).notifyDataSetChanged();
            D6.w(frameLayout);
            return;
        }
        D6.H(dVar.f1718a);
        com.avito.konveyor.adapter.a aVar2 = dVar.f1720c;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar2, list);
        com.avito.konveyor.adapter.j jVar2 = dVar.f1719b;
        (jVar2 != null ? jVar2 : null).notifyDataSetChanged();
        D6.H(frameLayout);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.i
    public final void p(@k String str) {
        this.f121519g.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.i
    public final void rw(@k List<b> list) {
        Drawable drawable;
        Context context;
        String str;
        ViewGroup viewGroup = this.f121521i;
        viewGroup.removeAllViews();
        for (b bVar : list) {
            List<String> list2 = bVar.f121478a;
            LayoutInflater layoutInflater = this.f121515c;
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.deal_item_geo_reference, viewGroup, false);
            viewGroup.addView(linearLayout);
            Iterator<T> it = list2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                context = this.f121514b;
                if (!zHasNext) {
                    break;
                }
                Integer numA = C35787f0.a((String) it.next());
                if (numA != null) {
                    int iIntValue = numA.intValue();
                    View viewInflate = layoutInflater.inflate(R.layout.deal_item_geo_reference_circle, (ViewGroup) linearLayout, false);
                    Drawable drawable2 = androidx.core.content.d.getDrawable(context, R.drawable.deal_item_metro_reference);
                    viewInflate.setBackground(drawable2 != null ? drawable2.mutate() : null);
                    viewInflate.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
                    linearLayout.addView(viewInflate);
                }
            }
            String str2 = bVar.f121479b;
            if (str2 != null) {
                a aVar = bVar.f121481d;
                Integer numA2 = (aVar == null || (str = aVar.f121476a) == null) ? null : q.a(str);
                if (numA2 != null) {
                    boolean zIsEmpty = list2.isEmpty();
                    int iIntValue2 = numA2.intValue();
                    String str3 = aVar.f121477b;
                    TextView textView = (TextView) layoutInflater.inflate(R.layout.deal_item_geo_content_text, (ViewGroup) linearLayout, false);
                    D6.f(textView, !zIsEmpty ? y6.e(1) : 0, 0, 0, 0, 14);
                    textView.setText(str2);
                    linearLayout.addView(textView);
                    if (str3 != null && str3.length() != 0) {
                        TextView textView2 = (TextView) layoutInflater.inflate(R.layout.deal_item_geo_after_text, (ViewGroup) linearLayout, false);
                        textView2.setText(str3);
                        linearLayout.addView(textView2);
                        ImageView imageView = (ImageView) layoutInflater.inflate(R.layout.deal_item_geo_icon, (ViewGroup) linearLayout, false);
                        Drawable drawableH = C35835l0.h(iIntValue2, context);
                        if (drawableH != null) {
                            V0.a(drawableH, C35835l0.d(R.attr.gray54, context));
                            drawable = drawableH;
                        }
                        imageView.setImageDrawable(drawable);
                        linearLayout.addView(imageView);
                    }
                } else {
                    boolean zIsEmpty2 = list2.isEmpty();
                    TextView textView3 = (TextView) layoutInflater.inflate(R.layout.deal_item_geo_content_text, (ViewGroup) linearLayout, false);
                    D6.f(textView3, zIsEmpty2 ? 0 : y6.e(1), 0, 0, 0, 14);
                    String str4 = bVar.f121480c;
                    if (str4 == null || str4.length() == 0) {
                        textView3.setText(str2);
                    } else {
                        String strConcat = str2.concat(str4);
                        SpannableString spannableString = new SpannableString(strConcat);
                        spannableString.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.gray54, context)), str2.length(), strConcat.length(), 34);
                        textView3.setText(spannableString);
                    }
                    linearLayout.addView(textView3);
                }
            }
        }
        D6.G(viewGroup, !list.isEmpty());
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.i
    public final void setTitle(@k String str) {
        this.f121520h.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.i
    public final void sl(boolean z12) {
        D6.G(this.f121518f, z12);
    }
}
