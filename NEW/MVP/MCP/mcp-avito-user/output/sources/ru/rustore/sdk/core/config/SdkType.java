package ru.rustore.sdk.core.config;

import Y61.k;
import com.yandex.metrica.plugins.PluginErrorDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SdkType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/core/config/SdkType;", "", "a", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum SdkType {
    KOTLIN("kotlin"),
    UNITY(PluginErrorDetails.Platform.UNITY),
    FLUTTER(PluginErrorDetails.Platform.FLUTTER),
    UNREAL_ENGINE("unreal-engine"),
    GODOT("godot"),
    REACT_NATIVE("react-native");


    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f436762c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f436770b;

    /* compiled from: SdkType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/rustore/sdk/core/config/SdkType$a;", "", "<init>", "()V", "", "KEY", "Ljava/lang/String;", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    SdkType(String str) {
        this.f436770b = str;
    }
}
