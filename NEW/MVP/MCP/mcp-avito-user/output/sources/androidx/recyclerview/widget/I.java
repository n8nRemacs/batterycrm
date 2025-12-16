package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* compiled from: OrientationHelper.java */
/* loaded from: classes10.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.m f53676a;

    /* renamed from: b, reason: collision with root package name */
    public int f53677b = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f53678c = new Rect();

    /* compiled from: OrientationHelper.java */
    public class a extends I {
        @Override // androidx.recyclerview.widget.I
        public final int d(View view) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            this.f53676a.getClass();
            return RecyclerView.m.m0(view) + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.I
        public final int e(View view) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            return this.f53676a.l0(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.I
        public final int f(View view) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            return this.f53676a.k0(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.I
        public final int g(View view) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            this.f53676a.getClass();
            return RecyclerView.m.j0(view) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin;
        }

        @Override // androidx.recyclerview.widget.I
        public final int h() {
            return this.f53676a.f53850p;
        }

        @Override // androidx.recyclerview.widget.I
        public final int i() {
            RecyclerView.m mVar = this.f53676a;
            return mVar.f53850p - mVar.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.I
        public final int j() {
            return this.f53676a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.I
        public final int k() {
            return this.f53676a.f53848n;
        }

        @Override // androidx.recyclerview.widget.I
        public final int l() {
            return this.f53676a.f53849o;
        }

        @Override // androidx.recyclerview.widget.I
        public final int m() {
            return this.f53676a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.I
        public final int n() {
            RecyclerView.m mVar = this.f53676a;
            return (mVar.f53850p - mVar.getPaddingLeft()) - mVar.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.I
        public final int p(View view) {
            RecyclerView.m mVar = this.f53676a;
            Rect rect = this.f53678c;
            mVar.w0(view, rect);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.I
        public final int q(View view) {
            RecyclerView.m mVar = this.f53676a;
            Rect rect = this.f53678c;
            mVar.w0(view, rect);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.I
        public final void r(int i12) {
            this.f53676a.E0(i12);
        }
    }

    /* compiled from: OrientationHelper.java */
    public class b extends I {
        @Override // androidx.recyclerview.widget.I
        public final int d(View view) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            this.f53676a.getClass();
            return RecyclerView.m.h0(view) + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.I
        public final int e(View view) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            return this.f53676a.k0(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.I
        public final int f(View view) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            return this.f53676a.l0(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.I
        public final int g(View view) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            this.f53676a.getClass();
            return RecyclerView.m.n0(view) - ((ViewGroup.MarginLayoutParams) nVar).topMargin;
        }

        @Override // androidx.recyclerview.widget.I
        public final int h() {
            return this.f53676a.f53851q;
        }

        @Override // androidx.recyclerview.widget.I
        public final int i() {
            RecyclerView.m mVar = this.f53676a;
            return mVar.f53851q - mVar.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.I
        public final int j() {
            return this.f53676a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.I
        public final int k() {
            return this.f53676a.f53849o;
        }

        @Override // androidx.recyclerview.widget.I
        public final int l() {
            return this.f53676a.f53848n;
        }

        @Override // androidx.recyclerview.widget.I
        public final int m() {
            return this.f53676a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.I
        public final int n() {
            RecyclerView.m mVar = this.f53676a;
            return (mVar.f53851q - mVar.getPaddingTop()) - mVar.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.I
        public final int p(View view) {
            RecyclerView.m mVar = this.f53676a;
            Rect rect = this.f53678c;
            mVar.w0(view, rect);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.I
        public final int q(View view) {
            RecyclerView.m mVar = this.f53676a;
            Rect rect = this.f53678c;
            mVar.w0(view, rect);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.I
        public final void r(int i12) {
            this.f53676a.F0(i12);
        }
    }

    public I(RecyclerView.m mVar, a aVar) {
        this.f53676a = mVar;
    }

    public static I a(RecyclerView.m mVar) {
        return new a(mVar, null);
    }

    public static I b(RecyclerView.m mVar, int i12) {
        if (i12 == 0) {
            return a(mVar);
        }
        if (i12 == 1) {
            return c(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static I c(RecyclerView.m mVar) {
        return new b(mVar, null);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public final int o() {
        if (Integer.MIN_VALUE == this.f53677b) {
            return 0;
        }
        return n() - this.f53677b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i12);
}
