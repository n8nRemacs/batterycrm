package com.avito.android.theme_settings.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.remote.model.text.FontStyleKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: ThemeSettingsEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/theme_settings/analytics/ThemeSettingsEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Mode", "Screen", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeSettingsEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f301299b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThemeSettingsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/theme_settings/analytics/ThemeSettingsEvent$Mode;", "", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f301300c;

        /* renamed from: d, reason: collision with root package name */
        public static final Mode f301301d;

        /* renamed from: e, reason: collision with root package name */
        public static final Mode f301302e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f301303f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f301304g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f301305b;

        static {
            Mode mode = new Mode("AUTO", 0, "auto");
            f301300c = mode;
            Mode mode2 = new Mode("LIGHT", 1, FontStyleKt.LIGHT);
            f301301d = mode2;
            Mode mode3 = new Mode("DARK", 2, "dark");
            f301302e = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            f301303f = modeArr;
            f301304g = c.a(modeArr);
        }

        public Mode(String str, int i12, String str2) {
            this.f301305b = str2;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f301303f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThemeSettingsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/theme_settings/analytics/ThemeSettingsEvent$Screen;", "", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Screen {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Screen[] f301306b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f301307c;

        static {
            Screen[] screenArr = {new Screen("SETTINGS", 0, "settings"), new Screen("SETTINGS_FROM_ONBOARDING", 1, "settings-from-onboarding")};
            f301306b = screenArr;
            f301307c = c.a(screenArr);
        }

        public Screen(String str, int i12, String str2) {
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) f301306b.clone();
        }
    }

    public ThemeSettingsEvent(@k Mode mode) {
        Screen[] screenArr = Screen.f301306b;
        this.f301299b = new ParametrizedClickStreamEvent(4195, 1, P0.g(new Q("app_ui_theme_setting_value", mode.f301305b), new Q("change_screen", "settings")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f301299b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f301299b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f301299b.f90248c;
    }
}
