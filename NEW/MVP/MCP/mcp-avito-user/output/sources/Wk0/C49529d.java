package wK0;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StatefulGradientDrawable.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LwK0/d;", "Landroid/graphics/drawable/GradientDrawable;", "<init>", "()V", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wK0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49529d extends GradientDrawable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f441378a;

    /* renamed from: b, reason: collision with root package name */
    public int f441379b;

    /* renamed from: c, reason: collision with root package name */
    public int f441380c;

    /* renamed from: d, reason: collision with root package name */
    public int f441381d;

    /* compiled from: StatefulGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwK0/d$a;", "Landroid/graphics/drawable/Drawable$ConstantState;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wK0.d$a */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Drawable.ConstantState f441382a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public ColorStateList f441383b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public int[] f441384c;

        /* renamed from: d, reason: collision with root package name */
        public int f441385d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public ColorStateList f441386e;

        /* renamed from: f, reason: collision with root package name */
        public float f441387f;

        /* renamed from: g, reason: collision with root package name */
        public int f441388g;

        /* renamed from: h, reason: collision with root package name */
        public int f441389h;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            Drawable.ConstantState constantState = this.f441382a;
            if (constantState != null) {
                return constantState.canApplyTheme();
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f441382a;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @k
        public final Drawable newDrawable() {
            return new C49529d(new a(this), null);
        }

        public a(@l a aVar) {
            this.f441388g = -1;
            this.f441389h = -1;
            this.f441383b = aVar != null ? aVar.f441383b : null;
            this.f441385d = aVar != null ? aVar.f441385d : 0;
            this.f441386e = aVar != null ? aVar.f441386e : null;
            this.f441384c = aVar != null ? aVar.f441384c : null;
            this.f441387f = aVar != null ? aVar.f441387f : 0.0f;
            this.f441388g = aVar != null ? aVar.f441388g : -1;
            this.f441389h = aVar != null ? aVar.f441389h : -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @k
        public final Drawable newDrawable(@l Resources resources) {
            return new C49529d(new a(this), null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @k
        public final Drawable newDrawable(@l Resources resources, @l Resources.Theme theme) {
            return new C49529d(new a(this), null);
        }

        public /* synthetic */ a(a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar);
        }
    }

    public /* synthetic */ C49529d(a aVar, C42822w c42822w) {
        this(aVar);
    }

    public final boolean a() {
        ArrayList arrayListH0 = C42756l.h0(getState());
        a aVar = this.f441378a;
        int[] iArr = aVar.f441384c;
        if (iArr != null) {
            for (int i12 : iArr) {
                arrayListH0.remove(Integer.valueOf(i12));
            }
        }
        ColorStateList colorStateList = aVar.f441383b;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(C42745f0.L0(arrayListH0), 0) : 0;
        if (this.f441379b == colorForState) {
            return false;
        }
        this.f441379b = colorForState;
        setColor(colorForState);
        return true;
    }

    public final boolean b() {
        ArrayList arrayListH0 = C42756l.h0(getState());
        a aVar = this.f441378a;
        int[] iArr = aVar.f441384c;
        if (iArr != null) {
            for (int i12 : iArr) {
                arrayListH0.remove(Integer.valueOf(i12));
            }
        }
        ColorStateList colorStateList = aVar.f441386e;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(C42745f0.L0(arrayListH0), 0) : 0;
        if (this.f441380c == colorForState && this.f441381d == aVar.f441385d) {
            return false;
        }
        this.f441380c = colorForState;
        int i13 = aVar.f441385d;
        this.f441381d = i13;
        setStroke(i13, colorForState);
        return true;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    @k
    public final Drawable.ConstantState getConstantState() {
        return this.f441378a;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f441378a.f441383b != null;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(@k int[] iArr) {
        return super.onStateChange(iArr) || a() || b();
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setCornerRadius(float f12) {
        super.setCornerRadius(f12);
        this.f441378a.f441387f = f12;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public final void setSize(int i12, int i13) {
        super.setSize(i12, i13);
        a aVar = this.f441378a;
        aVar.f441388g = i12;
        aVar.f441389h = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49529d() {
        this(new a(null, 1, 0 == true ? 1 : 0));
    }

    public C49529d(a aVar) {
        this.f441378a = aVar;
        setColor(this.f441379b);
        setStroke(this.f441381d, this.f441380c);
        aVar.f441382a = super.getConstantState();
        b();
        a();
        setCornerRadius(aVar.f441387f);
        setSize(aVar.f441388g, aVar.f441389h);
    }
}
