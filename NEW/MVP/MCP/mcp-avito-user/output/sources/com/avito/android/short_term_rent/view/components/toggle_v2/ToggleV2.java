package com.avito.android.short_term_rent.view.components.toggle_v2;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.chips.FixedChipsLinearLayoutManager;
import com.avito.android.lib.design.chips.y;
import com.avito.android.short_term_rent.a;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;
import tw0.InterfaceC48733a;

/* compiled from: ToggleV2.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2;", "Landroid/widget/FrameLayout;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "", "Ltw0/a;", "newData", "setData", "(Ljava/util/List;)V", "Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2$a;", "b", "Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2$a;", "getSelectedListener", "()Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2$a;", "setSelectedListener", "(Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2$a;)V", "selectedListener", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleV2 extends FrameLayout implements InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public a selectedListener;

    /* renamed from: c, reason: collision with root package name */
    public int f283058c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public c f283059d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public e f283060e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RecyclerView f283061f;

    /* compiled from: ToggleV2.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2$a;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k InterfaceC48733a interfaceC48733a);
    }

    @j
    public ToggleV2(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(TypedArray typedArray) {
        if (typedArray.hasValue(0)) {
            this.f283058c = typedArray.getDimensionPixelSize(0, this.f283058c);
        }
        e eVar = new e(new com.avito.android.short_term_rent.view.components.toggle_v2.a(1, this, ToggleV2.class, "onSelect", "onSelect(I)V", 0), new b(1, this, ToggleV2.class, "onUnselect", "onUnselect(I)V", 0));
        this.f283060e = eVar;
        this.f283059d = new c(eVar);
        y yVar = new y(this.f283058c / 2);
        RecyclerView recyclerView = this.f283061f;
        recyclerView.l(yVar, -1);
        recyclerView.setLayoutManager(new FixedChipsLinearLayoutManager(recyclerView.getContext(), this.f283058c, 0, true));
        recyclerView.setAdapter(this.f283059d);
    }

    public final void b(@k InterfaceC48733a interfaceC48733a) {
        RecyclerView.Adapter adapter = this.f283061f.getAdapter();
        c cVar = adapter instanceof c ? (c) adapter : null;
        if (cVar == null) {
            return;
        }
        Iterator it = cVar.f283070d.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (interfaceC48733a.a(it.next())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1) {
            return;
        }
        e eVar = this.f283060e;
        if (eVar != null) {
            eVar.b(i12);
        }
        cVar.notifyItemChanged(i12);
    }

    @l
    public final a getSelectedListener() {
        return this.selectedListener;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, a.i.f281176a);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setData(@k List<? extends InterfaceC48733a> newData) {
        RecyclerView.Adapter adapter = this.f283061f.getAdapter();
        c cVar = adapter instanceof c ? (c) adapter : null;
        if (cVar == null) {
            return;
        }
        ArrayList arrayList = cVar.f283070d;
        arrayList.clear();
        arrayList.addAll(newData);
        cVar.notifyDataSetChanged();
    }

    public final void setSelectedListener(@l a aVar) {
        this.selectedListener = aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ToggleV2(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.toggleV2 : i12;
        i13 = (i14 & 8) != 0 ? R.style.ToggleV2 : i13;
        super(context, attributeSet, i12);
        LayoutInflater.from(context).inflate(R.layout.toggle_v2, (ViewGroup) this, true);
        this.f283061f = (RecyclerView) findViewById(R.id.payments_selector_recycler_view);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.f281176a, i12, i13);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
