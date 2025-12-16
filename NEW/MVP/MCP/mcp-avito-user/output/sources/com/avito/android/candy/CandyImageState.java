package com.avito.android.candy;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CandyImageState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/candy/CandyImageState;", "", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CandyImageState {

    /* renamed from: c, reason: collision with root package name */
    public static final CandyImageState f114849c;

    /* renamed from: d, reason: collision with root package name */
    public static final CandyImageState f114850d;

    /* renamed from: e, reason: collision with root package name */
    public static final CandyImageState f114851e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CandyImageState[] f114852f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f114853g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f114854b;

    static {
        CandyImageState candyImageState = new CandyImageState("DEFAULT", 0, "default");
        f114849c = candyImageState;
        CandyImageState candyImageState2 = new CandyImageState("NIGHT", 1, "night");
        f114850d = candyImageState2;
        CandyImageState candyImageState3 = new CandyImageState("CHECKED", 2, BeduinCartItemModel.CHECKED_STRING);
        f114851e = candyImageState3;
        CandyImageState[] candyImageStateArr = {candyImageState, candyImageState2, candyImageState3};
        f114852f = candyImageStateArr;
        f114853g = kotlin.enums.c.a(candyImageStateArr);
    }

    public CandyImageState(String str, int i12, String str2) {
        this.f114854b = str2;
    }

    public static CandyImageState valueOf(String str) {
        return (CandyImageState) Enum.valueOf(CandyImageState.class, str);
    }

    public static CandyImageState[] values() {
        return (CandyImageState[]) f114852f.clone();
    }
}
