package com.avito.android.comfortable_deal.stages_transition.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StagesTransitionResult.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/model/StagesTransitionResultStrategy;", "", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StagesTransitionResultStrategy implements Parcelable {

    @k
    public static final Parcelable.Creator<StagesTransitionResultStrategy> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final StagesTransitionResultStrategy f122959b;

    /* renamed from: c, reason: collision with root package name */
    public static final StagesTransitionResultStrategy f122960c;

    /* renamed from: d, reason: collision with root package name */
    public static final StagesTransitionResultStrategy f122961d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ StagesTransitionResultStrategy[] f122962e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122963f;

    static {
        StagesTransitionResultStrategy stagesTransitionResultStrategy = new StagesTransitionResultStrategy("Success", 0);
        f122959b = stagesTransitionResultStrategy;
        StagesTransitionResultStrategy stagesTransitionResultStrategy2 = new StagesTransitionResultStrategy("Save", 1);
        f122960c = stagesTransitionResultStrategy2;
        StagesTransitionResultStrategy stagesTransitionResultStrategy3 = new StagesTransitionResultStrategy("Exit", 2);
        f122961d = stagesTransitionResultStrategy3;
        StagesTransitionResultStrategy[] stagesTransitionResultStrategyArr = {stagesTransitionResultStrategy, stagesTransitionResultStrategy2, stagesTransitionResultStrategy3};
        f122962e = stagesTransitionResultStrategyArr;
        f122963f = c.a(stagesTransitionResultStrategyArr);
        CREATOR = new Parcelable.Creator<StagesTransitionResultStrategy>() { // from class: com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy.a
            @Override // android.os.Parcelable.Creator
            public final StagesTransitionResultStrategy createFromParcel(Parcel parcel) {
                return StagesTransitionResultStrategy.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StagesTransitionResultStrategy[] newArray(int i12) {
                return new StagesTransitionResultStrategy[i12];
            }
        };
    }

    public StagesTransitionResultStrategy() {
        throw null;
    }

    public static StagesTransitionResultStrategy valueOf(String str) {
        return (StagesTransitionResultStrategy) Enum.valueOf(StagesTransitionResultStrategy.class, str);
    }

    public static StagesTransitionResultStrategy[] values() {
        return (StagesTransitionResultStrategy[]) f122962e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
