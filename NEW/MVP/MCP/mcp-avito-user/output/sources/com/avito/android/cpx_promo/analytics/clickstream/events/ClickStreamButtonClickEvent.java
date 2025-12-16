package com.avito.android.cpx_promo.analytics.clickstream.events;

import Y61.k;
import Y61.l;
import Zr.e;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: ClickStreamButtonClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/analytics/clickstream/events/ClickStreamButtonClickEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ButtonName", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClickStreamButtonClickEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f126792b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClickStreamButtonClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/analytics/clickstream/events/ClickStreamButtonClickEvent$ButtonName;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ButtonName {

        /* renamed from: c, reason: collision with root package name */
        public static final ButtonName f126793c;

        /* renamed from: d, reason: collision with root package name */
        public static final ButtonName f126794d;

        /* renamed from: e, reason: collision with root package name */
        public static final ButtonName f126795e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ButtonName[] f126796f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f126797g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f126798b;

        static {
            ButtonName buttonName = new ButtonName("SKIP", 0, "skip");
            f126793c = buttonName;
            ButtonName buttonName2 = new ButtonName("SAVE", 1, "save");
            f126794d = buttonName2;
            ButtonName buttonName3 = new ButtonName("DISABLE", 2, "disable");
            f126795e = buttonName3;
            ButtonName[] buttonNameArr = {buttonName, buttonName2, buttonName3};
            f126796f = buttonNameArr;
            f126797g = c.a(buttonNameArr);
        }

        public ButtonName(String str, int i12, String str2) {
            this.f126798b = str2;
        }

        public static ButtonName valueOf(String str) {
            return (ButtonName) Enum.valueOf(ButtonName.class, str);
        }

        public static ButtonName[] values() {
            return (ButtonName[]) f126796f.clone();
        }
    }

    public ClickStreamButtonClickEvent(@k String str, boolean z12, @l Long l12, @l Long l13, @l Long l14, @l String str2, @k ButtonName buttonName, int i12, int i13) {
        this.f126792b = new e(11098, 2, str, z12, i12, i13, C35755b0.c(P0.g(new Q("budget", l12), new Q("period_type", str2), new Q("price", l13), new Q("daily_limit", l14), new Q("button_name", buttonName.f126798b))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f126792b.getF75431b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f126792b.getParams();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f126792b.getF75432c();
    }
}
