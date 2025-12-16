package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.c;
import net.bytebuddy.matcher.InterfaceC44410t;
import okhttp3.internal.http2.Http2;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class ModifierMatcher<T extends net.bytebuddy.description.c> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Mode f418393b;

    public enum Mode {
        PUBLIC(1, "isPublic()"),
        PROTECTED(4, "isProtected()"),
        PRIVATE(2, "isPrivate()"),
        FINAL(16, "isFinal()"),
        STATIC(8, "isStatic()"),
        /* JADX INFO: Fake field, exist only in values array */
        SYNCHRONIZED(32, "isSynchronized()"),
        NATIVE(256, "isNative()"),
        /* JADX INFO: Fake field, exist only in values array */
        STRICT(2048, "isStrict()"),
        /* JADX INFO: Fake field, exist only in values array */
        VAR_ARGS(128, "isVarArgs()"),
        SYNTHETIC(4096, "isSynthetic()"),
        BRIDGE(64, "isBridge()"),
        ABSTRACT(1024, "isAbstract()"),
        INTERFACE(512, "isInterface()"),
        /* JADX INFO: Fake field, exist only in values array */
        ANNOTATION(8192, "isAnnotation()"),
        /* JADX INFO: Fake field, exist only in values array */
        VOLATILE(64, "isVolatile()"),
        /* JADX INFO: Fake field, exist only in values array */
        TRANSIENT(128, "isTransient()"),
        /* JADX INFO: Fake field, exist only in values array */
        MANDATED(32768, "isMandated()"),
        /* JADX INFO: Fake field, exist only in values array */
        ENUMERATION(Http2.INITIAL_MAX_FRAME_SIZE, "isEnum()");


        /* renamed from: b, reason: collision with root package name */
        public final int f418405b;

        /* renamed from: c, reason: collision with root package name */
        public final String f418406c;

        /* renamed from: d, reason: collision with root package name */
        public final ModifierMatcher<?> f418407d = new ModifierMatcher<>(this);

        Mode(int i12, String str) {
            this.f418405b = i12;
            this.f418406c = str;
        }
    }

    public ModifierMatcher(Mode mode) {
        this.f418393b = mode;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return (((net.bytebuddy.description.c) obj).getModifiers() & this.f418393b.f418405b) != 0;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418393b.equals(((ModifierMatcher) obj).f418393b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418393b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return this.f418393b.f418406c;
    }
}
