package com.google.common.escape;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: Escapers.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f360156a = 0;

    /* compiled from: Escapers.java */
    public class a extends d {
    }

    /* compiled from: Escapers.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f360157a;

        /* renamed from: b, reason: collision with root package name */
        public char f360158b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public String f360159c;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public final void a() {
            char[][] cArr;
            HashMap map = this.f360157a;
            map.getClass();
            if (map.isEmpty()) {
                cArr = com.google.common.escape.b.f360155a;
            } else {
                char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
                for (Character ch2 : map.keySet()) {
                    cArr2[ch2.charValue()] = ((String) map.get(ch2)).toCharArray();
                }
                cArr = cArr2;
            }
            new j();
            int length = cArr.length;
            String str = this.f360159c;
            if (str != null) {
                str.toCharArray();
            }
        }

        public b() {
            this.f360157a = new HashMap();
            this.f360158b = (char) 65535;
            this.f360159c = null;
        }
    }

    static {
        new a();
    }
}
