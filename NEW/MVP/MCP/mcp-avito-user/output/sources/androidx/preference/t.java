package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.C22808a;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import j.N;

/* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public class t extends M {

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f53471f;

    /* renamed from: g, reason: collision with root package name */
    public final M.a f53472g;

    /* renamed from: h, reason: collision with root package name */
    public final C22808a f53473h;

    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    public class a extends C22808a {
        public a() {
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            t tVar = t.this;
            tVar.f53472g.d(view, fVar);
            RecyclerView recyclerView = tVar.f53471f;
            recyclerView.getClass();
            int iU2 = RecyclerView.U(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof k) {
                ((k) adapter).k(iU2);
            }
        }

        @Override // androidx.core.view.C22808a
        public final boolean g(View view, int i12, Bundle bundle) {
            return t.this.f53472g.g(view, i12, bundle);
        }
    }

    public t(@N RecyclerView recyclerView) {
        super(recyclerView);
        this.f53472g = this.f53724e;
        this.f53473h = new a();
        this.f53471f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.M
    @N
    public final C22808a j() {
        return this.f53473h;
    }
}
