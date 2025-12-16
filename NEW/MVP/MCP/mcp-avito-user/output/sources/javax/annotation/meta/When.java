package javax.annotation.meta;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class When {

    /* renamed from: b, reason: collision with root package name */
    public static final When f405660b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ When[] f405661c;

    static {
        When when = new When("ALWAYS", 0);
        f405660b = when;
        f405661c = new When[]{when, new When(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1), new When("MAYBE", 2), new When("NEVER", 3)};
    }

    public When() {
        throw null;
    }

    public static When valueOf(String str) {
        return (When) Enum.valueOf(When.class, str);
    }

    public static When[] values() {
        return (When[]) f405661c.clone();
    }
}
