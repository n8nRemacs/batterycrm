package ru.rustore.sdk.core.config;

import Y61.k;
import Y61.l;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RuStoreInternalConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/core/config/a;", "", "a", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C12582a f436771b = new C12582a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SdkType f436772a;

    /* compiled from: RuStoreInternalConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/core/config/a$a;", "", "<init>", "()V", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: ru.rustore.sdk.core.config.a$a, reason: collision with other inner class name */
    public static final class C12582a {
        public /* synthetic */ C12582a(C42822w c42822w) {
            this();
        }

        @k
        public static a a(@l Map map) {
            SdkType sdkType;
            if (map == null) {
                return new a(SdkType.KOTLIN, null);
            }
            SdkType.f436762c.getClass();
            Object obj = map.get("type");
            String str = obj instanceof String ? (String) obj : null;
            SdkType sdkType2 = SdkType.KOTLIN;
            if (L.f(str, "kotlin")) {
                sdkType = sdkType2;
            } else {
                sdkType = SdkType.UNITY;
                if (!L.f(str, PluginErrorDetails.Platform.UNITY)) {
                    sdkType = SdkType.FLUTTER;
                    if (!L.f(str, PluginErrorDetails.Platform.FLUTTER)) {
                        sdkType = SdkType.UNREAL_ENGINE;
                        if (!L.f(str, "unreal-engine")) {
                            sdkType = SdkType.GODOT;
                            if (!L.f(str, "godot")) {
                                sdkType = SdkType.REACT_NATIVE;
                                if (!L.f(str, "react-native")) {
                                    sdkType = null;
                                }
                            }
                        }
                    }
                }
            }
            if (sdkType != null) {
                sdkType2 = sdkType;
            }
            return new a(sdkType2, null);
        }

        public C12582a() {
        }
    }

    public a(SdkType sdkType, C42822w c42822w) {
        this.f436772a = sdkType;
    }
}
