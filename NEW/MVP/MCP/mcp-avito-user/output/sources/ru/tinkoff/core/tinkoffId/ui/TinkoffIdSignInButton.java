package ru.tinkoff.core.tinkoffId.ui;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.d;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import m.C43852a;
import ru.tinkoff.core.tinkoffId.c;

/* compiled from: TinkoffIdSignInButton.kt */
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u000245R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00128\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\"8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00128BX\u0082\u0004¢\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010\u0016R(\u00100\u001a\u0004\u0018\u00010+2\b\u0010\u0003\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00103\u001a\u0004\u0018\u00010+2\b\u0010\u0003\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/¨\u00066"}, d2 = {"Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton;", "Landroid/view/ViewGroup;", "", "value", "b", "Z", "isCompact", "()Z", "setCompact", "(Z)V", "Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonStyle;", "c", "Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonStyle;", "getStyle", "()Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonStyle;", "setStyle", "(Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonStyle;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "d", "I", "getCornerRadius", "()I", "setCornerRadius", "(I)V", "cornerRadius", "Landroid/graphics/Typeface;", "e", "Landroid/graphics/Typeface;", "getTextFont", "()Landroid/graphics/Typeface;", "setTextFont", "(Landroid/graphics/Typeface;)V", "textFont", "Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonSize;", "f", "Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonSize;", "setSize", "(Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonSize;)V", "size", "p", "getSmallLogoBorder", "smallLogoBorder", "", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getBadgeText", "setBadgeText", "badgeText", "ButtonSize", "ButtonStyle", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TinkoffIdSignInButton extends ViewGroup {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isCompact;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public ButtonStyle style;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @U
    public int cornerRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public Typeface textFont;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public ButtonSize size;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f437057g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final StyleSpan f437058h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AppCompatTextView f437059i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final AppCompatImageView f437060j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final AppCompatTextView f437061k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final AppCompatImageView f437062l;

    /* renamed from: m, reason: collision with root package name */
    public final int f437063m;

    /* renamed from: n, reason: collision with root package name */
    public final int f437064n;

    /* renamed from: o, reason: collision with root package name */
    public final int f437065o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final int smallLogoBorder;

    /* renamed from: q, reason: collision with root package name */
    public int f437067q;

    /* renamed from: r, reason: collision with root package name */
    public int f437068r;

    /* renamed from: s, reason: collision with root package name */
    public int f437069s;

    /* renamed from: t, reason: collision with root package name */
    public int f437070t;

    /* renamed from: u, reason: collision with root package name */
    public int f437071u;

    /* compiled from: TinkoffIdSignInButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonSize;", "", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ButtonSize {
        SMALL(R.dimen.tinkoff_id_small_min_height, R.dimen.tinkoff_id_small_vertical_padding, R.dimen.tinkoff_id_small_horizontal_padding, R.dimen.tinkoff_id_title_small_font_size, R.dimen.tinkoff_id_title_small_logo_small_offset, R.dimen.tinkoff_id_small_logo_small_height, R.dimen.tinkoff_id_small_logo_small_width, R.dimen.tinkoff_id_small_logo_badge_small_offset, R.dimen.tinkoff_id_badge_small_font_size, R.dimen.tinkoff_id_badge_small_vertical_padding, R.dimen.tinkoff_id_badge_small_horizontal_padding),
        MEDIUM(R.dimen.tinkoff_id_medium_min_height, R.dimen.tinkoff_id_medium_vertical_padding, R.dimen.tinkoff_id_medium_horizontal_padding, R.dimen.tinkoff_id_title_medium_font_size, R.dimen.tinkoff_id_title_small_logo_medium_offset, R.dimen.tinkoff_id_small_logo_medium_height, R.dimen.tinkoff_id_small_logo_medium_width, R.dimen.tinkoff_id_small_logo_badge_medium_offset, R.dimen.tinkoff_id_badge_medium_font_size, R.dimen.tinkoff_id_badge_medium_vertical_padding, R.dimen.tinkoff_id_badge_medium_horizontal_padding),
        LARGE(R.dimen.tinkoff_id_large_min_height, R.dimen.tinkoff_id_large_vertical_padding, R.dimen.tinkoff_id_large_horizontal_padding, R.dimen.tinkoff_id_title_large_font_size, R.dimen.tinkoff_id_title_small_logo_large_offset, R.dimen.tinkoff_id_small_logo_large_height, R.dimen.tinkoff_id_small_logo_large_width, R.dimen.tinkoff_id_small_logo_badge_large_offset, R.dimen.tinkoff_id_badge_large_font_size, R.dimen.tinkoff_id_badge_large_vertical_padding, R.dimen.tinkoff_id_badge_large_horizontal_padding);


        /* renamed from: b, reason: collision with root package name */
        public final int f437076b;

        /* renamed from: c, reason: collision with root package name */
        public final int f437077c;

        /* renamed from: d, reason: collision with root package name */
        public final int f437078d;

        /* renamed from: e, reason: collision with root package name */
        public final int f437079e;

        /* renamed from: f, reason: collision with root package name */
        public final int f437080f;

        /* renamed from: g, reason: collision with root package name */
        public final int f437081g;

        /* renamed from: h, reason: collision with root package name */
        public final int f437082h;

        /* renamed from: i, reason: collision with root package name */
        public final int f437083i;

        /* renamed from: j, reason: collision with root package name */
        public final int f437084j;

        /* renamed from: k, reason: collision with root package name */
        public final int f437085k;

        ButtonSize(@InterfaceC42161q int i12, @InterfaceC42161q int i13, @InterfaceC42161q int i14, @InterfaceC42161q int i15, @InterfaceC42161q int i16, @InterfaceC42161q int i17, @InterfaceC42161q int i18, @InterfaceC42161q int i19, @InterfaceC42161q int i22, @InterfaceC42161q int i23, @InterfaceC42161q int i24) {
            this.f437076b = i13;
            this.f437077c = i14;
            this.f437078d = i15;
            this.f437079e = i16;
            this.f437080f = i17;
            this.f437081g = i18;
            this.f437082h = i19;
            this.f437083i = i22;
            this.f437084j = i23;
            this.f437085k = i24;
        }
    }

    /* compiled from: TinkoffIdSignInButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/ui/TinkoffIdSignInButton$ButtonStyle;", "", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ButtonStyle {
        YELLOW(R.color.tinkoff_id_button_yellow_style, R.color.tinkoff_id_button_pressed_yellow_style, R.drawable.tinkoff_id_compact_background_yellow_style, R.drawable.tinkoff_id_badge_background_yellow_style, R.drawable.tinkoff_id_tinkoff_small_logo, R.color.tinkoff_id_text_yellow_style),
        /* JADX INFO: Fake field, exist only in values array */
        GRAY(R.color.tinkoff_id_button_gray_style, R.color.tinkoff_id_button_pressed_gray_style, R.drawable.tinkoff_id_compact_background_gray_style, R.drawable.tinkoff_id_badge_background_gray_style, R.drawable.tinkoff_id_tinkoff_small_logo, R.color.tinkoff_id_text_gray_style),
        BLACK(R.color.tinkoff_id_button_black_style, R.color.tinkoff_id_button_pressed_black_style, R.drawable.tinkoff_id_compact_background_black_style, R.drawable.tinkoff_id_badge_background_black_style, R.drawable.tinkoff_id_tinkoff_small_logo_border, R.color.tinkoff_id_text_black_style);


        /* renamed from: b, reason: collision with root package name */
        public final int f437089b;

        /* renamed from: c, reason: collision with root package name */
        public final int f437090c;

        /* renamed from: d, reason: collision with root package name */
        public final int f437091d;

        /* renamed from: e, reason: collision with root package name */
        public final int f437092e;

        /* renamed from: f, reason: collision with root package name */
        public final int f437093f;

        /* renamed from: g, reason: collision with root package name */
        public final int f437094g;

        ButtonStyle(@InterfaceC42158n int i12, @InterfaceC42158n int i13, @InterfaceC42165v int i14, @InterfaceC42165v int i15, @InterfaceC42165v int i16, @InterfaceC42158n int i17) {
            this.f437089b = i12;
            this.f437090c = i13;
            this.f437091d = i14;
            this.f437092e = i15;
            this.f437093f = i16;
            this.f437094g = i17;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TinkoffIdSignInButton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        this.style = ButtonStyle.YELLOW;
        this.cornerRadius = a(R.dimen.tinkoff_id_default_corner_radius);
        this.textFont = i.c(R.font.neue_haas_unica_w1g, getContext());
        this.size = ButtonSize.LARGE;
        this.f437057g = context.getString(R.string.tinkoff_id_tinkoff_text);
        this.f437058h = new StyleSpan(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setGravity(17);
        this.f437059i = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f437060j = appCompatImageView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setGravity(17);
        this.f437061k = appCompatTextView2;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        appCompatImageView2.setImageDrawable(C43852a.a(getContext(), R.drawable.tinkoff_id_tinkoff_logo));
        this.f437062l = appCompatImageView2;
        this.f437063m = a(R.dimen.tinkoff_id_small_min_height);
        this.f437064n = a(R.dimen.tinkoff_id_compact_vertical_padding);
        this.f437065o = a(R.dimen.tinkoff_id_compact_horizontal_padding);
        this.smallLogoBorder = a(R.dimen.tinkoff_id_small_logo_border);
        addView(appCompatTextView);
        addView(appCompatImageView);
        addView(appCompatTextView2);
        addView(appCompatImageView2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.q.f437026a, i12, i13);
        setCompact(typedArrayObtainStyledAttributes.getBoolean(1, false));
        setStyle(ButtonStyle.values()[typedArrayObtainStyledAttributes.getInt(4, 0)]);
        setCornerRadius(b.b(typedArrayObtainStyledAttributes.getDimension(2, a(R.dimen.tinkoff_id_default_corner_radius))));
        setTextFont(i.c(typedArrayObtainStyledAttributes.getResourceId(3, R.font.neue_haas_unica_w1g), getContext()));
        if (!this.isCompact) {
            setBadgeText(typedArrayObtainStyledAttributes.getString(0));
            setTitle(typedArrayObtainStyledAttributes.getString(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        e();
    }

    public static final void c(int i12, int i13, int i14, View view) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i15 = (((i13 - i12) - measuredHeight) / 2) + i12;
        view.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    private final int getSmallLogoBorder() {
        if (this.isCompact || this.style != ButtonStyle.BLACK) {
            return 0;
        }
        return this.smallLogoBorder;
    }

    private final void setSize(ButtonSize buttonSize) {
        this.size = buttonSize;
        this.f437067q = a(buttonSize.f437076b);
        this.f437068r = a(this.size.f437077c);
        this.f437069s = a(this.size.f437079e);
        a(this.size.f437080f);
        this.f437070t = a(this.size.f437081g);
        this.f437071u = a(this.size.f437082h);
        int iA2 = a(this.size.f437084j);
        int iA3 = a(this.size.f437085k);
        AppCompatTextView appCompatTextView = this.f437061k;
        appCompatTextView.setPadding(iA3, iA2, iA3, iA2);
        this.f437059i.setTextSize(0, a(this.size.f437078d));
        appCompatTextView.setTextSize(0, a(this.size.f437083i));
    }

    public final int a(@InterfaceC42161q int i12) {
        return b.b(getContext().getResources().getDimension(i12));
    }

    public final boolean b() {
        CharSequence badgeText = getBadgeText();
        return !(badgeText == null || badgeText.length() == 0);
    }

    public final void d() {
        this.f437059i.setVisibility(!this.isCompact ? 0 : 8);
        this.f437060j.setVisibility(!this.isCompact ? 0 : 8);
        this.f437061k.setVisibility((this.isCompact || !b()) ? 8 : 0);
        this.f437062l.setVisibility(this.isCompact ? 0 : 8);
    }

    public final void e() {
        Drawable rippleDrawable;
        if (this.isCompact) {
            rippleDrawable = C43852a.a(getContext(), this.style.f437091d);
        } else {
            ColorStateList colorStateList = d.getColorStateList(getContext(), this.style.f437090c);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.cornerRadius);
            gradientDrawable.setColor(d.getColorStateList(getContext(), this.style.f437089b));
            rippleDrawable = new RippleDrawable(colorStateList, gradientDrawable, null);
        }
        setBackground(rippleDrawable);
        this.f437059i.setTextColor(d.getColorStateList(getContext(), this.style.f437094g));
        Drawable drawableA = C43852a.a(getContext(), this.style.f437092e);
        AppCompatTextView appCompatTextView = this.f437061k;
        appCompatTextView.setBackground(drawableA);
        appCompatTextView.setTextColor(d.getColorStateList(getContext(), this.style.f437094g));
        this.f437060j.setImageDrawable(C43852a.a(getContext(), this.style.f437093f));
    }

    @l
    public final CharSequence getBadgeText() {
        return this.f437061k.getText();
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    @k
    public final ButtonStyle getStyle() {
        return this.style;
    }

    @l
    public final Typeface getTextFont() {
        return this.textFont;
    }

    @l
    public final CharSequence getTitle() {
        return this.f437059i.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        int i18 = this.f437067q;
        int i19 = i17 - i18;
        if (this.isCompact) {
            AppCompatImageView appCompatImageView = this.f437062l;
            int i22 = this.f437065o;
            int i23 = this.f437064n;
            appCompatImageView.layout(i22, i23, i16 - i22, i17 - i23);
            return;
        }
        boolean zB2 = b();
        AppCompatImageView appCompatImageView2 = this.f437060j;
        AppCompatTextView appCompatTextView = this.f437059i;
        if (!zB2) {
            int measuredWidth = (((i16 - appCompatTextView.getMeasuredWidth()) - this.f437069s) - appCompatImageView2.getMeasuredWidth()) / 2;
            c(i18, i19, measuredWidth, appCompatTextView);
            c(i18, i19, appCompatTextView.getMeasuredWidth() + this.f437069s + measuredWidth, appCompatImageView2);
            return;
        }
        int measuredWidth2 = (((i16 - appCompatTextView.getMeasuredWidth()) - this.f437069s) - appCompatImageView2.getMeasuredWidth()) - this.f437071u;
        AppCompatTextView appCompatTextView2 = this.f437061k;
        int measuredWidth3 = (measuredWidth2 - appCompatTextView2.getMeasuredWidth()) / 2;
        c(i18, i19, measuredWidth3, appCompatTextView);
        int measuredWidth4 = appCompatTextView.getMeasuredWidth() + this.f437069s + measuredWidth3;
        c(i18, i19, measuredWidth4, appCompatImageView2);
        c(i18, i19, this.f437070t + this.f437071u + measuredWidth4, appCompatTextView2);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i13);
        int iResolveSize = this.f437063m;
        if (size >= iResolveSize) {
            iResolveSize = View.resolveSize(iResolveSize, i13);
        }
        setSize(iResolveSize < a(R.dimen.tinkoff_id_medium_min_height) ? ButtonSize.SMALL : iResolveSize < a(R.dimen.tinkoff_id_large_min_height) ? ButtonSize.MEDIUM : ButtonSize.LARGE);
        boolean z12 = this.isCompact;
        AppCompatTextView appCompatTextView = this.f437061k;
        AppCompatImageView appCompatImageView = this.f437060j;
        AppCompatTextView appCompatTextView2 = this.f437059i;
        if (!z12) {
            if (b()) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                appCompatTextView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                appCompatImageView.measure(View.MeasureSpec.makeMeasureSpec(this.f437070t + getSmallLogoBorder(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f437070t + getSmallLogoBorder(), 1073741824));
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                appCompatTextView.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
            } else {
                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                appCompatTextView2.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                appCompatImageView.measure(View.MeasureSpec.makeMeasureSpec(this.f437070t + getSmallLogoBorder(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f437070t + getSmallLogoBorder(), 1073741824));
            }
        }
        int measuredWidth = this.isCompact ? iResolveSize : b() ? appCompatTextView.getMeasuredWidth() + appCompatImageView.getMeasuredWidth() + appCompatTextView2.getMeasuredWidth() + this.f437068r + this.f437069s + this.f437071u + this.f437068r : this.f437068r + appCompatImageView.getMeasuredWidth() + appCompatTextView2.getMeasuredWidth() + this.f437068r + this.f437069s;
        if (!this.isCompact) {
            measuredWidth = View.resolveSize(measuredWidth, i12);
        }
        setMeasuredDimension(measuredWidth, iResolveSize);
    }

    public final void setBadgeText(@l CharSequence charSequence) {
        this.f437061k.setText(charSequence);
        d();
    }

    public final void setCompact(boolean z12) {
        this.isCompact = z12;
        d();
        e();
    }

    public final void setCornerRadius(int i12) {
        this.cornerRadius = i12;
        e();
    }

    public final void setStyle(@k ButtonStyle buttonStyle) {
        this.style = buttonStyle;
        e();
    }

    public final void setTextFont(@l Typeface typeface) {
        this.textFont = typeface;
        this.f437059i.setTypeface(typeface);
        this.f437061k.setTypeface(typeface);
    }

    public final void setTitle(@l CharSequence charSequence) {
        SpannableString spannableString;
        AppCompatTextView appCompatTextView = this.f437059i;
        StyleSpan styleSpan = this.f437058h;
        String str = this.f437057g;
        if (charSequence == null || charSequence.length() == 0) {
            spannableString = new SpannableString(str);
            spannableString.setSpan(styleSpan, 0, str.length(), 33);
        } else {
            String str2 = ((Object) charSequence) + " " + str;
            spannableString = new SpannableString(str2);
            spannableString.setSpan(styleSpan, charSequence.length() + 1, str2.length(), 33);
        }
        appCompatTextView.setText(spannableString);
        d();
    }
}
