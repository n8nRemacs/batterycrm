package com.avito.android.publish.screen.step.params.view.actions;

import com.avito.android.R;
import com.avito.android.publish.screen.step.params.view.actions.m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f241549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f241550c;

    public /* synthetic */ d(Object obj, int i12) {
        this.f241549b = i12;
        this.f241550c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f241549b) {
            case 0:
                ((f) this.f241550c).a(R.attr.buttonPrimaryLarge);
                break;
            case 1:
                ((f) this.f241550c).a(R.attr.buttonSecondaryLarge);
                break;
            default:
                ((m) this.f241550c).f241569c.C(m.a.f241576l);
                break;
        }
    }
}
