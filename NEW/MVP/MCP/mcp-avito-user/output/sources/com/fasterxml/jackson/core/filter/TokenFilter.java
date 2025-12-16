package com.fasterxml.jackson.core.filter;

/* loaded from: classes3.dex */
public class TokenFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final TokenFilter f341131a = new TokenFilter();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Inclusion {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Inclusion[] f341132b = {new Inclusion("ONLY_INCLUDE_ALL", 0), new Inclusion("INCLUDE_ALL_AND_PATH", 1), new Inclusion("INCLUDE_NON_NULL", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Inclusion EF5;

        public Inclusion() {
            throw null;
        }

        public static Inclusion valueOf(String str) {
            return (Inclusion) Enum.valueOf(Inclusion.class, str);
        }

        public static Inclusion[] values() {
            return (Inclusion[]) f341132b.clone();
        }
    }

    public String toString() {
        return this == f341131a ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }

    public void a() {
    }

    public TokenFilter b() {
        return this;
    }

    public TokenFilter c() {
        return this;
    }

    public TokenFilter d() {
        return this;
    }

    public TokenFilter e() {
        return this;
    }
}
