package net.bytebuddy.implementation;

import net.bytebuddy.description.method.a;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.implementation.Implementation;

/* loaded from: classes7.dex */
public interface MethodAccessorFactory {

    public enum AccessType {
        PUBLIC(Visibility.PUBLIC),
        DEFAULT(Visibility.PACKAGE_PRIVATE);


        /* renamed from: b, reason: collision with root package name */
        public final Visibility f417363b;

        AccessType(Visibility visibility) {
            this.f417363b = visibility;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Illegal implements MethodAccessorFactory {

        /* renamed from: b, reason: collision with root package name */
        public static final Illegal f417364b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Illegal[] f417365c;

        static {
            Illegal illegal = new Illegal("INSTANCE", 0);
            f417364b = illegal;
            f417365c = new Illegal[]{illegal};
        }

        public Illegal() {
            throw null;
        }

        public static Illegal valueOf(String str) {
            return (Illegal) Enum.valueOf(Illegal.class, str);
        }

        public static Illegal[] values() {
            return (Illegal[]) f417365c.clone();
        }

        @Override // net.bytebuddy.implementation.MethodAccessorFactory
        public final a.d c(Implementation.SpecialMethodInvocation specialMethodInvocation, AccessType accessType) {
            throw new IllegalStateException("It is illegal to register an accessor for this type");
        }
    }

    a.d c(Implementation.SpecialMethodInvocation specialMethodInvocation, AccessType accessType);
}
