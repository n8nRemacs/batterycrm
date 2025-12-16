package androidx.credentials.playservices.controllers.CreatePassword;

import Y41.a;
import androidx.credentials.AbstractC22850c;
import androidx.credentials.InterfaceC22872v;
import java.util.concurrent.Executor;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CredentialProviderCreatePasswordController.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController$handleResponse$3 extends N implements a<G0> {
    final /* synthetic */ AbstractC22850c $response;
    final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AbstractC22850c abstractC22850c) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = abstractC22850c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AbstractC22850c abstractC22850c) {
        InterfaceC22872v interfaceC22872v = credentialProviderCreatePasswordController.callback;
        if (interfaceC22872v == null) {
            interfaceC22872v = null;
        }
        interfaceC22872v.onResult(abstractC22850c);
    }

    @Override // Y41.a
    public /* bridge */ /* synthetic */ G0 invoke() {
        invoke2();
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            executor = null;
        }
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        final AbstractC22850c abstractC22850c = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(credentialProviderCreatePasswordController, abstractC22850c);
            }
        });
    }
}
