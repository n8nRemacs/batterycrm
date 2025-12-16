package androidx.credentials.playservices;

import Y41.l;
import Y61.k;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HiddenActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/PendingIntent;", "result", "Lkotlin/G0;", "invoke", "(Landroid/app/PendingIntent;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class HiddenActivity$handleCreatePublicKeyCredential$1$1 extends N implements l<PendingIntent, G0> {
    final /* synthetic */ int $requestCode;
    final /* synthetic */ HiddenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleCreatePublicKeyCredential$1$1(HiddenActivity hiddenActivity, int i12) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i12;
    }

    @Override // Y41.l
    public /* bridge */ /* synthetic */ G0 invoke(PendingIntent pendingIntent) throws IntentSender.SendIntentException {
        invoke2(pendingIntent);
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@k PendingIntent pendingIntent) throws IntentSender.SendIntentException {
        try {
            this.this$0.mWaitingForActivityResult = true;
            this.this$0.startIntentSenderForResult(pendingIntent.getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e12) {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.setupFailure(hiddenActivity.resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, "During public key credential, found IntentSender failure on public key creation: " + e12.getMessage());
        }
    }
}
