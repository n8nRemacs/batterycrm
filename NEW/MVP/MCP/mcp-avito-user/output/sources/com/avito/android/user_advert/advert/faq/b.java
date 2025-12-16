package com.avito.android.user_advert.advert.faq;

import Y61.k;
import android.net.Uri;
import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertFaqSurveyDeeplinkProvider.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/b;", "Lcom/avito/android/user_advert/advert/faq/a;", "<init>", "()V", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.user_advert.advert.faq.a {

    /* compiled from: AdvertFaqSurveyDeeplinkProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/b$a;", "", "<init>", "()V", "", "FAQ_SURVEY_REQUEST_PARAM_CATEGORY_ID", "Ljava/lang/String;", "FAQ_SURVEY_REQUEST_PARAM_ITEM_ID", "FAQ_SURVEY_REQUEST_URL", "FAQ_SURVEY_SCREEN_NAME", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b() {
    }

    @Override // com.avito.android.user_advert.advert.faq.a
    @k
    public final BeduinV2BottomSheetDeepLink a(@k String str, @k String str2) {
        return new BeduinV2BottomSheetDeepLink(Uri.parse("/api/1/user-habits/seller-faq/sheet").buildUpon().appendQueryParameter("itemId", str).appendQueryParameter("categoryId", str2).build().toString(), "FaqSeller", "fit", false, BeduinV2BottomSheetDeepLink.ContentPaddings.f104771e, null, null, null, false, 480, null);
    }
}
