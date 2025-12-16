package androidx.emoji2.text.flatbuffer;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: Utf8Old.java */
/* loaded from: classes.dex */
public class z extends x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f46109b = 0;

    /* compiled from: Utf8Old.java */
    public static class a {
        public a() {
            Charset charset = StandardCharsets.UTF_8;
            charset.newEncoder();
            charset.newDecoder();
        }
    }

    static {
        ThreadLocal.withInitial(new y());
    }
}
