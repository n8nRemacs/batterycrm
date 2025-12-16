package com.avito.android.vas_performance.remote.model.stickers.buy;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InfoIconName.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/remote/model/stickers/buy/InfoIconName;", "", "(Ljava/lang/String;I)V", "INFO", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InfoIconName {

    @c(RequestReviewResultKt.INFO_TYPE)
    public static final InfoIconName INFO;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InfoIconName[] f320222b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f320223c;

    static {
        InfoIconName infoIconName = new InfoIconName("INFO", 0);
        INFO = infoIconName;
        InfoIconName[] infoIconNameArr = {infoIconName};
        f320222b = infoIconNameArr;
        f320223c = kotlin.enums.c.a(infoIconNameArr);
    }

    private InfoIconName(String str, int i12) {
    }

    public static InfoIconName valueOf(String str) {
        return (InfoIconName) Enum.valueOf(InfoIconName.class, str);
    }

    public static InfoIconName[] values() {
        return (InfoIconName[]) f320222b.clone();
    }
}
