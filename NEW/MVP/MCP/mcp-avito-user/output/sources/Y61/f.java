package Y61;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Debug.java */
/* loaded from: classes7.dex */
public final class f {

    /* JADX WARN: Method from annotation default annotation not found: childrenArray */
    /* JADX WARN: Method from annotation default annotation not found: hasChildren */
    /* JADX WARN: Method from annotation default annotation not found: text */
    /* compiled from: Debug.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    public f() {
        throw new AssertionError("Debug should not be instantiated");
    }
}
