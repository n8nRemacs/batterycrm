package Ox0;

import Ux0.d;
import Y61.k;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.str_booking.network.di.StrBookingSectionType;
import com.avito.android.str_booking.network.models.sections.AttributedTextSection;
import com.avito.android.str_booking.network.models.sections.BannerSection;
import com.avito.android.str_booking.network.models.sections.ButtonsSection;
import com.avito.android.str_booking.network.models.sections.CalculationSection;
import com.avito.android.str_booking.network.models.sections.ClickStreamSection;
import com.avito.android.str_booking.network.models.sections.DetailsSection;
import com.avito.android.str_booking.network.models.sections.FooterSection;
import com.avito.android.str_booking.network.models.sections.GallerySection;
import com.avito.android.str_booking.network.models.sections.InfoSection;
import com.avito.android.str_booking.network.models.sections.ItemInfoSection;
import com.avito.android.str_booking.network.models.sections.LocationSection;
import com.avito.android.str_booking.network.models.sections.PromoBannerSection;
import com.avito.android.str_booking.network.models.sections.ScreenTitleSection;
import com.avito.android.str_booking.network.models.sections.UpdatedTimeSection;
import com.avito.android.str_booking.network.models.sections.UserInfoSection;
import com.avito.android.str_booking.network.models.sections.UxFeedbackSection;
import com.google.gson.r;
import com.my.tracker.ads.AdFormat;
import dagger.internal.h;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: StrBookingJsonModule_ProvideStrBookingTypeFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LOx0/c;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ox0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14747c implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C14747c f12734a = new C14747c();

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = C14746b.f12733a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, d.class);
        StrBookingSectionType[] strBookingSectionTypeArr = StrBookingSectionType.f285853b;
        runtimeTypeAdapterFactoryD.b(GallerySection.class, AdvertDetailsBlockIdKt.GALLERY_BLOCK, null);
        runtimeTypeAdapterFactoryD.b(ScreenTitleSection.class, "screenTitle", null);
        runtimeTypeAdapterFactoryD.b(BannerSection.class, AdFormat.BANNER, null);
        runtimeTypeAdapterFactoryD.b(ButtonsSection.class, "buttons", null);
        runtimeTypeAdapterFactoryD.b(ItemInfoSection.class, "itemInfo", null);
        runtimeTypeAdapterFactoryD.b(UserInfoSection.class, "userInfo", null);
        runtimeTypeAdapterFactoryD.b(DetailsSection.class, "details", null);
        runtimeTypeAdapterFactoryD.b(LocationSection.class, "location", null);
        runtimeTypeAdapterFactoryD.b(CalculationSection.class, "calculation", null);
        runtimeTypeAdapterFactoryD.b(InfoSection.class, RequestReviewResultKt.INFO_TYPE, null);
        runtimeTypeAdapterFactoryD.b(AttributedTextSection.class, "attributedText", null);
        runtimeTypeAdapterFactoryD.b(FooterSection.class, "footer", null);
        runtimeTypeAdapterFactoryD.b(ClickStreamSection.class, "clickstream", null);
        runtimeTypeAdapterFactoryD.b(UxFeedbackSection.class, "uxFeedback", null);
        runtimeTypeAdapterFactoryD.b(UpdatedTimeSection.class, "updatedTime", null);
        runtimeTypeAdapterFactoryD.b(PromoBannerSection.class, "promoBanner", null);
        return Collections.singleton(runtimeTypeAdapterFactoryD);
    }
}
