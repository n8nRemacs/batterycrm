package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import com.avito.android.region.Region;
import com.avito.android.verification.links.alfa.VerificationAlfaLink;
import com.avito.android.verification.links.close.VerificationCloseLink;
import com.avito.android.verification.links.download.VerificationDownloadLink;
import com.avito.android.verification.links.esia.VerificationEsiaLink;
import com.avito.android.verification.links.mts.VerificationMTSLink;
import com.avito.android.verification.links.open.VerificationOpenLink;
import com.avito.android.verification.links.redirect.VerificationRedirectLink;
import com.avito.android.verification.links.remove.VerificationRemoveLink;
import com.avito.android.verification.links.restore.VerificationRestoreLink;
import com.avito.android.verification.links.sber_business.SberBusinessLink;
import com.avito.android.verification.links.sber_finish.VerificationSberFinishLink;
import com.avito.android.verification.links.sber_id.VerificationSberIdLink;
import com.avito.android.verification.links.tinkoff_documents.VerificationTinkoffDocumentsLink;
import com.avito.android.verification.links.tinkoff_finish.VerificationTinkoffFinishLink;
import com.avito.android.verification.links.tinkoff_finish_web.VerificationTinkoffFinishWebLink;
import com.avito.android.verification.links.tochka.VerificationTochkaLink;
import com.avito.android.verification.links.verifications_list_old.VerificationsListLinkOld;
import com.avito.android.verification.links.vtb.VerificationVTBLink;
import com.avito.android.verification.links.vtb_finish.VerificationVTBFinishLink;
import com.avito.android.verification.verification_form_builder.deeplink.VerificationFormBuilderLink;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_verification_implGeneratedDeeplinkMetaStorage.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_verification_implGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_verification_implGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_verification_implGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(VerificationAlfaLink.class, new C14159a(1, "/verificationView/alfaId", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationCloseLink.class, new C14159a(1, "/verificationView/close", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationDownloadLink.class, new C14159a(1, "/verificationView/download", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationEsiaLink.class, new C14159a(1, "/verificationView/esia", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationMTSLink.class, new C14159a(1, "/verificationView/mts", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationOpenLink.class, new C14159a(1, "/verificationView/open", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationRedirectLink.class, new C14159a(1, "/verificationView/redirect", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationRemoveLink.class, new C14159a(1, "/verificationView/remove", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationRestoreLink.class, new C14159a(1, "/verificationView/restore", C42756l.l0(new Region[]{region, region2}), false)), new Q(SberBusinessLink.class, new C14159a(1, "/verificationView/sberBusiness", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationSberFinishLink.class, new C14159a(1, "/verificationView/sberFinish", C42756l.l0(new Region[]{region, region2}), true)), new Q(VerificationSberIdLink.class, new C14159a(1, "/verificationView/sberId", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationTinkoffDocumentsLink.class, new C14159a(1, "/verificationView/tinkoffDocuments", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationTinkoffFinishLink.class, new C14159a(1, "/verificationView/tinkoffFinish", C42756l.l0(new Region[]{region, region2}), true)), new Q(VerificationTinkoffFinishWebLink.class, new C14159a(1, "/verificationView/tinkoffFinishWeb", C42756l.l0(new Region[]{region, region2}), true)), new Q(VerificationTochkaLink.class, new C14159a(1, "/verificationView/tochka", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationsListLinkOld.class, new C14159a(1, "/profile/verifyIdentity/list", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationVTBLink.class, new C14159a(1, "/verificationView/vtbId", C42756l.l0(new Region[]{region, region2}), false)), new Q(VerificationVTBFinishLink.class, new C14159a(1, "/verificationView/vtbFinish", C42756l.l0(new Region[]{region, region2}), true)), new Q(VerificationFormBuilderLink.class, new C14159a(1, "/verificationView/formBuilder", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
