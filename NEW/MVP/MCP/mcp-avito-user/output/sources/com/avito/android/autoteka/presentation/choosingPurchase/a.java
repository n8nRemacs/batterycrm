package com.avito.android.autoteka.presentation.choosingPurchase;

import Y41.l;
import com.avito.android.autoteka.helpers.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaChoosingPurchaseActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/autoteka/helpers/l$a;", "autotekaToast", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/autoteka/helpers/l$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements l<l.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaChoosingPurchaseActivity f97111l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutotekaChoosingPurchaseActivity autotekaChoosingPurchaseActivity) {
        super(1);
        this.f97111l = autotekaChoosingPurchaseActivity;
    }

    @Override // Y41.l
    public final G0 invoke(l.a aVar) {
        l.a aVar2 = aVar;
        f fVar = this.f97111l.f97081u;
        if (fVar != null) {
            com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, fVar.f97116e, aVar2.f96672d, null, aVar2.f96671c, aVar2.f96669a, aVar2.f96670b, 910);
        }
        return G0.f406611a;
    }
}
