package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.b1i;
import defpackage.e52;
import defpackage.eb4;
import defpackage.gb4;
import defpackage.q3c;
import defpackage.w42;
import defpackage.x08;
import defpackage.xxg;
import defpackage.zg4;
import defpackage.zof;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements q3c {
    public List a;
    public e52 b;
    public float c;
    public float d;
    public boolean o;
    public boolean s0;
    public int t0;
    public zof u0;
    public View v0;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = e52.g;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.o = true;
        this.s0 = true;
        w42 w42Var = new w42(context, 0);
        this.u0 = w42Var;
        this.v0 = w42Var;
        addView(w42Var);
        this.t0 = 1;
    }

    private List<gb4> getCuesWithStylingPreferencesApplied() {
        if (this.o && this.s0) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            eb4 eb4VarA = ((gb4) this.a.get(i)).a();
            if (!this.o) {
                eb4VarA.n = false;
                CharSequence charSequence = eb4VarA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        eb4VarA.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = eb4VarA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof x08)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                zg4.c(eb4VarA);
            } else if (!this.s0) {
                zg4.c(eb4VarA);
            }
            arrayList.add(eb4VarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (xxg.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private e52 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i = xxg.a;
        e52 e52Var = e52.g;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return e52Var;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            return new e52(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new e52(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & zof> void setView(T t) {
        removeView(this.v0);
        View view = this.v0;
        if (view instanceof b1i) {
            ((b1i) view).b.destroy();
        }
        this.v0 = t;
        this.u0 = t;
        addView(t);
    }

    public final void a() {
        this.u0.a(getCuesWithStylingPreferencesApplied(), this.b, this.c, this.d);
    }

    @Override // defpackage.q3c
    public final void n(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.s0 = z;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.o = z;
        a();
    }

    public void setBottomPaddingFraction(float f) {
        this.d = f;
        a();
    }

    public void setCues(List<gb4> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        a();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        a();
    }

    public void setStyle(e52 e52Var) {
        this.b = e52Var;
        a();
    }

    public void setViewType(int i) {
        if (this.t0 == i) {
            return;
        }
        if (i == 1) {
            setView(new w42(getContext(), 0));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new b1i(getContext()));
        }
        this.t0 = i;
    }
}
