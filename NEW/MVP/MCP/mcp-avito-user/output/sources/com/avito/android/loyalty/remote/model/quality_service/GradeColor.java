package com.avito.android.loyalty.remote.model.quality_service;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GradeColor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "", "(Ljava/lang/String;I)V", "RED", "GREEN", "YELLOW", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GradeColor {

    @c("green")
    public static final GradeColor GREEN;

    @c("red")
    public static final GradeColor RED;

    @c("yellow")
    public static final GradeColor YELLOW;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ GradeColor[] f183239b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f183240c;

    static {
        GradeColor gradeColor = new GradeColor("RED", 0);
        RED = gradeColor;
        GradeColor gradeColor2 = new GradeColor("GREEN", 1);
        GREEN = gradeColor2;
        GradeColor gradeColor3 = new GradeColor("YELLOW", 2);
        YELLOW = gradeColor3;
        GradeColor[] gradeColorArr = {gradeColor, gradeColor2, gradeColor3};
        f183239b = gradeColorArr;
        f183240c = kotlin.enums.c.a(gradeColorArr);
    }

    private GradeColor(String str, int i12) {
    }

    public static GradeColor valueOf(String str) {
        return (GradeColor) Enum.valueOf(GradeColor.class, str);
    }

    public static GradeColor[] values() {
        return (GradeColor[]) f183239b.clone();
    }
}
