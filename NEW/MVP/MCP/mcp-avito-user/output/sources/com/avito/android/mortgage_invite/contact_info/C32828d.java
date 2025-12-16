package com.avito.android.mortgage_invite.contact_info;

import androidx.fragment.app.ActivityC22955m;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.mortgage_invite.model.ApplicationCreateResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import q20.InterfaceC47188b;

/* compiled from: ApplicationContactInfoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "applicationId", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.contact_info.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32828d extends N implements Y41.p<String, DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApplicationContactInfoFragment f205610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f205611m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32828d(ApplicationContactInfoFragment applicationContactInfoFragment, ActivityC22955m activityC22955m) {
        super(2);
        this.f205610l = applicationContactInfoFragment;
        this.f205611m = activityC22955m;
    }

    @Override // Y41.p
    public final G0 invoke(String str, DeepLink deepLink) {
        String str2 = str;
        DeepLink deepLink2 = deepLink;
        ApplicationContactInfoFragment applicationContactInfoFragment = this.f205610l;
        InterfaceC47188b interfaceC47188b = applicationContactInfoFragment.f205579o0;
        if (interfaceC47188b == null) {
            interfaceC47188b = null;
        }
        interfaceC47188b.b(new ApplicationCreateResult.ApplicationCreated(str2));
        if (deepLink2 != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = applicationContactInfoFragment.f205578n0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink2, null, null, 6);
        }
        this.f205611m.finish();
        return G0.f406611a;
    }
}
