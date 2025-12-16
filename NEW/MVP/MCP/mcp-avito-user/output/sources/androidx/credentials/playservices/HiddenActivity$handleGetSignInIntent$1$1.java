package androidx.credentials.playservices;

import Y41.l;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HiddenActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/app/PendingIntent;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class HiddenActivity$handleGetSignInIntent$1$1 extends N implements l<PendingIntent, G0> {
    final /* synthetic */ int $requestCode;
    final /* synthetic */ HiddenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleGetSignInIntent$1$1(HiddenActivity hiddenActivity, int i12) {
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
    public final void invoke2(PendingIntent pendingIntent) throws IntentSender.SendIntentException {
        try {
            this.this$0.mWaitingForActivityResult = true;
            this.this$0.startIntentSenderForResult(pendingIntent.getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e12) {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.setupFailure(hiddenActivity.resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "During get sign-in intent, one tap ui intent sender failure: " + e12.getMessage());
        }
    }
}
