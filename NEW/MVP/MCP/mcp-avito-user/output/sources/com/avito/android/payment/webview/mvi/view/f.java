package com.avito.android.payment.webview.mvi.view;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.payment.o;
import com.avito.android.util.N0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WebPaymentViewCancellationDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/webview/mvi/view/f;", "", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f214943a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.modal.a f214944b;

    /* compiled from: WebPaymentViewCancellationDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f214946m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f214947n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            super(2);
            this.f214946m = aVar;
            this.f214947n = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            f fVar = f.this;
            bVar2.setTitle(fVar.f214943a.getF213986c());
            o oVar = fVar.f214943a;
            bVar2.setSubtitle(oVar.getF213987d());
            bVar2.setButtonsOrientation(1);
            bVar2.L3(oVar.getF213989f(), new d(fVar, this.f214946m));
            bVar2.M3(oVar.getF213988e(), new e(fVar, this.f214947n));
            bVar2.setCancelable(true);
            return G0.f406611a;
        }
    }

    @Inject
    public f(@k o oVar) {
        this.f214943a = oVar;
    }

    public final void a(@k Context context, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        N0.a(this.f214944b);
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, context, new a(aVar2, aVar));
        this.f214944b = aVarC;
        com.avito.android.lib.util.g.a(aVarC);
    }
}
