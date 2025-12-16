package org.objenesis.instantiator.annotations;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Typology {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Typology[] f421791b = {new Typology("STANDARD", 0), new Typology("SERIALIZATION", 1), new Typology("NOT_COMPLIANT", 2), new Typology(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Typology EF5;

    public Typology() {
        throw null;
    }

    public static Typology valueOf(String str) {
        return (Typology) Enum.valueOf(Typology.class, str);
    }

    public static Typology[] values() {
        return (Typology[]) f421791b.clone();
    }
}
