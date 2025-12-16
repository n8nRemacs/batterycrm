package com.avito.android.user_advert.advert;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import iR.C41336a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.user_advert.advert.h1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C35396h1 implements io.reactivex.rxjava3.core.C, Toolbar.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f308944c;

    public /* synthetic */ C35396h1(Object obj, int i12) {
        this.f308943b = i12;
        this.f308944c = obj;
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(final io.reactivex.rxjava3.core.B b12) {
        Object obj = this.f308944c;
        switch (this.f308943b) {
            case 0:
                int i12 = C35436m1.f310544u;
                final C35436m1 c35436m1 = (C35436m1) obj;
                final int i13 = 0;
                b12.f(new l41.f() { // from class: com.avito.android.user_advert.advert.i1
                    @Override // l41.f
                    public final void cancel() {
                        switch (i13) {
                            case 0:
                                c35436m1.f310565t.setOnMenuItemClickListener(null);
                                break;
                            default:
                                c35436m1.f310565t.setNavigationOnClickListener(null);
                                break;
                        }
                    }
                });
                com.avito.android.ui.d.b(c35436m1.f310565t, new C35396h1(b12, 2));
                break;
            default:
                int i14 = C35436m1.f310544u;
                final C35436m1 c35436m12 = (C35436m1) obj;
                final int i15 = 1;
                b12.f(new l41.f() { // from class: com.avito.android.user_advert.advert.i1
                    @Override // l41.f
                    public final void cancel() {
                        switch (i15) {
                            case 0:
                                c35436m12.f310565t.setOnMenuItemClickListener(null);
                                break;
                            default:
                                c35436m12.f310565t.setNavigationOnClickListener(null);
                                break;
                        }
                    }
                });
                c35436m12.f310565t.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_advert.advert.j1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = C35436m1.f310544u;
                        b12.onNext(kotlin.G0.f406611a);
                    }
                });
                break;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i12 = C35436m1.f310544u;
        C41336a.C11375a.a();
        ((io.reactivex.rxjava3.core.B) this.f308944c).onNext(Integer.valueOf(menuItem.getItemId()));
        return true;
    }
}
