package net.bytebuddy.agent.builder;

import androidx.compose.foundation.H;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.instrument.Instrumentation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.builder.b;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.NexusAccessor;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.c;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.h;
import net.bytebuddy.jar.asm.p;
import net.bytebuddy.jar.asm.r;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.C44400i;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.C44412v;
import net.bytebuddy.matcher.C44413w;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.N;
import net.bytebuddy.matcher.z;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.d;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes8.dex */
public interface AgentBuilder {

    public interface CircularityLock {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Inactive implements CircularityLock {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Inactive[] f415379b = {new Inactive("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            Inactive EF5;

            public Inactive() {
                throw null;
            }

            public static Inactive valueOf(String str) {
                return (Inactive) Enum.valueOf(Inactive.class, str);
            }

            public static Inactive[] values() {
                return (Inactive[]) f415379b.clone();
            }
        }

        public static class a implements CircularityLock {
            public a() {
                new ConcurrentHashMap();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements CircularityLock {

            /* renamed from: b, reason: collision with root package name */
            public final ReentrantLock f415380b;

            /* renamed from: c, reason: collision with root package name */
            public final TimeUnit f415381c;

            public b() {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f415380b = new ReentrantLock();
                this.f415381c = timeUnit;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f415381c.equals(bVar.f415381c) && this.f415380b.equals(bVar.f415380b);
            }

            public final int hashCode() {
                return this.f415381c.hashCode() + ((((this.f415380b.hashCode() + (getClass().hashCode() * 31)) * 31) + ((int) 0)) * 31);
            }
        }
    }

    public interface ClassFileBufferStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Default implements ClassFileBufferStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f415382b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Default[] f415383c;

            public enum a extends Default {
            }

            public enum b extends Default {
            }

