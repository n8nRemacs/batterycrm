package com.avito.android.lib.design.select;

import X41.j;
import Y41.p;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.bottom_sheet.k;
import com.avito.android.lib.design.bottom_sheet.y;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.input.ComponentType;
import com.avito.android.lib.design.select.state.SelectState;
import com.avito.android.lib.design.select.style.d;
import com.avito.android.lib.util.c;
import j.f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Select.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/lib/design/select/Select;", "Lcom/avito/android/lib/design/select/BaseSelect;", "LLV/a;", "Lcom/avito/android/lib/design/select/state/SelectState;", "Lcom/avito/android/lib/design/select/style/d;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setListItemStyle", "(I)V", "setBottomSheetTheme", "setAppearance", "setAppearanceAndContent", "newState", "setState", "(Lcom/avito/android/lib/design/select/state/SelectState;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/select/style/d;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Select extends BaseSelect implements LV.a<SelectState, d> {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f180249i0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    @l
    public y f180250f0;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public d f180251g0;

    /* renamed from: h0, reason: collision with root package name */
    @l
    public SelectState f180252h0;

    /* compiled from: Select.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SelectState.BorderState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SelectState.BorderState borderState = SelectState.BorderState.f180272b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SelectState.BorderState borderState2 = SelectState.BorderState.f180272b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/select/Select;", "<anonymous parameter 0>", "Lcom/avito/android/lib/design/bottom_sheet/k;", "data", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/select/Select;Lcom/avito/android/lib/design/bottom_sheet/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<Select, k, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SelectState f180253l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SelectState selectState) {
            super(2);
            this.f180253l = selectState;
        }

        @Override // Y41.p
        public final G0 invoke(Select select, k kVar) {
            k kVar2 = kVar;
            Y41.l<String, G0> lVar = this.f180253l.f180263g;
            if (lVar != null) {
                lVar.invoke(kVar2.f178541a);
            }
            return G0.f406611a;
        }
    }

    @j
    public Select(@Y61.k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setBottomSheetTheme(@f0 int style) {
        y yVar = this.f180250f0;
        if (yVar != null) {
            yVar.f178611a = style;
        }
    }

    private final void setListItemStyle(@f0 int style) {
        y yVar = this.f180250f0;
        if (yVar != null) {
            yVar.f178612b = style;
        }
    }

    public final void A(TypedArray typedArray) {
        y.a aVar = y.f178610g;
        com.avito.android.lib.design.select.a aVar2 = com.avito.android.lib.design.select.a.f180254l;
        aVar.getClass();
        y yVar = new y(null);
        aVar2.getClass();
        G0 g02 = G0.f406611a;
        this.f180250f0 = yVar;
        d.a aVar3 = d.f180318f;
        Context context = getContext();
        aVar3.getClass();
        setStyle(d.a.b(typedArray, context));
    }

    @Override // com.avito.android.lib.design.input.Input, pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f179001w0);
        A(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.avito.android.lib.design.input.Input
    public void setAppearanceAndContent(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f179001w0);
        A(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Select(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.select : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_Select : i13;
        super(context, attributeSet, i12, i13);
        setComponentType(ComponentType.f179284e);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f179001w0, i12, i13);
        A(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k com.avito.android.lib.design.select.state.SelectState r12) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.select.Select.setState(com.avito.android.lib.design.select.state.SelectState):void");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.lib.design.select.BaseSelect, LV.d
    public void setStyle(@Y61.k com.avito.android.lib.design.select.style.d newStyle) {
        com.avito.android.lib.design.select.style.d dVar = this.f180251g0;
        if (new c(newStyle, dVar).f181333c) {
            return;
        }
        this.f180251g0 = newStyle;
        Drawable drawable = null;
        com.avito.android.lib.design.select.style.c cVar = dVar != null ? dVar.f180319a : null;
        com.avito.android.lib.design.select.style.c cVar2 = newStyle.f180319a;
        if (!new c(cVar2, cVar).f181333c && cVar2 != null) {
            super.setStyle(newStyle);
        }
        Integer numValueOf = Integer.valueOf(newStyle.f180320b);
        if (!new c(numValueOf, dVar != null ? Integer.valueOf(dVar.f180320b) : null).f181333c) {
            setListItemStyle(numValueOf.intValue());
        }
        Integer numValueOf2 = Integer.valueOf(newStyle.f180321c);
        if (!new c(numValueOf2, dVar != null ? Integer.valueOf(dVar.f180321c) : null).f181333c) {
            setBottomSheetTheme(numValueOf2.intValue());
        }
        ColorStateList colorStateList = dVar != null ? dVar.f180323e : null;
        ColorStateList colorStateList2 = newStyle.f180323e;
        boolean zF2 = L.f(colorStateList2, colorStateList);
        Drawable drawable2 = newStyle.f180322d;
        if (zF2) {
            if (L.f(drawable2, dVar != null ? dVar.f180322d : null)) {
                return;
            }
        }
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList2);
            drawable = drawable2;
        }
        y yVar = this.f180250f0;
        if (yVar != null) {
            yVar.f178616f = drawable;
        }
    }
}
