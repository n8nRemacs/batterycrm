package com.avito.android.rating_ui.button;

import Y61.k;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.remote.model.DeeplinkAction;
import kotlin.Metadata;

/* compiled from: BaseRatingButtonItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/button/BaseRatingButtonItem;", "LTV0/a;", "FillType", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface BaseRatingButtonItem extends TV0.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseRatingButtonItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/button/BaseRatingButtonItem$FillType;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FillType {

        /* renamed from: b, reason: collision with root package name */
        public static final FillType f249982b;

        /* renamed from: c, reason: collision with root package name */
        public static final FillType f249983c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FillType[] f249984d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f249985e;

        static {
            FillType fillType = new FillType("FULL_WIDTH", 0);
            f249982b = fillType;
            FillType fillType2 = new FillType("WRAP_CONTENT", 1);
            f249983c = fillType2;
            FillType[] fillTypeArr = {fillType, fillType2};
            f249984d = fillTypeArr;
            f249985e = kotlin.enums.c.a(fillTypeArr);
        }

        public FillType() {
            throw null;
        }

        public static FillType valueOf(String str) {
            return (FillType) Enum.valueOf(FillType.class, str);
        }

        public static FillType[] values() {
            return (FillType[]) f249984d.clone();
        }
    }

    @k
    RatingItemsMarginHorizontal c();

    @k
    DeeplinkAction getAction();

    @k
    FillType getType();

    boolean j0();
}
