package com.avito.android.lib.design.content_placeholder;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.button.b;
import com.avito.android.lib.design.content_placeholder.a;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: ContentPlaceholder.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Landroid/widget/FrameLayout;", "LpK0/a;", "LLV/a;", "LWU/a;", "Lcom/avito/android/lib/design/content_placeholder/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/content_placeholder/a;)V", "newState", "setState", "(LWU/a;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "res", "setImageResource", "(Ljava/lang/Integer;)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "setButtonTitle", "Landroid/view/View$OnClickListener;", "listener", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ContentPlaceholder extends FrameLayout implements InterfaceC46971a, LV.a<WU.a, a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public WU.a f178888b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f178889c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f178890d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f178891e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f178892f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f178893g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f178894h;

    @j
    public ContentPlaceholder(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178986p);
        a.C5264a c5264a = a.f178895n;
        Context context = getContext();
        c5264a.getClass();
        setStyle(a.C5264a.b(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setButtonOnClickListener(@l View.OnClickListener listener) {
        this.f178894h.setOnClickListener(listener);
    }

    public final void setButtonTitle(@l CharSequence text) {
        b.a(this.f178894h, text, false);
    }

    public final void setImageDrawable(@l Drawable drawable) {
        ImageView imageView = this.f178891e;
        imageView.setImageDrawable(drawable);
        D6.G(imageView, drawable != null);
    }

    public final void setImageResource(@InterfaceC42165v @l Integer res) {
        Drawable drawable;
        if (res != null) {
            drawable = androidx.core.content.d.getDrawable(getContext(), res.intValue());
        } else {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public final void setSubtitle(@l CharSequence text) {
        I5.a(this.f178893g, text, false);
    }

    public final void setTitle(@l CharSequence text) {
        I5.a(this.f178892f, text, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ContentPlaceholder(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.contentPlaceholder : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_ContentPlaceholder : i13;
        super(context, attributeSet, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.design_content_placeholder_layout, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.placeholder_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f178890d = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.placeholder_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f178891e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.placeholder_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f178892f = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.placeholder_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f178893g = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.placeholder_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f178894h = (Button) viewFindViewById5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178986p, i12, i13);
        a.C5264a c5264a = a.f178895n;
        Context context2 = getContext();
        c5264a.getClass();
        setStyle(a.C5264a.b(typedArrayObtainStyledAttributes, context2));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k WU.a newState) {
        WU.a aVar = this.f178888b;
        if (new c(newState, aVar).f181333c) {
            return;
        }
        this.f178888b = newState;
        Integer num = aVar != null ? aVar.f17925a : null;
        Integer num2 = newState.f17925a;
        if (!new c(num2, num).f181333c) {
            setImageResource(num2);
        }
        PrintableText printableText = aVar != null ? aVar.f17926b : null;
        PrintableText printableText2 = newState.f17926b;
        if (!new c(printableText2, printableText).f181333c) {
            PrintableText printableText3 = printableText2;
            setTitle(printableText3 != null ? printableText3.k0(getContext()) : null);
        }
        PrintableText printableText4 = aVar != null ? aVar.f17927c : null;
        PrintableText printableText5 = newState.f17927c;
        if (!new c(printableText5, printableText4).f181333c) {
            PrintableText printableText6 = printableText5;
            setSubtitle(printableText6 != null ? printableText6.k0(getContext()) : null);
        }
        PrintableText printableText7 = aVar != null ? aVar.f17928d : null;
        PrintableText printableText8 = newState.f17928d;
        if (!new c(printableText8, printableText7).f181333c) {
            PrintableText printableText9 = printableText8;
            setButtonTitle(printableText9 != null ? printableText9.k0(getContext()) : null);
        }
        View.OnClickListener onClickListener = aVar != null ? aVar.f17929e : null;
        View.OnClickListener onClickListener2 = newState.f17929e;
        if (new c(onClickListener2, onClickListener).f181333c) {
            return;
        }
        setButtonOnClickListener(onClickListener2);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.content_placeholder.a r11) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.content_placeholder.ContentPlaceholder.setStyle(com.avito.android.lib.design.content_placeholder.a):void");
    }
}
