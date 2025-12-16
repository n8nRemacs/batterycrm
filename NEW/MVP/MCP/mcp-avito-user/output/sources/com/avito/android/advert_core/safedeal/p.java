package com.avito.android.advert_core.safedeal;

import android.view.ViewGroup;
import com.avito.android.advert_core.safedeal.q;
import com.avito.android.component.snackbar.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MyAdvertSafeDealServicesView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/advert_core/safedeal/q$a;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_core/safedeal/q$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class p extends N implements Y41.l<q.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f84226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h hVar) {
        super(1);
        this.f84226l = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q.a aVar) {
        q.a aVar2 = aVar;
        ViewGroup viewGroup = this.f84226l.f84206a;
        String str = aVar2.f84227a;
        e.b.f125239c.getClass();
        com.avito.android.component.snackbar.h.c(viewGroup, str, 0, new e.b(aVar2.f84228b, aVar2.f84229c, null), null, null, null, 250);
        return G0.f406611a;
    }
}
