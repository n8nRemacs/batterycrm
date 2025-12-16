package com.avito.android.lib.design.description_list.parameter_line;

import PK0.n;
import X41.j;
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
import com.avito.android.lib.design.description_list.parameter_line.b;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.util.C35763c0;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: DescriptionListParameterLine.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001 J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/DescriptionListParameterLine;", "Landroid/widget/LinearLayout;", "LpK0/a;", "LLV/a;", "Lcom/avito/android/lib/design/description_list/parameter_line/a;", "Lcom/avito/android/lib/design/description_list/parameter_line/b;", "Lcom/avito/android/lib/design/description_list/parameter_line/DescriptionListParameterLine$LineType;", "lineType", "Lkotlin/G0;", "setLineType", "(Lcom/avito/android/lib/design/description_list/parameter_line/DescriptionListParameterLine$LineType;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "", "Lcom/avito/android/lib/design/description_list/a;", "newItems", "setItems", "(Ljava/util/List;)V", "newState", "setState", "(Lcom/avito/android/lib/design/description_list/parameter_line/a;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/description_list/parameter_line/b;)V", "<set-?>", "i", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "LineType", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DescriptionListParameterLine extends LinearLayout implements InterfaceC46971a, LV.a<com.avito.android.lib.design.description_list.parameter_line.a, b> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public b f179049b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.description_list.parameter_line.a f179050c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f179051d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public float[] f179052e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public float[] f179053f;

    /* renamed from: g, reason: collision with root package name */
    public float f179054g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public List<DescriptionParameterItem> f179055h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public List<com.avito.android.lib.design.description_list.a> items;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DescriptionListParameterLine.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/DescriptionListParameterLine$LineType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LineType {

        /* renamed from: b, reason: collision with root package name */
        public static final LineType f179057b;

        /* renamed from: c, reason: collision with root package name */
        public static final LineType f179058c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ LineType[] f179059d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179060e;

        static {
            LineType lineType = new LineType("SOLID", 0);
            f179057b = lineType;
            LineType lineType2 = new LineType("DOTTED", 1);
            f179058c = lineType2;
            LineType[] lineTypeArr = {lineType, lineType2};
            f179059d = lineTypeArr;
            f179060e = c.a(lineTypeArr);
        }

        public LineType() {
            throw null;
        }

        public static LineType valueOf(String str) {
            return (LineType) Enum.valueOf(LineType.class, str);
        }

        public static LineType[] values() {
            return (LineType[]) f179059d.clone();
        }
    }

    /* compiled from: DescriptionListParameterLine.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LineType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LineType lineType = LineType.f179057b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @j
    public DescriptionListParameterLine(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setLineType(LineType lineType) {
        float[] fArr;
        int iOrdinal = lineType.ordinal();
        if (iOrdinal == 0) {
            fArr = null;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            fArr = this.f179052e;
        }
        if (Arrays.equals(this.f179053f, fArr)) {
            return;
        }
        this.f179053f = fArr;
        for (DescriptionParameterItem descriptionParameterItem : this.f179055h) {
            b bVar = this.f179049b;
            if (bVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            descriptionParameterItem.b(this.f179054g, bVar.f179068e.f318848a, this.f179053f);
        }
    }

    public final void a(DescriptionParameterItem descriptionParameterItem, com.avito.android.lib.design.description_list.a aVar, boolean z12, boolean z13) {
        ColorStateList colorStateListB;
        b bVar = this.f179049b;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        descriptionParameterItem.leftTextView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 70.0f));
        com.avito.android.lib.design.text_view.a aVar2 = descriptionParameterItem.rightTextView;
        aVar2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 30.0f));
        descriptionParameterItem.setLeftTextIconClickListener(aVar.f179019c);
        descriptionParameterItem.setLeftTextIconDrawable(aVar.f179020d);
        descriptionParameterItem.b(this.f179054g, bVar.f179068e.f318848a, this.f179053f);
        Float f12 = bVar.f179074k;
        descriptionParameterItem.setDotsOffset(f12 != null ? f12.floatValue() : 0.0f);
        descriptionParameterItem.leftTextView.setText(aVar.f179017a);
        aVar2.setText(aVar.f179018b);
        C35763c0 c35763c0 = bVar.f179075l;
        if (c35763c0 != null && (colorStateListB = c35763c0.b()) != null) {
            descriptionParameterItem.getIcon().setImageTintList(colorStateListB);
        }
        b(descriptionParameterItem, z12);
        descriptionParameterItem.setPadding(0, z13 ? bVar.f179069f : 0, 0, 0);
        C35763c0 c35763c02 = bVar.f179065b;
        if (c35763c02 != null) {
            descriptionParameterItem.getLeftTextView().setTextColor(c35763c02.b());
        }
        C35763c0 c35763c03 = bVar.f179067d;
        if (c35763c03 != null) {
            descriptionParameterItem.getRightTextView().setTextColor(c35763c03.b());
        }
        Integer num = aVar.f179021e;
        if (num != null) {
            descriptionParameterItem.setIconTint(num.intValue());
        }
    }

    public final void b(DescriptionParameterItem descriptionParameterItem, boolean z12) {
        b bVar = this.f179049b;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!z12 || !bVar.f179077n) {
            e.a(descriptionParameterItem.getLeftTextView(), bVar.f179064a);
            e.a(descriptionParameterItem.getRightTextView(), bVar.f179066c);
            return;
        }
        n nVar = bVar.f179076m;
        if (nVar != null) {
            descriptionParameterItem.setTextStyleDataCompat(nVar);
        }
        com.avito.android.lib.design.text_view.a aVar = descriptionParameterItem.leftTextView;
        aVar.setTypeface(aVar.getTypeface(), 1);
        descriptionParameterItem.rightTextView.setTypeface(aVar.getTypeface(), 1);
    }

    public final void c() {
        boolean z12;
        boolean z13;
        int size = this.f179055h.size() - this.items.size();
        LinearLayout linearLayout = this.f179051d;
        if (size > 0) {
            List listF0 = C42745f0.F0(size, this.f179055h);
            this.f179055h = C42745f0.E0(this.f179055h, this.items.size());
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                linearLayout.removeView((View) it.next());
            }
            int i12 = 0;
            for (Object obj : this.f179055h) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                a((DescriptionParameterItem) obj, this.items.get(i12), i12 == C42745f0.J(this.f179055h), i12 > 0);
                i12 = i13;
            }
            return;
        }
        if (size >= 0) {
            int i14 = 0;
            for (Object obj2 : this.f179055h) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                a((DescriptionParameterItem) obj2, this.items.get(i14), i14 == C42745f0.J(this.f179055h), i14 > 0);
                i14 = i15;
            }
            return;
        }
        int iAbs = Math.abs(size);
        List listF02 = C42745f0.F0(iAbs, this.items);
        ArrayList arrayList = new ArrayList(C42745f0.q(listF02, 10));
        int i16 = 0;
        for (Object obj3 : listF02) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.android.lib.design.description_list.a aVar = (com.avito.android.lib.design.description_list.a) obj3;
            boolean z14 = i16 == iAbs + (-1);
            DescriptionParameterItem descriptionParameterItem = new DescriptionParameterItem(getContext(), null, 0, 0, 14, null);
            a(descriptionParameterItem, aVar, z14, true);
            arrayList.add(descriptionParameterItem);
            i16 = i17;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linearLayout.addView((DescriptionParameterItem) it2.next());
        }
        int i18 = 0;
        for (Object obj4 : this.f179055h) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                C42745f0.H0();
                throw null;
            }
            DescriptionParameterItem descriptionParameterItem2 = (DescriptionParameterItem) obj4;
            com.avito.android.lib.design.description_list.a aVar2 = this.items.get(i18);
            if (i18 > 0) {
                z13 = true;
                z12 = false;
            } else {
                z12 = false;
                z13 = false;
            }
            a(descriptionParameterItem2, aVar2, z12, z13);
            i18 = i19;
        }
        this.f179055h = C42745f0.h0(arrayList, this.f179055h);
    }

    public final void d(TypedArray typedArray) {
        Float f12;
        Float f13;
        Float f14;
        b.a aVar = b.f179063o;
        Context context = getContext();
        aVar.getClass();
        setStyle(b.a.b(typedArray, context));
        float fFloatValue = 0.0f;
        this.f179051d.setPadding(0, kotlin.math.b.b(typedArray.getDimension(8, 0.0f)), 0, kotlin.math.b.b(typedArray.getDimension(7, 0.0f)));
        b bVar = this.f179049b;
        float fFloatValue2 = (bVar == null || (f14 = bVar.f179072i) == null) ? 0.0f : f14.floatValue();
        b bVar2 = this.f179049b;
        float[] fArr = {fFloatValue2, (bVar2 == null || (f13 = bVar2.f179071h) == null) ? 0.0f : f13.floatValue()};
        this.f179052e = fArr;
        this.f179053f = fArr;
        b bVar3 = this.f179049b;
        if (bVar3 != null && (f12 = bVar3.f179073j) != null) {
            fFloatValue = f12.floatValue();
        }
        this.f179054g = fFloatValue;
    }

    @k
    public final List<com.avito.android.lib.design.description_list.a> getItems() {
        return this.items;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178994t);
        d(typedArrayObtainStyledAttributes);
        c();
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setItems(@k List<com.avito.android.lib.design.description_list.a> newItems) {
        if (L.f(this.items, newItems)) {
            return;
        }
        this.items = newItems;
        if (!this.f179055h.isEmpty()) {
            c();
            return;
        }
        List<com.avito.android.lib.design.description_list.a> list = this.items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.android.lib.design.description_list.a aVar = (com.avito.android.lib.design.description_list.a) obj;
            boolean z12 = true;
            boolean z13 = i12 == C42745f0.J(this.items);
            if (i12 <= 0) {
                z12 = false;
            }
            DescriptionParameterItem descriptionParameterItem = new DescriptionParameterItem(getContext(), null, 0, 0, 14, null);
            a(descriptionParameterItem, aVar, z13, z12);
            arrayList.add(descriptionParameterItem);
            i12 = i13;
        }
        this.f179055h = arrayList;
        LinearLayout linearLayout = this.f179051d;
        linearLayout.removeAllViews();
        Iterator<T> it = this.f179055h.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DescriptionListParameterLine(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.descriptionListParameterLine : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_DescriptionListParameterLine : i13;
        super(context, attributeSet, i12, i13);
        this.f179052e = new float[0];
        this.f179053f = new float[0];
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f179055h = c42784z0;
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.description_list_view, this);
        View viewFindViewById = findViewById(R.id.items_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f179051d = (LinearLayout) viewFindViewById;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178994t, i12, i13);
        d(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        this.items = c42784z0;
    }

    @Override // LV.b
    public void setState(@k com.avito.android.lib.design.description_list.parameter_line.a newState) {
        com.avito.android.lib.design.description_list.parameter_line.a aVar = this.f179050c;
        if (new com.avito.android.lib.util.c(newState, aVar).f181333c) {
            return;
        }
        this.f179050c = newState;
        List<com.avito.android.lib.design.description_list.a> list = aVar != null ? aVar.f179061a : null;
        List<com.avito.android.lib.design.description_list.a> list2 = newState.f179061a;
        if (!new com.avito.android.lib.util.c(list2, list).f181333c && list2 != null) {
            setItems(list2);
        }
        LineType lineType = aVar != null ? aVar.f179062b : null;
        LineType lineType2 = newState.f179062b;
        if (new com.avito.android.lib.util.c(lineType2, lineType).f181333c || lineType2 == null) {
            return;
        }
        setLineType(lineType2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.description_list.parameter_line.b r14) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.description_list.parameter_line.DescriptionListParameterLine.setStyle(com.avito.android.lib.design.description_list.parameter_line.b):void");
    }
}
