package com.avito.android.publish.screen.step.select;

import Ne0.InterfaceC14566a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.publish.screen.step.select.SelectFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f242111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f242112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f242113d;

    public /* synthetic */ a(BaseFragment baseFragment, int i12, int i13) {
        this.f242111b = i13;
        this.f242113d = baseFragment;
        this.f242112c = i12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i22 = this.f242112c;
        BaseFragment baseFragment = this.f242113d;
        switch (this.f242111b) {
            case 0:
                SelectFragment.b bVar = SelectFragment.f242071A0;
                ((SelectFragment) baseFragment).q5().accept(new InterfaceC14566a.c(view.getHeight() + i22));
                break;
            default:
                RecyclerView recyclerView = ((com.avito.android.publish.select.SelectFragment) baseFragment).f242630u0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                D6.f(recyclerView, 0, 0, 0, view.getHeight() + i22, 7);
                break;
        }
    }
}
