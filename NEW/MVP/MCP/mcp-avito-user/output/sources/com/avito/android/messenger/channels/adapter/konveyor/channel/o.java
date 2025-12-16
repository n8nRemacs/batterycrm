package com.avito.android.messenger.channels.adapter.konveyor.channel;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class o implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f186886c;

    public /* synthetic */ o(int i12, Y41.a aVar) {
        this.f186885b = i12;
        this.f186886c = aVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Y41.a aVar = this.f186886c;
        switch (this.f186885b) {
            case 0:
                int i12 = p.f186887n;
                aVar.invoke();
                break;
            default:
                int i13 = com.avito.android.user_advert.advert.items.address.j.f309077d;
                aVar.invoke();
                break;
        }
        return true;
    }
}
