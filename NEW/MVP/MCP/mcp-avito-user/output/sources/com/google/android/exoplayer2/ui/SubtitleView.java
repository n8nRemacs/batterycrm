package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public List<com.google.android.exoplayer2.text.a> f347423b;

    /* renamed from: c, reason: collision with root package name */
    public C36567e f347424c;

    /* renamed from: d, reason: collision with root package name */
    public float f347425d;

    /* renamed from: e, reason: collision with root package name */
    public float f347426e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f347427f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f347428g;

    /* renamed from: h, reason: collision with root package name */
    public int f347429h;

    /* renamed from: i, reason: collision with root package name */
    public a f347430i;

    /* renamed from: j, reason: collision with root package name */
    public View f347431j;

    public interface a {
        void a(List list, C36567e c36567e, float f12, float f13);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public SubtitleView(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f347423b = Collections.emptyList();
        this.f347424c = C36567e.f347455g;
        this.f347425d = 0.0533f;
        this.f347426e = 0.08f;
        this.f347427f = true;
        this.f347428g = true;
        C36566d c36566d = new C36566d(context);
        this.f347430i = c36566d;
        this.f347431j = c36566d;
        addView(c36566d);
        this.f347429h = 1;
    }

    private List<com.google.android.exoplayer2.text.a> getCuesWithStylingPreferencesApplied() {
        if (this.f347427f && this.f347428g) {
            return this.f347423b;
        }
        ArrayList arrayList = new ArrayList(this.f347423b.size());
        for (int i12 = 0; i12 < this.f347423b.size(); i12++) {
            com.google.android.exoplayer2.text.a aVar = this.f347423b.get(i12);
            aVar.getClass();
            a.c cVar = new a.c(aVar, null);
            if (!this.f347427f) {
                cVar.f346747n = false;
                CharSequence charSequence = cVar.f346734a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        cVar.f346734a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = cVar.f346734a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof com.google.android.exoplayer2.text.span.b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                B.a(cVar);
            } else if (!this.f347428g) {
                B.a(cVar);
            }
            arrayList.add(cVar.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (U.f348106a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C36567e getUserCaptionStyle() {
        CaptioningManager captioningManager;
        C36567e c36567e;
        int i12 = U.f348106a;
        C36567e c36567e2 = C36567e.f347455g;
        if (i12 < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c36567e2;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i12 >= 21) {
            c36567e = new C36567e(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        } else {
            c36567e = new C36567e(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return c36567e;
    }

    private <T extends View & a> void setView(T t12) {
        removeView(this.f347431j);
        View view = this.f347431j;
        if (view instanceof G) {
            ((G) view).f347385c.destroy();
        }
        this.f347431j = t12;
        this.f347430i = t12;
        addView(t12);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f347430i.a(getCuesWithStylingPreferencesApplied(), this.f347424c, this.f347425d, this.f347426e);
    }

    public void setApplyEmbeddedFontSizes(boolean z12) {
        this.f347428g = z12;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z12) {
        this.f347427f = z12;
        c();
    }

    public void setBottomPaddingFraction(float f12) {
        this.f347426e = f12;
        c();
    }

    public void setCues(@P List<com.google.android.exoplayer2.text.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f347423b = list;
        c();
    }

    public void setFractionalTextSize(float f12) {
        this.f347425d = f12;
        c();
    }

    public void setStyle(C36567e c36567e) {
        this.f347424c = c36567e;
        c();
    }

    public void setViewType(int i12) {
        if (this.f347429h == i12) {
            return;
        }
        if (i12 == 1) {
            setView(new C36566d(getContext()));
        } else {
            if (i12 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new G(getContext()));
        }
        this.f347429h = i12;
    }
}
