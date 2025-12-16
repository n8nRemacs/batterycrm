package com.avito.android.util;

import android.R;
import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class E1 implements io.reactivex.rxjava3.core.M, io.reactivex.rxjava3.core.C, InterfaceC37024g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f318582c;

    public /* synthetic */ E1(Object obj, int i12) {
        this.f318581b = i12;
        this.f318582c = obj;
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(io.reactivex.rxjava3.core.B b12) {
        switch (this.f318581b) {
            case 1:
                b12.a(new H2(new J2(b12), (View) this.f318582c, false));
                break;
            case 2:
                b12.a(new H2(new I2(b12), ((Activity) this.f318582c).findViewById(R.id.content), false));
                break;
            default:
                Toolbar toolbar = (Toolbar) this.f318582c;
                b12.f(new C35973x1(toolbar, 1));
                toolbar.setNavigationOnClickListener(new O5(b12, 0));
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(io.reactivex.rxjava3.core.K k12) {
        E1 e12 = new E1(new G1(k12), 3);
        Task task = (Task) this.f318582c;
        task.g(e12);
        task.c(new C31685o(17));
        task.a(new F1(k12));
        task.e(new F1(k12));
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public void onSuccess(Object obj) {
        ((Y41.l) this.f318582c).invoke(obj);
    }
}
