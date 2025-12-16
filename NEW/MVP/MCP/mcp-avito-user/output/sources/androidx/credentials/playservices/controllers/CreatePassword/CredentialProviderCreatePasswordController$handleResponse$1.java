package androidx.credentials.playservices.controllers.CreatePassword;

import Y41.a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CredentialProviderCreatePasswordController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Lkotlin/G0;", "f", "invoke", "(Landroid/os/CancellationSignal;LY41/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController$handleResponse$1 extends N implements p<CancellationSignal, a<? extends G0>, G0> {
    public static final CredentialProviderCreatePasswordController$handleResponse$1 INSTANCE = new CredentialProviderCreatePasswordController$handleResponse$1();

    public CredentialProviderCreatePasswordController$handleResponse$1() {
        super(2);
    }

    @Override // Y41.p
    public /* bridge */ /* synthetic */ G0 invoke(CancellationSignal cancellationSignal, a<? extends G0> aVar) {
        invoke2(cancellationSignal, (a<G0>) aVar);
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l CancellationSignal cancellationSignal, @k a<G0> aVar) {
        CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, aVar);
    }
}
