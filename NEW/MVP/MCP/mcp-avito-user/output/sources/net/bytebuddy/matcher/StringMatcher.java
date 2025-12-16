package net.bytebuddy.matcher;

import androidx.compose.runtime.C22026a;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class StringMatcher extends InterfaceC44410t.a.d<String> {

    /* renamed from: b, reason: collision with root package name */
    public final String f418410b;

    /* renamed from: c, reason: collision with root package name */
    public final Mode f418411c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Mode {

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f418412c;

        /* renamed from: d, reason: collision with root package name */
        public static final Mode f418413d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f418414e;

        /* renamed from: b, reason: collision with root package name */
        public final String f418415b;

        public enum a extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            public final boolean a(String str, String str2) {
                return str2.equals(str);
            }
        }

        public enum b extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            public final boolean a(String str, String str2) {
                return str2.equalsIgnoreCase(str);
            }
        }

        public enum c extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            public final boolean a(String str, String str2) {
                return str2.startsWith(str);
            }
        }

        public enum d extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            @SuppressFBWarnings(justification = "Both strings are transformed by the default locale.", value = {"DM_CONVERT_CASE"})
            public final boolean a(String str, String str2) {
                return str2.toLowerCase().startsWith(str.toLowerCase());
            }
        }

        public enum e extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            public final boolean a(String str, String str2) {
                return str2.endsWith(str);
            }
        }

        public enum f extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            @SuppressFBWarnings(justification = "Both strings are transformed by the default locale.", value = {"DM_CONVERT_CASE"})
            public final boolean a(String str, String str2) {
                return str2.toLowerCase().endsWith(str.toLowerCase());
            }
        }

        public enum g extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            public final boolean a(String str, String str2) {
                return str2.contains(str);
            }
        }

        public enum h extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            @SuppressFBWarnings(justification = "Both strings are transformed by the default locale.", value = {"DM_CONVERT_CASE"})
            public final boolean a(String str, String str2) {
                return str2.toLowerCase().contains(str.toLowerCase());
            }
        }

        public enum i extends Mode {
            @Override // net.bytebuddy.matcher.StringMatcher.Mode
            public final boolean a(String str, String str2) {
                return str2.matches(str);
            }
        }

        static {
            a aVar = new a("EQUALS_FULLY", 0, "equals", null);
            f418412c = aVar;
            b bVar = new b("EQUALS_FULLY_IGNORE_CASE", 1, "equalsIgnoreCase", null);
            c cVar = new c("STARTS_WITH", 2, "startsWith", null);
            f418413d = cVar;
            f418414e = new Mode[]{aVar, bVar, cVar, new d("STARTS_WITH_IGNORE_CASE", 3, "startsWithIgnoreCase", null), new e("ENDS_WITH", 4, "endsWith", null), new f("ENDS_WITH_IGNORE_CASE", 5, "endsWithIgnoreCase", null), new g("CONTAINS", 6, "contains", null), new h("CONTAINS_IGNORE_CASE", 7, "containsIgnoreCase", null), new i("MATCHES", 8, "matches", null)};
        }

        public Mode() {
            throw null;
        }

        public Mode(String str, int i12, String str2, a aVar) {
            this.f418415b = str2;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f418414e.clone();
        }

        public abstract boolean a(String str, String str2);
    }

    public StringMatcher(String str, Mode mode) {
        this.f418410b = str;
        this.f418411c = mode;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(String str) {
        return this.f418411c.a(this.f418410b, str);
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StringMatcher stringMatcher = (StringMatcher) obj;
        return this.f418411c.equals(stringMatcher.f418411c) && this.f418410b.equals(stringMatcher.f418410b);
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418411c.hashCode() + androidx.compose.foundation.H.d(super.hashCode() * 31, 31, this.f418410b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f418411c.f418415b);
        sb2.append('(');
        return C22026a.c(sb2, this.f418410b, ')');
    }
}
