package com.avito.android.lib.design.badge;

import android.view.ViewPropertyAnimator;
import com.avito.android.lib.design.badge.Badge;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f178388c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f178387b = i12;
        this.f178388c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f178387b) {
            case 0:
                Badge.a aVar = (Badge.a) this.f178388c;
                if (!aVar.f178374i) {
                    aVar.f178377l.j();
                    break;
                } else {
                    ViewPropertyAnimator viewPropertyAnimator = aVar.f178375j;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        break;
                    }
                }
                break;
            default:
                ((Y41.a) this.f178388c).invoke();
                break;
        }
    }
}
