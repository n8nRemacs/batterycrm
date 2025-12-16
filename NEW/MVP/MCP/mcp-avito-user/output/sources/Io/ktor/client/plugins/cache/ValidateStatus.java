package io.ktor.client.plugins.cache;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpCacheEntry.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/cache/ValidateStatus;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ValidateStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final ValidateStatus f399116b;

    /* renamed from: c, reason: collision with root package name */
    public static final ValidateStatus f399117c;

    /* renamed from: d, reason: collision with root package name */
    public static final ValidateStatus f399118d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ValidateStatus[] f399119e;

    static {
        ValidateStatus validateStatus = new ValidateStatus("ShouldValidate", 0);
        f399116b = validateStatus;
        ValidateStatus validateStatus2 = new ValidateStatus("ShouldNotValidate", 1);
        f399117c = validateStatus2;
        ValidateStatus validateStatus3 = new ValidateStatus("ShouldWarn", 2);
        f399118d = validateStatus3;
        f399119e = new ValidateStatus[]{validateStatus, validateStatus2, validateStatus3};
    }

    public ValidateStatus() {
        throw null;
    }

    public static ValidateStatus valueOf(String str) {
        return (ValidateStatus) Enum.valueOf(ValidateStatus.class, str);
    }

    public static ValidateStatus[] values() {
        return (ValidateStatus[]) f399119e.clone();
    }
}
