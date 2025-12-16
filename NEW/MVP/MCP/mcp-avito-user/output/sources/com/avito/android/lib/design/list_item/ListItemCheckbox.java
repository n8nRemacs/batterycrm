package com.avito.android.lib.design.list_item;

import Au.C13079a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.design.State;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35821j2;
import com.avito.android.util.D6;
import gw.InterfaceC40743a;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lV.C43687c;
import lV.InterfaceC43686b;

/* compiled from: ListItemCheckbox.kt */
@s0
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001IB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u001a\u001a\u00020\n2\b\b\u0003\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\b\b\u0001\u0010 \u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\"¢\u0006\u0004\b!\u0010#J\u0017\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\b\b\u0001\u0010 \u001a\u00020\u0018¢\u0006\u0004\b,\u0010\u001bJ\u0017\u0010-\u001a\u00020\n2\b\b\u0001\u0010 \u001a\u00020\u0018¢\u0006\u0004\b-\u0010\u001bJ\u0015\u0010.\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b.\u0010\u001fJ\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0018H\u0016¢\u0006\u0004\b0\u0010\u001bJ\u0015\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0018¢\u0006\u0004\b2\u0010\u001bJ\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020;H\u0002¢\u0006\u0004\b\u0013\u0010<R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010H\u001a\u0004\u0018\u00010C8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemCheckbox;", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lkotlin/G0;", "setEnabled", "(Z)V", "LkV/b;", "newState", "setState", "(LkV/b;)V", "LlV/b;", "newStyle", "setStyle", "(LlV/b;)V", "setCheckboxEnabled", BeduinCartItemModel.CHECKED_STRING, "setChecked", "", "drawableRes", "setImageResource", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "color", "setImageColor", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", "Landroid/view/View$OnClickListener;", "listener", "setImageClickedListener", "(Landroid/view/View$OnClickListener;)V", "", "text", "setBadgeText", "(Ljava/lang/String;)V", "setBadgeTextColor", "setBadgeBackgroundColor", "setBadgeBackground", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "styleRes", "setCheckboxStyle", "", VoiceInfo.STATE, "setCheckboxState", "([I)V", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "alignment", "setAlignment", "(Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;)V", "LlV/c;", "(LlV/c;)V", "Lgw/a;", "x", "Lgw/a;", "getImageContainer", "()Lgw/a;", "imageContainer", "Landroid/widget/CompoundButton;", "A", "Landroid/widget/CompoundButton;", "getButtonView", "()Landroid/widget/CompoundButton;", "buttonView", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ListItemCheckbox extends ListItemCompoundButton {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f179513B = 0;

    /* renamed from: A, reason: collision with root package name */
    @l
    public final Checkbox f179514A;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final ImageView f179515q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final Checkbox f179516r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final FrameLayout f179517s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final Badge f179518t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final AlignmentFrameLayout f179519u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final int[] f179520v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final int[] f179521w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final a f179522x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public C43687c f179523y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public kV.c f179524z;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/Views$runOnNextLayoutChange$1", "Landroid/view/View$OnLayoutChangeListener;", "com/avito/android/util/H6", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f179527b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ListItemCheckbox f179528c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Image f179529d;

        public b(View view, ListItemCheckbox listItemCheckbox, Image image) {
            this.f179527b = view;
            this.f179528c = listItemCheckbox;
            this.f179529d = image;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            ListItemCheckbox listItemCheckbox = this.f179528c;
            s.b(listItemCheckbox.getImageContainer(), this.f179529d, listItemCheckbox.new c(), 20);
            ImageView imageView = listItemCheckbox.f179515q;
            imageView.addOnLayoutChangeListener(new d(imageView, listItemCheckbox));
            this.f179527b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: ListItemCheckbox.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/drawable/Drawable;", "it", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Drawable, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Drawable drawable) {
            ListItemCheckbox.this.l();
            return G0.f406611a;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f179531b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ListItemCheckbox f179532c;

        public d(View view, ListItemCheckbox listItemCheckbox) {
            this.f179531b = view;
            this.f179532c = listItemCheckbox;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            ListItemCheckbox listItemCheckbox = this.f179532c;
            listItemCheckbox.getClass();
            BaseListItem.Alignment alignment = BaseListItem.Alignment.f179500b;
            BaseListItem.Alignment alignment2 = BaseListItem.Alignment.f179501c;
            AlignmentFrameLayout alignmentFrameLayout = listItemCheckbox.f179494g;
            if (alignmentFrameLayout != null) {
                listItemCheckbox.d(alignmentFrameLayout, alignment, alignment2);
            }
            this.f179531b.removeOnLayoutChangeListener(this);
        }
    }

    public ListItemCheckbox(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.listItemCheckbox);
        ImageView imageView = (ImageView) findViewById(R.id.design_item_icon);
        this.f179515q = imageView;
        Checkbox checkbox = (Checkbox) findViewById(R.id.design_item_checkbox);
        this.f179516r = checkbox;
        this.f179517s = (FrameLayout) findViewById(R.id.design_item_title_right_container);
        this.f179518t = (Badge) findViewById(R.id.notification_badge);
        this.f179519u = (AlignmentFrameLayout) findViewById(R.id.design_right_container);
        this.f179520v = new int[]{android.R.attr.state_checked};
        this.f179521w = new int[0];
        a aVar = new a();
        this.f179522x = aVar;
        aVar.f179526c = imageView;
        this.f179514A = checkbox;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178945S, R.attr.listItemCheckbox, R.style.Design_Widget_ListItemCheckbox);
        C43687c.a aVar2 = C43687c.f413775i;
        Context context2 = getContext();
        aVar2.getClass();
        setStyle(C43687c.a.c(typedArrayObtainStyledAttributes, context2));
        setChecked(typedArrayObtainStyledAttributes.getBoolean(3, false));
        int i12 = typedArrayObtainStyledAttributes.getInt(1, -1);
        o(i12 != 0 ? i12 != 1 ? null : BaseListItem.Alignment.f179501c : BaseListItem.Alignment.f179500b);
        b();
        c();
        setEnabled(isEnabled());
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] iArr = isChecked() ? this.f179520v : this.f179521w;
        ImageView imageView = this.f179515q;
        if (imageView != null) {
            imageView.setImageState(iArr, true);
        }
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton
    public final void g(@k C13079a c13079a) {
        Checkbox checkbox = this.f179516r;
        if (checkbox != null) {
            checkbox.setOnCheckedChangeListener(new com.avito.android.lib.deprecated_design.radio_button.c(1, c13079a, this));
        }
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton
    @l
    public CompoundButton getButtonView() {
        return this.f179514A;
    }

    @k
    public final InterfaceC40743a getImageContainer() {
        return this.f179522x;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        Checkbox checkbox = this.f179516r;
        if (checkbox != null) {
            return checkbox.isChecked();
        }
        return false;
    }

    public final void k() {
        ImageView imageView = this.f179515q;
        if (imageView != null) {
            D6.w(imageView);
        }
        AlignmentFrameLayout alignmentFrameLayout = this.f179519u;
        if (alignmentFrameLayout != null) {
            D6.w(alignmentFrameLayout);
        }
    }

    public final void l() {
        ImageView imageView = this.f179515q;
        if (imageView != null) {
            D6.H(imageView);
        }
        AlignmentFrameLayout alignmentFrameLayout = this.f179519u;
        if (alignmentFrameLayout != null) {
            D6.H(alignmentFrameLayout);
        }
    }

    public final void m(@l Image image) {
        if (image == null) {
            this.f179522x.setImage(null);
            k();
            return;
        }
        ImageView imageView = this.f179515q;
        if (imageView != null) {
            if (!D6.x(imageView)) {
                imageView.addOnLayoutChangeListener(new b(imageView, this, image));
            } else {
                s.b(getImageContainer(), image, new c(), 20);
                imageView.addOnLayoutChangeListener(new d(imageView, this));
            }
        }
    }

    public final void n(@U int i12, @U int i13) {
        ImageView imageView = this.f179515q;
        ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams == null || imageView == null) {
            return;
        }
        layoutParams.width = i12;
        layoutParams.height = i13;
        imageView.setLayoutParams(layoutParams);
        AlignmentFrameLayout alignmentFrameLayout = this.f179519u;
        if (alignmentFrameLayout != null) {
            int paddingBottom = alignmentFrameLayout.getPaddingBottom() + alignmentFrameLayout.getPaddingTop() + i13;
            int minimumHeight = getMinimumHeight();
            if (minimumHeight >= paddingBottom) {
                paddingBottom = minimumHeight;
            }
            setMinimumHeight(paddingBottom);
        }
    }

    public final void o(BaseListItem.Alignment alignment) {
        if (alignment != null) {
            AlignmentFrameLayout alignmentFrameLayout = this.f179494g;
            if (alignmentFrameLayout != null) {
                d(alignmentFrameLayout, alignment, alignment);
            }
            AlignmentFrameLayout alignmentFrameLayout2 = this.f179495h;
            if (alignmentFrameLayout2 != null) {
                d(alignmentFrameLayout2, alignment, alignment);
                return;
            }
            return;
        }
        BaseListItem.Alignment alignment2 = BaseListItem.Alignment.f179500b;
        BaseListItem.Alignment alignment3 = BaseListItem.Alignment.f179501c;
        AlignmentFrameLayout alignmentFrameLayout3 = this.f179494g;
        if (alignmentFrameLayout3 != null) {
            d(alignmentFrameLayout3, alignment2, alignment3);
        }
        AlignmentFrameLayout alignmentFrameLayout4 = this.f179495h;
        if (alignmentFrameLayout4 != null) {
            d(alignmentFrameLayout4, alignment2, alignment2);
        }
    }

    public final void setAlignment(@l BaseListItem.Alignment alignment) {
        o(alignment);
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, pK0.InterfaceC46971a
    public void setAppearance(int style) {
        C43687c.a aVar = C43687c.f413775i;
        Context context = getContext();
        aVar.getClass();
        setStyle(C43687c.a.b(style, context));
    }

    public final void setBadgeBackground(@k Drawable drawable) {
        Badge badge = this.f179518t;
        if (badge == null) {
            return;
        }
        badge.setBackground(drawable);
    }

    public final void setBadgeBackgroundColor(@InterfaceC42156l int color) {
        Badge badge = this.f179518t;
        Object background = badge != null ? badge.getBackground() : null;
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
        if (badge == null) {
            return;
        }
        badge.setBackground(gradientDrawable);
    }

    public final void setBadgeText(@k String text) {
        Badge badge = this.f179518t;
        if (badge != null) {
            badge.setTitleText(text);
        }
        if (badge != null) {
            D6.G(badge, true);
        }
    }

    public final void setBadgeTextColor(@InterfaceC42156l int color) {
        Badge badge = this.f179518t;
        if (badge != null) {
            badge.setTextColor(color);
        }
    }

    public final void setCheckboxEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Checkbox checkbox = this.f179516r;
        if (checkbox == null) {
            return;
        }
        checkbox.setEnabled(enabled);
    }

    public final void setCheckboxState(@k int[] state) {
        Checkbox checkbox = this.f179516r;
        if (checkbox != null) {
            checkbox.setState(state);
        }
    }

    public final void setCheckboxStyle(int styleRes) {
        Checkbox checkbox = this.f179516r;
        if (checkbox != null) {
            checkbox.setAppearance(styleRes);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        Checkbox checkbox = this.f179516r;
        if (checkbox == null) {
            return;
        }
        checkbox.setChecked(checked);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ImageView imageView = this.f179515q;
        if (imageView != null) {
            imageView.setEnabled(enabled);
        }
        Checkbox checkbox = this.f179516r;
        if (checkbox == null) {
            return;
        }
        checkbox.setEnabled(enabled);
    }

    public final void setImageClickedListener(@l View.OnClickListener listener) {
        ImageView imageView = this.f179515q;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setImageColor(@InterfaceC42156l int color) {
        setImageColor(ColorStateList.valueOf(color));
    }

    public final void setImageDrawable(@l Drawable drawable) {
        ImageView imageView = this.f179515q;
        if (imageView != null) {
            C35821j2.a(imageView, drawable);
        }
        b();
        c();
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

    @Override // android.widget.Checkable
    public final void toggle() {
        Checkbox checkbox = this.f179516r;
        if (checkbox != null) {
            checkbox.toggle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setStyle(lV.C43687c r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.ListItemCheckbox.setStyle(lV.c):void");
    }

    public final void setImageColor(@l ColorStateList color) {
        ImageView imageView = this.f179515q;
        if (imageView == null) {
            return;
        }
        imageView.setImageTintList(color);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101  */
    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k kV.b r18) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.ListItemCheckbox.setState(kV.b):void");
    }

    /* compiled from: ListItemCheckbox.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemCheckbox$a;", "Lgw/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC40743a {

        /* renamed from: b, reason: collision with root package name */
        @l
        public Drawable f179525b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public ImageView f179526c;

        public a() {
            State.a aVar = State.f135879c;
        }

        @Override // gw.InterfaceC40743a
        @l
        public final Drawable getImage() {
            return this.f179525b;
        }

        @Override // gw.InterfaceC40743a
        @l
        public final View getImageContainerView() {
            return this.f179526c;
        }

        @Override // gw.InterfaceC40743a
        public final void setImage(@l Drawable drawable) {
            this.f179525b = drawable;
            ImageView imageView = this.f179526c;
            if (imageView == null) {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                D6.G(imageView, this.f179525b != null);
            }
        }

        @Override // gw.InterfaceC40743a
        public final void setState(@k State state) {
        }
    }

    @Override // com.avito.android.lib.design.list_item.BaseListItem, LV.d
    public void setStyle(@k InterfaceC43686b newStyle) {
        if (newStyle instanceof C43687c) {
            setStyle((C43687c) newStyle);
        }
    }
}
