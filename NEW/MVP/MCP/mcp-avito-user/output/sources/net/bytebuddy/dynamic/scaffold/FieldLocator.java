package net.bytebuddy.dynamic.scaffold;

import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.b;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.W;

/* loaded from: classes8.dex */
public interface FieldLocator {

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForClassHierarchy extends a {

        /* renamed from: c, reason: collision with root package name */
        public final TypeDescription f416816c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Factory implements b {

            /* renamed from: b, reason: collision with root package name */
            public static final Factory f416817b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Factory[] f416818c;

            static {
                Factory factory = new Factory("INSTANCE", 0);
                f416817b = factory;
                f416818c = new Factory[]{factory};
            }

            public Factory() {
                throw null;
            }

            public static Factory valueOf(String str) {
                return (Factory) Enum.valueOf(Factory.class, str);
            }

            public static Factory[] values() {
                return (Factory[]) f416818c.clone();
            }
        }

        public ForClassHierarchy(TypeDescription typeDescription) {
            super(typeDescription);
            this.f416816c = typeDescription;
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.a
        public final net.bytebuddy.description.field.b a(InterfaceC44410t.a aVar) {
            Iterator<TypeDefinition> it = this.f416816c.iterator();
            while (it.hasNext()) {
                net.bytebuddy.description.field.b bVarP1 = it.next().x().P1(aVar);
                if (!bVarP1.isEmpty()) {
                    return bVarP1;
                }
            }
            return new b.C11973b();
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.a
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416816c.equals(((ForClassHierarchy) obj).f416816c);
            }
            return false;
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.a
        public final int hashCode() {
            return this.f416816c.hashCode() + (super.hashCode() * 31);
        }
    }

    public static class ForTopLevelType extends a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Factory implements b {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Factory[] f416819b = {new Factory("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            Factory EF5;

            public Factory() {
                throw null;
            }

            public static Factory valueOf(String str) {
                return (Factory) Enum.valueOf(Factory.class, str);
            }

            public static Factory[] values() {
                return (Factory[]) f416819b.clone();
            }
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.a
        public final net.bytebuddy.description.field.b a(InterfaceC44410t.a aVar) {
            return this.f416824b.x().P1(aVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements FieldLocator, b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f416820b = {new NoOp("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        NoOp EF5;

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f416820b.clone();
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public final Resolution K(String str) {
            return Resolution.Illegal.f416821b;
        }
    }

    public interface Resolution {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Illegal implements Resolution {

            /* renamed from: b, reason: collision with root package name */
            public static final Illegal f416821b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Illegal[] f416822c;

            static {
                Illegal illegal = new Illegal("INSTANCE", 0);
                f416821b = illegal;
                f416822c = new Illegal[]{illegal};
            }

            public Illegal() {
                throw null;
            }

            public static Illegal valueOf(String str) {
                return (Illegal) Enum.valueOf(Illegal.class, str);
            }

            public static Illegal[] values() {
                return (Illegal[]) f416822c.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public final net.bytebuddy.description.field.a a() {
                throw new IllegalStateException("Could not locate field");
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public final boolean b() {
                return false;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Resolution {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.field.a f416823b;

            public a(net.bytebuddy.description.field.a aVar) {
                this.f416823b = aVar;
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public final net.bytebuddy.description.field.a a() {
                return this.f416823b;
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public final boolean b() {
                return true;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416823b.equals(((a) obj).f416823b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f416823b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        net.bytebuddy.description.field.a a();

        boolean b();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class a implements FieldLocator {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f416824b;

        public a(TypeDescription typeDescription) {
            this.f416824b = typeDescription;
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public final Resolution K(String str) {
            net.bytebuddy.description.field.b bVarA = a(C44411u.x(str).a(new W(this.f416824b)));
            return bVarA.size() == 1 ? new Resolution.a((net.bytebuddy.description.field.a) bVarA.M2()) : Resolution.Illegal.f416821b;
        }

        public abstract net.bytebuddy.description.field.b a(InterfaceC44410t.a aVar);

        public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416824b.equals(((a) obj).f416824b);
            }
            return false;
        }

        public int hashCode() {
            return this.f416824b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    public interface b {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c extends a {

        /* renamed from: c, reason: collision with root package name */
        public final TypeDescription f416825c;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements b {
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

        public c(TypeDescription typeDescription, TypeDescription typeDescription2) {
            super(typeDescription2);
            this.f416825c = typeDescription;
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.a
        public final net.bytebuddy.description.field.b a(InterfaceC44410t.a aVar) {
            return this.f416825c.x().P1(aVar);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.a
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416825c.equals(((c) obj).f416825c);
            }
            return false;
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.a
        public final int hashCode() {
            return this.f416825c.hashCode() + (super.hashCode() * 31);
        }
    }

    Resolution K(String str);
}
