package com.avito.android.features.auto.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoAdvertDetailsI2IDealerBlockTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/features/auto/ab_tests/configs/AutoAdvertDetailsI2IDealerBlockTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutoAdvertDetailsI2IDealerBlockTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AutoAdvertDetailsI2IDealerBlockTestGroup f157638c;

    /* renamed from: d, reason: collision with root package name */
    public static final AutoAdvertDetailsI2IDealerBlockTestGroup f157639d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AutoAdvertDetailsI2IDealerBlockTestGroup[] f157640e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f157641f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157642b;

    static {
        AutoAdvertDetailsI2IDealerBlockTestGroup autoAdvertDetailsI2IDealerBlockTestGroup = new AutoAdvertDetailsI2IDealerBlockTestGroup("NONE", 0, "");
        f157638c = autoAdvertDetailsI2IDealerBlockTestGroup;
        AutoAdvertDetailsI2IDealerBlockTestGroup autoAdvertDetailsI2IDealerBlockTestGroup2 = new AutoAdvertDetailsI2IDealerBlockTestGroup("CONTROL", 1, "control");
        f157639d = autoAdvertDetailsI2IDealerBlockTestGroup2;
        AutoAdvertDetailsI2IDealerBlockTestGroup[] autoAdvertDetailsI2IDealerBlockTestGroupArr = {autoAdvertDetailsI2IDealerBlockTestGroup, autoAdvertDetailsI2IDealerBlockTestGroup2, new AutoAdvertDetailsI2IDealerBlockTestGroup("TEST", 2, "test"), new AutoAdvertDetailsI2IDealerBlockTestGroup("TEST_WITH_DEALER_BOOST", 3, "test_with_dealer_boost")};
        f157640e = autoAdvertDetailsI2IDealerBlockTestGroupArr;
        f157641f = c.a(autoAdvertDetailsI2IDealerBlockTestGroupArr);
    }

    public AutoAdvertDetailsI2IDealerBlockTestGroup(String str, int i12, String str2) {
        this.f157642b = str2;
    }

    public static AutoAdvertDetailsI2IDealerBlockTestGroup valueOf(String str) {
        return (AutoAdvertDetailsI2IDealerBlockTestGroup) Enum.valueOf(AutoAdvertDetailsI2IDealerBlockTestGroup.class, str);
    }

    public static AutoAdvertDetailsI2IDealerBlockTestGroup[] values() {
        return (AutoAdvertDetailsI2IDealerBlockTestGroup[]) f157640e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF157642b() {
        return this.f157642b;
    }
}
