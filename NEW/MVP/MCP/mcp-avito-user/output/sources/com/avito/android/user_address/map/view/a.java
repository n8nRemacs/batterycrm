package com.avito.android.user_address.map.view;

import android.view.View;
import com.avito.android.user_address.map.mvi.A;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f307939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_address.map.e f307940c;

    public /* synthetic */ a(com.avito.android.user_address.map.e eVar, int i12) {
        this.f307939b = i12;
        this.f307940c = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f307939b) {
            case 0:
                this.f307940c.accept(A.o.f307636a);
                break;
            case 1:
                this.f307940c.accept(A.n.f307635a);
                break;
            case 2:
                this.f307940c.accept(A.i.f307631a);
                break;
            case 3:
                this.f307940c.accept(A.t.f307641a);
                break;
            case 4:
                this.f307940c.accept(A.k.f307633a);
                break;
            case 5:
                this.f307940c.accept(A.b.f307626a);
                break;
            case 6:
                this.f307940c.accept(A.s.f307640a);
                break;
            default:
                this.f307940c.accept(A.b.f307626a);
                break;
        }
    }
}
