package wK0;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StatefulShapeDrawable.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LwK0/e;", "Landroid/graphics/drawable/ShapeDrawable;", "<init>", "()V", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wK0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49530e extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f441390a;

    /* renamed from: b, reason: collision with root package name */
    public int f441391b;

    /* compiled from: StatefulShapeDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwK0/e$a;", "Landroid/graphics/drawable/Drawable$ConstantState;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wK0.e$a */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Drawable.ConstantState f441392a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Shape f441393b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public ColorStateList f441394c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final int[] f441395d;

        /* renamed from: e, reason: collision with root package name */
        public int f441396e;

        /* renamed from: f, reason: collision with root package name */
        public int f441397f;

        /* renamed from: g, reason: collision with root package name */
        public int f441398g;

        /* renamed from: h, reason: collision with root package name */
        public int f441399h;

        /* renamed from: i, reason: collision with root package name */
        public int f441400i;

        /* renamed from: j, reason: collision with root package name */
        public int f441401j;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            Drawable.ConstantState constantState = this.f441392a;
            if (constantState != null) {
                return constantState.canApplyTheme();
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f441392a;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @k
        public final Drawable newDrawable() {
            return new C49530e(new a(this), null);
        }

        public a(@l a aVar) {
            this.f441396e = -1;
            this.f441397f = -1;
            this.f441393b = aVar != null ? aVar.f441393b : null;
            this.f441394c = aVar != null ? aVar.f441394c : null;
            this.f441395d = aVar != null ? aVar.f441395d : null;
            this.f441396e = aVar != null ? aVar.f441396e : -1;
            this.f441397f = aVar != null ? aVar.f441397f : -1;
            this.f441398g = aVar != null ? aVar.f441398g : 0;
            this.f441399h = aVar != null ? aVar.f441399h : 0;
            this.f441400i = aVar != null ? aVar.f441400i : 0;
            this.f441401j = aVar != null ? aVar.f441401j : 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @k
        public final Drawable newDrawable(@l Resources resources) {
            return new C49530e(new a(this), null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @k
        public final Drawable newDrawable(@l Resources resources, @l Resources.Theme theme) {
            return new C49530e(new a(this), null);
        }

        public /* synthetic */ a(a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar);
        }
    }

    public /* synthetic */ C49530e(a aVar, C42822w c42822w) {
        this(aVar);
    }

    public final boolean a() {
        ArrayList arrayListH0 = C42756l.h0(getState());
        a aVar = this.f441390a;
        int[] iArr = aVar.f441395d;
        if (iArr != null) {
            for (int i12 : iArr) {
                arrayListH0.remove(Integer.valueOf(i12));
            }
        }
        ColorStateList colorStateList = aVar.f441394c;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(C42745f0.L0(arrayListH0), 0) : 0;
        if (this.f441391b == colorForState) {
            return false;
        }
        this.f441391b = colorForState;
        getPaint().setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    @k
    public final Drawable.ConstantState getConstantState() {
        return this.f441390a;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f441390a.f441394c != null;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(@k int[] iArr) {
        return super.onStateChange(iArr) || a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i12, int i13, int i14, int i15) {
        a aVar = this.f441390a;
        super.setBounds(i12 + aVar.f441398g, i13 + aVar.f441399h, i14 - aVar.f441400i, i15 - aVar.f441401j);
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public final void setIntrinsicHeight(int i12) {
        super.setIntrinsicHeight(i12);
        this.f441390a.f441397f = i12;
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public final void setIntrinsicWidth(int i12) {
        super.setIntrinsicWidth(i12);
        this.f441390a.f441396e = i12;
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public final void setPadding(@l Rect rect) {
        if (rect == null) {
            return;
        }
        int i12 = rect.left;
        int i13 = rect.top;
        int i14 = rect.right;
        int i15 = rect.bottom;
        a aVar = this.f441390a;
        aVar.f441398g = i12;
        aVar.f441399h = i13;
        aVar.f441400i = i14;
        aVar.f441401j = i15;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public final void setShape(@l Shape shape) {
        super.setShape(shape);
        this.f441390a.f441393b = shape;
    }

    public C49530e() {
        this((RectShape) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49530e(@l RectShape rectShape) {
        this(new a(null, 1, 0 == true ? 1 : 0));
        a aVar = this.f441390a;
        aVar.f441393b = rectShape;
        super.setShape(rectShape);
        super.setIntrinsicHeight(aVar.f441397f);
        super.setIntrinsicWidth(aVar.f441396e);
        a();
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public final void setPadding(int i12, int i13, int i14, int i15) {
        a aVar = this.f441390a;
        aVar.f441398g = i12;
        aVar.f441399h = i13;
        aVar.f441400i = i14;
        aVar.f441401j = i15;
        invalidateSelf();
    }

    public C49530e(a aVar) {
        this.f441390a = aVar;
        getPaint().setColor(this.f441391b);
        aVar.f441392a = super.getConstantState();
        super.setShape(aVar.f441393b);
        super.setIntrinsicHeight(aVar.f441397f);
        super.setIntrinsicWidth(aVar.f441396e);
        a();
    }
}
