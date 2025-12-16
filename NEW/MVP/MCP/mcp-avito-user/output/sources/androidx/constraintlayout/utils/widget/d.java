package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.C19961m;
import j.X;

/* compiled from: MotionButton.java */
/* loaded from: classes.dex */
public class d extends C19961m {

    /* renamed from: b, reason: collision with root package name */
    public float f44110b;

    /* renamed from: c, reason: collision with root package name */
    public float f44111c;

    /* compiled from: MotionButton.java */
    public class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* compiled from: MotionButton.java */
    public class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    public float getRound() {
        return this.f44111c;
    }

    public float getRoundPercent() {
        return this.f44110b;
    }

    @X
    public void setRound(float f12) {
        if (Float.isNaN(f12)) {
            this.f44111c = f12;
            float f13 = this.f44110b;
            this.f44110b = -1.0f;
            setRoundPercent(f13);
            return;
        }
        boolean z12 = this.f44111c != f12;
        this.f44111c = f12;
        if (f12 != 0.0f) {
            setClipToOutline(true);
            getWidth();
            getHeight();
            throw null;
        }
        setClipToOutline(false);
        if (z12) {
            invalidateOutline();
        }
    }

    @X
    public void setRoundPercent(float f12) {
        boolean z12 = this.f44110b != f12;
        this.f44110b = f12;
        if (f12 != 0.0f) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z12) {
            invalidateOutline();
        }
    }
}
