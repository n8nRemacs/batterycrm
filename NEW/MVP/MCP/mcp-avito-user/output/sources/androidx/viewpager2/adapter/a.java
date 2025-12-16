package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes10.dex */
class a implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f55065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f55066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f55067d;

    public a(b bVar, FrameLayout frameLayout, i iVar) {
        this.f55067d = bVar;
        this.f55065b = frameLayout;
        this.f55066c = iVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        FrameLayout frameLayout = this.f55065b;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f55067d.o(this.f55066c);
        }
    }
}
