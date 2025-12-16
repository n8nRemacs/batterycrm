package com.avito.android.advert.item.safedeal;

import android.os.Build;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.QuantityChange;
import com.avito.android.component.toast.f;
import com.avito.android.component.toast.util.g;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class J<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28180h f78734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QuantityChange f78735c;

    public J(C28180h c28180h, QuantityChange quantityChange) {
        this.f78734b = c28180h;
        this.f78735c = quantityChange;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        I1 i12;
        Throwable th2 = (Throwable) obj;
        I i13 = new I(this.f78735c);
        C28180h c28180h = this.f78734b;
        c28180h.C(i13);
        I1 i14 = c28180h.f78841v;
        if (i14 != null) {
            g.a.a(i14, com.avito.android.printable_text.b.f(com.avito.android.error.z.l(th2)), ToastBarPosition.f181046d, new f.c(th2), 62);
        }
        if (Build.VERSION.SDK_INT < 30 || (i12 = c28180h.f78841v) == null) {
            return;
        }
        i12.H(17);
    }
}
