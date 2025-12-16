package org.mockito.internal.junit;

/* compiled from: ExceptionFactory.java */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f421678a = null;

    /* compiled from: ExceptionFactory.java */
    public interface a {
    }

    static {
        try {
            try {
                Class.forName("org.opentest4j.AssertionFailedError");
            } catch (ClassNotFoundException unused) {
                Class.forName("junit.framework.ComparisonFailure");
            }
        } catch (ClassNotFoundException unused2) {
        }
    }
}
