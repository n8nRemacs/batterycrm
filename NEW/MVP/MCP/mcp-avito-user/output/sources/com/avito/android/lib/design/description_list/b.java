package com.avito.android.lib.design.description_list;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.description_list.d;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: DescriptionList.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/lib/design/description_list/b;", "Landroid/widget/LinearLayout;", "LpK0/a;", "LLV/a;", "Lcom/avito/android/lib/design/description_list/c;", "Lcom/avito/android/lib/design/description_list/d;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "", "Lcom/avito/android/lib/design/description_list/a;", "newItems", "setItems", "(Ljava/util/List;)V", "Landroid/content/res/ColorStateList;", "color", "setIconColor", "(Landroid/content/res/ColorStateList;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/description_list/d;)V", "newState", "setState", "(Lcom/avito/android/lib/design/description_list/c;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends LinearLayout implements InterfaceC46971a, LV.a<c, d> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public d f179022b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public c f179023c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f179024d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public List<e> f179025e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public List<a> f179026f;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.descriptionList : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_DescriptionList : i13;
        super(context, attributeSet, i12, i13);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f179025e = c42784z0;
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.description_list_view, this);
        View viewFindViewById = findViewById(R.id.items_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f179024d = (LinearLayout) viewFindViewById;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178992s, i12, i13);
        d.f179028j.getClass();
        setStyle(d.a.b(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
        this.f179026f = c42784z0;
    }

    public final void a(e eVar, a aVar, boolean z12) {
        d dVar;
        Integer num;
        C35763c0 c35763c0;
        ColorStateList colorStateListB;
        eVar.setIconClickListener(aVar.f179019c);
        eVar.setIconDrawable(aVar.f179020d);
        eVar.leftText = aVar.f179017a;
        eVar.rightText = aVar.f179018b;
        eVar.g();
        d dVar2 = this.f179022b;
        n nVar = dVar2 != null ? dVar2.f179029a : null;
        int i12 = dVar2 != null ? dVar2.f179030b : 0;
        n nVar2 = dVar2 != null ? dVar2.f179031c : null;
        int i13 = dVar2 != null ? dVar2.f179032d : 0;
        eVar.f179042f = nVar;
        eVar.f179043g = i12;
        eVar.f179044h = nVar2;
        eVar.f179045i = i13;
        eVar.g();
        d dVar3 = this.f179022b;
        if (dVar3 != null && (c35763c0 = dVar3.f179033e) != null && (colorStateListB = c35763c0.b()) != null) {
            eVar.getIcon().setImageTintList(colorStateListB);
        }
        d dVar4 = this.f179022b;
        if (dVar4 != null && (num = dVar4.f179034f) != null) {
            eVar.setIconInset(num.intValue());
        }
        eVar.setPadding(0, (!z12 || (dVar = this.f179022b) == null) ? 0 : dVar.f179035g, 0, 0);
    }

    public final void b() {
        int size = this.f179025e.size() - this.f179026f.size();
        LinearLayout linearLayout = this.f179024d;
        if (size > 0) {
            List listF0 = C42745f0.F0(size, this.f179025e);
            this.f179025e = C42745f0.E0(this.f179025e, this.f179026f.size());
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                linearLayout.removeView((View) it.next());
            }
            int i12 = 0;
            for (Object obj : this.f179025e) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                a((e) obj, this.f179026f.get(i12), i12 > 0);
                i12 = i13;
            }
            return;
        }
        if (size >= 0) {
            int i14 = 0;
            for (Object obj2 : this.f179025e) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                a((e) obj2, this.f179026f.get(i14), i14 > 0);
                i14 = i15;
            }
            return;
        }
        List<a> listF02 = C42745f0.F0(Math.abs(size), this.f179026f);
        ArrayList arrayList = new ArrayList(C42745f0.q(listF02, 10));
        for (a aVar : listF02) {
            e eVar = new e(getContext(), null, 0, 0, 14, null);
            a(eVar, aVar, true);
            arrayList.add(eVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linearLayout.addView((e) it2.next());
        }
        int i16 = 0;
        for (Object obj3 : this.f179025e) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                C42745f0.H0();
                throw null;
            }
            a((e) obj3, this.f179026f.get(i16), i16 > 0);
            i16 = i17;
        }
        this.f179025e = C42745f0.h0(arrayList, this.f179025e);
    }

    public final void c() {
        if (!this.f179025e.isEmpty()) {
            b();
            return;
        }
        List<a> list = this.f179026f;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a aVar = (a) obj;
            boolean z12 = i12 > 0;
            e eVar = new e(getContext(), null, 0, 0, 14, null);
            a(eVar, aVar, z12);
            arrayList.add(eVar);
            i12 = i13;
        }
        this.f179025e = arrayList;
        LinearLayout linearLayout = this.f179024d;
        linearLayout.removeAllViews();
        Iterator<T> it = this.f179025e.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178992s);
        d.a aVar = d.f179028j;
        Context context = getContext();
        aVar.getClass();
        setStyle(d.a.b(typedArrayObtainStyledAttributes, context));
        b();
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setIconColor(@l ColorStateList color) {
        d dVar = this.f179022b;
        if (dVar != null) {
            setStyle(new d(dVar.f179029a, dVar.f179030b, dVar.f179031c, dVar.f179032d, color != null ? C35771d0.b(color) : null, dVar.f179034f, dVar.f179035g, dVar.f179036h, dVar.f179037i));
        }
        c();
    }

    public final void setItems(@k List<a> newItems) {
        if (L.f(this.f179026f, newItems)) {
            return;
        }
        this.f179026f = newItems;
        c();
    }

    @Override // LV.b
    public void setState(@k c newState) {
        c cVar = this.f179023c;
        if (new com.avito.android.lib.util.c(newState, cVar).f181333c) {
            return;
        }
        this.f179023c = newState;
        ArrayList arrayList = cVar != null ? cVar.f179027a : null;
        ArrayList arrayList2 = newState.f179027a;
        if (new com.avito.android.lib.util.c(arrayList2, arrayList).f181333c) {
            return;
        }
        setItems(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.description_list.d r13) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.description_list.b.setStyle(com.avito.android.lib.design.description_list.d):void");
    }
}
