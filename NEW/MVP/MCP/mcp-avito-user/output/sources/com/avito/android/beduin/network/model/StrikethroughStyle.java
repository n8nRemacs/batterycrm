package com.avito.android.beduin.network.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StrikethroughStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/model/StrikethroughStyle;", "", "(Ljava/lang/String;I)V", "SOLID", "SOLID_MIDDLE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StrikethroughStyle {

    @c("solid")
    public static final StrikethroughStyle SOLID;

    @c("solidMiddle")
    public static final StrikethroughStyle SOLID_MIDDLE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ StrikethroughStyle[] f104016b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f104017c;

    static {
        StrikethroughStyle strikethroughStyle = new StrikethroughStyle("SOLID", 0);
        SOLID = strikethroughStyle;
        StrikethroughStyle strikethroughStyle2 = new StrikethroughStyle("SOLID_MIDDLE", 1);
        SOLID_MIDDLE = strikethroughStyle2;
        StrikethroughStyle[] strikethroughStyleArr = {strikethroughStyle, strikethroughStyle2};
        f104016b = strikethroughStyleArr;
        f104017c = kotlin.enums.c.a(strikethroughStyleArr);
    }

    private StrikethroughStyle(String str, int i12) {
    }

    public static StrikethroughStyle valueOf(String str) {
        return (StrikethroughStyle) Enum.valueOf(StrikethroughStyle.class, str);
    }

    public static StrikethroughStyle[] values() {
        return (StrikethroughStyle[]) f104016b.clone();
    }
}
