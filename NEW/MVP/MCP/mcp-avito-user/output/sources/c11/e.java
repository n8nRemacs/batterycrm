package C11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.o0;

/* JADX WARN: Method from annotation default annotation not found: dependencies */
/* JADX WARN: Method from annotation default annotation not found: exclude */
/* JADX WARN: Method from annotation default annotation not found: modules */
/* compiled from: MergeComponent.kt */
@Target({ElementType.TYPE})
@P41.d
@P41.b
@Retention(RetentionPolicy.RUNTIME)
@P41.c
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000bBO\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0004\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0004\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"LC11/e;", "", "Lkotlin/reflect/d;", "scope", "", "modules", "dependencies", "exclude", "<init>", "(Lkotlin/reflect/d;Lkotlin/Array;Lkotlin/Array;Lkotlin/Array;)V", "a", "c", "annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Repeatable(b.class)
/* loaded from: classes7.dex */
public @interface e {

    /* compiled from: MergeComponent.kt */
    @Target({ElementType.TYPE})
    @P41.d
    @P41.b
    @Retention(RetentionPolicy.RUNTIME)
    @P41.c
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LC11/e$a;", "", "<init>", "()V", "annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Repeatable(InterfaceC0085a.class)
    public @interface a {

        /* compiled from: MergeComponent.kt */
        @Target({ElementType.TYPE})
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @P41.d
        @o0
        @Retention(RetentionPolicy.RUNTIME)
        @P41.c
        /* renamed from: C11.e$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0085a {
        }
    }

    /* compiled from: MergeComponent.kt */
    @Target({ElementType.TYPE})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @P41.d
    @o0
    @Retention(RetentionPolicy.RUNTIME)
    @P41.c
    public @interface b {
    }

    /* compiled from: MergeComponent.kt */
    @Target({ElementType.TYPE})
    @P41.d
    @P41.b
    @Retention(RetentionPolicy.RUNTIME)
    @P41.c
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LC11/e$c;", "", "<init>", "()V", "annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Repeatable(a.class)
    public @interface c {

        /* compiled from: MergeComponent.kt */
        @Target({ElementType.TYPE})
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @P41.d
        @o0
        @Retention(RetentionPolicy.RUNTIME)
        @P41.c
        public @interface a {
        }
    }
}