            static {
                a aVar = new a("RETAINING", 0, null);
                f415382b = aVar;
                f415383c = new Default[]{aVar, new b("DISCARDING", 1, null)};
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
                return (Default[]) f415383c.clone();
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements AgentBuilder {

        /* renamed from: x, reason: collision with root package name */
        public static final b f415384x;

        /* renamed from: y, reason: collision with root package name */
        public static final CircularityLock.a f415385y;

        /* renamed from: z, reason: collision with root package name */
        public static final boolean f415386z;

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuddy f415387a;

        /* renamed from: b, reason: collision with root package name */
        public final Listener.NoOp f415388b;

        /* renamed from: c, reason: collision with root package name */
        public final CircularityLock.a f415389c;

        /* renamed from: d, reason: collision with root package name */
        public final PoolStrategy.Default f415390d;

        /* renamed from: e, reason: collision with root package name */
        public final TypeStrategy.Default f415391e;

        /* renamed from: f, reason: collision with root package name */
        public final LocationStrategy.ForClassLoader f415392f;

        /* renamed from: g, reason: collision with root package name */
        public final NativeMethodStrategy.Disabled f415393g;

        /* renamed from: h, reason: collision with root package name */
        public final WarmupStrategy.NoOp f415394h;

        /* renamed from: i, reason: collision with root package name */
        public final TransformerDecorator.NoOp f415395i;

        /* renamed from: j, reason: collision with root package name */
        public final InitializationStrategy.b.d f415396j;

        /* renamed from: k, reason: collision with root package name */
        public final RedefinitionStrategy f415397k;

        /* renamed from: l, reason: collision with root package name */
        public final RedefinitionStrategy.DiscoveryStrategy.SinglePass f415398l;

        /* renamed from: m, reason: collision with root package name */
        public final RedefinitionStrategy.BatchAllocator.ForTotal f415399m;

        /* renamed from: n, reason: collision with root package name */
        public final RedefinitionStrategy.Listener.NoOp f415400n;

        /* renamed from: o, reason: collision with root package name */
        public final RedefinitionStrategy.ResubmissionStrategy.Disabled f415401o;

        /* renamed from: p, reason: collision with root package name */
        public final InjectionStrategy.UsingReflection f415402p;

        /* renamed from: q, reason: collision with root package name */
        public final LambdaInstrumentationStrategy f415403q;

        /* renamed from: r, reason: collision with root package name */
        public final DescriptionStrategy.Default f415404r;

        /* renamed from: s, reason: collision with root package name */
        public final FallbackStrategy.a f415405s;

        /* renamed from: t, reason: collision with root package name */
        public final ClassFileBufferStrategy.Default f415406t;

        /* renamed from: u, reason: collision with root package name */
        public final InstallationListener.NoOp f415407u;

        /* renamed from: v, reason: collision with root package name */
        public final RawMatcher.b f415408v;

        /* renamed from: w, reason: collision with root package name */
        public final List<e> f415409w;

        public static class ExecutingTransformer extends b.a {

            /* renamed from: a, reason: collision with root package name */
            public static final Factory f415410a;

            public interface Factory {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class CreationAction implements PrivilegedAction<Factory> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final CreationAction f415411b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ CreationAction[] f415412c;

                    static {
                        CreationAction creationAction = new CreationAction("INSTANCE", 0);
                        f415411b = creationAction;
                        f415412c = new CreationAction[]{creationAction};
                    }

                    public CreationAction() {
                        throw null;
                    }

                    public static CreationAction valueOf(String str) {
                        return (CreationAction) Enum.valueOf(CreationAction.class, str);
                    }

                    public static CreationAction[] values() {
                        return (CreationAction[]) f415412c.clone();
                    }

                    @Override // java.security.PrivilegedAction
                    @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                    public final Factory run() {
                        try {
                            return new a(((a.InterfaceC12009a.AbstractC12010a) new ByteBuddy().d().c(TypeDescription.d.A0(ExecutingTransformer.class), ConstructorStrategy.Default.f417164c).L(ExecutingTransformer.class.getName().concat("$ByteBuddy$ModuleSupport"))).u(C44411u.x("transform").a(C44411u.B(new C44400i(new C44413w(C44411u.f(TypeDescription.d.A0(JavaType.f418907k.c()))))))).z(MethodCall.a(ExecutingTransformer.class.getDeclaredMethod("a", Object.class, ClassLoader.class, String.class, Class.class, ProtectionDomain.class, byte[].class)).m().g(Arrays.asList(MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod.f417375b))).p().l6(ExecutingTransformer.class.getClassLoader(), ClassLoadingStrategy.Default.f416768d.f416771b.a(ExecutingTransformer.class.getProtectionDomain())).a().getDeclaredConstructor(ByteBuddy.class, Listener.class, PoolStrategy.class, TypeStrategy.class, LocationStrategy.class, NativeMethodStrategy.class, InitializationStrategy.class, InjectionStrategy.class, LambdaInstrumentationStrategy.class, DescriptionStrategy.class, FallbackStrategy.class, ClassFileBufferStrategy.class, InstallationListener.class, RawMatcher.class, RedefinitionStrategy.ResubmissionEnforcer.class, List.class, CircularityLock.class));
                        } catch (Exception unused) {
                            return ForLegacyVm.f415413b;
                        }
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForLegacyVm implements Factory {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForLegacyVm f415413b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForLegacyVm[] f415414c;

                    static {
                        ForLegacyVm forLegacyVm = new ForLegacyVm("INSTANCE", 0);
                        f415413b = forLegacyVm;
                        f415414c = new ForLegacyVm[]{forLegacyVm};
                    }

                    public ForLegacyVm() {
                        throw null;
                    }

                    public static ForLegacyVm valueOf(String str) {
                        return (ForLegacyVm) Enum.valueOf(ForLegacyVm.class, str);
                    }

                    public static ForLegacyVm[] values() {
                        return (ForLegacyVm[]) f415414c.clone();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Factory {

                    /* renamed from: b, reason: collision with root package name */
                    public final Constructor<? extends net.bytebuddy.agent.builder.b> f415415b;

                    public a(Constructor<? extends net.bytebuddy.agent.builder.b> constructor) {
                        this.f415415b = constructor;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415415b.equals(((a) obj).f415415b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f415415b.hashCode() + (getClass().hashCode() * 31);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public class a implements PrivilegedAction<byte[]> {
                public a() {
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

                @Override // java.security.PrivilegedAction
                @net.bytebuddy.utility.nullability.b
                public final byte[] run() {
                    throw null;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public class b implements PrivilegedAction<byte[]> {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.getClass();
                    return false;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    Object obj = null;
                    obj.getClass();
                    throw null;
                }

                @Override // java.security.PrivilegedAction
                @net.bytebuddy.utility.nullability.b
                public final byte[] run() {
                    d.b bVar = net.bytebuddy.utility.d.f418921c;
                    Factory factory = ExecutingTransformer.f415410a;
                    throw null;
                }
            }

            static {
                try {
                    Class.forName("java.security.AccessController", false, null);
                    Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
                } catch (ClassNotFoundException | SecurityException unused) {
                }
                f415410a = (Factory) Default.a(Factory.CreationAction.f415411b);
            }

            @net.bytebuddy.utility.nullability.b
            public byte[] a(Object obj, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, @net.bytebuddy.utility.nullability.b String str, @net.bytebuddy.utility.nullability.b Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                throw null;
            }
        }

        public interface NativeMethodStrategy {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Disabled implements NativeMethodStrategy {

                /* renamed from: b, reason: collision with root package name */
                public static final Disabled f415416b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Disabled[] f415417c;

                static {
                    Disabled disabled = new Disabled("INSTANCE", 0);
                    f415416b = disabled;
                    f415417c = new Disabled[]{disabled};
                }

                public Disabled() {
                    throw null;
                }

                public static Disabled valueOf(String str) {
                    return (Disabled) Enum.valueOf(Disabled.class, str);
                }

                public static Disabled[] values() {
                    return (Disabled[]) f415417c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements NativeMethodStrategy {
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

        public interface WarmupStrategy {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NoOp implements WarmupStrategy {

                /* renamed from: b, reason: collision with root package name */
                public static final NoOp f415418b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ NoOp[] f415419c;

                static {
                    NoOp noOp = new NoOp("INSTANCE", 0);
                    f415418b = noOp;
                    f415419c = new NoOp[]{noOp};
                }

                public NoOp() {
                    throw null;
                }

                public static NoOp valueOf(String str) {
                    return (NoOp) Enum.valueOf(NoOp.class, str);
                }

                public static NoOp[] values() {
                    return (NoOp[]) f415419c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements WarmupStrategy {

                /* renamed from: b, reason: collision with root package name */
                public static final InterfaceC11891a f415420b = (InterfaceC11891a) Default.a(JavaDispatcher.a(InterfaceC11891a.class));

                @JavaDispatcher.i("java.lang.instrument.ClassFileTransformer")
                /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$Default$WarmupStrategy$a$a, reason: collision with other inner class name */
                public interface InterfaceC11891a {
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
        }

        public static abstract class a implements AgentBuilder {

            /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$Default$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC11892a<S extends d<S>> extends a implements d<S> {
            }
        }

        @JavaDispatcher.i("java.lang.instrument.Instrumentation")
        public interface b {
        }

        @HashCodeAndEqualsPlugin.Enhance
        public class c extends a.AbstractC11892a<c> implements c {
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

        public static class d extends Default implements RedefinitionListenable.c {

            public class a extends a implements RedefinitionListenable.b {
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class e {

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements RawMatcher {
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
            public static class b implements RawMatcher {
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

            public static class c implements Iterator<e> {
                public c() {
                    throw null;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
                
                    throw null;
                 */
                @Override // java.util.Iterator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final net.bytebuddy.agent.builder.AgentBuilder.e next() {
                    /*
                        r1 = this;
                        r0 = 0
                        throw r0     // Catch: java.lang.Throwable -> L2
                    L2:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.agent.builder.AgentBuilder.Default.e.c.next():java.lang.Object");
                }

                @Override // java.util.Iterator
                public final void remove() {
                    throw new UnsupportedOperationException("remove");
                }
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

        @HashCodeAndEqualsPlugin.Enhance
        public class f extends a.AbstractC11892a<b.InterfaceC11904b> implements b.a, b.InterfaceC11904b {
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

        static {
            boolean z12 = false;
            try {
                Class.forName("java.security.AccessController", false, null);
                f415386z = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                f415386z = z12;
                f415384x = (b) a(JavaDispatcher.a(b.class));
                f415385y = new CircularityLock.a();
            } catch (SecurityException unused2) {
                z12 = true;
                f415386z = z12;
                f415384x = (b) a(JavaDispatcher.a(b.class));
                f415385y = new CircularityLock.a();
            }
            f415384x = (b) a(JavaDispatcher.a(b.class));
            f415385y = new CircularityLock.a();
        }

        public Default() {
            InitializationStrategy.b.d dVar;
            InterfaceC44410t c44412v;
            ByteBuddy byteBuddy = new ByteBuddy();
            Listener.NoOp noOp = Listener.NoOp.f415458b;
            CircularityLock.a aVar = f415385y;
            PoolStrategy.Default r42 = PoolStrategy.Default.FAST;
            TypeStrategy.Default r52 = TypeStrategy.Default.f415502b;
            LocationStrategy.ForClassLoader forClassLoader = LocationStrategy.ForClassLoader.f415460b;
            NativeMethodStrategy.Disabled disabled = NativeMethodStrategy.Disabled.f415416b;
            WarmupStrategy.NoOp noOp2 = WarmupStrategy.NoOp.f415418b;
            TransformerDecorator.NoOp noOp3 = TransformerDecorator.NoOp.f415500b;
            InitializationStrategy.b.d dVar2 = new InitializationStrategy.b.d();
            RedefinitionStrategy redefinitionStrategy = RedefinitionStrategy.f415477b;
            RedefinitionStrategy.DiscoveryStrategy.SinglePass singlePass = RedefinitionStrategy.DiscoveryStrategy.SinglePass.f415486b;
            RedefinitionStrategy.BatchAllocator.ForTotal forTotal = RedefinitionStrategy.BatchAllocator.ForTotal.f415480b;
            RedefinitionStrategy.Listener.NoOp noOp4 = RedefinitionStrategy.Listener.NoOp.f415489b;
            RedefinitionStrategy.ResubmissionStrategy.Disabled disabled2 = RedefinitionStrategy.ResubmissionStrategy.Disabled.f415496b;
            InjectionStrategy.UsingReflection usingReflection = InjectionStrategy.UsingReflection.f415430b;
            LambdaInstrumentationStrategy lambdaInstrumentationStrategy = LambdaInstrumentationStrategy.f415436b;
            DescriptionStrategy.Default r15 = DescriptionStrategy.Default.f415421b;
            FallbackStrategy.a aVar2 = new FallbackStrategy.a(LinkageError.class, TypeNotPresentException.class);
            ClassFileBufferStrategy.Default r13 = ClassFileBufferStrategy.Default.f415382b;
            InstallationListener.NoOp noOp5 = InstallationListener.NoOp.f415434b;
            C44396e<?> c44396e = C44396e.f418422c;
            N<?> n12 = N.f418408b;
            ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
            if (parent == null) {
                c44412v = C44396e.f418423d;
                dVar = dVar2;
            } else {
                dVar = dVar2;
                c44412v = new C44412v(parent);
            }
            RawMatcher.b bVar = new RawMatcher.b(new RawMatcher.c(c44396e, n12.d(c44412v)), new RawMatcher.c(C44411u.w("net.bytebuddy.").a(new M(C44411u.w("net.bytebuddy.renamed."))).d(C44411u.w("sun.reflect.").d(C44411u.w("jdk.internal.reflect."))).d(ModifierMatcher.Mode.SYNTHETIC.f418407d), c44396e));
            List<e> listEmptyList = Collections.emptyList();
            this.f415387a = byteBuddy;
            this.f415388b = noOp;
            this.f415389c = aVar;
            this.f415390d = r42;
            this.f415391e = r52;
            this.f415392f = forClassLoader;
            this.f415393g = disabled;
            this.f415394h = noOp2;
            this.f415395i = noOp3;
            this.f415396j = dVar;
            this.f415397k = redefinitionStrategy;
            this.f415398l = singlePass;
            this.f415399m = forTotal;
            this.f415400n = noOp4;
            this.f415401o = disabled2;
            this.f415402p = usingReflection;
            this.f415403q = lambdaInstrumentationStrategy;
            this.f415404r = r15;
            this.f415405s = aVar2;
            this.f415406t = r13;
            this.f415407u = noOp5;
            this.f415408v = bVar;
            this.f415409w = listEmptyList;
        }

        @a.b
        public static <T> T a(PrivilegedAction<T> privilegedAction) {
            return f415386z ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r52 = (Default) obj;
            return this.f415397k.equals(r52.f415397k) && this.f415403q.equals(r52.f415403q) && this.f415387a.equals(r52.f415387a) && this.f415388b.equals(r52.f415388b) && this.f415389c.equals(r52.f415389c) && this.f415390d.equals(r52.f415390d) && this.f415391e.equals(r52.f415391e) && this.f415392f.equals(r52.f415392f) && this.f415393g.equals(r52.f415393g) && this.f415394h.equals(r52.f415394h) && this.f415395i.equals(r52.f415395i) && this.f415396j.equals(r52.f415396j) && this.f415398l.equals(r52.f415398l) && this.f415399m.equals(r52.f415399m) && this.f415400n.equals(r52.f415400n) && this.f415401o.equals(r52.f415401o) && this.f415402p.equals(r52.f415402p) && this.f415404r.equals(r52.f415404r) && this.f415405s.equals(r52.f415405s) && this.f415406t.equals(r52.f415406t) && this.f415407u.equals(r52.f415407u) && this.f415408v.equals(r52.f415408v) && this.f415409w.equals(r52.f415409w);
        }

        public final int hashCode() {
            return this.f415409w.hashCode() + ((this.f415408v.hashCode() + ((this.f415407u.hashCode() + ((this.f415406t.hashCode() + ((this.f415405s.hashCode() + ((this.f415404r.hashCode() + ((this.f415403q.hashCode() + ((this.f415402p.hashCode() + ((this.f415401o.hashCode() + ((this.f415400n.hashCode() + ((this.f415399m.hashCode() + ((this.f415398l.hashCode() + ((this.f415397k.hashCode() + ((this.f415396j.hashCode() + ((this.f415395i.hashCode() + ((this.f415394h.hashCode() + ((this.f415393g.hashCode() + ((this.f415392f.hashCode() + ((this.f415391e.hashCode() + ((this.f415390d.hashCode() + ((this.f415389c.hashCode() + ((this.f415388b.hashCode() + ((this.f415387a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
    }

    public interface DescriptionStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Default implements DescriptionStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f415421b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Default[] f415422c;

            public enum a extends Default {
            }

            public enum b extends Default {
            }

            public enum c extends Default {
            }

            static {
                a aVar = new a("HYBRID", 0, true, null);
                f415421b = aVar;
                f415422c = new Default[]{aVar, new b("POOL_ONLY", 1, false, null), new c("POOL_FIRST", 2, false, null)};
            }

            public Default() {
                throw null;
            }

            public Default(String str, int i12, boolean z12, a aVar) {
            }

            public static Default valueOf(String str) {
                return (Default) Enum.valueOf(Default.class, str);
            }

            public static Default[] values() {
                return (Default[]) f415422c.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements DescriptionStrategy {

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$DescriptionStrategy$a$a, reason: collision with other inner class name */
            public static class C11893a implements DescriptionStrategy {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$DescriptionStrategy$a$a$a, reason: collision with other inner class name */
                public static class C11894a implements TypeDescription.SuperTypeLoading.ClassLoadingDelegate {

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$DescriptionStrategy$a$a$a$a, reason: collision with other inner class name */
                    public static class CallableC11895a implements Callable<Class<?>> {
                        @Override // java.util.concurrent.Callable
                        public final Class<?> call() {
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
                            H.d(getClass().hashCode() * 31, 31, null);
                            throw null;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$DescriptionStrategy$a$a$a$b */
                    public static class b implements Callable<Class<?>> {
                        @Override // java.util.concurrent.Callable
                        public final Class<?> call() {
                            return Class.forName(null, false, null);
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
                            return H.d(getClass().hashCode() * 31, 31, null);
                        }
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
            public static class b implements TypeDescription.SuperTypeLoading.ClassLoadingDelegate {
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

    public interface FallbackStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Simple implements FallbackStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Simple[] f415423b = {new Simple("ENABLED", 0), new Simple("DISABLED", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            Simple EF5;

            public static Simple valueOf(String str) {
                return (Simple) Enum.valueOf(Simple.class, str);
            }

            public static Simple[] values() {
                return (Simple[]) f415423b.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements FallbackStrategy {

            /* renamed from: b, reason: collision with root package name */
            public final HashSet f415424b;

            public a() {
                throw null;
            }

            public a(Class<? extends Throwable>... clsArr) {
                this.f415424b = new HashSet(Arrays.asList(clsArr));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f415424b.equals(((a) obj).f415424b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f415424b.hashCode() + (getClass().hashCode() * 31);
            }
        }
    }

    public interface InitializationStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Minimal implements InitializationStrategy, a {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Minimal[] f415425b = {new Minimal("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            Minimal EF5;

            public Minimal() {
                throw null;
            }

            public static Minimal valueOf(String str) {
                return (Minimal) Enum.valueOf(Minimal.class, str);
            }

            public static Minimal[] values() {
                return (Minimal[]) f415425b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements InitializationStrategy, a {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415426b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415426b.clone();
            }
        }

        public interface a {
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class b implements InitializationStrategy {

            /* renamed from: b, reason: collision with root package name */
            public final NexusAccessor f415427b;

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class a implements a {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$InitializationStrategy$b$a$a, reason: collision with other inner class name */
                public static class C11896a implements LoadedTypeInitializer {
                    @Override // net.bytebuddy.implementation.LoadedTypeInitializer
                    public final void a(Class<?> cls) {
                        throw null;
                    }

                    @Override // net.bytebuddy.implementation.LoadedTypeInitializer
                    public final boolean c() {
                        return true;
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
                        AK.c.c(AK.c.c(D8.j(null, getClass().hashCode() * 31, 31), 31, null), 31, null);
                        throw null;
                    }
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

            /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$InitializationStrategy$b$b, reason: collision with other inner class name */
            public static class C11897b extends b {

                /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$InitializationStrategy$b$b$a */
                public static class a extends a {
                }

                public C11897b() {
                    super(new NexusAccessor());
                }
            }

            public static class c extends b {

                public static class a extends a {
                }

                public c() {
                    super(new NexusAccessor());
                }
            }

            public static class d extends b {

                public static class a extends a {
                }

                public d() {
                    super(new NexusAccessor());
                }
            }

            public b(NexusAccessor nexusAccessor) {
                this.f415427b = nexusAccessor;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f415427b.equals(((b) obj).f415427b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f415427b.hashCode() + (getClass().hashCode() * 31);
            }
        }
    }

    public interface InjectionStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Disabled implements InjectionStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Disabled[] f415428b = {new Disabled("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            Disabled EF5;

            public Disabled() {
                throw null;
            }

            public static Disabled valueOf(String str) {
                return (Disabled) Enum.valueOf(Disabled.class, str);
            }

            public static Disabled[] values() {
                return (Disabled[]) f415428b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class UsingJna implements InjectionStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ UsingJna[] f415429b = {new UsingJna("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            UsingJna EF5;

            public UsingJna() {
                throw null;
            }

            public static UsingJna valueOf(String str) {
                return (UsingJna) Enum.valueOf(UsingJna.class, str);
            }

            public static UsingJna[] values() {
                return (UsingJna[]) f415429b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class UsingReflection implements InjectionStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final UsingReflection f415430b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ UsingReflection[] f415431c;

            static {
                UsingReflection usingReflection = new UsingReflection("INSTANCE", 0);
                f415430b = usingReflection;
                f415431c = new UsingReflection[]{usingReflection};
            }

            public UsingReflection() {
                throw null;
            }

            public static UsingReflection valueOf(String str) {
                return (UsingReflection) Enum.valueOf(UsingReflection.class, str);
            }

            public static UsingReflection[] values() {
                return (UsingReflection[]) f415431c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class UsingUnsafe implements InjectionStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ UsingUnsafe[] f415432b = {new UsingUnsafe("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            UsingUnsafe EF5;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements InjectionStrategy {
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

            public UsingUnsafe() {
                throw null;
            }

            public static UsingUnsafe valueOf(String str) {
                return (UsingUnsafe) Enum.valueOf(UsingUnsafe.class, str);
            }

            public static UsingUnsafe[] values() {
                return (UsingUnsafe[]) f415432b.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements InjectionStrategy {
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

    public interface InstallationListener {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ErrorSuppressing implements InstallationListener {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ErrorSuppressing[] f415433b = {new ErrorSuppressing("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            ErrorSuppressing EF5;

            public ErrorSuppressing() {
                throw null;
            }

            public static ErrorSuppressing valueOf(String str) {
                return (ErrorSuppressing) Enum.valueOf(ErrorSuppressing.class, str);
            }

            public static ErrorSuppressing[] values() {
                return (ErrorSuppressing[]) f415433b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements InstallationListener {

            /* renamed from: b, reason: collision with root package name */
            public static final NoOp f415434b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415435c;

            static {
                NoOp noOp = new NoOp("INSTANCE", 0);
                f415434b = noOp;
                f415435c = new NoOp[]{noOp};
            }

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415435c.clone();
            }
        }

        public static abstract class a implements InstallationListener {
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements InstallationListener {
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
        public static class c implements InstallationListener {
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

    public interface Listener {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements Listener {

            /* renamed from: b, reason: collision with root package name */
            public static final NoOp f415458b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415459c;

            static {
                NoOp noOp = new NoOp("INSTANCE", 0);
                f415458b = noOp;
                f415459c = new NoOp[]{noOp};
            }

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415459c.clone();
            }
        }

        public static abstract class a implements Listener {
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements Listener {
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
        public static class c implements Listener {
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
        public static class d extends a {
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
        public static class e implements Listener {
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
        public static class f extends a {
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
        public static class g extends a {
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

    public interface LocationStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class ForClassLoader implements LocationStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final ForClassLoader f415460b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForClassLoader[] f415461c;

            public enum a extends ForClassLoader {
            }

            public enum b extends ForClassLoader {
            }

            static {
                a aVar = new a("STRONG", 0, null);
                f415460b = aVar;
                f415461c = new ForClassLoader[]{aVar, new b("WEAK", 1, null)};
            }

            public ForClassLoader() {
                throw null;
            }

            public ForClassLoader(String str, int i12, a aVar) {
            }

            public static ForClassLoader valueOf(String str) {
                return (ForClassLoader) Enum.valueOf(ForClassLoader.class, str);
            }

            public static ForClassLoader[] values() {
                return (ForClassLoader[]) f415461c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements LocationStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415462b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415462b.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements LocationStrategy {
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
        public static class b implements LocationStrategy {
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

    public interface PoolStrategy {

        public enum ClassLoading implements PoolStrategy {
            /* JADX INFO: Fake field, exist only in values array */
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            /* JADX INFO: Fake field, exist only in values array */
            FAST(TypePool.Default.ReaderMode.FAST);

            ClassLoading(TypePool.Default.ReaderMode readerMode) {
            }
        }

        public enum Default implements PoolStrategy {
            /* JADX INFO: Fake field, exist only in values array */
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            FAST(TypePool.Default.ReaderMode.FAST);

            Default(TypePool.Default.ReaderMode readerMode) {
            }
        }

        public enum Eager implements PoolStrategy {
            /* JADX INFO: Fake field, exist only in values array */
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            /* JADX INFO: Fake field, exist only in values array */
            FAST(TypePool.Default.ReaderMode.FAST);

            Eager(TypePool.Default.ReaderMode readerMode) {
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class a implements PoolStrategy {

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$PoolStrategy$a$a, reason: collision with other inner class name */
            public static class C11899a extends a {
                @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.a
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

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.a
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
    }

    public interface RawMatcher {

        public enum ForLoadState implements RawMatcher {
            /* JADX INFO: Fake field, exist only in values array */
            LOADED(false),
            /* JADX INFO: Fake field, exist only in values array */
            UNLOADED(true);

            ForLoadState(boolean z12) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForResolvableTypes implements RawMatcher {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ForResolvableTypes[] f415468b = {new ForResolvableTypes("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            ForResolvableTypes EF5;

            public ForResolvableTypes() {
                throw null;
            }

            public static ForResolvableTypes valueOf(String str) {
                return (ForResolvableTypes) Enum.valueOf(ForResolvableTypes.class, str);
            }

            public static ForResolvableTypes[] values() {
                return (ForResolvableTypes[]) f415468b.clone();
            }
        }

        public enum Trivial implements RawMatcher {
            /* JADX INFO: Fake field, exist only in values array */
            MATCHING(true),
            NON_MATCHING(false);

            Trivial(boolean z12) {
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements RawMatcher {
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
        public static class b implements RawMatcher {

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList f415471b;

            public b() {
                throw null;
            }

            public b(RawMatcher... rawMatcherArr) {
                List<RawMatcher> listAsList = Arrays.asList(rawMatcherArr);
                this.f415471b = new ArrayList(listAsList.size());
                for (RawMatcher rawMatcher : listAsList) {
                    if (rawMatcher instanceof b) {
                        this.f415471b.addAll(((b) rawMatcher).f415471b);
                    } else if (rawMatcher != Trivial.NON_MATCHING) {
                        this.f415471b.add(rawMatcher);
                    }
                }
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f415471b.equals(((b) obj).f415471b);
            }

            public final int hashCode() {
                return this.f415471b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements RawMatcher {

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC44410t.a f415472b;

            /* renamed from: c, reason: collision with root package name */
            public final InterfaceC44410t.a f415473c;

            /* renamed from: d, reason: collision with root package name */
            public final C44396e f415474d;

            public c() {
                throw null;
            }

            public c(InterfaceC44410t.a aVar, InterfaceC44410t.a aVar2) {
                C44396e<?> c44396e = C44396e.f418422c;
                this.f415472b = aVar;
                this.f415473c = aVar2;
                this.f415474d = c44396e;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f415472b.equals(cVar.f415472b) && this.f415473c.equals(cVar.f415473c) && this.f415474d.equals(cVar.f415474d);
            }

            public final int hashCode() {
                return this.f415474d.hashCode() + ((this.f415473c.hashCode() + ((this.f415472b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d implements RawMatcher {
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

    public interface RedefinitionListenable extends AgentBuilder {

        public interface ResubmissionImmediateMatcher {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Trivial implements ResubmissionImmediateMatcher {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Trivial[] f415475b = {new Trivial("MATCHING", 0), new Trivial("NON_MATCHING", 1)};

                /* JADX INFO: Fake field, exist only in values array */
                Trivial EF5;

                public static Trivial valueOf(String str) {
                    return (Trivial) Enum.valueOf(Trivial.class, str);
                }

                public static Trivial[] values() {
                    return (Trivial[]) f415475b.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements ResubmissionImmediateMatcher {
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
            public static class b implements ResubmissionImmediateMatcher {
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
            public static class c implements ResubmissionImmediateMatcher {
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

        public interface ResubmissionOnErrorMatcher {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Trivial implements ResubmissionOnErrorMatcher {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Trivial[] f415476b = {new Trivial("MATCHING", 0), new Trivial("NON_MATCHING", 1)};

                /* JADX INFO: Fake field, exist only in values array */
                Trivial EF5;

                public static Trivial valueOf(String str) {
                    return (Trivial) Enum.valueOf(Trivial.class, str);
                }

                public static Trivial[] values() {
                    return (Trivial[]) f415476b.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements ResubmissionOnErrorMatcher {
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
            public static class b implements ResubmissionOnErrorMatcher {
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
            public static class c implements ResubmissionOnErrorMatcher {
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

        public interface a extends RedefinitionListenable {
        }

        public interface b extends d, AgentBuilder {
        }

        public interface c extends a {
        }

        public interface d {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class RedefinitionStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final RedefinitionStrategy f415477b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f415478c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ RedefinitionStrategy[] f415479d;

        public interface BatchAllocator {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForTotal implements BatchAllocator {

                /* renamed from: b, reason: collision with root package name */
                public static final ForTotal f415480b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForTotal[] f415481c;

                static {
                    ForTotal forTotal = new ForTotal("INSTANCE", 0);
                    f415480b = forTotal;
                    f415481c = new ForTotal[]{forTotal};
                }

                public ForTotal() {
                    throw null;
                }

                public static ForTotal valueOf(String str) {
                    return (ForTotal) Enum.valueOf(ForTotal.class, str);
                }

                public static ForTotal[] values() {
                    return (ForTotal[]) f415481c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements BatchAllocator {
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
            public static class b implements BatchAllocator {
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
            public static class c implements BatchAllocator {
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
            public static class d implements BatchAllocator {

                public static class a implements Iterable<List<Class<?>>> {

                    /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$BatchAllocator$d$a$a, reason: collision with other inner class name */
                    public static class C11900a implements Iterator<List<Class<?>>> {
                        public C11900a() {
                            throw null;
                        }

                        @Override // java.util.Iterator
                        public final boolean hasNext() {
                            throw null;
                        }

                        @Override // java.util.Iterator
                        public final List<Class<?>> next() {
                            throw null;
                        }

                        @Override // java.util.Iterator
                        public final void remove() {
                            throw new UnsupportedOperationException("remove");
                        }
                    }

                    public a() {
                        throw null;
                    }

                    @Override // java.lang.Iterable
                    public final Iterator<List<Class<?>>> iterator() {
                        throw null;
                    }
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
        }

        public interface DiscoveryStrategy {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Reiterating implements DiscoveryStrategy {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Reiterating[] f415482b = {new Reiterating("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Reiterating EF5;

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Iterable<Iterable<Class<?>>> {
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

                    @Override // java.lang.Iterable
                    public final Iterator<Iterable<Class<?>>> iterator() {
                        return new b();
                    }
                }

                public static class b implements Iterator<Iterable<Class<?>>> {

                    /* renamed from: b, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.b
                    public ArrayList f415483b;

                    public b() {
                        new HashSet();
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        if (this.f415483b != null) {
                            return !r0.isEmpty();
                        }
                        this.f415483b = new ArrayList();
                        Instrumentation instrumentation = null;
                        instrumentation.getAllLoadedClasses();
                        throw null;
                    }

                    @Override // java.util.Iterator
                    public final Iterable<Class<?>> next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        try {
                            return this.f415483b;
                        } finally {
                            this.f415483b = null;
                        }
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException("remove");
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class c implements DiscoveryStrategy {

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ c[] f415484b = {new c("INSTANCE", 0)};

                    /* JADX INFO: Fake field, exist only in values array */
                    c EF5;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class a implements Iterable<Iterable<Class<?>>> {
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

                        @Override // java.lang.Iterable
                        public final Iterator<Iterable<Class<?>>> iterator() {
                            return new b();
                        }
                    }

                    public static class b implements Iterator<Iterable<Class<?>>> {

                        /* renamed from: b, reason: collision with root package name */
                        @net.bytebuddy.utility.nullability.b
                        public ArrayList f415485b;

                        @Override // java.util.Iterator
                        public final boolean hasNext() {
                            if (this.f415485b != null) {
                                return !r0.isEmpty();
                            }
                            Instrumentation instrumentation = null;
                            instrumentation.getAllLoadedClasses();
                            throw null;
                        }

                        @Override // java.util.Iterator
                        public final Iterable<Class<?>> next() {
                            if (!hasNext()) {
                                throw new NoSuchElementException();
                            }
                            try {
                                return this.f415485b;
                            } finally {
                                this.f415485b = null;
                            }
                        }

                        @Override // java.util.Iterator
                        public final void remove() {
                            throw new UnsupportedOperationException("remove");
                        }
                    }

                    public c() {
                        throw null;
                    }

                    public static c valueOf(String str) {
                        return (c) Enum.valueOf(c.class, str);
                    }

                    public static c[] values() {
                        return (c[]) f415484b.clone();
                    }
                }

                public Reiterating() {
                    throw null;
                }

                public static Reiterating valueOf(String str) {
                    return (Reiterating) Enum.valueOf(Reiterating.class, str);
                }

                public static Reiterating[] values() {
                    return (Reiterating[]) f415482b.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class SinglePass implements DiscoveryStrategy {

                /* renamed from: b, reason: collision with root package name */
                public static final SinglePass f415486b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ SinglePass[] f415487c;

                static {
                    SinglePass singlePass = new SinglePass("INSTANCE", 0);
                    f415486b = singlePass;
                    f415487c = new SinglePass[]{singlePass};
                }

                public SinglePass() {
                    throw null;
                }

                public static SinglePass valueOf(String str) {
                    return (SinglePass) Enum.valueOf(SinglePass.class, str);
                }

                public static SinglePass[] values() {
                    return (SinglePass[]) f415487c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements DiscoveryStrategy {
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

        public interface Listener {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class ErrorEscalating implements Listener {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ErrorEscalating[] f415488b = {new a("FAIL_FAST", 0, null), new b("FAIL_LAST", 1, null)};

                /* JADX INFO: Fake field, exist only in values array */
                ErrorEscalating EF7;

                public enum a extends ErrorEscalating {
                }

                public enum b extends ErrorEscalating {
                }

                public ErrorEscalating() {
                    throw null;
                }

                public ErrorEscalating(String str, int i12, a aVar) {
                }

                public static ErrorEscalating valueOf(String str) {
                    return (ErrorEscalating) Enum.valueOf(ErrorEscalating.class, str);
                }

                public static ErrorEscalating[] values() {
                    return (ErrorEscalating[]) f415488b.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NoOp implements Listener {

                /* renamed from: b, reason: collision with root package name */
                public static final NoOp f415489b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ NoOp[] f415490c;

                static {
                    NoOp noOp = new NoOp("INSTANCE", 0);
                    f415489b = noOp;
                    f415490c = new NoOp[]{noOp};
                }

                public NoOp() {
                    throw null;
                }

                public static NoOp valueOf(String str) {
                    return (NoOp) Enum.valueOf(NoOp.class, str);
                }

                public static NoOp[] values() {
                    return (NoOp[]) f415490c.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Yielding implements Listener {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Yielding[] f415491b = {new Yielding("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Yielding EF5;

                public Yielding() {
                    throw null;
                }

                public static Yielding valueOf(String str) {
                    return (Yielding) Enum.valueOf(Yielding.class, str);
                }

                public static Yielding[] values() {
                    return (Yielding[]) f415491b.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class a implements Listener {
                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass();
                }

                public int hashCode() {
                    return getClass().hashCode();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b extends a {
                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.a
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

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.a
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements Listener {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Iterable<List<Class<?>>> {

                    /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$Listener$c$a$a, reason: collision with other inner class name */
                    public static class C11901a implements Iterator<List<Class<?>>> {

                        /* renamed from: b, reason: collision with root package name */
                        @net.bytebuddy.utility.nullability.b
                        public Iterator<? extends List<Class<?>>> f415492b;

                        public final void a() {
                            Iterator<? extends List<Class<?>>> it = this.f415492b;
                            if (it == null || !it.hasNext()) {
                                throw null;
                            }
                        }

                        @Override // java.util.Iterator
                        public final boolean hasNext() {
                            Iterator<? extends List<Class<?>>> it = this.f415492b;
                            return it != null && it.hasNext();
                        }

                        @Override // java.util.Iterator
                        public final List<Class<?>> next() {
                            try {
                                Iterator<? extends List<Class<?>>> it = this.f415492b;
                                if (it != null) {
                                    return it.next();
                                }
                                throw new NoSuchElementException();
                            } finally {
                                a();
                            }
                        }

                        @Override // java.util.Iterator
                        public final void remove() {
                            throw new UnsupportedOperationException("remove");
                        }
                    }

                    public a() {
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

                    @Override // java.lang.Iterable
                    public final Iterator<List<Class<?>>> iterator() {
                        throw null;
                    }
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class d extends a {
                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.a
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
                    return true;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.a
                public final int hashCode() {
                    return (super.hashCode() * 31) + ((int) 0);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class e implements Listener {
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

        public interface ResubmissionEnforcer {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Disabled implements ResubmissionEnforcer {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Disabled[] f415493b = {new Disabled("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Disabled EF5;

                public Disabled() {
                    throw null;
                }

                public static Disabled valueOf(String str) {
                    return (Disabled) Enum.valueOf(Disabled.class, str);
                }

                public static Disabled[] values() {
                    return (Disabled[]) f415493b.clone();
                }
            }
        }

        public interface ResubmissionScheduler {

            public interface Cancelable {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class NoOp implements Cancelable {

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ NoOp[] f415494b = {new NoOp("INSTANCE", 0)};

                    /* JADX INFO: Fake field, exist only in values array */
                    NoOp EF5;

                    public NoOp() {
                        throw null;
                    }

                    public static NoOp valueOf(String str) {
                        return (NoOp) Enum.valueOf(NoOp.class, str);
                    }

                    public static NoOp[] values() {
                        return (NoOp[]) f415494b.clone();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Cancelable {
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

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NoOp implements ResubmissionScheduler {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ NoOp[] f415495b = {new NoOp("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                NoOp EF5;

                public NoOp() {
                    throw null;
                }

                public static NoOp valueOf(String str) {
                    return (NoOp) Enum.valueOf(NoOp.class, str);
                }

                public static NoOp[] values() {
                    return (NoOp[]) f415495b.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements ResubmissionScheduler {
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
            public static class b implements ResubmissionScheduler {
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

        public interface ResubmissionStrategy {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Disabled implements ResubmissionStrategy {

                /* renamed from: b, reason: collision with root package name */
                public static final Disabled f415496b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Disabled[] f415497c;

                static {
                    Disabled disabled = new Disabled("INSTANCE", 0);
                    f415496b = disabled;
                    f415497c = new Disabled[]{disabled};
                }

                public Disabled() {
                    throw null;
                }

                public static Disabled valueOf(String str) {
                    return (Disabled) Enum.valueOf(Disabled.class, str);
                }

                public static Disabled[] values() {
                    return (Disabled[]) f415497c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements ResubmissionStrategy {

                /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$a$a, reason: collision with other inner class name */
                public static class C11902a {
                    @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        boolean z12 = obj instanceof C11902a;
                        throw null;
                    }

                    public final int hashCode() {
                        return 0;
                    }
                }

                public static class b extends InstallationListener.a implements Runnable {
                    @Override // java.lang.Runnable
                    public final void run() {
                        throw null;
                    }
                }

                public static class c extends Listener.a implements ResubmissionEnforcer {

                    /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$a$c$a, reason: collision with other inner class name */
                    public static class C11903a<T> extends AbstractSet<T> {

                        /* renamed from: b, reason: collision with root package name */
                        public final ConcurrentHashMap f415498b = new ConcurrentHashMap();

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public final boolean add(T t12) {
                            return this.f415498b.put(t12, Boolean.TRUE) == null;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                        public final Iterator<T> iterator() {
                            return this.f415498b.keySet().iterator();
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public final boolean remove(Object obj) {
                            return this.f415498b.remove(obj) != null;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public final int size() {
                            return this.f415498b.size();
                        }
                    }
                }

                public static class d extends WeakReference<ClassLoader> {
                    @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof C11902a) {
                            ((C11902a) obj).getClass();
                            get();
                            throw null;
                        }
                        if (!(obj instanceof d)) {
                            return false;
                        }
                        d dVar = (d) obj;
                        dVar.getClass();
                        return get() == dVar.get();
                    }

                    public final int hashCode() {
                        return 0;
                    }
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class b {
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

        public enum a extends RedefinitionStrategy {
        }

        public enum b extends RedefinitionStrategy {
        }

        public enum c extends RedefinitionStrategy {
        }

        public static abstract class d {

            public static class a extends d {
            }

            public static class b extends d {
            }

            public static class c implements Iterator<List<Class<?>>> {

                /* renamed from: b, reason: collision with root package name */
                public Iterator<? extends List<Class<?>>> f415499b;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f415499b.hasNext();
                }

                @Override // java.util.Iterator
                public final List<Class<?>> next() {
                    try {
                        List<Class<?>> next = this.f415499b.next();
                        if (this.f415499b.hasNext()) {
                            return next;
                        }
                        throw null;
                    } catch (Throwable th2) {
                        if (this.f415499b.hasNext()) {
                            throw th2;
                        }
                        throw null;
                    }
                }

                @Override // java.util.Iterator
                public final void remove() {
                    throw new UnsupportedOperationException("remove");
                }
            }
        }

        @JavaDispatcher.i("java.lang.instrument.Instrumentation")
        public interface e {
        }

        static {
            a aVar = new a("DISABLED", 0, false, false, null);
            f415477b = aVar;
            f415479d = new RedefinitionStrategy[]{aVar, new b("REDEFINITION", 1, true, false, null), new c("RETRANSFORMATION", 2, true, true, null)};
            f415478c = (e) Default.a(JavaDispatcher.a(e.class));
        }

        public RedefinitionStrategy() {
            throw null;
        }

        public RedefinitionStrategy(String str, int i12, boolean z12, boolean z13, a aVar) {
        }

        public static RedefinitionStrategy valueOf(String str) {
            return (RedefinitionStrategy) Enum.valueOf(RedefinitionStrategy.class, str);
        }

        public static RedefinitionStrategy[] values() {
            return (RedefinitionStrategy[]) f415479d.clone();
        }
    }

    public interface TransformerDecorator {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements TransformerDecorator {

            /* renamed from: b, reason: collision with root package name */
            public static final NoOp f415500b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415501c;

            static {
                NoOp noOp = new NoOp("INSTANCE", 0);
                f415500b = noOp;
                f415501c = new NoOp[]{noOp};
            }

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415501c.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements TransformerDecorator {
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

    public interface TypeStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Default implements TypeStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f415502b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Default[] f415503c;

            public enum a extends Default {
            }

            public enum b extends Default {
            }

            public enum c extends Default {
            }

            public enum d extends Default {
            }

            static {
                a aVar = new a("REBASE", 0, null);
                f415502b = aVar;
                f415503c = new Default[]{aVar, new b("REDEFINE", 1, null), new c("REDEFINE_FROZEN", 2, null), new d("DECORATE", 3, null)};
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
                return (Default[]) f415503c.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements TypeStrategy {
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

    public interface b {

        public interface a extends AgentBuilder, b {
        }

        /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$b$b, reason: collision with other inner class name */
        public interface InterfaceC11904b extends d<InterfaceC11904b>, b {
        }
    }

    public interface c extends d<c>, AgentBuilder {
    }

    public interface d<T extends d<T>> {
    }

    public interface e {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements e {

            /* renamed from: a, reason: collision with root package name */
            public final Advice.u f415504a;

            /* renamed from: b, reason: collision with root package name */
            public final Advice.ExceptionHandler.Default f415505b;

            /* renamed from: c, reason: collision with root package name */
            public final net.bytebuddy.implementation.bytecode.assign.primitive.b f415506c;

            /* renamed from: d, reason: collision with root package name */
            public final ClassFileLocator.NoOp f415507d;

            /* renamed from: e, reason: collision with root package name */
            public final PoolStrategy.Default f415508e;

            /* renamed from: f, reason: collision with root package name */
            public final LocationStrategy.ForClassLoader f415509f;

            /* renamed from: g, reason: collision with root package name */
            public final List<AbstractC11905a> f415510g;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$e$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC11905a {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$e$a$a$a, reason: collision with other inner class name */
                public static class C11906a extends AbstractC11905a {
                    @Override // net.bytebuddy.agent.builder.AgentBuilder.e.a.AbstractC11905a
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

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.e.a.AbstractC11905a
                    public final int hashCode() {
                        super.hashCode();
                        throw null;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$e$a$a$b */
                public static class b extends AbstractC11905a {
                    @Override // net.bytebuddy.agent.builder.AgentBuilder.e.a.AbstractC11905a
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

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.e.a.AbstractC11905a
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

            public a() {
                a.d dVar = Advice.f415511g;
                Advice.u uVar = new Advice.u();
                Advice.ExceptionHandler.Default r12 = Advice.ExceptionHandler.Default.f415685b;
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                ClassFileLocator.NoOp noOp = ClassFileLocator.NoOp.f416579b;
                PoolStrategy.Default r42 = PoolStrategy.Default.FAST;
                LocationStrategy.ForClassLoader forClassLoader = LocationStrategy.ForClassLoader.f415460b;
                List<AbstractC11905a> listEmptyList = Collections.emptyList();
                this.f415504a = uVar;
                this.f415505b = r12;
                this.f415506c = bVar;
                this.f415507d = noOp;
                this.f415508e = r42;
                this.f415509f = forClassLoader;
                this.f415510g = listEmptyList;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f415504a.equals(aVar.f415504a) && this.f415505b.equals(aVar.f415505b) && this.f415506c.equals(aVar.f415506c) && this.f415507d.equals(aVar.f415507d) && this.f415508e.equals(aVar.f415508e) && this.f415509f.equals(aVar.f415509f) && this.f415510g.equals(aVar.f415510g);
            }

            public final int hashCode() {
                return this.f415510g.hashCode() + ((this.f415509f.hashCode() + ((this.f415508e.hashCode() + ((this.f415507d.hashCode() + ((this.f415506c.hashCode() + ((this.f415505b.hashCode() + ((this.f415504a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements e {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class LambdaInstrumentationStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final LambdaInstrumentationStrategy f415436b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LambdaInstrumentationStrategy[] f415437c;

        /* JADX INFO: Fake field, exist only in values array */
        LambdaInstrumentationStrategy EF2;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class LambdaMetafactoryFactory implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: d, reason: collision with root package name */
            public static final Enum f415448d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ LambdaMetafactoryFactory[] f415449e = {new a("REGULAR", 0, 6, 11, null), new b("ALTERNATIVE", 1, 6, 16, null)};

            /* renamed from: b, reason: collision with root package name */
            public final int f415450b;

            /* renamed from: c, reason: collision with root package name */
            public final int f415451c;

            /* JADX INFO: Fake field, exist only in values array */
            LambdaMetafactoryFactory EF12;

            public interface Loader {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Unavailable implements Loader {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Unavailable f415452b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ Unavailable[] f415453c;

                    static {
                        Unavailable unavailable = new Unavailable("INSTANCE", 0);
                        f415452b = unavailable;
                        f415453c = new Unavailable[]{unavailable};
                    }

                    public Unavailable() {
                        throw null;
                    }

                    public static Unavailable valueOf(String str) {
                        return (Unavailable) Enum.valueOf(Unavailable.class, str);
                    }

                    public static Unavailable[] values() {
                        return (Unavailable[]) f415453c.clone();
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final int p() {
                        throw new IllegalStateException("No lambda expression loading strategy available on current VM");
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final void q(s sVar) {
                        throw new IllegalStateException("No lambda expression loading strategy available on current VM");
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final int r() {
                        throw new IllegalStateException("No lambda expression loading strategy available on current VM");
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class UsingMethodHandleLookup implements Loader {

                    /* renamed from: b, reason: collision with root package name */
                    public static final UsingMethodHandleLookup f415454b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ UsingMethodHandleLookup[] f415455c;

                    static {
                        UsingMethodHandleLookup usingMethodHandleLookup = new UsingMethodHandleLookup("INSTANCE", 0);
                        f415454b = usingMethodHandleLookup;
                        f415455c = new UsingMethodHandleLookup[]{usingMethodHandleLookup};
                    }

                    public UsingMethodHandleLookup() {
                        throw null;
                    }

                    public static UsingMethodHandleLookup valueOf(String str) {
                        return (UsingMethodHandleLookup) Enum.valueOf(UsingMethodHandleLookup.class, str);
                    }

                    public static UsingMethodHandleLookup[] values() {
                        return (UsingMethodHandleLookup[]) f415455c.clone();
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final int p() {
                        return 8;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final void q(s sVar) {
                        sVar.J(25, 0);
                        sVar.J(25, 4);
                        sVar.A("java/lang/invoke/MethodHandles$Lookup", "revealDirect", "(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandleInfo;", 182, false);
                        sVar.J(58, 10);
                        sVar.J(25, 10);
                        sVar.A("java/lang/invoke/MethodHandleInfo", "getModifiers", "()I", 185, true);
                        sVar.A("java/lang/reflect/Modifier", "isProtected", "(I)Z", 184, false);
                        r rVar = new r();
                        sVar.r(153, rVar);
                        sVar.J(25, 0);
                        sVar.A("java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", 182, false);
                        sVar.J(25, 10);
                        sVar.A("java/lang/invoke/MethodHandleInfo", "getDeclaringClass", "()Ljava/lang/Class;", 185, true);
                        sVar.A("sun/invoke/util/VerifyAccess", "isSamePackage", "(Ljava/lang/Class;Ljava/lang/Class;)Z", 184, false);
                        r rVar2 = new r();
                        sVar.r(153, rVar2);
                        sVar.s(rVar);
                        sVar.k(new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType", 1, "java/util/List", "java/util/List", "[B", "java/lang/invoke/MethodHandleInfo"}, 0, new Object[0], 11, 0);
                        sVar.J(25, 10);
                        sVar.A("java/lang/invoke/MethodHandleInfo", "getReferenceKind", "()I", 185, true);
                        sVar.o(16, 7);
                        r rVar3 = new r();
                        sVar.r(160, rVar3);
                        sVar.s(rVar2);
                        sVar.k(null, 3, null, 0, 0);
                        sVar.m(4);
                        r rVar4 = new r();
                        sVar.r(167, rVar4);
                        sVar.s(rVar3);
                        sVar.k(null, 3, null, 0, 0);
                        sVar.m(3);
                        sVar.s(rVar4);
                        sVar.k(null, 4, new Object[]{1}, 0, 1);
                        sVar.J(54, 11);
                        sVar.J(21, 11);
                        r rVar5 = new r();
                        sVar.r(153, rVar5);
                        sVar.J(25, 0);
                        sVar.J(25, 9);
                        sVar.J(25, 10);
                        sVar.m(4);
                        sVar.m(5);
                        sVar.I(189, "java/lang/invoke/MethodHandles$Lookup$ClassOption");
                        sVar.m(89);
                        sVar.m(3);
                        sVar.j(178, "java/lang/invoke/MethodHandles$Lookup$ClassOption", "NESTMATE", "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;");
                        sVar.m(83);
                        sVar.m(89);
                        sVar.m(4);
                        sVar.j(178, "java/lang/invoke/MethodHandles$Lookup$ClassOption", "STRONG", "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;");
                        sVar.m(83);
                        sVar.A("java/lang/invoke/MethodHandles$Lookup", "defineHiddenClassWithClassData", "([BLjava/lang/Object;Z[Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;)Ljava/lang/invoke/MethodHandles$Lookup;", 182, false);
                        sVar.J(58, 12);
                        sVar.s(new r());
                        r rVar6 = new r();
                        sVar.r(167, rVar6);
                        sVar.s(rVar5);
                        sVar.k(new Object[]{1}, 1, null, 1, 0);
                        sVar.J(25, 0);
                        sVar.J(25, 9);
                        sVar.m(4);
                        sVar.m(5);
                        sVar.I(189, "java/lang/invoke/MethodHandles$Lookup$ClassOption");
                        sVar.m(89);
                        sVar.m(3);
                        sVar.j(178, "java/lang/invoke/MethodHandles$Lookup$ClassOption", "NESTMATE", "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;");
                        sVar.m(83);
                        sVar.m(89);
                        sVar.m(4);
                        sVar.j(178, "java/lang/invoke/MethodHandles$Lookup$ClassOption", "STRONG", "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;");
                        sVar.m(83);
                        sVar.A("java/lang/invoke/MethodHandles$Lookup", "defineHiddenClass", "([BZ[Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;)Ljava/lang/invoke/MethodHandles$Lookup;", 182, false);
                        sVar.J(58, 12);
                        sVar.s(rVar6);
                        sVar.k(new Object[]{"java/lang/invoke/MethodHandles$Lookup"}, 1, null, 1, 0);
                        sVar.J(25, 12);
                        sVar.A("java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", 182, false);
                        sVar.J(58, 10);
                        sVar.k(new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType", 1, "java/util/List", "java/util/List", "java/lang/Class"}, 0, null, 10, 0);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final int r() {
                        return 15;
                    }
                }

                public enum UsingUnsafe implements Loader {
                    /* JADX INFO: Fake field, exist only in values array */
                    JDK_INTERNAL_MISC_UNSAFE("jdk/internal/misc/Unsafe"),
                    /* JADX INFO: Fake field, exist only in values array */
                    SUN_MISC_UNSAFE("sun/misc/Unsafe");


                    /* renamed from: b, reason: collision with root package name */
                    public final String f415457b;

                    UsingUnsafe(String str) {
                        this.f415457b = str;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final int p() {
                        return 4;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final void q(s sVar) {
                        StringBuilder sb2 = new StringBuilder("()L");
                        String str = this.f415457b;
                        sVar.A(str, "getUnsafe", AK.c.s(sb2, str, ";"), 184, false);
                        sVar.J(58, 11);
                        sVar.J(25, 11);
                        sVar.J(25, 0);
                        sVar.A("java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", 182, false);
                        sVar.J(25, 9);
                        sVar.m(1);
                        sVar.A(str, "defineAnonymousClass", "(Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class;", 182, false);
                        sVar.J(58, 10);
                        sVar.J(25, 11);
                        sVar.J(25, 10);
                        sVar.A(str, "ensureClassInitialized", "(Ljava/lang/Class;)V", 182, false);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public final int r() {
                        return 13;
                    }
                }

                int p();

                void q(s sVar);

                int r();
            }

            public enum a extends LambdaMetafactoryFactory {
                @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory
                public final void b(s sVar) {
                    sVar.m(3);
                    sVar.J(54, 6);
                    sVar.A("java/util/Collections", "emptyList", "()Ljava/util/List;", 184, false);
                    sVar.J(58, 7);
                    sVar.A("java/util/Collections", "emptyList", "()Ljava/util/List;", 184, false);
                    sVar.J(58, 8);
                    sVar.k(new Object[]{1, "java/util/List", "java/util/List"}, 1, null, 3, 0);
                }
            }

            public enum b extends LambdaMetafactoryFactory {
                @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory
                public final void b(s sVar) {
                    sVar.J(25, 3);
                    sVar.m(6);
                    sVar.m(50);
                    sVar.I(192, "java/lang/Integer");
                    sVar.A("java/lang/Integer", "intValue", "()I", 182, false);
                    sVar.J(54, 4);
                    sVar.m(7);
                    sVar.J(54, 5);
                    sVar.J(21, 4);
                    sVar.m(5);
                    sVar.m(WebSocketProtocol.PAYLOAD_SHORT);
                    r rVar = new r();
                    sVar.r(153, rVar);
                    sVar.J(25, 3);
                    sVar.J(21, 5);
                    sVar.l(5, 1);
                    sVar.m(50);
                    sVar.I(192, "java/lang/Integer");
                    sVar.A("java/lang/Integer", "intValue", "()I", 182, false);
                    sVar.J(54, 7);
                    sVar.J(21, 7);
                    sVar.I(189, "java/lang/Class");
                    sVar.J(58, 6);
                    sVar.J(25, 3);
                    sVar.J(21, 5);
                    sVar.J(25, 6);
                    sVar.m(3);
                    sVar.J(21, 7);
                    sVar.A("java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", 184, false);
                    sVar.J(21, 5);
                    sVar.J(21, 7);
                    sVar.m(96);
                    sVar.J(54, 5);
                    r rVar2 = new r();
                    sVar.r(167, rVar2);
                    sVar.s(rVar);
                    sVar.k(new Object[]{1, 1}, 1, null, 2, 0);
                    sVar.m(3);
                    sVar.I(189, "java/lang/Class");
                    sVar.J(58, 6);
                    sVar.s(rVar2);
                    sVar.k(new Object[]{"[Ljava/lang/Class;"}, 1, null, 1, 0);
                    sVar.J(21, 4);
                    sVar.m(5);
                    sVar.m(WebSocketProtocol.PAYLOAD_SHORT);
                    r rVar3 = new r();
                    sVar.r(153, rVar3);
                    sVar.J(25, 3);
                    sVar.J(21, 5);
                    sVar.l(5, 1);
                    sVar.m(50);
                    sVar.I(192, "java/lang/Integer");
                    sVar.A("java/lang/Integer", "intValue", "()I", 182, false);
                    sVar.J(54, 8);
                    sVar.J(21, 8);
                    sVar.I(189, "java/lang/invoke/MethodType");
                    sVar.J(58, 7);
                    sVar.J(25, 3);
                    sVar.J(21, 5);
                    sVar.J(25, 7);
                    sVar.m(3);
                    sVar.J(21, 8);
                    sVar.A("java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", 184, false);
                    r rVar4 = new r();
                    sVar.r(167, rVar4);
                    sVar.s(rVar3);
                    sVar.k(null, 3, null, 0, 0);
                    sVar.m(3);
                    sVar.I(189, "java/lang/invoke/MethodType");
                    sVar.J(58, 7);
                    sVar.s(rVar4);
                    sVar.k(new Object[]{"[Ljava/lang/invoke/MethodType;"}, 1, null, 1, 0);
                    sVar.J(25, 3);
                    sVar.m(3);
                    sVar.m(50);
                    sVar.I(192, "java/lang/invoke/MethodType");
                    sVar.J(58, 8);
                    sVar.J(25, 3);
                    sVar.m(4);
                    sVar.m(50);
                    sVar.I(192, "java/lang/invoke/MethodHandle");
                    sVar.J(58, 9);
                    sVar.J(25, 3);
                    sVar.m(5);
                    sVar.m(50);
                    sVar.I(192, "java/lang/invoke/MethodType");
                    sVar.J(58, 10);
                    sVar.J(21, 4);
                    sVar.m(4);
                    sVar.m(WebSocketProtocol.PAYLOAD_SHORT);
                    r rVar5 = new r();
                    sVar.r(153, rVar5);
                    sVar.m(4);
                    r rVar6 = new r();
                    sVar.r(167, rVar6);
                    sVar.s(rVar5);
                    sVar.k(new Object[]{"java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType"}, 1, null, 3, 0);
                    sVar.m(3);
                    sVar.s(rVar6);
                    sVar.k(null, 4, new Object[]{1}, 0, 1);
                    sVar.J(54, 11);
                    sVar.J(25, 6);
                    sVar.A("java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", 184, false);
                    sVar.J(58, 12);
                    sVar.J(25, 7);
                    sVar.A("java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", 184, false);
                    sVar.J(58, 13);
                    sVar.J(25, 8);
                    sVar.J(58, 3);
                    sVar.J(25, 9);
                    sVar.J(58, 4);
                    sVar.J(25, 10);
                    sVar.J(58, 5);
                    sVar.J(21, 11);
                    sVar.J(54, 6);
                    sVar.J(25, 12);
                    sVar.J(58, 7);
                    sVar.J(25, 13);
                    sVar.J(58, 8);
                    sVar.k(new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType", 1, "java/util/List", "java/util/List"}, 0, null, 9, 0);
                }
            }

            static {
                Enum r02;
                try {
                    Class<?> cls = Class.forName("java.lang.invoke.MethodHandles$Lookup", false, null);
                    Class cls2 = Boolean.TYPE;
                    cls.getMethod("defineHiddenClass", byte[].class, cls2, Class.forName("[Ljava.lang.invoke.MethodHandles$Lookup$ClassOption;", false, null));
                    cls.getMethod("defineHiddenClassWithClassData", byte[].class, Object.class, cls2, Class.forName("[Ljava.lang.invoke.MethodHandles$Lookup$ClassOption;", false, null));
                    r02 = Loader.UsingMethodHandleLookup.f415454b;
                } catch (Exception unused) {
                    Loader.UsingUnsafe[] usingUnsafeArrValues = Loader.UsingUnsafe.values();
                    int length = usingUnsafeArrValues.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            r02 = Loader.Unavailable.f415452b;
                            break;
                        }
                        Loader.UsingUnsafe usingUnsafe = usingUnsafeArrValues[i12];
                        try {
                            Class.forName(usingUnsafe.f415457b.replace('/', '.'), false, null).getMethod("defineAnonymousClass", Class.class, byte[].class, Object[].class);
                            r02 = usingUnsafe;
                            break;
                        } catch (Exception unused2) {
                            i12++;
                        }
                    }
                }
                f415448d = r02;
            }

            public LambdaMetafactoryFactory() {
                throw null;
            }

            public LambdaMetafactoryFactory(String str, int i12, int i13, int i14, a aVar) {
                this.f415450b = i13;
                this.f415451c = i14;
            }

            public static LambdaMetafactoryFactory valueOf(String str) {
                return (LambdaMetafactoryFactory) Enum.valueOf(LambdaMetafactoryFactory.class, str);
            }

            public static LambdaMetafactoryFactory[] values() {
                return (LambdaMetafactoryFactory[]) f415449e.clone();
            }

            public abstract void b(s sVar);

            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, net.bytebuddy.agent.builder.AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader] */
            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                b(sVar);
                sVar.A("java/lang/ClassLoader", "getSystemClassLoader", "()Ljava/lang/ClassLoader;", 184, false);
                sVar.t("net.bytebuddy.agent.builder.LambdaFactory");
                sVar.A("java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", 182, false);
                sVar.t("make");
                sVar.o(16, 9);
                sVar.I(189, "java/lang/Class");
                sVar.m(89);
                sVar.m(3);
                sVar.t(B.w(0, 18, "Ljava/lang/Object;"));
                sVar.m(83);
                sVar.m(89);
                sVar.m(4);
                sVar.t(B.w(0, 18, "Ljava/lang/String;"));
                sVar.m(83);
                sVar.m(89);
                sVar.m(5);
                sVar.t(B.w(0, 18, "Ljava/lang/Object;"));
                sVar.m(83);
                sVar.m(89);
                sVar.m(6);
                sVar.t(B.w(0, 18, "Ljava/lang/Object;"));
                sVar.m(83);
                sVar.m(89);
                sVar.m(7);
                sVar.t(B.w(0, 18, "Ljava/lang/Object;"));
                sVar.m(83);
                sVar.m(89);
                sVar.m(8);
                sVar.t(B.w(0, 18, "Ljava/lang/Object;"));
                sVar.m(83);
                sVar.m(89);
                sVar.o(16, 6);
                sVar.j(178, "java/lang/Boolean", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/Class;");
                sVar.m(83);
                sVar.m(89);
                sVar.o(16, 7);
                sVar.t(B.w(0, 16, "Ljava/util/List;"));
                sVar.m(83);
                sVar.m(89);
                sVar.o(16, 8);
                sVar.t(B.w(0, 16, "Ljava/util/List;"));
                sVar.m(83);
                sVar.A("java/lang/Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", 182, false);
                sVar.m(1);
                sVar.o(16, 9);
                sVar.I(189, "java/lang/Object");
                sVar.m(89);
                sVar.m(3);
                sVar.J(25, 0);
                sVar.m(83);
                sVar.m(89);
                sVar.m(4);
                sVar.J(25, 1);
                sVar.m(83);
                sVar.m(89);
                sVar.m(5);
                sVar.J(25, 2);
                sVar.m(83);
                sVar.m(89);
                sVar.m(6);
                sVar.J(25, 3);
                sVar.m(83);
                sVar.m(89);
                sVar.m(7);
                sVar.J(25, 4);
                sVar.m(83);
                sVar.m(89);
                sVar.m(8);
                sVar.J(25, 5);
                sVar.m(83);
                sVar.m(89);
                sVar.o(16, 6);
                sVar.J(21, 6);
                sVar.A("java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", 184, false);
                sVar.m(83);
                sVar.m(89);
                sVar.o(16, 7);
                sVar.J(25, 7);
                sVar.m(83);
                sVar.m(89);
                sVar.o(16, 8);
                sVar.J(25, 8);
                sVar.m(83);
                sVar.A("java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 182, false);
                sVar.I(192, "[B");
                sVar.J(58, 9);
                ?? r82 = f415448d;
                r82.q(sVar);
                sVar.J(25, 2);
                sVar.A("java/lang/invoke/MethodType", "parameterCount", "()I", 182, false);
                r rVar = new r();
                sVar.r(154, rVar);
                sVar.I(187, "java/lang/invoke/ConstantCallSite");
                sVar.m(89);
                sVar.J(25, 2);
                sVar.A("java/lang/invoke/MethodType", "returnType", "()Ljava/lang/Class;", 182, false);
                sVar.J(25, 10);
                sVar.A("java/lang/Class", "getDeclaredConstructors", "()[Ljava/lang/reflect/Constructor;", 182, false);
                sVar.m(3);
                sVar.m(50);
                sVar.m(3);
                sVar.I(189, "java/lang/Object");
                sVar.A("java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", 182, false);
                sVar.A("java/lang/invoke/MethodHandles", "constant", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;", 184, false);
                sVar.A("java/lang/invoke/ConstantCallSite", "<init>", "(Ljava/lang/invoke/MethodHandle;)V", 183, false);
                r rVar2 = new r();
                sVar.r(167, rVar2);
                sVar.s(rVar);
                sVar.k(new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType", 1, "java/util/List", "java/util/List", "[B", "java/lang/Class"}, 0, new Object[0], 11, 0);
                sVar.I(187, "java/lang/invoke/ConstantCallSite");
                sVar.m(89);
                sVar.j(178, "java/lang/invoke/MethodHandles$Lookup", "IMPL_LOOKUP", "Ljava/lang/invoke/MethodHandles$Lookup;");
                sVar.J(25, 10);
                sVar.t("get$Lambda");
                sVar.J(25, 2);
                sVar.A("java/lang/invoke/MethodHandles$Lookup", "findStatic", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;", 182, false);
                sVar.A("java/lang/invoke/ConstantCallSite", "<init>", "(Ljava/lang/invoke/MethodHandle;)V", 183, false);
                sVar.s(rVar2);
                sVar.k(null, 4, new Object[]{"java/lang/invoke/CallSite"}, 0, 1);
                sVar.m(176);
                return new a.c(Math.max(this.f415450b, r82.p()), Math.max(this.f415451c, r82.r()));
            }
        }

        public enum a extends LambdaInstrumentationStrategy {
        }

        public enum b extends LambdaInstrumentationStrategy {
        }

        static {
            a aVar = new a("ENABLED", 0, null);
            b bVar = new b("DISABLED", 1, null);
            f415436b = bVar;
            f415437c = new LambdaInstrumentationStrategy[]{aVar, bVar};
        }

        public LambdaInstrumentationStrategy() {
            throw null;
        }

        public LambdaInstrumentationStrategy(String str, int i12, a aVar) {
        }

        public static LambdaInstrumentationStrategy valueOf(String str) {
            return (LambdaInstrumentationStrategy) Enum.valueOf(LambdaInstrumentationStrategy.class, str);
        }

        public static LambdaInstrumentationStrategy[] values() {
            return (LambdaInstrumentationStrategy[]) f415437c.clone();
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class LambdaInstanceFactory {
            static {
                new AtomicInteger();
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

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ConstructorImplementation implements Implementation {

                /* renamed from: c, reason: collision with root package name */
                public static final ConstructorImplementation f415438c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ ConstructorImplementation[] f415439d;

                /* renamed from: b, reason: collision with root package name */
                public final transient a.d f415440b = (a.d) ((net.bytebuddy.description.method.b) ((z.a) TypeDescription.f416317A2.q()).P1(MethodSortMatcher.Sort.f418387e.f418392c)).M2();

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements net.bytebuddy.implementation.bytecode.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final net.bytebuddy.description.field.b f415441b;

                    public a(net.bytebuddy.description.field.b bVar) {
                        this.f415441b = bVar;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415441b.equals(((a) obj).f415441b);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        net.bytebuddy.description.field.b bVar = this.f415441b;
                        ArrayList arrayList = new ArrayList(bVar.size() * 3);
                        Iterator<?> it = aVar.getParameters().iterator();
                        while (it.hasNext()) {
                            net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                            arrayList.add(MethodVariableAccess.c());
                            arrayList.add(MethodVariableAccess.b(cVar));
                            arrayList.add(FieldAccess.b((a.c) bVar.get(cVar.getIndex())).new c());
                        }
                        return new a.c(new StackManipulation.b(MethodVariableAccess.c(), MethodInvocation.a(ConstructorImplementation.f415438c.f415440b), new StackManipulation.b(arrayList), MethodReturn.f418075h).n(sVar, context).f417834b, aVar.p());
                    }

                    public final int hashCode() {
                        return this.f415441b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                static {
                    ConstructorImplementation constructorImplementation = new ConstructorImplementation();
                    f415438c = constructorImplementation;
                    f415439d = new ConstructorImplementation[]{constructorImplementation};
                }

                public static ConstructorImplementation valueOf(String str) {
                    return (ConstructorImplementation) Enum.valueOf(ConstructorImplementation.class, str);
                }

                public static ConstructorImplementation[] values() {
                    return (ConstructorImplementation[]) f415439d.clone();
                }

                @Override // net.bytebuddy.implementation.Implementation
                public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                    return new a(target.a().x());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class FactoryImplementation implements Implementation {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ FactoryImplementation[] f415442b = {new FactoryImplementation("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                FactoryImplementation EF5;

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements net.bytebuddy.implementation.bytecode.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypeDescription f415443b;

                    public a(TypeDescription typeDescription) {
                        this.f415443b = typeDescription;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415443b.equals(((a) obj).f415443b);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        TypeDescription typeDescription = this.f415443b;
                        return new a.c(new StackManipulation.b(net.bytebuddy.implementation.bytecode.b.g(typeDescription), Duplication.f417792d, MethodVariableAccess.a(aVar), MethodInvocation.a((a.d) typeDescription.q().P1(MethodSortMatcher.Sort.f418387e.f418392c).M2()), MethodReturn.f418076i).n(sVar, context).f417834b, aVar.p());
                    }

                    public final int hashCode() {
                        return this.f415443b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                public FactoryImplementation() {
                    throw null;
                }

                public static FactoryImplementation valueOf(String str) {
                    return (FactoryImplementation) Enum.valueOf(FactoryImplementation.class, str);
                }

                public static FactoryImplementation[] values() {
                    return (FactoryImplementation[]) f415442b.clone();
                }

                @Override // net.bytebuddy.implementation.Implementation
                public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                    return new a(target.a());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class LambdaMethodImplementation implements Implementation {

                @HashCodeAndEqualsPlugin.Enhance
                public static class Appender implements net.bytebuddy.implementation.bytecode.a {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Dispatcher f415444b;

                    public interface Dispatcher {

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        public static final class UsingDirectInvocation implements Dispatcher {

                            /* renamed from: b, reason: collision with root package name */
                            public static final UsingDirectInvocation f415445b;

                            /* renamed from: c, reason: collision with root package name */
                            public static final /* synthetic */ UsingDirectInvocation[] f415446c;

                            static {
                                UsingDirectInvocation usingDirectInvocation = new UsingDirectInvocation("INSTANCE", 0);
                                f415445b = usingDirectInvocation;
                                f415446c = new UsingDirectInvocation[]{usingDirectInvocation};
                            }

                            public UsingDirectInvocation() {
                                throw null;
                            }

                            public static UsingDirectInvocation valueOf(String str) {
                                return (UsingDirectInvocation) Enum.valueOf(UsingDirectInvocation.class, str);
                            }

                            public static UsingDirectInvocation[] values() {
                                return (UsingDirectInvocation[]) f415446c.clone();
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class a extends StackManipulation.a implements Dispatcher {

                            /* renamed from: b, reason: collision with root package name */
                            public final a.c f415447b;

                            public a(a.c cVar) {
                                this.f415447b = cVar;
                            }

                            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj != null && getClass() == obj.getClass()) {
                                    return this.f415447b.equals(((a) obj).f415447b);
                                }
                                return false;
                            }

                            public final int hashCode() {
                                return this.f415447b.hashCode() + (getClass().hashCode() * 31);
                            }

                            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                                sVar.t(new h("_", "Ljava/lang/invoke/MethodHandle;", new p("java/lang/invoke/MethodHandles", "classData", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", 6, false), new Object[0]));
                                return new StackManipulation.d(1, 1);
                            }
                        }
                    }

                    static {
                        Dispatcher aVar;
                        try {
                            Class<?> cls = Class.forName("java.lang.invoke.MethodHandles$Lookup", false, null);
                            cls.getMethod("classData", cls, String.class, Class.class);
                            aVar = new Dispatcher.a(new a.c(Class.forName("java.lang.invoke.MethodHandle", false, null).getMethod("invokeExact", Object[].class)));
                        } catch (Exception unused) {
                            aVar = Dispatcher.UsingDirectInvocation.f415445b;
                        }
                        f415444b = aVar;
                    }

                    public Appender() {
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

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        throw null;
                    }

                    public final int hashCode() {
                        getClass().hashCode();
                        throw null;
                    }
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
                public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                    throw null;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Implementation {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.agent.builder.AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$a$a, reason: collision with other inner class name */
                public static class C11898a implements net.bytebuddy.implementation.bytecode.a {
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        throw null;
                    }

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        MethodVariableAccess.a(aVar);
                        throw null;
                    }

                    public final int hashCode() {
                        getClass().hashCode();
                        throw null;
                    }
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
                public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                    throw null;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements Implementation {
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
                public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                    try {
                        TypeDescription typeDescriptionA0 = TypeDescription.d.A0(Class.forName("java.lang.invoke.SerializedLambda"));
                        ArrayList arrayList = new ArrayList(target.a().x().size());
                        for (a.c cVar : target.a().x()) {
                            arrayList.add(new StackManipulation.b(MethodVariableAccess.c(), FieldAccess.b(cVar).new C12105b(), Assigner.f417851M2.a(cVar.getType(), TypeDescription.Generic.f416323x2, Assigner.Typing.STATIC)));
                        }
                        net.bytebuddy.implementation.bytecode.b.g(typeDescriptionA0);
                        Duplication duplication = Duplication.f417792d;
                        ClassConstant.c(null);
                        throw null;
                    } catch (ClassNotFoundException e12) {
                        throw new IllegalStateException("Cannot find class for lambda serialization", e12);
                    }
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }
    }
}
