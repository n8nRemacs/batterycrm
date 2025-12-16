package com.avito.android.upload_doc.helpers;

import OG0.a;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f306796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f306797c;

    public /* synthetic */ d(e eVar, int i12) {
        this.f306796b = i12;
        this.f306797c = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f306796b) {
            case 0:
                this.f306797c.f306803f.invoke(a.h.f12127a);
                break;
            default:
                this.f306797c.f306803f.invoke(a.f.f12125a);
                break;
        }
    }
}
