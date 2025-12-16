package Jt0;

import Y61.k;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import com.google.gson.r;
import dagger.internal.h;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ServiceBookingJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJt0/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jt0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14246b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C14246b f9167a = new C14246b();

    @Override // javax.inject.Provider
    public final Object get() {
        C14245a.f9166a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, BookingFormResponseV3SuccessParamsItem.class);
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingImagesV3.class, "bookingImages");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamCheckPriceListV3.class, "bookingParamCheckPriceList");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamCommentV3.class, "bookingParamComment");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamDateV3.class, "bookingParamDate");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamDaysV3.class, "bookingParamDays");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamInputTextV3.class, "bookingParamInputText");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamOfferV3.class, "bookingParamOffer");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamPriceListV3.class, "bookingParamPriceList");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3.class, "bookingParamSpecialists");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormResponseV3SuccessParamsItem.BookingParamTextV3.class, "bookingParamText");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
