package com.avito.android.publish.slots.market_price.item;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.items.MarketPriceItem;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MarketPriceView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/market_price/item/i;", "Lcom/avito/android/publish/slots/market_price/item/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f244544b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f244545c;

    /* renamed from: d, reason: collision with root package name */
    public final ListItem f244546d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f244547e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f244548f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f244549g;

    /* compiled from: MarketPriceView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f244550a;

        static {
            int[] iArr = new int[MarketPriceItem.DealTypeImageName.values().length];
            try {
                MarketPriceItem.DealTypeImageName dealTypeImageName = MarketPriceItem.DealTypeImageName.f173906b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MarketPriceItem.DealTypeImageName dealTypeImageName2 = MarketPriceItem.DealTypeImageName.f173906b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MarketPriceItem.DealTypeImageName dealTypeImageName3 = MarketPriceItem.DealTypeImageName.f173906b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MarketPriceItem.DealTypeImageName dealTypeImageName4 = MarketPriceItem.DealTypeImageName.f173906b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MarketPriceItem.DealTypeImageName dealTypeImageName5 = MarketPriceItem.DealTypeImageName.f173906b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f244550a = iArr;
        }
    }

    public i(@k View view) {
        super(view);
        this.f244544b = (TextView) view.findViewById(R.id.market_price);
        this.f244545c = (TextView) view.findViewById(R.id.message);
        this.f244546d = (ListItem) view.findViewById(R.id.deal_type);
        this.f244547e = (ViewGroup) view.findViewById(R.id.deal_type_block);
        this.f244548f = (ViewGroup) view.findViewById(R.id.empty_deal_type);
        this.f244549g = new ArrayList();
    }

    @Override // com.avito.android.publish.slots.market_price.item.h
    public final void P2(@k CharSequence charSequence) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f244545c;
        textView.setMovementMethod(linkMovementMethod);
        textView.setText(charSequence);
    }

    @Override // com.avito.android.publish.slots.market_price.item.h
    public final void Pq(int i12, @k String str) {
        ListItem listItem = this.f244546d;
        listItem.setTitle(str);
        listItem.setTitleColor(ColorStateList.valueOf(i12));
    }

    @Override // com.avito.android.publish.slots.market_price.item.h
    public final void QQ(@k CharSequence charSequence) {
        this.f244544b.setText(charSequence);
    }

    @Override // com.avito.android.publish.slots.market_price.item.h
    public final void Tv(boolean z12) {
        D6.G(this.f244547e, z12);
    }

    @Override // com.avito.android.publish.slots.market_price.item.h
    public final void YE(@l MarketPriceItem.DealTypeImageName dealTypeImageName) {
        int i12 = dealTypeImageName == null ? -1 : a.f244550a[dealTypeImageName.ordinal()];
        ListItem listItem = this.f244546d;
        if (i12 == -1) {
            ListItem.k(listItem, 0, 0, 3);
            return;
        }
        if (i12 == 1) {
            ListItem.k(listItem, 0, R.drawable.ic_imv_perfect, 1);
            return;
        }
        if (i12 == 2) {
            ListItem.k(listItem, 0, R.drawable.ic_imv_verygood, 1);
            return;
        }
        if (i12 == 3) {
            ListItem.k(listItem, 0, R.drawable.ic_imv_good, 1);
        } else if (i12 == 4) {
            ListItem.k(listItem, 0, R.drawable.ic_imv_bad, 1);
        } else {
            if (i12 != 5) {
                return;
            }
            ListItem.k(listItem, 0, R.drawable.ic_imv_verybad, 1);
        }
    }

    @Override // com.avito.android.publish.slots.market_price.item.h
    public final void t60(@l List<String> list) {
        ViewGroup viewGroup = this.f244548f;
        viewGroup.removeAllViews();
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            D6.w(viewGroup);
            return;
        }
        int size = list.size();
        ArrayList arrayList = this.f244549g;
        int i12 = 0;
        if (size > arrayList.size()) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            int size2 = list.size() - arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList.add((TextView) layoutInflaterFrom.inflate(R.layout.publish_slot_market_price_gray_shield, viewGroup, false));
            }
        }
        for (Object obj : list) {
            int i14 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            TextView textView = (TextView) arrayList.get(i12);
            textView.setText((String) obj);
            viewGroup.addView(textView);
            i12 = i14;
        }
        D6.G(viewGroup, true);
    }

    @Override // com.avito.android.publish.slots.market_price.item.h
    public final void tf(@k String str) {
        this.f244546d.setSubtitle(str);
    }

    @Override // com.avito.android.publish.slots.market_price.item.h
    public final void zQ(boolean z12) {
        D6.G(this.f244545c, z12);
    }
}
