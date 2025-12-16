package com.avito.android.extended_profile.converter;

import androidx.camera.camera2.internal.G;
import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.about_v2.AboutV2Item;
import com.avito.android.remote.model.ExtendedProfileAboutV2;
import com.avito.android.remote.model.ExtendedProfileGalleryElement;
import com.avito.android.remote.model.TnsGalleryImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/converter/h;", "Lcom/avito/android/extended_profile/converter/g;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f149418a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28262a f149419b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f149420c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d f149421d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final k f149422e;

    @Inject
    public h(@Y61.k a aVar, @Y61.k InterfaceC28262a interfaceC28262a, boolean z12, @Y61.k d dVar, @Y61.k k kVar) {
        this.f149418a = aVar;
        this.f149419b = interfaceC28262a;
        this.f149420c = z12;
        this.f149421d = dVar;
        this.f149422e = kVar;
    }

    public static DeepLink b(DeepLink deepLink, String str) {
        if (!(deepLink instanceof ExtendedProfilePhoneRequestLink)) {
            return deepLink;
        }
        ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink = (ExtendedProfilePhoneRequestLink) deepLink;
        return new ExtendedProfilePhoneRequestLink(extendedProfilePhoneRequestLink.f133319b, extendedProfilePhoneRequestLink.f133320c, extendedProfilePhoneRequestLink.f133321d, str);
    }

    public static AboutV2Item c(ExtendedProfileAboutV2 extendedProfileAboutV2, String str, boolean z12) {
        String strF = G.f("about_v2_item_", str);
        String title = extendedProfileAboutV2.getTitle();
        List<ExtendedProfileGalleryElement> images = extendedProfileAboutV2.getImages();
        ArrayList arrayListB = images != null ? C42745f0.B(images, TnsGalleryImage.class) : null;
        String description = extendedProfileAboutV2.getDescription();
        ExtendedProfileAboutV2.Config config = extendedProfileAboutV2.getConfig();
        Integer showMoreLinesCount = config != null ? config.getShowMoreLinesCount() : null;
        ExtendedProfileAboutV2.Config config2 = extendedProfileAboutV2.getConfig();
        return new AboutV2Item(strF, null, title, arrayListB, null, description, showMoreLinesCount, config2 != null ? config2.getShowMoreTitle() : null, false, extendedProfileAboutV2.getWidgetName(), z12, 274, null);
    }

    public static com.avito.android.extended_profile.data.k d(ExtendedProfileWidgetItem extendedProfileWidgetItem, String str) {
        if (str == null) {
            str = "";
        }
        return new com.avito.android.extended_profile.data.k(str, Collections.singletonList(extendedProfileWidgetItem));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0b25 A[PHI: r28
  0x0b25: PHI (r28v3 java.lang.String) = (r28v2 java.lang.String), (r28v2 java.lang.String), (r28v5 java.lang.String) binds: [B:533:0x0b2d, B:535:0x0b37, B:529:0x0b15] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0dd9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v115 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68, types: [T] */
    /* JADX WARN: Type inference failed for: r4v101, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v103, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v45, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.ArrayList] */
    @Override // com.avito.android.extended_profile.converter.g
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.extended_profile.data.b a(@Y61.k java.lang.String r54, @Y61.l java.lang.String r55, @Y61.k com.avito.android.remote.model.ExtendedProfile r56) {
        /*
            Method dump skipped, instructions count: 3640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.converter.h.a(java.lang.String, java.lang.String, com.avito.android.remote.model.ExtendedProfile):com.avito.android.extended_profile.data.b");
    }
}
