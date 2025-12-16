package SM0;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.verification.VerificationActivity;
import com.avito.android.verification.verification_form_builder.deeplink.VerificationFormBuilderLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationFormBuilderLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LSM0/a;", "Lcom/avito/android/verification/common/c;", "Lcom/avito/android/verification/verification_form_builder/deeplink/VerificationFormBuilderLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes5.dex */
public final class a extends com.avito.android.verification.common.c<VerificationFormBuilderLink> {

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.verification.b f14935j;

    @Inject
    public a(@k com.avito.android.verification.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar2, @k a.i iVar) {
        super(bVar2, interfaceC4053a, iVar);
        this.f14935j = bVar;
    }

    @Override // com.avito.android.verification.common.c
    public final Intent k(DeepLink deepLink) {
        com.avito.android.verification.b bVar = this.f14935j;
        bVar.getClass();
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(bVar.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.verification_form_builder_link", (VerificationFormBuilderLink) deepLink);
        intent.setFlags(603979776);
        return intent;
    }
}
