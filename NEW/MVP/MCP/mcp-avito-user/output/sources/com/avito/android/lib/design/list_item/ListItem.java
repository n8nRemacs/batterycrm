package com.avito.android.lib.design.list_item;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.util.c;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lV.C43685a;
import lV.InterfaceC43686b;
import lV.f;

/* compiled from: ListItem.kt */
@s0
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001f\u0010\"J\u0017\u0010#\u001a\u00020\n2\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010 J\u0017\u0010#\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010 J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020.H\u0002¢\u0006\u0004\b\u0016\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItem;", "Lcom/avito/android/lib/design/list_item/BaseListItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "Lkotlin/G0;", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "setMessage", "setLink", "LkV/b;", "newState", "setState", "(LkV/b;)V", "LlV/b;", "newStyle", "setStyle", "(LlV/b;)V", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "alignment", "setLeftAlignment", "(Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;)V", "setRightAlignment", "", "color", "setLeftIconColor", "(I)V", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", "setRightIconColor", "Landroid/view/View$OnClickListener;", "listener", "setRightIconClickedListener", "(Landroid/view/View$OnClickListener;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "", "enabled", "setEnabled", "(Z)V", "LlV/f;", "(LlV/f;)V", "getTextCount", "()I", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class ListItem extends BaseListItem {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f179506t = 0;

    /* renamed from: n, reason: collision with root package name */
    @k
    public BaseListItem.Alignment f179507n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public BaseListItem.Alignment f179508o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final SimpleDraweeView f179509p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final SimpleDraweeView f179510q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public f f179511r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public kV.f f179512s;

    public ListItem(@l Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(SimpleDraweeView simpleDraweeView, Q q12, Drawable drawable) {
        if (q12 != null) {
            ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            Size size = (Size) q12.f406620c;
            layoutParams.width = y6.b(size.getWidth());
            layoutParams.height = y6.b(size.getHeight());
            simpleDraweeView.setLayoutParams(layoutParams);
            GW0.b bVar = new GW0.b(simpleDraweeView.getResources());
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(n.a((Image) q12.f406619b));
            aVarA.f169500r = false;
            bVar.f6543h = drawable;
            simpleDraweeView.setHierarchy(bVar.a());
            aVarA.c();
            D6.H(simpleDraweeView);
            return;
        }
        if (drawable == null) {
            C35949t5.a(simpleDraweeView).b();
            D6.w(simpleDraweeView);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = drawable.getIntrinsicWidth();
        layoutParams2.height = drawable.getIntrinsicHeight();
        simpleDraweeView.setLayoutParams(layoutParams2);
        C35949t5.a(simpleDraweeView).b();
        ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView);
        aVarA2.f169484b = new ImageRequest.d.a(drawable, null);
        aVarA2.c();
        D6.H(simpleDraweeView);
    }

    private final int getTextCount() {
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

    public static /* synthetic */ void i(ListItem listItem, Drawable drawable) {
        SimpleDraweeView simpleDraweeView = listItem.f179510q;
        listItem.g(drawable, simpleDraweeView != null ? simpleDraweeView.getDrawable() : null);
    }

    public static /* synthetic */ void k(ListItem listItem, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        listItem.j(i12, i13);
    }

    public final void g(@l Drawable drawable, @l Drawable drawable2) {
        SimpleDraweeView simpleDraweeView = this.f179509p;
        if (simpleDraweeView != null) {
            C35821j2.a(simpleDraweeView, drawable);
        }
        SimpleDraweeView simpleDraweeView2 = this.f179510q;
        if (simpleDraweeView2 != null) {
            C35821j2.a(simpleDraweeView2, drawable2);
        }
        b();
        c();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void j(@InterfaceC42165v int i12, @InterfaceC42165v int i13) {
        Drawable drawable;
        Integer numValueOf = Integer.valueOf(i12);
        Drawable drawable2 = null;
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            drawable = getContext().getDrawable(numValueOf.intValue());
        } else {
            drawable = null;
        }
        Integer numValueOf2 = Integer.valueOf(i13);
        if (numValueOf2.intValue() <= 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            drawable2 = getContext().getDrawable(numValueOf2.intValue());
        }
        g(drawable, drawable2);
    }

    public final void l() {
        if (getTextCount() <= 1) {
            BaseListItem.Alignment alignment = BaseListItem.Alignment.f179500b;
            BaseListItem.Alignment alignment2 = this.f179507n;
            AlignmentFrameLayout alignmentFrameLayout = this.f179494g;
            if (alignmentFrameLayout != null) {
                d(alignmentFrameLayout, alignment, alignment2);
                return;
            }
            return;
        }
        BaseListItem.Alignment alignment3 = this.f179507n;
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
        if (getTextCount() <= 1) {
            BaseListItem.Alignment alignment = BaseListItem.Alignment.f179500b;
            BaseListItem.Alignment alignment2 = this.f179508o;
            AlignmentFrameLayout alignmentFrameLayout = this.f179495h;
            if (alignmentFrameLayout != null) {
                d(alignmentFrameLayout, alignment, alignment2);
                return;
            }
            return;
        }
        BaseListItem.Alignment alignment3 = this.f179508o;
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
            d(alignmentFrameLayout3, alignment4, alignment3);
        }
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, pK0.InterfaceC46971a
    public void setAppearance(int style) {
        f.a aVar = f.f413801h;
        Context context = getContext();
        aVar.getClass();
        setStyle(f.a.b(style, context));
        requestLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        SimpleDraweeView simpleDraweeView = this.f179509p;
        if (simpleDraweeView != null) {
            simpleDraweeView.setEnabled(enabled);
        }
        SimpleDraweeView simpleDraweeView2 = this.f179510q;
        if (simpleDraweeView2 == null) {
            return;
        }
        simpleDraweeView2.setEnabled(enabled);
    }

    public final void setLeftAlignment(@k BaseListItem.Alignment alignment) {
        this.f179507n = alignment;
        l();
    }

    public final void setLeftIconColor(@InterfaceC42156l int color) {
        setLeftIconColor(ColorStateList.valueOf(color));
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setLink(@l CharSequence text) {
        super.setLink(text);
        l();
        m();
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setMessage(@l CharSequence text) {
        super.setMessage(text);
        l();
        m();
    }

    public final void setRightAlignment(@k BaseListItem.Alignment alignment) {
        this.f179508o = alignment;
        m();
    }

    public final void setRightIconClickedListener(@l View.OnClickListener listener) {
        SimpleDraweeView simpleDraweeView = this.f179510q;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(listener);
        }
    }

    public final void setRightIconColor(@InterfaceC42156l int color) {
        setRightIconColor(ColorStateList.valueOf(color));
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setSubtitle(@l CharSequence text) {
        super.setSubtitle(text);
        l();
        m();
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setTitle(@l CharSequence text) {
        super.setTitle(text);
        l();
        m();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ListItem(@l Context context, @l AttributeSet attributeSet, int i12) {
        Integer numValueOf = i12 <= 0 ? null : Integer.valueOf(i12);
        int i13 = R.attr.listItem;
        super(context, attributeSet, numValueOf != null ? numValueOf.intValue() : R.attr.listItem);
        BaseListItem.Alignment alignment = BaseListItem.Alignment.f179502d;
        this.f179507n = alignment;
        this.f179508o = alignment;
        this.f179509p = (SimpleDraweeView) findViewById(R.id.design_item_left_icon);
        this.f179510q = (SimpleDraweeView) findViewById(R.id.design_item_right_icon);
        Integer numValueOf2 = i12 > 0 ? Integer.valueOf(i12) : null;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178943R, numValueOf2 != null ? numValueOf2.intValue() : i13, R.style.Design_Widget_ListItem);
        f.a aVar = f.f413801h;
        Context context2 = getContext();
        aVar.getClass();
        setStyle(f.a.c(typedArrayObtainStyledAttributes, context2));
        l();
        m();
        b();
        c();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setStyle(f newStyle) {
        f fVar = this.f179511r;
        if (new c(newStyle, fVar).f181333c || newStyle == null) {
            return;
        }
        this.f179511r = newStyle;
        C43685a c43685a = newStyle != null ? newStyle.f413802a : null;
        if (!new c(c43685a, fVar != null ? fVar.f413802a : null).f181333c && c43685a != null) {
            super.setStyle((InterfaceC43686b) c43685a);
        }
        boolean zF2 = L.f(newStyle != null ? newStyle.f413803b : null, fVar != null ? fVar.f413803b : null);
        SimpleDraweeView simpleDraweeView = this.f179509p;
        if (!zF2) {
            if (simpleDraweeView != null) {
                C35821j2.a(simpleDraweeView, newStyle.f413803b);
            }
            b();
        } else if (newStyle.f413803b == null && simpleDraweeView != null && D6.y(simpleDraweeView)) {
            D6.w(simpleDraweeView);
            b();
        }
        boolean zF3 = L.f(newStyle != null ? newStyle.f413804c : null, fVar != null ? fVar.f413804c : null);
        SimpleDraweeView simpleDraweeView2 = this.f179510q;
        if (!zF3) {
            if (simpleDraweeView2 != null) {
                C35821j2.a(simpleDraweeView2, newStyle.f413804c);
            }
            D6.H(simpleDraweeView2);
            c();
        } else if (newStyle.f413804c == null && simpleDraweeView2 != null && D6.y(simpleDraweeView2)) {
            D6.w(simpleDraweeView2);
            c();
        }
        C35763c0 c35763c0 = newStyle != null ? newStyle.f413807f : null;
        if (!new c(c35763c0, fVar != null ? fVar.f413807f : null).f181333c && c35763c0 != null) {
            setLeftIconColor(c35763c0.b());
        }
        C35763c0 c35763c02 = newStyle != null ? newStyle.f413808g : null;
        if (!new c(c35763c02, fVar != null ? fVar.f413808g : null).f181333c && c35763c02 != null) {
            setRightIconColor(c35763c02.b());
        }
        BaseListItem.Alignment alignment = newStyle != null ? newStyle.f413805d : null;
        if (!new c(alignment, fVar != null ? fVar.f413805d : null).f181333c && alignment != null) {
            setLeftAlignment(alignment);
        }
        BaseListItem.Alignment alignment2 = newStyle != null ? newStyle.f413806e : null;
        if (new c(alignment2, fVar != null ? fVar.f413806e : null).f181333c || alignment2 == null) {
            return;
        }
        setRightAlignment(alignment2);
    }

    public final void setLeftIconColor(@l ColorStateList color) {
        SimpleDraweeView simpleDraweeView = this.f179509p;
        if (simpleDraweeView != null) {
            simpleDraweeView.setImageTintList(color);
        }
    }

    public final void setRightIconColor(@l ColorStateList color) {
        SimpleDraweeView simpleDraweeView = this.f179510q;
        if (simpleDraweeView != null) {
            simpleDraweeView.setImageTintList(color);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k kV.b r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.ListItem.setState(kV.b):void");
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.d
    public void setStyle(@k InterfaceC43686b newStyle) {
        if (newStyle instanceof f) {
            setStyle((f) newStyle);
        }
    }
}
