package com.avito.android.lib.design.list_item;

import Au.C13079a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.lib.deprecated_design.radio_button.c;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.U;
import java.util.ArrayList;
import java.util.List;
import kV.d;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import lV.C43688d;
import lV.InterfaceC43686b;

/* compiled from: ListItemCheckmark.kt */
@s0
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\"\u0010%J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010\u001bJ\u0015\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020 ¢\u0006\u0004\b)\u0010#J\u0015\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\b\b\u0003\u0010.\u001a\u00020 ¢\u0006\u0004\b/\u0010#J\u0019\u00102\u001a\u00020\n2\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\n2\u0006\u00104\u001a\u00020 H\u0016¢\u0006\u0004\b5\u0010#J\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u000206H\u0002¢\u0006\u0004\b\u000f\u00107R\u001c\u0010=\u001a\u0004\u0018\u0001088\u0014X\u0094\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemCheckmark;", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LkV/b;", "newState", "Lkotlin/G0;", "setState", "(LkV/b;)V", "LlV/b;", "newStyle", "setStyle", "(LlV/b;)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "setMessage", "setLink", "", "enabled", "setEnabled", "(Z)V", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "alignment", "setAlignment", "(Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;)V", "", "color", "setImageColor", "(I)V", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", BeduinCartItemModel.CHECKED_STRING, "setChecked", "styleRes", "setCheckmarkStyle", "", VoiceInfo.STATE, "setCheckmarkState", "([I)V", "drawableRes", "setImageResource", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "LlV/d;", "(LlV/d;)V", "Lcom/avito/android/lib/design/toggle/Checkmark;", "u", "Lcom/avito/android/lib/design/toggle/Checkmark;", "getButtonView", "()Lcom/avito/android/lib/design/toggle/Checkmark;", "buttonView", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ListItemCheckmark extends ListItemCompoundButton {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f179533x = 0;

    /* renamed from: q, reason: collision with root package name */
    @k
    public BaseListItem.Alignment f179534q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final SimpleDraweeView f179535r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final Checkmark f179536s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final AlignmentFrameLayout f179537t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @l
    public final Checkmark buttonView;

    /* renamed from: v, reason: collision with root package name */
    @l
    public C43688d f179539v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public d f179540w;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f179541b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SimpleDraweeView f179542c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Image f179543d;

        public a(View view, SimpleDraweeView simpleDraweeView, Image image) {
            this.f179541b = view;
            this.f179542c = simpleDraweeView;
            this.f179543d = image;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = ListItemCheckmark.f179533x;
            ImageRequest.a aVarA = C35949t5.a(this.f179542c);
            aVarA.d(n.a(this.f179543d));
            aVarA.c();
            this.f179541b.removeOnLayoutChangeListener(this);
        }
    }

    public ListItemCheckmark(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.listItemCheckmark);
        this.f179534q = BaseListItem.Alignment.f179502d;
        this.f179535r = (SimpleDraweeView) findViewById(R.id.design_item_icon);
        Checkmark checkmark = (Checkmark) findViewById(R.id.design_item_checkmark);
        this.f179536s = checkmark;
        this.f179537t = (AlignmentFrameLayout) findViewById(R.id.design_left_container);
        this.buttonView = checkmark;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178947T, R.attr.listItemCheckmark, R.style.Design_Widget_ListItemCheckmark);
        C43688d.a aVar = C43688d.f413784i;
        Context context2 = getContext();
        aVar.getClass();
        setStyle(C43688d.a.c(typedArrayObtainStyledAttributes, context2));
        setChecked(typedArrayObtainStyledAttributes.getBoolean(2, false));
        o();
        BaseListItem.Alignment alignment = BaseListItem.Alignment.f179500b;
        AlignmentFrameLayout alignmentFrameLayout = this.f179495h;
        if (alignmentFrameLayout != null) {
            d(alignmentFrameLayout, alignment, alignment);
        }
        b();
        c();
        setEnabled(isEnabled());
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton
    public final void g(@k C13079a c13079a) {
        Checkmark checkmark = this.f179536s;
        if (checkmark != null) {
            checkmark.setOnCheckedChangeListener(new c(2, c13079a, this));
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        Checkmark checkmark = this.f179536s;
        if (checkmark != null) {
            return checkmark.isChecked();
        }
        return false;
    }

    public final void k() {
        SimpleDraweeView simpleDraweeView = this.f179535r;
        if (simpleDraweeView != null) {
            D6.w(simpleDraweeView);
        }
        AlignmentFrameLayout alignmentFrameLayout = this.f179537t;
        if (alignmentFrameLayout != null) {
            D6.w(alignmentFrameLayout);
        }
    }

    public final void l() {
        SimpleDraweeView simpleDraweeView = this.f179535r;
        if (simpleDraweeView != null) {
            D6.H(simpleDraweeView);
        }
        AlignmentFrameLayout alignmentFrameLayout = this.f179537t;
        if (alignmentFrameLayout != null) {
            D6.H(alignmentFrameLayout);
        }
    }

    public final void m(@l Image image) {
        SimpleDraweeView simpleDraweeView = this.f179535r;
        if (simpleDraweeView == null) {
            return;
        }
        if (image == null) {
            C35949t5.a(simpleDraweeView).b();
        } else {
            if (!D6.x(simpleDraweeView)) {
                simpleDraweeView.addOnLayoutChangeListener(new a(simpleDraweeView, simpleDraweeView, image));
                return;
            }
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(n.a(image));
            aVarA.c();
        }
    }

    public final void n(@U int i12, @U int i13) {
        SimpleDraweeView simpleDraweeView = this.f179535r;
        ViewGroup.LayoutParams layoutParams = simpleDraweeView != null ? simpleDraweeView.getLayoutParams() : null;
        if (layoutParams == null || simpleDraweeView == null) {
            return;
        }
        layoutParams.width = i12;
        layoutParams.height = i13;
        simpleDraweeView.setLayoutParams(layoutParams);
        AlignmentFrameLayout alignmentFrameLayout = this.f179537t;
        if (alignmentFrameLayout != null) {
            int paddingBottom = alignmentFrameLayout.getPaddingBottom() + alignmentFrameLayout.getPaddingTop() + i13;
            int minimumHeight = getMinimumHeight();
            if (minimumHeight >= paddingBottom) {
                paddingBottom = minimumHeight;
            }
            setMinimumHeight(paddingBottom);
        }
    }

    public final void o() {
        List listU = C42745f0.U(getTitle(), getSubtitle(), getMessage(), getLink());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            String str = (String) obj;
            if (str != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1) {
            BaseListItem.Alignment alignment = BaseListItem.Alignment.f179500b;
            BaseListItem.Alignment alignment2 = this.f179534q;
            AlignmentFrameLayout alignmentFrameLayout = this.f179494g;
            if (alignmentFrameLayout != null) {
                d(alignmentFrameLayout, alignment, alignment2);
                return;
            }
            return;
        }
        BaseListItem.Alignment alignment3 = this.f179534q;
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

    public final void setAlignment(@k BaseListItem.Alignment alignment) {
        this.f179534q = alignment;
        o();
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, pK0.InterfaceC46971a
    public void setAppearance(int style) {
        C43688d.a aVar = C43688d.f413784i;
        Context context = getContext();
        aVar.getClass();
        setStyle(C43688d.a.b(style, context));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        Checkmark checkmark = this.f179536s;
        if (checkmark == null) {
            return;
        }
        checkmark.setChecked(checked);
    }

    public final void setCheckmarkState(@k int[] state) {
        Checkmark checkmark = this.f179536s;
        if (checkmark != null) {
            checkmark.setState(state);
        }
    }

    public final void setCheckmarkStyle(int styleRes) {
        Checkmark checkmark = this.f179536s;
        if (checkmark != null) {
            checkmark.setAppearance(styleRes);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        SimpleDraweeView simpleDraweeView = this.f179535r;
        if (simpleDraweeView != null) {
            simpleDraweeView.setEnabled(enabled);
        }
        Checkmark checkmark = this.f179536s;
        if (checkmark == null) {
            return;
        }
        checkmark.setEnabled(enabled);
    }

    public final void setImageColor(@InterfaceC42156l int color) {
        setImageColor(ColorStateList.valueOf(color));
    }

    public final void setImageDrawable(@l Drawable drawable) {
        SimpleDraweeView simpleDraweeView = this.f179535r;
        if (simpleDraweeView != null) {
            C35821j2.a(simpleDraweeView, drawable);
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
        o();
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setMessage(@l CharSequence text) {
        super.setMessage(text);
        o();
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setSubtitle(@l CharSequence text) {
        super.setSubtitle(text);
        o();
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem
    public void setTitle(@l CharSequence text) {
        super.setTitle(text);
        o();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        Checkmark checkmark = this.f179536s;
        if (checkmark != null) {
            checkmark.toggle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setStyle(lV.C43688d r6) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.ListItemCheckmark.setStyle(lV.d):void");
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton
    @l
    public Checkmark getButtonView() {
        return this.buttonView;
    }

    public final void setImageColor(@l ColorStateList color) {
        SimpleDraweeView simpleDraweeView = this.f179535r;
        if (simpleDraweeView == null) {
            return;
        }
        simpleDraweeView.setImageTintList(color);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k kV.b r18) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.ListItemCheckmark.setState(kV.b):void");
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.d
    public void setStyle(@k InterfaceC43686b newStyle) {
        if (newStyle instanceof C43688d) {
            setStyle((C43688d) newStyle);
        }
    }
}
