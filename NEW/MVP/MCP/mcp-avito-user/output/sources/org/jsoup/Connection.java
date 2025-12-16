package org.jsoup;

/* loaded from: classes7.dex */
public interface Connection {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Method {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Method[] f421035b = {new Method("GET", 0), new Method("POST", 1), new Method("PUT", 2), new Method("DELETE", 3), new Method("PATCH", 4), new Method("HEAD", 5), new Method("OPTIONS", 6), new Method("TRACE", 7)};

        /* JADX INFO: Fake field, exist only in values array */
        Method EF5;

        public Method() {
            throw null;
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) f421035b.clone();
        }
    }

    public interface a<T extends a> {
    }

    public interface b {
    }

    public interface c extends a<c> {
    }

    public interface d extends a<d> {
    }
}
