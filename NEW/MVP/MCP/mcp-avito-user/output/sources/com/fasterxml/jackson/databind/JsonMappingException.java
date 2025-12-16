package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public class JsonMappingException extends DatabindException {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f341373e = 0;
    private static final long serialVersionUID = 3;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList<a> f341374c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Closeable f341375d;

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this.f341375d = closeable;
        if (closeable instanceof JsonParser) {
            this.f341081b = ((JsonParser) closeable).P();
        }
    }

    public static JsonMappingException g(IOException iOException) {
        return new JsonMappingException(null, androidx.compose.ui.graphics.colorspace.e.n("Unexpected IOException (of type ", iOException.getClass().getName(), "): ", com.fasterxml.jackson.databind.util.g.i(iOException)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.JsonMappingException h(java.lang.Throwable r3, com.fasterxml.jackson.databind.JsonMappingException.a r4) {
        /*
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.JsonMappingException
            if (r0 == 0) goto L7
            com.fasterxml.jackson.databind.JsonMappingException r3 = (com.fasterxml.jackson.databind.JsonMappingException) r3
            goto L47
        L7:
            java.lang.String r0 = com.fasterxml.jackson.databind.util.g.i(r3)
            if (r0 == 0) goto L13
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2e
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "(was "
            r0.<init>(r1)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L2e:
            boolean r1 = r3 instanceof com.fasterxml.jackson.core.JacksonException
            if (r1 == 0) goto L40
            r1 = r3
            com.fasterxml.jackson.core.JacksonException r1 = (com.fasterxml.jackson.core.JacksonException) r1
            java.lang.Object r1 = r1.c()
            boolean r2 = r1 instanceof java.io.Closeable
            if (r2 == 0) goto L40
            java.io.Closeable r1 = (java.io.Closeable) r1
            goto L41
        L40:
            r1 = 0
        L41:
            com.fasterxml.jackson.databind.JsonMappingException r2 = new com.fasterxml.jackson.databind.JsonMappingException
            r2.<init>(r1, r0, r3)
            r3 = r2
        L47:
            java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException$a> r0 = r3.f341374c
            if (r0 != 0) goto L52
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.f341374c = r0
        L52:
            java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException$a> r0 = r3.f341374c
            int r0 = r0.size()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 >= r1) goto L61
            java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException$a> r0 = r3.f341374c
            r0.addFirst(r4)
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonMappingException.h(java.lang.Throwable, com.fasterxml.jackson.databind.JsonMappingException$a):com.fasterxml.jackson.databind.JsonMappingException");
    }

    public static JsonMappingException i(Throwable th2, Object obj, int i12) {
        a aVar = new a();
        aVar.f341376b = obj;
        aVar.f341378d = i12;
        return h(th2, aVar);
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    @com.fasterxml.jackson.annotation.o
    public final Object c() {
        return this.f341375d;
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public final void e(Object obj, String str) {
        a aVar = new a(obj, str);
        if (this.f341374c == null) {
            this.f341374c = new LinkedList<>();
        }
        if (this.f341374c.size() < 1000) {
            this.f341374c.addFirst(aVar);
        }
    }

    public final String f() {
        String message = super.getMessage();
        if (this.f341374c == null) {
            return message;
        }
        StringBuilder sb2 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb2.append(" (through reference chain: ");
        LinkedList<a> linkedList = this.f341374c;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().a());
                if (it.hasNext()) {
                    sb2.append("->");
                }
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return f();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return f();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public static class a implements Serializable {
        private static final long serialVersionUID = 2;

        /* renamed from: b, reason: collision with root package name */
        public transient Object f341376b;

        /* renamed from: c, reason: collision with root package name */
        public final String f341377c;

        /* renamed from: d, reason: collision with root package name */
        public int f341378d = -1;

        /* renamed from: e, reason: collision with root package name */
        public String f341379e;

        public a() {
        }

        public final String a() {
            if (this.f341379e == null) {
                StringBuilder sb2 = new StringBuilder();
                Object obj = this.f341376b;
                if (obj != null) {
                    Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i12 = 0;
                    while (componentType.isArray()) {
                        componentType = componentType.getComponentType();
                        i12++;
                    }
                    sb2.append(componentType.getName());
                    while (true) {
                        i12--;
                        if (i12 < 0) {
                            break;
                        }
                        sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    }
                } else {
                    sb2.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
                }
                sb2.append('[');
                String str = this.f341377c;
                if (str != null) {
                    sb2.append('\"');
                    sb2.append(str);
                    sb2.append('\"');
                } else {
                    int i13 = this.f341378d;
                    if (i13 >= 0) {
                        sb2.append(i13);
                    } else {
                        sb2.append('?');
                    }
                }
                sb2.append(']');
                this.f341379e = sb2.toString();
            }
            return this.f341379e;
        }

        public final String toString() {
            return a();
        }

        public Object writeReplace() {
            a();
            return this;
        }

        public a(Object obj, String str) {
            this.f341376b = obj;
            if (str != null) {
                this.f341377c = str;
                return;
            }
            throw new NullPointerException("Cannot pass null fieldName");
        }
    }

    public JsonMappingException(JsonParser jsonParser, String str, com.fasterxml.jackson.core.e eVar) {
        super(str, eVar, null);
        this.f341375d = jsonParser;
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th2) {
        super(str, null, th2);
        this.f341375d = closeable;
        if (th2 instanceof JacksonException) {
            this.f341081b = ((JacksonException) th2).a();
        } else if (closeable instanceof JsonParser) {
            this.f341081b = ((JsonParser) closeable).P();
        }
    }
}
