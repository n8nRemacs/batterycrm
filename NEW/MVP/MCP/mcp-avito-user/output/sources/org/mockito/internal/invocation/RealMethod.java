package org.mockito.internal.invocation;

import java.io.Serializable;

/* loaded from: classes7.dex */
public interface RealMethod extends Serializable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IsIllegal implements RealMethod {

        /* renamed from: b, reason: collision with root package name */
        public static final IsIllegal f421649b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ IsIllegal[] f421650c;

        static {
            IsIllegal isIllegal = new IsIllegal("INSTANCE", 0);
            f421649b = isIllegal;
            f421650c = new IsIllegal[]{isIllegal};
        }

        public IsIllegal() {
            throw null;
        }

        public static IsIllegal valueOf(String str) {
            return (IsIllegal) Enum.valueOf(IsIllegal.class, str);
        }

        public static IsIllegal[] values() {
            return (IsIllegal[]) f421650c.clone();
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final Object invoke() {
            throw new IllegalStateException();
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final boolean l4() {
            return false;
        }
    }

    public static class a implements RealMethod {
        @Override // org.mockito.internal.invocation.RealMethod
        public final Object invoke() {
            try {
                throw null;
            } catch (Throwable th2) {
                new org.mockito.internal.exceptions.stacktrace.a().a(th2);
                throw th2;
            }
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final boolean l4() {
            return true;
        }
    }

    public static class b extends a implements RealMethod {
    }

    Object invoke();

    boolean l4();
}
