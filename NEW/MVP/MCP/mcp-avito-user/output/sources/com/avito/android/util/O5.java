package com.avito.android.util;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class O5 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f318705c;

    public /* synthetic */ O5(Object obj, int i12) {
        this.f318704b = i12;
        this.f318705c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f318704b) {
            case 0:
                ((io.reactivex.rxjava3.core.B) this.f318705c).onNext(kotlin.G0.f406611a);
                break;
            default:
                ((Y41.a) this.f318705c).invoke();
                break;
        }
    }
}
