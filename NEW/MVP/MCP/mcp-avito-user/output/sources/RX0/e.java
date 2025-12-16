package rX0;

import com.fasterxml.jackson.annotation.InterfaceC36431a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JsonPOJOBuilder.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface e {

    /* compiled from: JsonPOJOBuilder.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f429867a;

        /* renamed from: b, reason: collision with root package name */
        public final String f429868b;

        public a(e eVar) {
            String strBuildMethodName = eVar.buildMethodName();
            String strWithPrefix = eVar.withPrefix();
            this.f429867a = strBuildMethodName;
            this.f429868b = strWithPrefix;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
