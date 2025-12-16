package com.avito.android.profile.edit;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class P implements io.reactivex.rxjava3.core.C, Toolbar.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f221990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f221991c;

    public /* synthetic */ P(Object obj, int i12) {
        this.f221990b = i12;
        this.f221991c = obj;
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(final io.reactivex.rxjava3.core.B b12) {
        switch (this.f221990b) {
            case 0:
                ((S) this.f221991c).f221999d.f231600j = new T(b12);
                break;
            case 1:
                ((S) this.f221991c).f222002g.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.edit.Q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        io.reactivex.rxjava3.core.B b13 = b12;
                        if (b13.getF318621e()) {
                            return;
                        }
                        b13.onNext(G0.f406611a);
                    }
                });
                break;
            default:
                com.avito.android.ui.d.b(((S) this.f221991c).f222002g, new P(b12, 3));
                break;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        io.reactivex.rxjava3.core.B b12 = (io.reactivex.rxjava3.core.B) this.f221991c;
        if (b12.getF318621e()) {
            return true;
        }
        b12.onNext(G0.f406611a);
        return true;
    }
}
