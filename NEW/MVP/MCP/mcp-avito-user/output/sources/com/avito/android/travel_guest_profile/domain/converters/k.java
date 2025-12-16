package com.avito.android.travel_guest_profile.domain.converters;

import com.avito.android.remote.model.rating_details_mvi.ModelReviewEntry;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileRatingModelReviewConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/domain/converters/k;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f301955a;

    /* compiled from: TravelGuestProfileRatingModelReviewConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f301956a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f301957b;

        static {
            int[] iArr = new int[ModelReviewEntry.ReviewStatus.values().length];
            try {
                iArr[ModelReviewEntry.ReviewStatus.PUBLISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModelReviewEntry.ReviewStatus.DECLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModelReviewEntry.ReviewStatus.MODERATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ModelReviewEntry.ReviewStatus.APPROVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f301956a = iArr;
            int[] iArr2 = new int[ModelReviewEntry.ActionType.values().length];
            try {
                iArr2[ModelReviewEntry.ActionType.REMOVE_MODEL_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f301957b = iArr2;
        }
    }

    @Inject
    public k(@Y61.k e eVar) {
        this.f301955a = eVar;
    }
}
