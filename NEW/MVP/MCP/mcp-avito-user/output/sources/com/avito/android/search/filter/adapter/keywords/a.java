package com.avito.android.search.filter.adapter.keywords;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f262429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.b f262430d;

    public /* synthetic */ a(Y41.l lVar, com.avito.konveyor.adapter.b bVar, int i12) {
        this.f262428b = i12;
        this.f262429c = lVar;
        this.f262430d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f262428b) {
            case 0:
                this.f262429c.invoke(String.valueOf(((c) this.f262430d).f262438e.m53getText()));
                break;
            default:
                this.f262429c.invoke(String.valueOf(((h) this.f262430d).f262459e.m53getText()));
                break;
        }
    }
}
