package Y61;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Async.java */
/* loaded from: classes7.dex */
public final class b {

    /* compiled from: Async.java */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* compiled from: Async.java */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: Y61.b$b, reason: collision with other inner class name */
    public @interface InterfaceC1367b {
    }

    public b() {
        throw new AssertionError("Async should not be instantiated");
    }
}
