package com.avito.android.lib.design.list_item;

import Au.C13079a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.deprecated_design.radio_button.c;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35821j2;
import com.avito.android.util.D6;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.f0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lV.C43685a;
import lV.InterfaceC43686b;
import lV.g;

/* compiled from: ListItemSwitcher.kt */
@s0
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u0019\u0010\u001f\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\b\b\u0001\u0010$\u001a\u00020\u0019¢\u0006\u0004\b%\u0010\u001cJ\u0017\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010&¢\u0006\u0004\b%\u0010'J\u0015\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020 ¢\u0006\u0004\b)\u0010#J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010#J\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J\u0017\u00102\u001a\u00020\n2\b\b\u0003\u00101\u001a\u00020\u0019¢\u0006\u0004\b2\u0010\u001cJ\u0019\u00105\u001a\u00020\n2\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u0010\u001cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u000208H\u0002¢\u0006\u0004\b\u000f\u00109R\u001c\u0010?\u001a\u0004\u0018\u00010:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemSwitcher;", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LkV/b;", "newState", "Lkotlin/G0;", "setState", "(LkV/b;)V", "LlV/b;", "newStyle", "setStyle", "(LlV/b;)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "", VoiceInfo.STATE, "setSwitcherState", "([I)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setSwitcherAppearance", "(I)V", "setSubtitle", "setMessage", "setLink", "", "enabled", "setEnabled", "(Z)V", "color", "setImageColor", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", "isLoading", "setLoading", BeduinCartItemModel.CHECKED_STRING, "setChecked", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "alignment", "setIconAlignment", "(Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;)V", "setSwitcherAlignment", "drawableRes", "setImageResource", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setAppearance", "LlV/g;", "(LlV/g;)V", "Lcom/avito/android/lib/design/switcher/Switcher;", "w", "Lcom/avito/android/lib/design/switcher/Switcher;", "getButtonView", "()Lcom/avito/android/lib/design/switcher/Switcher;", "buttonView", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ListItemSwitcher extends ListItemCompoundButton {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f179564z = 0;

    /* renamed from: q, reason: collision with root package name */
    @k
    public BaseListItem.Alignment f179565q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public BaseListItem.Alignment f179566r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final ImageView f179567s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final Switcher f179568t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final Spinner f179569u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final FrameLayout f179570v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @l
    public final Switcher buttonView;

    /* renamed from: x, reason: collision with root package name */
    @l
    public g f179572x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public kV.g f179573y;

    public ListItemSwitcher(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.listItemSwitcher);
        BaseListItem.Alignment alignment = BaseListItem.Alignment.f179502d;
        this.f179565q = alignment;
        this.f179566r = alignment;
        this.f179567s = (ImageView) findViewById(R.id.design_item_icon);
        Switcher switcher = (Switcher) findViewById(R.id.design_item_switcher);
        this.f179568t = switcher;
        this.f179569u = (Spinner) findViewById(R.id.design_item_spinner);
        this.f179570v = (FrameLayout) findViewById(R.id.design_right_container);
        this.buttonView = switcher;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178952W, R.attr.listItemSwitcher, R.style.Design_Widget_ListItemSwitcher);
        g.a aVar = g.f413809j;
        Context context2 = getContext();
        aVar.getClass();
        setStyle(g.a.c(typedArrayObtainStyledAttributes, context2));
        setLoading(typedArrayObtainStyledAttributes.getBoolean(4, false));
        setChecked(typedArrayObtainStyledAttributes.getBoolean(1, false));
        l();
        BaseListItem.Alignment alignment2 = BaseListItem.Alignment.f179500b;
        BaseListItem.Alignment alignment3 = BaseListItem.Alignment.f179503e;
        AlignmentFrameLayout alignmentFrameLayout = this.f179495h;
        if (alignmentFrameLayout != null) {
            d(alignmentFrameLayout, alignment2, alignment3);
        }
        b();
        c();
        setEnabled(isEnabled());
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton
    public final void g(@k C13079a c13079a) {
        Switcher switcher = this.f179568t;
        if (switcher != null) {
            switcher.setOnCheckedChangeListener(new c(4, c13079a, this));
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        Switcher switcher = this.f179568t;
        if (switcher != null) {
            return switcher.isChecked();
        }
        return false;
    }

    public final int k() {
        List<String> listU = C42745f0.U(getTitle(), getSubtitle(), getMessage(), getLink());
        if ((listU instanceof Collection) && listU.isEmpty()) {
            return 0;
        }
        int i12 = 0;
        for (String str : listU) {
            if (!(str == null || str.length() == 0) && (i12 = i12 + 1) < 0) {
                C42745f0.G0();
                throw null;
            }
        }
        return i12;
    }

    public final void l() {
        if (k() <= 1) {
            BaseListItem.Alignment alignment = BaseListItem.Alignment.f179500b;
            BaseListItem.Alignment alignment2 = this.f179565q;
            AlignmentFrameLayout alignmentFrameLayout = this.f179494g;
            if (alignmentFrameLayout != null) {
                d(alignmentFrameLayout, alignment, alignment2);
                return;
            }
            return;
        }
        BaseListItem.Alignment alignment3 = this.f179565q;
        if (alignment3 == BaseListItem.Alignment.f179501c) {
            AlignmentFrameLayout alignmentFrameLayout2 = this.f179494g;
            if (alignmentFrameLayout2 != null) {
                d(alignmentFrameLayout2, alignment3, alignment3);
                return;
            }
            return;
        }
        BaseListItem.Alignment alignment4 = BaseListItem.Alignment.f179500b;
        AlignmentFrameLayout alignmentFrameLayout3 = this.f179494g;
        if (alignmentFrameLayout3 != null) {
            d(alignmentFrameLayout3, alignment4, alignment3);
        }
    }

    public final void m() {
        if (k() <= 1) {
            BaseListItem.Alignment alignment = this.f179566r;
            BaseListItem.Alignment alignment2 = BaseListItem.Alignment.f179500b;
            AlignmentFrameLayout alignmentFrameLayout = this.f179495h;
            if (alignmentFrameLayout != null) {
                d(alignmentFrameLayout, alignment, alignment2);
                return;
            }
            return;
        }
        BaseListItem.Alignment alignment3 = this.f179566r;
        if (alignment3 == BaseListItem.Alignment.f179501c) {
            AlignmentFrameLayout alignmentFrameLayout2 = this.f179495h;
            if (alignmentFrameLayout2 != null) {
                d(alignmentFrameLayout2, alignment3, alignment3);
                return;
            }
            return;
        }
        BaseListItem.Alignment alignment4 = BaseListItem.Alignment.f179500b;
        AlignmentFrameLayout alignmentFrameLayout3 = this.f179495h;
        if (alignmentFrameLayout3 != null) {
            d(alignmentFrameLayout3, alignment3, alignment4);
        }
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, pK0.InterfaceC46971a
    public void setAppearance(int style) {
        g.a aVar = g.f413809j;
        Context context = getContext();
        aVar.getClass();
        setStyle(g.a.b(style, context));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        Switcher switcher = this.f179568t;
        if (switcher == null) {
            return;
        }
        switcher.setChecked(checked);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ImageView imageView = this.f179567s;
        if (imageView != null) {
            imageView.setEnabled(enabled);
        }
        Switcher switcher = this.f179568t;
        if (switcher == null) {
            return;
        }
        switcher.setEnabled(enabled);
    }

    public final void setIconAlignment(@k BaseListItem.Alignment alignment) {
        this.f179565q = alignment;
        l();
    }

    public final void setImageColor(@InterfaceC42156l int color) {
        setImageColor(ColorStateList.valueOf(color));
    }

    public final void setImageDrawable(@l Drawable drawable) {
        ImageView imageView = this.f179567s;
        if (imageView != null) {
            C35821j2.a(imageView, drawable);
        }
        b();
    }

    public final void setImageResource(@InterfaceC42165v int drawableRes) {
        Integer numValueOf = Integer.valueOf(drawableRes);
        Drawable drawable = null;
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            drawable = getContext().getDrawable(numValueOf.intValue());
        }
        setImageDrawable(drawable);
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setLink(@l CharSequence text) {
        super.setLink(text);
        l();
    }

    public final void setLoading(boolean isLoading) {
        Spinner spinner = this.f179569u;
        if (spinner != null) {
            D6.G(spinner, isLoading);
        }
        Switcher switcher = this.f179568t;
        if (switcher != null) {
            D6.G(switcher, !isLoading);
        }
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setMessage(@l CharSequence text) {
        super.setMessage(text);
        l();
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setSubtitle(@l CharSequence text) {
        super.setSubtitle(text);
        l();
    }

    public final void setSwitcherAlignment(@k BaseListItem.Alignment alignment) {
        this.f179566r = alignment;
        m();
    }

    public final void setSwitcherAppearance(@f0 int style) throws Resources.NotFoundException {
        Switcher switcher = this.f179568t;
        if (switcher != null) {
            switcher.setAppearance(style);
        }
    }

    public final void setSwitcherState(@k int[] state) {
        Switcher switcher = this.f179568t;
        if (switcher != null) {
            switcher.setState(state);
        }
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setTitle(@l CharSequence text) {
        super.setTitle(text);
        l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        Switcher switcher = this.f179568t;
        if (switcher != null) {
            switcher.toggle();
        }
    }

    private final void setStyle(g newStyle) {
        ImageView imageView;
        Spinner spinner;
        Switcher switcher;
        g gVar = this.f179572x;
        if (new com.avito.android.lib.util.c(newStyle, gVar).f181333c || newStyle == null) {
            return;
        }
        this.f179572x = newStyle;
        C43685a c43685a = gVar != null ? gVar.f413810a : null;
        C43685a c43685a2 = newStyle.f413810a;
        if (!new com.avito.android.lib.util.c(c43685a2, c43685a).f181333c && c43685a2 != null) {
            super.setStyle((InterfaceC43686b) c43685a2);
        }
        Drawable drawable = gVar != null ? gVar.f413818i : null;
        Drawable drawable2 = newStyle.f413818i;
        if (!L.f(drawable2, drawable)) {
            setImageDrawable(drawable2);
        } else if (drawable2 == null && (imageView = this.f179567s) != null && D6.y(imageView)) {
            D6.w(imageView);
            b();
        }
        C35763c0 c35763c0 = gVar != null ? gVar.f413813d : null;
        C35763c0 c35763c02 = newStyle.f413813d;
        if (!new com.avito.android.lib.util.c(c35763c02, c35763c0).f181333c && c35763c02 != null) {
            setImageColor(c35763c02.b());
        }
        BaseListItem.Alignment alignment = gVar != null ? gVar.f413816g : null;
        BaseListItem.Alignment alignment2 = newStyle.f413816g;
        if (!new com.avito.android.lib.util.c(alignment2, alignment).f181333c && alignment2 != null) {
            this.f179565q = alignment2;
            l();
        }
        BaseListItem.Alignment alignment3 = gVar != null ? gVar.f413817h : null;
        BaseListItem.Alignment alignment4 = newStyle.f413817h;
        if (!new com.avito.android.lib.util.c(alignment4, alignment3).f181333c && alignment4 != null) {
            this.f179566r = alignment4;
            m();
        }
        com.avito.android.lib.design.switcher.a aVar = gVar != null ? gVar.f413811b : null;
        com.avito.android.lib.design.switcher.a aVar2 = newStyle.f413811b;
        if (!new com.avito.android.lib.util.c(aVar2, aVar).f181333c && aVar2 != null && (switcher = this.f179568t) != null) {
            switcher.setStyle(aVar2);
        }
        Integer numValueOf = Integer.valueOf(newStyle.f413815f);
        if (!new com.avito.android.lib.util.c(numValueOf, gVar != null ? Integer.valueOf(gVar.f413815f) : null).f181333c) {
            int iIntValue = numValueOf.intValue();
            FrameLayout frameLayout = this.f179570v;
            if (frameLayout != null) {
                D6.c(frameLayout, null, Integer.valueOf(iIntValue), null, null, 13);
            }
        }
        com.avito.android.lib.design.spinner.a aVar3 = gVar != null ? gVar.f413812c : null;
        com.avito.android.lib.design.spinner.a aVar4 = newStyle.f413812c;
        if (!new com.avito.android.lib.util.c(aVar4, aVar3).f181333c && aVar4 != null && (spinner = this.f179569u) != null) {
            spinner.setStyle(aVar4);
        }
        if (L.f(aVar2, gVar != null ? gVar.f413811b : null)) {
            if (L.f(aVar4, gVar != null ? gVar.f413812c : null)) {
                if (L.f(c35763c02, gVar != null ? gVar.f413813d : null)) {
                    if (L.f(c43685a2, gVar != null ? gVar.f413810a : null)) {
                        return;
                    }
                }
            }
        }
        requestLayout();
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton
    @l
    public Switcher getButtonView() {
        return this.buttonView;
    }

    public final void setImageColor(@l ColorStateList color) {
        ImageView imageView = this.f179567s;
        if (imageView == null) {
            return;
        }
        imageView.setImageTintList(color);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k kV.b r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.ListItemSwitcher.setState(kV.b):void");
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.d
    public void setStyle(@k InterfaceC43686b newStyle) {
        if (newStyle instanceof g) {
            setStyle((g) newStyle);
        }
    }
}
