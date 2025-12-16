package com.google.common.escape;

/* compiled from: Platform.java */
@XY0.b
@f
/* loaded from: classes6.dex */
final class l {

    /* compiled from: Platform.java */
    public class a extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        public final char[] initialValue() {
            return new char[1024];
        }
    }

    static {
        new a();
    }
}
