package com.avito.android.rating_form;

import ch0.InterfaceC27196b;
import kotlin.Metadata;

/* compiled from: RatingFormStepProgressInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/RatingFormStepProgressInteractor;", "", "RatingFormStepProgressType", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingFormStepProgressInteractor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingFormStepProgressInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/RatingFormStepProgressInteractor$RatingFormStepProgressType;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RatingFormStepProgressType {

        /* renamed from: b, reason: collision with root package name */
        public static final RatingFormStepProgressType f247918b;

        /* renamed from: c, reason: collision with root package name */
        public static final RatingFormStepProgressType f247919c;

        /* renamed from: d, reason: collision with root package name */
        public static final RatingFormStepProgressType f247920d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ RatingFormStepProgressType[] f247921e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f247922f;

        static {
            RatingFormStepProgressType ratingFormStepProgressType = new RatingFormStepProgressType("CLIENT_WITH_STEPS_SIZE", 0);
            f247918b = ratingFormStepProgressType;
            RatingFormStepProgressType ratingFormStepProgressType2 = new RatingFormStepProgressType("CLIENT_WITH_ALL_PROBABLE_STEPS", 1);
            f247919c = ratingFormStepProgressType2;
            RatingFormStepProgressType ratingFormStepProgressType3 = new RatingFormStepProgressType("BACKEND", 2);
            f247920d = ratingFormStepProgressType3;
            RatingFormStepProgressType[] ratingFormStepProgressTypeArr = {ratingFormStepProgressType, ratingFormStepProgressType2, ratingFormStepProgressType3};
            f247921e = ratingFormStepProgressTypeArr;
            f247922f = kotlin.enums.c.a(ratingFormStepProgressTypeArr);
        }

        public RatingFormStepProgressType() {
            throw null;
        }

        public static RatingFormStepProgressType valueOf(String str) {
            return (RatingFormStepProgressType) Enum.valueOf(RatingFormStepProgressType.class, str);
        }

        public static RatingFormStepProgressType[] values() {
            return (RatingFormStepProgressType[]) f247921e.clone();
        }
    }

    @Y61.k
    InterfaceC27196b a(int i12);
}
