package com.avito.android.user_advert.advert.items.realty.verification;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyVerificationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cadastralNumber", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.items.realty.verification.a f309963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f309964m;

    /* compiled from: RealtyVerificationItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f309965a;

        static {
            int[] iArr = new int[MyAdvertDetails.VerificationStatus.values().length];
            try {
                iArr[MyAdvertDetails.VerificationStatus.REQUEST_PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyAdvertDetails.VerificationStatus.OWNERSHIP_VERIFICATION_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MyAdvertDetails.VerificationStatus.PASSPORT_VERIFICATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MyAdvertDetails.VerificationStatus.REQUEST_CADASTRAL_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MyAdvertDetails.VerificationStatus.VERIFICATION_IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f309965a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.user_advert.advert.items.realty.verification.a aVar, h hVar) {
        super(1);
        this.f309963l = aVar;
        this.f309964m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        DeepLink deepLink;
        MyAdvertDetailsActivity myAdvertDetailsActivity;
        MyAdvertDetailsActivity myAdvertDetailsActivity2;
        String str2 = str;
        com.avito.android.user_advert.advert.items.realty.verification.a aVar = this.f309963l;
        int i12 = a.f309965a[aVar.f309951d.getStatus().ordinal()];
        h hVar = this.f309964m;
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            SimpleAdvertAction action = aVar.f309951d.getAction();
            if (action != null && (deepLink = action.getDeepLink()) != null && (myAdvertDetailsActivity = hVar.f309966b) != null) {
                myAdvertDetailsActivity.a(deepLink);
            }
        } else if (i12 == 4 && str2 != null && (myAdvertDetailsActivity2 = hVar.f309966b) != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity2.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.tc(aVar, str2);
        }
        return G0.f406611a;
    }
}
