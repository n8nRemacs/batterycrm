package xM0;

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
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.verification.a;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;
import xM0.C49863c;

/* compiled from: VerificationContentPlaceholder.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b$\u0010#¨\u0006%"}, d2 = {"LxM0/a;", "Landroid/widget/FrameLayout;", "LpK0/a;", "LLV/a;", "LxM0/b;", "LxM0/c;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "newStyle", "setStyle", "(LxM0/c;)V", "newState", "setState", "(LxM0/b;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "res", "setImageResource", "(Ljava/lang/Integer;)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "setErrorCodeMessage", "setFirstButtonTitle", "setSecondButtonTitle", "Landroid/view/View$OnClickListener;", "listener", "setFirstButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "setSecondButtonOnClickListener", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xM0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49861a extends FrameLayout implements InterfaceC46971a, LV.a<C49862b, C49863c> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public C49862b f442408b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C49863c f442409c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f442410d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f442411e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f442412f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f442413g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f442414h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f442415i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Button f442416j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C49861a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.verificationContentPlaceholder : i12;
        i13 = (i14 & 8) != 0 ? R.style.VerificationContentPlaceholder : i13;
        super(context, attributeSet, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.verification_content_placeholder, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.placeholder_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f442410d = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.placeholder_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f442411e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.placeholder_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f442412f = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.placeholder_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f442413g = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.placeholder_error_code_message);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f442414h = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.placeholder_first_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f442415i = (Button) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.placeholder_second_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f442416j = (Button) viewFindViewById7;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f323379a, i12, i13);
        C49863c.a aVar = C49863c.f442425r;
        Context context2 = getContext();
        aVar.getClass();
        setStyle(C49863c.a.b(typedArrayObtainStyledAttributes, context2));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, a.j.f323379a);
        C49863c.a aVar = C49863c.f442425r;
        Context context = getContext();
        aVar.getClass();
        setStyle(C49863c.a.b(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setErrorCodeMessage(@l CharSequence text) {
        I5.a(this.f442414h, text, false);
    }

    public final void setFirstButtonOnClickListener(@l View.OnClickListener listener) {
        this.f442415i.setOnClickListener(listener);
    }

    public final void setFirstButtonTitle(@l CharSequence text) {
        com.avito.android.lib.design.button.b.a(this.f442415i, text, false);
    }

    public final void setImageDrawable(@l Drawable drawable) {
        ImageView imageView = this.f442411e;
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

    public final void setSecondButtonOnClickListener(@l View.OnClickListener listener) {
        this.f442416j.setOnClickListener(listener);
    }

    public final void setSecondButtonTitle(@l CharSequence text) {
        com.avito.android.lib.design.button.b.a(this.f442416j, text, false);
    }

    public final void setSubtitle(@l CharSequence text) {
        I5.a(this.f442413g, text, false);
    }

    public final void setTitle(@l CharSequence text) {
        I5.a(this.f442412f, text, false);
    }

    @Override // LV.b
    public void setState(@k C49862b newState) {
        C49862b c49862b = this.f442408b;
        if (new com.avito.android.lib.util.c(newState, c49862b).f181333c) {
            return;
        }
        this.f442408b = newState;
        Integer num = c49862b != null ? c49862b.f442417a : null;
        Integer num2 = newState.f442417a;
        if (!new com.avito.android.lib.util.c(num2, num).f181333c) {
            setImageResource(num2);
        }
        PrintableText printableText = c49862b != null ? c49862b.f442418b : null;
        PrintableText printableText2 = newState.f442418b;
        if (!new com.avito.android.lib.util.c(printableText2, printableText).f181333c) {
            PrintableText printableText3 = printableText2;
            setTitle(printableText3 != null ? printableText3.k0(getContext()) : null);
        }
        PrintableText printableText4 = c49862b != null ? c49862b.f442419c : null;
        PrintableText printableText5 = newState.f442419c;
        if (!new com.avito.android.lib.util.c(printableText5, printableText4).f181333c) {
            PrintableText printableText6 = printableText5;
            setSubtitle(printableText6 != null ? printableText6.k0(getContext()) : null);
        }
        PrintableText printableText7 = c49862b != null ? c49862b.f442420d : null;
        PrintableText printableText8 = newState.f442420d;
        if (!new com.avito.android.lib.util.c(printableText8, printableText7).f181333c) {
            PrintableText printableText9 = printableText8;
            setErrorCodeMessage(printableText9 != null ? printableText9.k0(getContext()) : null);
        }
        PrintableText printableText10 = c49862b != null ? c49862b.f442421e : null;
        PrintableText printableText11 = newState.f442421e;
        if (!new com.avito.android.lib.util.c(printableText11, printableText10).f181333c) {
            PrintableText printableText12 = printableText11;
            setFirstButtonTitle(printableText12 != null ? printableText12.k0(getContext()) : null);
        }
        View.OnClickListener onClickListener = c49862b != null ? c49862b.f442423g : null;
        View.OnClickListener onClickListener2 = newState.f442423g;
        if (!new com.avito.android.lib.util.c(onClickListener2, onClickListener).f181333c) {
            setFirstButtonOnClickListener(onClickListener2);
        }
        PrintableText printableText13 = c49862b != null ? c49862b.f442422f : null;
        PrintableText printableText14 = newState.f442422f;
        if (!new com.avito.android.lib.util.c(printableText14, printableText13).f181333c) {
            PrintableText printableText15 = printableText14;
            setSecondButtonTitle(printableText15 != null ? printableText15.k0(getContext()) : null);
        }
        View.OnClickListener onClickListener3 = c49862b != null ? c49862b.f442424h : null;
        View.OnClickListener onClickListener4 = newState.f442424h;
        if (new com.avito.android.lib.util.c(onClickListener4, onClickListener3).f181333c) {
            return;
        }
        setSecondButtonOnClickListener(onClickListener4);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k xM0.C49863c r11) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xM0.C49861a.setStyle(xM0.c):void");
    }
}
