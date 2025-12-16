package io.ktor.client.engine;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProxyConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/engine/ProxyType;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProxyType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ProxyType[] f398855b = {new ProxyType("SOCKS", 0), new ProxyType("HTTP", 1), new ProxyType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ProxyType EF5;

    public ProxyType() {
        throw null;
    }

    public static ProxyType valueOf(String str) {
        return (ProxyType) Enum.valueOf(ProxyType.class, str);
    }

    public static ProxyType[] values() {
        return (ProxyType[]) f398855b.clone();
    }
}
