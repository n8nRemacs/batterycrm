package HL;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_onboarding.IacMicOnboardingLink;
import com.avito.android.onboarding.OnboardingLink;
import com.avito.android.permissions.z;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacMicOnboardingLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LHL/a;", "Lev/a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_onboarding/IacMicOnboardingLink;", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<IacMicOnboardingLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f7041f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final z f7042g;

    /* compiled from: IacMicOnboardingLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LHL/a$a;", "", "<init>", "()V", "", "IAC_ONBOARDING_WITHOUT_PERMISSION_ID", "Ljava/lang/String;", "IAC_ONBOARDING_WITH_PERMISSION_ID", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: HL.a$a, reason: collision with other inner class name */
    public static final class C0405a {
        public /* synthetic */ C0405a(C42822w c42822w) {
            this();
        }

        public C0405a() {
        }
    }

    static {
        new C0405a(null);
    }

    @Inject
    public a(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k z zVar) {
        this.f7041f = aVar;
        this.f7042g = zVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        i(IacMicOnboardingLink.b.a.f168400b, this.f7041f, this.f7042g.b("android.permission.RECORD_AUDIO").b() ? new OnboardingLink("55", null, null, null, 14, null) : new OnboardingLink("54", null, null, null, 14, null));
    }
}
