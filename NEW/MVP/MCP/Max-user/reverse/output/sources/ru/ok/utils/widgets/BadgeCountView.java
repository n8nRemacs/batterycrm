package ru.ok.utils.widgets;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bq4;
import defpackage.bwf;
import defpackage.kc0;
import defpackage.m7g;
import defpackage.nca;
import defpackage.nk;
import defpackage.q1g;
import defpackage.u45;
import defpackage.vg0;
import defpackage.vid;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0007R/\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ok/utils/widgets/BadgeCountView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lm7g;", "", "backgroundColor", "Lqqg;", "setBackgroundColor", "(I)V", "", "u0", "Z", "getNeedPlusIndicator", "()Z", "setNeedPlusIndicator", "(Z)V", "needPlusIndicator", "v0", "getManageVisibility", "setManageVisibility", "manageVisibility", "<set-?>", "w0", "Ldbd;", "getCount", "()I", "setCount", "count", "Lvg0;", "x0", "getStyle", "()Lvg0;", "setStyle", "(Lvg0;)V", "style", "ui-utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BadgeCountView extends AppCompatTextView implements m7g {
    public static final /* synthetic */ yy7[] z0 = {new z8a(BadgeCountView.class, "count", "getCount()I"), u45.h(vid.a, BadgeCountView.class, "style", "getStyle()Lru/ok/utils/widgets/BadgeCountView$Style;")};

    /* renamed from: u0, reason: from kotlin metadata */
    public boolean needPlusIndicator;

    /* renamed from: v0, reason: from kotlin metadata */
    public boolean manageVisibility;
    public final kc0 w0;
    public final nk x0;
    public int y0;

    public BadgeCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setGravity(17);
        setIncludeFontPadding(false);
        setTextAlignment(4);
        setVisibility(8);
        b();
        this.manageVisibility = true;
        this.w0 = new kc0(this, context);
        this.x0 = new nk(1, this);
        this.y0 = -1;
    }

    private final vg0 getStyle() {
        yy7 yy7Var = z0[1];
        return (vg0) this.x0.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyle(vg0 vg0Var) {
        this.x0.O(this, z0[1], vg0Var);
    }

    @Override // defpackage.m7g
    public final void b() {
        q1g q1gVarD;
        if (isInEditMode()) {
            setTextColor(-1);
            setBackgroundColor(-16776961);
            setCount(20);
            this.needPlusIndicator = true;
            return;
        }
        if (isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context = getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context);
        }
        setTextColor(q1gVarD.F);
        setBackgroundColor(q1gVarD.H);
    }

    public final int getCount() {
        yy7 yy7Var = z0[0];
        return ((Number) this.w0.b).intValue();
    }

    public final boolean getManageVisibility() {
        return this.manageVisibility;
    }

    public final boolean getNeedPlusIndicator() {
        return this.needPlusIndicator;
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        this.y0 = backgroundColor;
        Drawable background = getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(backgroundColor);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(backgroundColor);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(backgroundColor);
        }
    }

    public final void setCount(int i) {
        this.w0.O(this, z0[0], Integer.valueOf(i));
    }

    public final void setManageVisibility(boolean z) {
        this.manageVisibility = z;
    }

    public final void setNeedPlusIndicator(boolean z) {
        this.needPlusIndicator = z;
    }
}
