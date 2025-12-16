package com.avito.android.deep_linking.links;

import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinUniversalPageLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/ThemeMode;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "LIGHT", "DARK", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ThemeMode {

    @com.google.gson.annotations.c("dark")
    public static final ThemeMode DARK;

    @com.google.gson.annotations.c(FontStyleKt.LIGHT)
    public static final ThemeMode LIGHT;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f133714c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ThemeMode[] f133715d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f133716e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133717b;

    /* compiled from: BeduinUniversalPageLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ThemeMode$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ThemeMode themeMode = new ThemeMode("LIGHT", 0, FontStyleKt.LIGHT);
        LIGHT = themeMode;
        ThemeMode themeMode2 = new ThemeMode("DARK", 1, "dark");
        DARK = themeMode2;
        ThemeMode[] themeModeArr = {themeMode, themeMode2};
        f133715d = themeModeArr;
        f133716e = kotlin.enums.c.a(themeModeArr);
        f133714c = new a(null);
    }

    private ThemeMode(String str, int i12, String str2) {
        this.f133717b = str2;
    }

    public static ThemeMode valueOf(String str) {
        return (ThemeMode) Enum.valueOf(ThemeMode.class, str);
    }

    public static ThemeMode[] values() {
        return (ThemeMode[]) f133715d.clone();
    }
}
