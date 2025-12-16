package net.bytebuddy.implementation;

import androidx.compose.foundation.H;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.jar.asm.s;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class InvokeDynamic implements Implementation.b {

    public interface InvocationProvider {

        public interface ArgumentProvider {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class ConstantPoolWrapper {

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ ConstantPoolWrapper[] f417337d = {new a("BOOLEAN", 0, Boolean.TYPE, Boolean.class, null), new b("BYTE", 1, Byte.TYPE, Byte.class, null), new c("SHORT", 2, Short.TYPE, Short.class, null), new d("CHARACTER", 3, Character.TYPE, Character.class, null), new e("INTEGER", 4, Integer.TYPE, Integer.class, null), new f("LONG", 5, Long.TYPE, Long.class, null), new g("FLOAT", 6, Float.TYPE, Float.class, null), new h("DOUBLE", 7, Double.TYPE, Double.class, null)};

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417338b;

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f417339c;

                /* JADX INFO: Fake field, exist only in values array */
                ConstantPoolWrapper EF11;

                public enum a extends ConstantPoolWrapper {
                }

                public enum b extends ConstantPoolWrapper {
                }

                public enum c extends ConstantPoolWrapper {
                }

                public enum d extends ConstantPoolWrapper {
                }

                public enum e extends ConstantPoolWrapper {
                }

                public enum f extends ConstantPoolWrapper {
                }

                public enum g extends ConstantPoolWrapper {
                }

                public enum h extends ConstantPoolWrapper {
                }

                @HashCodeAndEqualsPlugin.Enhance
                public class i implements ArgumentProvider {
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

                public ConstantPoolWrapper() {
                    throw null;
                }

                public ConstantPoolWrapper(String str, int i12, Class cls, Class cls2, a aVar) {
                    this.f417338b = TypeDescription.d.A0(cls);
                    this.f417339c = TypeDescription.d.A0(cls2);
                }

                public static ConstantPoolWrapper valueOf(String str) {
                    return (ConstantPoolWrapper) Enum.valueOf(ConstantPoolWrapper.class, str);
                }

                public static ConstantPoolWrapper[] values() {
                    return (ConstantPoolWrapper[]) f417337d.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForInterceptedMethodInstanceAndParameters implements ArgumentProvider {

                /* renamed from: b, reason: collision with root package name */
                public static final ForInterceptedMethodInstanceAndParameters f417340b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForInterceptedMethodInstanceAndParameters[] f417341c;

                static {
                    ForInterceptedMethodInstanceAndParameters forInterceptedMethodInstanceAndParameters = new ForInterceptedMethodInstanceAndParameters("INSTANCE", 0);
                    f417340b = forInterceptedMethodInstanceAndParameters;
                    f417341c = new ForInterceptedMethodInstanceAndParameters[]{forInterceptedMethodInstanceAndParameters};
                }

                public ForInterceptedMethodInstanceAndParameters() {
                    throw null;
                }

                public static ForInterceptedMethodInstanceAndParameters valueOf(String str) {
                    return (ForInterceptedMethodInstanceAndParameters) Enum.valueOf(ForInterceptedMethodInstanceAndParameters.class, str);
                }

                public static ForInterceptedMethodInstanceAndParameters[] values() {
                    return (ForInterceptedMethodInstanceAndParameters[]) f417341c.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForInterceptedMethodParameters implements ArgumentProvider {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ForInterceptedMethodParameters[] f417342b = {new ForInterceptedMethodParameters("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                ForInterceptedMethodParameters EF5;

                public ForInterceptedMethodParameters() {
                    throw null;
                }

                public static ForInterceptedMethodParameters valueOf(String str) {
                    return (ForInterceptedMethodParameters) Enum.valueOf(ForInterceptedMethodParameters.class, str);
                }

                public static ForInterceptedMethodParameters[] values() {
                    return (ForInterceptedMethodParameters[]) f417342b.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements ArgumentProvider {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return getClass().hashCode() * 31;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements ArgumentProvider {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return getClass().hashCode() * 31;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements ArgumentProvider {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return getClass().hashCode() * 31;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class d implements ArgumentProvider {
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class e implements ArgumentProvider {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return Double.compare(0.0d, 0.0d) == 0;
                }

                public final int hashCode() {
                    int iHashCode = getClass().hashCode() * 31;
                    long jDoubleToLongBits = Double.doubleToLongBits(0.0d);
                    return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class f implements ArgumentProvider {
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class g implements ArgumentProvider {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a extends g {
                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.g
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
                        throw null;
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.g
                    public final int hashCode() {
                        super.hashCode();
                        throw null;
                    }
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
            public static class h implements ArgumentProvider {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return Float.compare(0.0f, 0.0f) == 0;
                }

                public final int hashCode() {
                    return Float.floatToIntBits(0.0f) + (getClass().hashCode() * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class i implements ArgumentProvider {
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class j implements ArgumentProvider {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return getClass().hashCode() * 31;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class k implements ArgumentProvider {
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class l implements ArgumentProvider {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return (getClass().hashCode() * 31) + ((int) 0);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class m implements ArgumentProvider {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a extends m {
                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.m
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
                        throw null;
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.m
                    public final int hashCode() {
                        super.hashCode();
                        throw null;
                    }
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return getClass().hashCode() * 31;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class n implements ArgumentProvider {
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class o implements ArgumentProvider {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return getClass().hashCode() * 31;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class p implements ArgumentProvider {
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class q implements ArgumentProvider {
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

            public interface r {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements r {
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
        }

        public interface NameProvider {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForInterceptedMethod implements NameProvider {

                /* renamed from: b, reason: collision with root package name */
                public static final ForInterceptedMethod f417343b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForInterceptedMethod[] f417344c;

                static {
                    ForInterceptedMethod forInterceptedMethod = new ForInterceptedMethod("INSTANCE", 0);
                    f417343b = forInterceptedMethod;
                    f417344c = new ForInterceptedMethod[]{forInterceptedMethod};
                }

                public ForInterceptedMethod() {
                    throw null;
                }

                public static ForInterceptedMethod valueOf(String str) {
                    return (ForInterceptedMethod) Enum.valueOf(ForInterceptedMethod.class, str);
                }

                public static ForInterceptedMethod[] values() {
                    return (ForInterceptedMethod[]) f417344c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements NameProvider {
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

        public interface ReturnTypeProvider {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForInterceptedMethod implements ReturnTypeProvider {

                /* renamed from: b, reason: collision with root package name */
                public static final ForInterceptedMethod f417345b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForInterceptedMethod[] f417346c;

                static {
                    ForInterceptedMethod forInterceptedMethod = new ForInterceptedMethod("INSTANCE", 0);
                    f417345b = forInterceptedMethod;
                    f417346c = new ForInterceptedMethod[]{forInterceptedMethod};
                }

                public ForInterceptedMethod() {
                    throw null;
                }

                public static ForInterceptedMethod valueOf(String str) {
                    return (ForInterceptedMethod) Enum.valueOf(ForInterceptedMethod.class, str);
                }

                public static ForInterceptedMethod[] values() {
                    return (ForInterceptedMethod[]) f417346c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements ReturnTypeProvider {
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

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements InvocationProvider {

            /* renamed from: a, reason: collision with root package name */
            public final NameProvider.ForInterceptedMethod f417347a;

            /* renamed from: b, reason: collision with root package name */
            public final ReturnTypeProvider.ForInterceptedMethod f417348b;

            /* renamed from: c, reason: collision with root package name */
            public final List<ArgumentProvider> f417349c;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$a$a, reason: collision with other inner class name */
            public static class C12079a implements b {
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
                    H.e(D8.j(null, H.d(getClass().hashCode() * 31, 31, null), 31), 31, null);
                    throw null;
                }
            }

            public a() {
                NameProvider.ForInterceptedMethod forInterceptedMethod = NameProvider.ForInterceptedMethod.f417343b;
                ReturnTypeProvider.ForInterceptedMethod forInterceptedMethod2 = ReturnTypeProvider.ForInterceptedMethod.f417345b;
                List<ArgumentProvider> listSingletonList = Collections.singletonList(ArgumentProvider.ForInterceptedMethodInstanceAndParameters.f417340b);
                this.f417347a = forInterceptedMethod;
                this.f417348b = forInterceptedMethod2;
                this.f417349c = listSingletonList;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417347a.equals(aVar.f417347a) && this.f417348b.equals(aVar.f417348b) && this.f417349c.equals(aVar.f417349c);
            }

            public final int hashCode() {
                return this.f417349c.hashCode() + ((this.f417348b.hashCode() + ((this.f417347a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
            }
        }

        public interface b {

            public interface a {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$b$a$a, reason: collision with other inner class name */
                public static class C12080a implements a {
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
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class TerminationHandler {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TerminationHandler[] f417350b = {new a("RETURNING", 0, null), new b("DROPPING", 1, null)};

        /* JADX INFO: Fake field, exist only in values array */
        TerminationHandler EF7;

        public enum a extends TerminationHandler {
        }

        public enum b extends TerminationHandler {
        }

        public TerminationHandler() {
            throw null;
        }

        public TerminationHandler(String str, int i12, a aVar) {
        }

        public static TerminationHandler valueOf(String str) {
            return (TerminationHandler) Enum.valueOf(TerminationHandler.class, str);
        }

        public static TerminationHandler[] values() {
            return (TerminationHandler[]) f417350b.clone();
        }
    }

    public static abstract class b extends InvokeDynamic {
        public abstract InvokeDynamic a();

        @Override // net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            a();
            throw null;
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return a().i(target);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class c implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f417351b;

        public c(TypeDescription typeDescription) {
            this.f417351b = typeDescription;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f417351b.equals(cVar.f417351b) && InvokeDynamic.this.equals(InvokeDynamic.this);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            InvokeDynamic.this.getClass();
            throw null;
        }

        public final int hashCode() {
            return InvokeDynamic.this.hashCode() + D8.j(this.f417351b, getClass().hashCode() * 31, 31);
        }
    }

    public static class d extends b {
        @Override // net.bytebuddy.implementation.InvokeDynamic.b
        public final InvokeDynamic a() {
            throw null;
        }
    }

    public static class e extends d {
    }

    public static abstract class f extends b {

        @SuppressFBWarnings(justification = "Super type implementation covers use case", value = {"EQ_DOESNT_OVERRIDE_EQUALS"})
        public static class a extends f {
            @Override // net.bytebuddy.implementation.InvokeDynamic.b
            public final InvokeDynamic a() {
                throw null;
            }
        }

        @SuppressFBWarnings(justification = "Super type implementation covers use case", value = {"EQ_DOESNT_OVERRIDE_EQUALS"})
        public static class b extends f {
            @Override // net.bytebuddy.implementation.InvokeDynamic.b
            public final InvokeDynamic a() {
                throw null;
            }
        }

        @SuppressFBWarnings(justification = "Super type implementation covers use case", value = {"EQ_DOESNT_OVERRIDE_EQUALS"})
        public static class c extends f {
            @Override // net.bytebuddy.implementation.InvokeDynamic.b
            public final InvokeDynamic a() {
                throw null;
            }
        }
    }

    public InvokeDynamic() {
        throw null;
    }

    @Override // net.bytebuddy.implementation.Implementation.b
    public final Implementation.b c(Implementation.b bVar) {
        TerminationHandler[] terminationHandlerArr = TerminationHandler.f417350b;
        throw null;
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType e(InstrumentedType instrumentedType) {
        throw null;
    }

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

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        return new c(target.a());
    }
}
