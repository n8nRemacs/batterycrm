package com.avito.android.search.filter.adapter.category_group;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.p f262090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f262091d;

    public /* synthetic */ t(Y41.p pVar, C c12, int i12) {
        this.f262089b = i12;
        this.f262090c = pVar;
        this.f262091d = c12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.p pVar = this.f262090c;
        C c12 = this.f262091d;
        switch (this.f262089b) {
            case 0:
                int i12 = w.f262098i;
                pVar.invoke(Integer.valueOf(c12.f262038b), c12);
                break;
            default:
                int i13 = D.f262042i;
                pVar.invoke(Integer.valueOf(c12.f262038b), c12);
                break;
        }
    }
}
