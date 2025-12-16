package com.avito.android.advert.item.anchor_trust_factors.topbar;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.r6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import r4.C47486a;
import s4.C47993a;

/* compiled from: AdvertDetailsTopBarAnchorsView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/topbar/l;", "Lz7/e;", "Lcom/avito/android/advert/item/anchor_trust_factors/topbar/k;", "Landroid/view/ViewStub$OnInflateListener;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements z7.e<k>, k, ViewStub.OnInflateListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f72869b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public View f72870c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.anchor_trust_factors.topbar.layout.b f72871d;

    public l(@Y61.k ViewStub viewStub, @Y61.k com.avito.android.util.text.a aVar) {
        this.f72869b = aVar;
        viewStub.setOnInflateListener(this);
        viewStub.inflate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.k
    public final void a(@Y61.k C47993a c47993a) {
        Button button;
        Button button2;
        com.avito.android.advert.item.anchor_trust_factors.topbar.layout.b bVar = this.f72871d;
        if (bVar != null) {
            C47993a c47993a2 = bVar.f72879g;
            com.avito.android.lib.util.c cVar = new com.avito.android.lib.util.c(c47993a, c47993a2);
            if (cVar.f181333c) {
                return;
            }
            bVar.f72879g = c47993a;
            String str = c47993a2 != null ? c47993a2.f437458a : null;
            String str2 = c47993a.f437458a;
            boolean z12 = new com.avito.android.lib.util.c(str2, str).f181333c;
            int i12 = 0;
            LinearLayout linearLayout = bVar.f72876d;
            String str3 = c47993a.f437460c;
            if (!z12 && str2 != null) {
                VU.b bVarB = bVar.b(str2, str3);
                int i13 = 0;
                for (Object obj : bVar.f72878f.f429574a) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    if (!((C47486a.C12352a) obj).f429577c && (button2 = (Button) C42745f0.K(i13, bVar.f72880h)) != null) {
                        button2.setStyle(bVarB);
                    }
                    i13 = i14;
                }
                linearLayout.requestLayout();
            }
            T t12 = cVar.f181331a;
            String str4 = t12 != 0 ? ((C47993a) t12).f437459b : null;
            T t13 = cVar.f181332b;
            if (!new com.avito.android.lib.util.c(str4, t13 != 0 ? ((C47993a) t13).f437459b : null).f181333c && str4 != null) {
                VU.b bVarB2 = bVar.b(c47993a.f437459b, str3);
                for (Object obj2 : bVar.f72878f.f429574a) {
                    int i15 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    if (((C47486a.C12352a) obj2).f429577c && (button = (Button) C42745f0.K(i12, bVar.f72880h)) != null) {
                        button.setStyle(bVarB2);
                    }
                    i12 = i15;
                }
                linearLayout.requestLayout();
            }
            Integer numValueOf = t12 != 0 ? Integer.valueOf(((C47993a) t12).f437461d) : null;
            if (new com.avito.android.lib.util.c(numValueOf, t13 != 0 ? Integer.valueOf(((C47993a) t13).f437461d) : null).f181333c || numValueOf == null) {
                return;
            }
            linearLayout.setDividerDrawable(r6.a(c47993a.f437461d));
            linearLayout.setShowDividers(2);
            linearLayout.requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.k
    public final void b(@Y61.k C47486a c47486a) {
        Button button;
        com.avito.android.advert.item.anchor_trust_factors.topbar.layout.b bVar = this.f72871d;
        if (bVar != null) {
            C47486a c47486a2 = bVar.f72878f;
            if (new com.avito.android.lib.util.c(c47486a, c47486a2).f181333c) {
                return;
            }
            List<C47486a.C12352a> list = c47486a2.f429574a;
            List<C47486a.C12352a> list2 = c47486a.f429574a;
            if (new com.avito.android.lib.util.c(list2, list).f181333c) {
                return;
            }
            bVar.f72878f.getClass();
            bVar.f72878f = new C47486a(list2);
            List<C47486a.C12352a> list3 = list2;
            List<C47486a.C12352a> list4 = list;
            boolean zIsEmpty = list3.isEmpty();
            LinearLayout linearLayout = bVar.f72876d;
            if (zIsEmpty || list3.size() != list4.size()) {
                C47486a c47486a3 = bVar.f72878f;
                linearLayout.removeAllViews();
                ArrayList arrayList = new ArrayList();
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                for (C47486a.C12352a c12352a : c47486a3.f429574a) {
                    Button button2 = new Button(bVar.f72877e, null, 0, 0, 14, null);
                    button2.setState(bVar.a(c12352a));
                    linearLayout.addView(button2, layoutParams);
                    arrayList.add(button2);
                }
                bVar.f72880h = arrayList;
                linearLayout.requestLayout();
                return;
            }
            int size = list3.size();
            Integer numValueOf = null;
            for (int i12 = 0; i12 < size; i12++) {
                C47486a.C12352a c12352a2 = list3.get(i12);
                Button button3 = (Button) C42745f0.K(i12, bVar.f72880h);
                if (button3 != null) {
                    button3.setState(bVar.a(c12352a2));
                }
                boolean z12 = list3.get(i12).f429577c;
                C47993a c47993a = bVar.f72879g;
                if (c47993a != null) {
                    String str = c47993a.f437460c;
                    if (z12) {
                        Button button4 = (Button) C42745f0.K(i12, bVar.f72880h);
                        if (button4 != null) {
                            button4.setStyle(bVar.b(c47993a.f437459b, str));
                        }
                    } else {
                        Button button5 = (Button) C42745f0.K(i12, bVar.f72880h);
                        if (button5 != null) {
                            button5.setStyle(bVar.b(c47993a.f437458a, str));
                        }
                    }
                }
                if (numValueOf == null && list3.get(i12).f429577c && !list4.get(i12).f429577c) {
                    numValueOf = Integer.valueOf(i12);
                }
            }
            ?? r14 = bVar.f72880h;
            if (numValueOf != null && (button = (Button) C42745f0.K(numValueOf.intValue(), r14)) != null) {
                bVar.f72875c.smoothScrollTo(button.getLeft(), 0);
            }
            linearLayout.requestLayout();
        }
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.k
    @Y61.k
    public final Rect c() {
        Rect rect = new Rect(0, 0, 0, 0);
        View view = this.f72870c;
        if (view == null) {
            return rect;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        rect.set(i12, iArr[1], view.getWidth() + i12, view.getHeight() + iArr[1]);
        return rect;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.k
    public final void d() {
        View view = this.f72870c;
        if (view != null) {
            view.measure(0, 0);
        }
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.k
    public final int getHeight() {
        View view = this.f72870c;
        if (view != null) {
            return D6.r(view);
        }
        return 0;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.k
    public final void hide() {
        D6.w(this.f72870c);
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(@Y61.l ViewStub viewStub, @Y61.k View view) {
        this.f72870c = view;
        this.f72871d = new com.avito.android.advert.item.anchor_trust_factors.topbar.layout.b(this.f72869b, (HorizontalScrollView) view.findViewById(R.id.advert_details_top_bar_anchors_scroll_view));
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.k
    public final void show() {
        D6.H(this.f72870c);
    }
}
