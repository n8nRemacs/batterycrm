package com.avito.android.rating_form.api.remote.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RatingFormToastPreset.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormToastPreset;", "", "(Ljava/lang/String;I)V", "DEFAULT", "INVERSE", "ERROR", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormToastPreset {

    @c("default")
    public static final RatingFormToastPreset DEFAULT;

    @c("error")
    public static final RatingFormToastPreset ERROR;

    @c("inverse")
    public static final RatingFormToastPreset INVERSE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RatingFormToastPreset[] f248008b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f248009c;

    static {
        RatingFormToastPreset ratingFormToastPreset = new RatingFormToastPreset("DEFAULT", 0);
        DEFAULT = ratingFormToastPreset;
        RatingFormToastPreset ratingFormToastPreset2 = new RatingFormToastPreset("INVERSE", 1);
        INVERSE = ratingFormToastPreset2;
        RatingFormToastPreset ratingFormToastPreset3 = new RatingFormToastPreset("ERROR", 2);
        ERROR = ratingFormToastPreset3;
        RatingFormToastPreset[] ratingFormToastPresetArr = {ratingFormToastPreset, ratingFormToastPreset2, ratingFormToastPreset3};
        f248008b = ratingFormToastPresetArr;
        f248009c = kotlin.enums.c.a(ratingFormToastPresetArr);
    }

    private RatingFormToastPreset(String str, int i12) {
    }

    public static RatingFormToastPreset valueOf(String str) {
        return (RatingFormToastPreset) Enum.valueOf(RatingFormToastPreset.class, str);
    }

    public static RatingFormToastPreset[] values() {
        return (RatingFormToastPreset[]) f248008b.clone();
    }
}
