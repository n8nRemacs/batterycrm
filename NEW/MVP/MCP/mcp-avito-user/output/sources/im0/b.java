package IM0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.VerificationStartLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.verification.links.verifications_list_old.VerificationsListLinkOld;
import ev.AbstractC40162b;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VerificationsListLinkSyncHandlerOld.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIM0/b;", "Lev/b;", "Lcom/avito/android/verification/links/verifications_list_old/VerificationsListLinkOld;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40162b<VerificationsListLinkOld> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f8155d;

    /* compiled from: VerificationsListLinkSyncHandlerOld.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LIM0/b$a;", "", "<init>", "()V", "", "KEY_FLOW_PARAMETER", "Ljava/lang/String;", "REDIRECT_FLOW_PARAMETER", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f8155d = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        b.a.a(this.f8155d, new VerificationStartLink(Collections.singletonMap(MessageBody.SystemMessageBody.Platform.FLOW, "redirectFromLegacy")), null, null, 6);
        return AbstractC14250d.c.f9171c;
    }
}
