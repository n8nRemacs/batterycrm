package com.avito.android.screens.bbip.ui;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import ih.InterfaceC41399a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import np0.InterfaceC44461a;
import op0.C44839a;
import op0.C44840b;

/* compiled from: BbipInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/i;", "Lcom/avito/android/screens/bbip/ui/g;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41399a> f260297a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f260298b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44461a f260299c;

    @Inject
    public i(@Y61.k h31.e<InterfaceC41399a> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC44461a interfaceC44461a) {
        this.f260297a = eVar;
        this.f260298b = interfaceC35745a5;
        this.f260299c = interfaceC44461a;
    }

    @Override // com.avito.android.screens.bbip.ui.g
    @Y61.k
    public final B0 a(@Y61.k C44840b c44840b) {
        return Y5.a(this.f260297a.get().d(c44840b.f420192a, c44840b.f420193b).x0(this.f260298b.a())).d0(new h(this, c44840b));
    }

    @Override // com.avito.android.screens.bbip.ui.g
    @Y61.k
    public final z<jh.n> b(@Y61.k C44840b c44840b) {
        InterfaceC41399a interfaceC41399a = this.f260297a.get();
        Integer num = c44840b.f420195d.f420196a;
        int iIntValue = num != null ? num.intValue() : 0;
        C44839a c44839a = c44840b.f420194c;
        Integer num2 = c44839a.f420189b;
        return Y5.a(interfaceC41399a.g(c44840b.f420192a, iIntValue, num2 != null ? num2.intValue() : c44839a.f420188a, c44840b.f420193b).x0(this.f260298b.a()));
    }

    @Override // com.avito.android.screens.bbip.ui.g
    @Y61.k
    public final z<DeepLinkResponse> c(@Y61.k C44840b c44840b) {
        return Y5.a(this.f260297a.get().c(this.f260299c.c(c44840b)).x0(this.f260298b.a()));
    }
}
