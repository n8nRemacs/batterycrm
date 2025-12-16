package net.bytebuddy;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.utility.g;

/* loaded from: classes8.dex */
public interface NamingStrategy {

    @HashCodeAndEqualsPlugin.Enhance
    public static class Suffixing extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f415317a = "ByteBuddy";

        /* renamed from: b, reason: collision with root package name */
        public final String f415318b = "net.bytebuddy.renamed";

        /* renamed from: c, reason: collision with root package name */
        public final BaseNameResolver f415319c;

        public interface BaseNameResolver {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForUnnamedType implements BaseNameResolver {

                /* renamed from: b, reason: collision with root package name */
                public static final ForUnnamedType f415320b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForUnnamedType[] f415321c;

                static {
                    ForUnnamedType forUnnamedType = new ForUnnamedType("INSTANCE", 0);
                    f415320b = forUnnamedType;
                    f415321c = new ForUnnamedType[]{forUnnamedType};
                }

                public ForUnnamedType() {
                    throw null;
                }

                public static ForUnnamedType valueOf(String str) {
                    return (ForUnnamedType) Enum.valueOf(ForUnnamedType.class, str);
                }

                public static ForUnnamedType[] values() {
                    return (ForUnnamedType[]) f415321c.clone();
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public final String a(TypeDescription typeDescription) {
                    return typeDescription.getName();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements BaseNameResolver {
                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public final String a(TypeDescription typeDescription) {
                    return null;
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public int hashCode() {
                    getClass().hashCode();
                    throw null;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements BaseNameResolver {
                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public final String a(TypeDescription typeDescription) {
                    throw null;
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public int hashCode() {
                    getClass().hashCode();
                    throw null;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements BaseNameResolver {
                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public final String a(TypeDescription typeDescription) {
                    String str;
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    int length = stackTrace.length;
                    int i12 = 0;
                    boolean z12 = false;
                    while (true) {
                        if (i12 >= length) {
                            str = null;
                            break;
                        }
                        StackTraceElement stackTraceElement = stackTrace[i12];
                        if (stackTraceElement.getClassName().equals(ByteBuddy.class.getName())) {
                            z12 = true;
                        } else if (z12) {
                            str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                            break;
                        }
                        i12++;
                    }
                    if (str == null) {
                        throw new IllegalStateException(e.k(ByteBuddy.class, "Base name resolver not invoked via "));
                    }
                    return typeDescription.getName() + "$" + str.replace('.', '$');
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Object obj2 = ForUnnamedType.f415320b;
                    return obj2.equals(obj2);
                }

                public final int hashCode() {
                    return ForUnnamedType.f415320b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            String a(TypeDescription typeDescription);
        }

        public Suffixing(BaseNameResolver baseNameResolver) {
            this.f415319c = baseNameResolver;
        }

        public String a(TypeDescription typeDescription) {
            String strA = this.f415319c.a(typeDescription);
            if (strA.startsWith("java.")) {
                String str = this.f415318b;
                if (!str.equals("")) {
                    strA = r.r(str, ".", strA);
                }
            }
            StringBuilder sbZ = r.z(strA, "$");
            sbZ.append(this.f415317a);
            return sbZ.toString();
        }

        public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Suffixing suffixing = (Suffixing) obj;
            return this.f415317a.equals(suffixing.f415317a) && this.f415318b.equals(suffixing.f415318b) && this.f415319c.equals(suffixing.f415319c);
        }

        public int hashCode() {
            return this.f415319c.hashCode() + H.d(H.d(getClass().hashCode() * 31, 31, this.f415317a), 31, this.f415318b);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class SuffixingRandom extends Suffixing {

        /* renamed from: d, reason: collision with root package name */
        @HashCodeAndEqualsPlugin.ValueHandling
        public final g f415322d;

        @Deprecated
        public interface BaseNameResolver extends Suffixing.BaseNameResolver {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Deprecated
            public static final class ForUnnamedType implements BaseNameResolver {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ForUnnamedType[] f415323b = {new ForUnnamedType("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                ForUnnamedType EF5;

                public ForUnnamedType() {
                    throw null;
                }

                public static ForUnnamedType valueOf(String str) {
                    return (ForUnnamedType) Enum.valueOf(ForUnnamedType.class, str);
                }

                public static ForUnnamedType[] values() {
                    return (ForUnnamedType[]) f415323b.clone();
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver
                public final String a(TypeDescription typeDescription) {
                    return typeDescription.getName();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            @Deprecated
            public static class a extends Suffixing.BaseNameResolver.a implements BaseNameResolver {
                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.a
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass();
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.a
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            @Deprecated
            public static class b extends Suffixing.BaseNameResolver.b implements BaseNameResolver {
                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.b
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass();
                }

                @Override // net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.b
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }
            }
        }

        public SuffixingRandom(g gVar) {
            super(Suffixing.BaseNameResolver.ForUnnamedType.f415320b);
            this.f415322d = gVar;
        }

        @Override // net.bytebuddy.NamingStrategy.Suffixing
        public final String a(TypeDescription typeDescription) {
            return super.a(typeDescription) + "$" + this.f415322d.c();
        }

        @Override // net.bytebuddy.NamingStrategy.Suffixing
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }
    }

    public static abstract class a implements NamingStrategy {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b extends a {
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }
    }
}
