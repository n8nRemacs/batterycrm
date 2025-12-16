package com.avito.android.email.email_confirmation.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmailChangeConfirmationDeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.email.email_confirmation.EmailConfirmationActivity;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EmailChangeConfirmationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/email/email_confirmation/deeplink/g;", "Lev/b;", "Lcom/avito/android/deep_linking/links/EmailChangeConfirmationDeepLink;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends AbstractC40162b<EmailChangeConfirmationDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f147103d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Context f147104e;

    @Inject
    public g(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f147103d = interfaceC4053a;
        this.f147104e = context;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        String str2 = ((EmailChangeConfirmationDeepLink) deepLink).f133297b;
        Intent intent = new Intent(this.f147104e, (Class<?>) EmailConfirmationActivity.class);
        intent.putExtra("update_existed_key", true);
        intent.putExtra("confirmation_code_key", str2);
        this.f147103d.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
