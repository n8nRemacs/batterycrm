package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.at;
import defpackage.bab;
import defpackage.cx0;
import defpackage.dga;
import defpackage.dqi;
import defpackage.ec4;
import defpackage.h9b;
import defpackage.i9b;
import defpackage.ipi;
import defpackage.jza;
import defpackage.k9b;
import defpackage.kti;
import defpackage.kwi;
import defpackage.l3b;
import defpackage.lee;
import defpackage.m9b;
import defpackage.nk;
import defpackage.nz5;
import defpackage.p1b;
import defpackage.u6g;
import defpackage.u74;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vw4;
import defpackage.y8b;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.z8b;
import defpackage.zud;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010R+\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeTitleSubtitleButton;", "Landroid/widget/FrameLayout;", "Lu6g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/widget/TextView;", "Lqqg;", "setupTextViewParams", "(Landroid/widget/TextView;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "", "<set-?>", "x0", "Ldbd;", "isProgressEnabled", "()Z", "setProgressEnabled", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneMeTitleSubtitleButton extends FrameLayout implements u6g {
    public static final /* synthetic */ yy7[] y0;
    public SpannableString a;
    public SpannableString b;
    public final TextAppearanceSpan c;
    public final ec4 d;
    public final TextAppearanceSpan o;
    public final jza s0;
    public final ShapeDrawable t0;
    public final RippleDrawable u0;
    public final Object v0;
    public final Object w0;
    public final nk x0;

    static {
        z8a z8aVar = new z8a(OneMeTitleSubtitleButton.class, "isProgressEnabled", "isProgressEnabled()Z");
        vid.a.getClass();
        y0 = new yy7[]{z8aVar};
    }

    public OneMeTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new TextAppearanceSpan(context, bab.b);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.d = new ec4();
        this.o = new TextAppearanceSpan(context, bab.a);
        jza jzaVar = jza.c;
        this.s0 = jzaVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.t0 = shapeDrawable;
        v1a v1aVar = a93.s0;
        this.u0 = new RippleDrawable(ColorStateList.valueOf(v1aVar.y(this).c().a.a.e), shapeDrawable, new ColorDrawable(-65536));
        this.v0 = ipi.b(3, new p1b(context, 15));
        this.w0 = ipi.b(3, new l3b(context, 4, this));
        this.x0 = new nk(this);
        setMinimumHeight(kwi.b(jzaVar));
        setOutlineProvider(new u74(kwi.a(jzaVar)));
        float f = 20;
        float f2 = 4;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        onThemeChanged(v1aVar.y(this));
    }

    public static final void a(OneMeTitleSubtitleButton oneMeTitleSubtitleButton, boolean z) {
        int i = zud.a;
        nz5 nz5Var = new nz5(lee.g(new at(8, oneMeTitleSubtitleButton), new dga(18)));
        while (nz5Var.hasNext()) {
            ((View) nz5Var.next()).setVisibility(z ? 0 : 8);
        }
    }

    private final void setupTextViewParams(TextView textView) {
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(2);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setGravity(17);
        textView.setTextAlignment(4);
        textView.setLineSpacing(kti.d(2 * vw4.d().getDisplayMetrics().density), 1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void b(CharSequence charSequence, CharSequence charSequence2) throws IOException {
        SpannableString spannableStringValueOf;
        SpannableString spannableStringValueOf2;
        ?? r0 = this.v0;
        TextView textView = (TextView) r0.getValue();
        textView.setId(zud.k);
        setupTextViewParams(textView);
        dqi.a(this, textView, -1);
        SpannableString spannableString = null;
        if (charSequence != this.a) {
            if (charSequence == null || (spannableStringValueOf2 = SpannableString.valueOf(charSequence)) == null) {
                spannableStringValueOf2 = null;
            } else {
                spannableStringValueOf2.setSpan(this.c, 0, charSequence.length(), 17);
                spannableStringValueOf2.setSpan(this.d, 0, charSequence.length(), 17);
            }
            this.a = spannableStringValueOf2;
        }
        if (charSequence2 != this.b) {
            if (charSequence2 != null && (spannableStringValueOf = SpannableString.valueOf(charSequence2)) != null) {
                spannableStringValueOf.setSpan(this.o, 0, charSequence2.length(), 17);
                spannableString = spannableStringValueOf;
            }
            this.b = spannableString;
        }
        TextView textView2 = (TextView) r0.getValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence3 = this.a;
        if (charSequence3 == null) {
            charSequence3 = "";
        }
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(charSequence3);
        SpannableString spannableString2 = this.b;
        if (spannableString2 != null) {
            spannableStringBuilderAppend.append('\n');
            spannableStringBuilderAppend.append((CharSequence) spannableString2);
        }
        textView2.setText(spannableStringBuilderAppend);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void c() {
        k9b k9bVar;
        ?? r0 = this.w0;
        if (r0.e()) {
            m9b m9bVar = (m9b) r0.getValue();
            m9bVar.setAppearance(a93.s0.x(m9bVar.getContext()).l() ? y8b.a : z8b.a);
            int i = cx0.$EnumSwitchMapping$0[this.s0.ordinal()];
            if (i == 1) {
                k9bVar = i9b.a;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                k9bVar = h9b.a;
            }
            m9bVar.setSize(k9bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i;
        TextView textView = (TextView) this.v0.getValue();
        v1a v1aVar = a93.s0;
        if (v1aVar.x(getContext()).l()) {
            i = v1aVar.y(this).getText().a;
        } else {
            v1aVar.y(this).getText();
            i = -1;
        }
        textView.setTextColor(i);
        this.t0.getPaint().setColor(v1aVar.x(getContext()).l() ? v1aVar.y(this).b().a.g : v1aVar.y(this).b().a.n);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(v1aVar.y(this).c().a.a.h);
        RippleDrawable rippleDrawable = this.u0;
        rippleDrawable.setColor(colorStateListValueOf);
        setBackground(rippleDrawable);
        c();
        invalidate();
    }

    public final void setProgressEnabled(boolean z) {
        this.x0.O(this, y0[0], Boolean.valueOf(z));
    }

    public final void setSubtitle(CharSequence subtitle) throws IOException {
        b(this.a, subtitle);
    }

    public final void setTitle(CharSequence title) throws IOException {
        b(title, this.b);
    }
}
