package com.yandex.div.core.view2.errors;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f369058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f369059c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f369058b = i12;
        this.f369059c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f369058b) {
            case 0:
                ((b) this.f369059c).f369060b.invoke();
                break;
            case 1:
                ((b) this.f369059c).f369061c.invoke();
                break;
            default:
                i iVar = ((n) this.f369059c).f369087c;
                iVar.a(o.a(iVar.f369080g, true, 0, 0, null, null, 30));
                break;
        }
    }
}
