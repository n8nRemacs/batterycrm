package com.avito.android.tariff.remote.model.bar;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BarDescriptionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/remote/model/bar/BarDescriptionState;", "", "(Ljava/lang/String;I)V", "WARNING", "NORMAL", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarDescriptionState {

    @c(Constants.NORMAL)
    public static final BarDescriptionState NORMAL;

    @c(ConstraintKt.WARNING)
    public static final BarDescriptionState WARNING;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BarDescriptionState[] f297485b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f297486c;

    static {
        BarDescriptionState barDescriptionState = new BarDescriptionState("WARNING", 0);
        WARNING = barDescriptionState;
        BarDescriptionState barDescriptionState2 = new BarDescriptionState("NORMAL", 1);
        NORMAL = barDescriptionState2;
        BarDescriptionState[] barDescriptionStateArr = {barDescriptionState, barDescriptionState2};
        f297485b = barDescriptionStateArr;
        f297486c = kotlin.enums.c.a(barDescriptionStateArr);
    }

    private BarDescriptionState(String str, int i12) {
    }

    public static BarDescriptionState valueOf(String str) {
        return (BarDescriptionState) Enum.valueOf(BarDescriptionState.class, str);
    }

    public static BarDescriptionState[] values() {
        return (BarDescriptionState[]) f297485b.clone();
    }
}
