package net.bytebuddy.implementation.bind;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.ArgumentTypeResolver;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public interface MethodDelegationBinder {

    @SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
    public interface AmbiguityResolver {

        /* renamed from: K2, reason: collision with root package name */
        public static final a f417604K2 = new a(BindingPriority.Resolver.f417665b, DeclaringTypeResolver.f417602b, ArgumentTypeResolver.f417589b, MethodNameEqualityResolver.f417647b, ParameterLengthResolver.f417649b);

        public enum Directional implements AmbiguityResolver {
            /* JADX INFO: Fake field, exist only in values array */
            LEFT(true),
            /* JADX INFO: Fake field, exist only in values array */
            RIGHT(false);


            /* renamed from: b, reason: collision with root package name */
            public final boolean f417606b;

            Directional(boolean z12) {
                this.f417606b = z12;
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public final Resolution a(net.bytebuddy.description.method.a aVar, MethodBinding methodBinding, MethodBinding methodBinding2) {
                return this.f417606b ? Resolution.LEFT : Resolution.RIGHT;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements AmbiguityResolver {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f417607b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f417607b.clone();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public final Resolution a(net.bytebuddy.description.method.a aVar, MethodBinding methodBinding, MethodBinding methodBinding2) {
                return Resolution.UNKNOWN;
            }
        }

        public enum Resolution {
            UNKNOWN(true),
            LEFT(false),
            RIGHT(false),
            AMBIGUOUS(true);


            /* renamed from: b, reason: collision with root package name */
            public final boolean f417613b;

            Resolution(boolean z12) {
                this.f417613b = z12;
            }

            public final Resolution a(Resolution resolution) {
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    return resolution;
                }
                Resolution resolution2 = AMBIGUOUS;
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return (resolution == UNKNOWN || resolution == this) ? this : resolution2;
                }
                if (iOrdinal == 3) {
                    return resolution2;
                }
                throw new AssertionError();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements AmbiguityResolver {

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList f417614b;

            public a() {
                throw null;
            }

            public a(AmbiguityResolver... ambiguityResolverArr) {
                List<AmbiguityResolver> listAsList = Arrays.asList(ambiguityResolverArr);
                this.f417614b = new ArrayList();
                for (AmbiguityResolver ambiguityResolver : listAsList) {
                    if (ambiguityResolver instanceof a) {
                        this.f417614b.addAll(((a) ambiguityResolver).f417614b);
                    } else if (!(ambiguityResolver instanceof NoOp)) {
                        this.f417614b.add(ambiguityResolver);
                    }
                }
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public final Resolution a(net.bytebuddy.description.method.a aVar, MethodBinding methodBinding, MethodBinding methodBinding2) {
                Resolution resolutionA = Resolution.UNKNOWN;
                Iterator it = this.f417614b.iterator();
                while (resolutionA.f417613b && it.hasNext()) {
                    resolutionA = ((AmbiguityResolver) it.next()).a(aVar, methodBinding, methodBinding2);
                }
                return resolutionA;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f417614b.equals(((a) obj).f417614b);
            }

            public final int hashCode() {
                return this.f417614b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        Resolution a(net.bytebuddy.description.method.a aVar, MethodBinding methodBinding, MethodBinding methodBinding2);
    }

    public interface BindingResolver {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Default implements BindingResolver {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f417615b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Default[] f417616c;

            static {
                Default r02 = new Default("INSTANCE", 0);
                f417615b = r02;
                f417616c = new Default[]{r02};
            }

            public Default() {
                throw null;
            }

            public static MethodBinding a(AmbiguityResolver.a aVar, net.bytebuddy.description.method.a aVar2, ArrayList arrayList) {
                int size = arrayList.size();
                if (size == 1) {
                    return (MethodBinding) arrayList.get(0);
                }
                if (size == 2) {
                    MethodBinding methodBinding = (MethodBinding) arrayList.get(0);
                    MethodBinding methodBinding2 = (MethodBinding) arrayList.get(1);
                    int iOrdinal = aVar.a(aVar2, methodBinding, methodBinding2).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            return methodBinding;
                        }
                        if (iOrdinal == 2) {
                            return methodBinding2;
                        }
                        if (iOrdinal != 3) {
                            throw new AssertionError();
                        }
                    }
                    throw new IllegalArgumentException("Cannot resolve ambiguous delegation of " + aVar2 + " to " + methodBinding.b() + " or " + methodBinding2.b());
                }
                MethodBinding methodBinding3 = (MethodBinding) arrayList.get(0);
                MethodBinding methodBinding4 = (MethodBinding) arrayList.get(1);
                int iOrdinal2 = aVar.a(aVar2, methodBinding3, methodBinding4).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        arrayList.remove(1);
                        return a(aVar, aVar2, arrayList);
                    }
                    if (iOrdinal2 == 2) {
                        arrayList.remove(0);
                        return a(aVar, aVar2, arrayList);
                    }
                    if (iOrdinal2 != 3) {
                        throw new IllegalStateException("Unexpected amount of targets: " + arrayList.size());
                    }
                }
                arrayList.remove(1);
                arrayList.remove(0);
                MethodBinding methodBindingA = a(aVar, aVar2, arrayList);
                int iOrdinal3 = aVar.a(aVar2, methodBinding3, methodBindingA).a(aVar.a(aVar2, methodBinding4, methodBindingA)).ordinal();
                if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                    if (iOrdinal3 == 2) {
                        return methodBindingA;
                    }
                    if (iOrdinal3 != 3) {
                        throw new AssertionError();
                    }
                }
                throw new IllegalArgumentException("Cannot resolve ambiguous delegation of " + aVar2 + " to " + methodBinding3.b() + " or " + methodBinding4.b());
            }

            public static Default valueOf(String str) {
                return (Default) Enum.valueOf(Default.class, str);
            }

            public static Default[] values() {
                return (Default[]) f417616c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Unique implements BindingResolver {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Unique[] f417617b = {new Unique("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            Unique EF5;

            public Unique() {
                throw null;
            }

            public static Unique valueOf(String str) {
                return (Unique) Enum.valueOf(Unique.class, str);
            }

            public static Unique[] values() {
                return (Unique[]) f417617b.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements BindingResolver {
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

    public interface MethodBinding extends StackManipulation {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Illegal implements MethodBinding {

            /* renamed from: b, reason: collision with root package name */
            public static final Illegal f417618b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Illegal[] f417619c;

            static {
                Illegal illegal = new Illegal("INSTANCE", 0);
                f417618b = illegal;
                f417619c = new Illegal[]{illegal};
            }

            public Illegal() {
                throw null;
            }

            public static Illegal valueOf(String str) {
                return (Illegal) Enum.valueOf(Illegal.class, str);
            }

            public static Illegal[] values() {
                return (Illegal[]) f417619c.clone();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
            public final net.bytebuddy.description.method.a b() {
                throw new IllegalStateException("Method is not bound");
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return false;
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
            public final Integer l(ArgumentTypeResolver.a aVar) {
                throw new IllegalStateException("Method is not bound");
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                throw new IllegalStateException("Cannot delegate to an unbound method");
            }
        }

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final MethodInvoker f417620a;

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417621b;

            /* renamed from: c, reason: collision with root package name */
            public final ArrayList f417622c;

            /* renamed from: d, reason: collision with root package name */
            public final LinkedHashMap<Object, Integer> f417623d = new LinkedHashMap<>();

            /* renamed from: e, reason: collision with root package name */
            public int f417624e = 0;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$a$a, reason: collision with other inner class name */
            public static class C12092a implements MethodBinding {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417625b;

                /* renamed from: c, reason: collision with root package name */
                public final HashMap f417626c;

                /* renamed from: d, reason: collision with root package name */
                public final StackManipulation f417627d;

                /* renamed from: e, reason: collision with root package name */
                public final ArrayList f417628e;

                /* renamed from: f, reason: collision with root package name */
                public final StackManipulation f417629f;

                public C12092a(net.bytebuddy.description.method.a aVar, LinkedHashMap linkedHashMap, StackManipulation stackManipulation, ArrayList arrayList, StackManipulation stackManipulation2) {
                    this.f417625b = aVar;
                    this.f417626c = new HashMap(linkedHashMap);
                    this.f417627d = stackManipulation;
                    this.f417628e = new ArrayList(arrayList);
                    this.f417629f = stackManipulation2;
                }

                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
                public final net.bytebuddy.description.method.a b() {
                    return this.f417625b;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    C12092a c12092a = (C12092a) obj;
                    return this.f417625b.equals(c12092a.f417625b) && this.f417626c.equals(c12092a.f417626c) && this.f417627d.equals(c12092a.f417627d) && this.f417628e.equals(c12092a.f417628e) && this.f417629f.equals(c12092a.f417629f);
                }

                public final int hashCode() {
                    return this.f417629f.hashCode() + e.g(this.f417628e, (this.f417627d.hashCode() + ((this.f417626c.hashCode() + D8.h(this.f417625b, getClass().hashCode() * 31, 31)) * 31)) * 31, 31);
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public final boolean isValid() {
                    boolean zIsValid = this.f417627d.isValid() && this.f417629f.isValid();
                    Iterator it = this.f417628e.iterator();
                    while (zIsValid && it.hasNext()) {
                        zIsValid = ((StackManipulation) it.next()).isValid();
                    }
                    return zIsValid;
                }

                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
                @net.bytebuddy.utility.nullability.b
                public final Integer l(ArgumentTypeResolver.a aVar) {
                    return (Integer) this.f417626c.get(aVar);
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public final StackManipulation.d n(s sVar, Implementation.Context context) {
                    return new StackManipulation.b(net.bytebuddy.utility.a.a(this.f417628e, Arrays.asList(this.f417627d, this.f417629f))).n(sVar, context);
                }
            }

            public a(MethodInvoker methodInvoker, net.bytebuddy.description.method.a aVar) {
                this.f417620a = methodInvoker;
                this.f417621b = aVar;
                this.f417622c = new ArrayList(aVar.getParameters().size());
            }
        }

        net.bytebuddy.description.method.a b();

        @net.bytebuddy.utility.nullability.b
        Integer l(ArgumentTypeResolver.a aVar);
    }

    public interface MethodInvoker {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Simple implements MethodInvoker {

            /* renamed from: b, reason: collision with root package name */
            public static final Simple f417630b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Simple[] f417631c;

            static {
                Simple simple = new Simple("INSTANCE", 0);
                f417630b = simple;
                f417631c = new Simple[]{simple};
            }

            public Simple() {
                throw null;
            }

            public static Simple valueOf(String str) {
                return (Simple) Enum.valueOf(Simple.class, str);
            }

            public static Simple[] values() {
                return (Simple[]) f417631c.clone();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker
            public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                return MethodInvocation.b(aVar);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements MethodInvoker {
            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker
            public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                return MethodInvocation.b(aVar).i(null);
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
        }

        StackManipulation a(net.bytebuddy.description.method.a aVar);
    }

    public interface ParameterBinding<T> extends StackManipulation {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Illegal implements ParameterBinding<Void> {

            /* renamed from: b, reason: collision with root package name */
            public static final Illegal f417632b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Illegal[] f417633c;

            static {
                Illegal illegal = new Illegal("INSTANCE", 0);
                f417632b = illegal;
                f417633c = new Illegal[]{illegal};
            }

            public Illegal() {
                throw null;
            }

            public static Illegal valueOf(String str) {
                return (Illegal) Enum.valueOf(Illegal.class, str);
            }

            public static Illegal[] values() {
                return (Illegal[]) f417633c.clone();
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return false;
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public final Void k() {
                throw new IllegalStateException("An illegal binding does not define an identification token");
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                throw new IllegalStateException("An illegal parameter binding must not be applied");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements ParameterBinding<Object> {

            /* renamed from: b, reason: collision with root package name */
            @HashCodeAndEqualsPlugin.ValueHandling
            public final Object f417634b = new Object();

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation f417635c;

            public a(StackManipulation stackManipulation) {
                this.f417635c = stackManipulation;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417635c.equals(((a) obj).f417635c);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417635c.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return this.f417635c.isValid();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public final Object k() {
                return this.f417634b;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                return this.f417635c.n(sVar, context);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b<T> implements ParameterBinding<T> {

            /* renamed from: b, reason: collision with root package name */
            public final ArgumentTypeResolver.a f417636b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.b f417637c;

            public b(StackManipulation.b bVar, ArgumentTypeResolver.a aVar) {
                this.f417637c = bVar;
                this.f417636b = aVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f417636b.equals(bVar.f417636b) && this.f417637c.equals(bVar.f417637c);
            }

            public final int hashCode() {
                return this.f417637c.hashCode() + ((this.f417636b.f417601a + (getClass().hashCode() * 31)) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return this.f417637c.isValid();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public final T k() {
                return (T) this.f417636b;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                return this.f417637c.n(sVar, context);
            }
        }

        T k();
    }

    public interface Record {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Illegal implements Record {

            /* renamed from: b, reason: collision with root package name */
            public static final Illegal f417638b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Illegal[] f417639c;

            static {
                Illegal illegal = new Illegal("INSTANCE", 0);
                f417638b = illegal;
                f417639c = new Illegal[]{illegal};
            }

            public Illegal() {
                throw null;
            }

            public static Illegal valueOf(String str) {
                return (Illegal) Enum.valueOf(Illegal.class, str);
            }

            public static Illegal[] values() {
                return (Illegal[]) f417639c.clone();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.Record
            public final MethodBinding a(Implementation.Target target, net.bytebuddy.description.method.a aVar, TerminationHandler.Default r32, MethodInvoker methodInvoker, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar) {
                return MethodBinding.Illegal.f417618b;
            }
        }

        MethodBinding a(Implementation.Target target, net.bytebuddy.description.method.a aVar, TerminationHandler.Default r32, MethodInvoker methodInvoker, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar);
    }

    public interface TerminationHandler {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Default implements TerminationHandler {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f417640b;

            /* renamed from: c, reason: collision with root package name */
            public static final Default f417641c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Default[] f417642d;

            public enum a extends Default {
                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler
                public final StackManipulation a(net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    return new StackManipulation.b(bVar.a(aVar2.v0() ? aVar2.n().P0() : aVar2.getReturnType(), aVar.getReturnType(), typing), MethodReturn.c(aVar.getReturnType()));
                }
            }

            public enum b extends Default {
                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler
                public final StackManipulation a(net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    return Removal.c(aVar2.v0() ? aVar2.n() : aVar2.getReturnType());
                }
            }

            static {
                a aVar = new a("RETURNING", 0, null);
                f417640b = aVar;
                b bVar = new b("DROPPING", 1, null);
                f417641c = bVar;
                f417642d = new Default[]{aVar, bVar};
            }

            public Default() {
                throw null;
            }

            public Default(String str, int i12, a aVar) {
            }

            public static Default valueOf(String str) {
                return (Default) Enum.valueOf(Default.class, str);
            }

            public static Default[] values() {
                return (Default[]) f417642d.clone();
            }
        }

        StackManipulation a(net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2);
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f417643a;

        static {
            int[] iArr = new int[AmbiguityResolver.Resolution.values().length];
            f417643a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f417643a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f417643a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f417643a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements Record {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends Record> f417644b;

        /* renamed from: c, reason: collision with root package name */
        public final AmbiguityResolver.a f417645c;

        /* renamed from: d, reason: collision with root package name */
        public final BindingResolver.Default f417646d;

        public b(List list, AmbiguityResolver.a aVar, BindingResolver.Default r32) {
            this.f417644b = list;
            this.f417645c = aVar;
            this.f417646d = r32;
        }

        @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.Record
        public final MethodBinding a(Implementation.Target target, net.bytebuddy.description.method.a aVar, TerminationHandler.Default r13, MethodInvoker methodInvoker, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar) {
            ArrayList arrayList = new ArrayList();
            List<? extends Record> list = this.f417644b;
            Iterator<? extends Record> it = list.iterator();
            while (it.hasNext()) {
                MethodBinding methodBindingA = it.next().a(target, aVar, r13, methodInvoker, bVar);
                if (methodBindingA.isValid()) {
                    arrayList.add(methodBindingA);
                }
            }
            if (!arrayList.isEmpty()) {
                AmbiguityResolver.a aVar2 = this.f417645c;
                this.f417646d.getClass();
                return BindingResolver.Default.a(aVar2, aVar, new ArrayList(arrayList));
            }
            throw new IllegalArgumentException("None of " + list + " allows for delegation from " + aVar);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417644b.equals(bVar.f417644b) && this.f417645c.equals(bVar.f417645c) && this.f417646d.equals(bVar.f417646d);
        }

        public final int hashCode() {
            return this.f417646d.hashCode() + ((this.f417645c.hashCode() + H.e(getClass().hashCode() * 31, 31, this.f417644b)) * 31);
        }
    }
}
