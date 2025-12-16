package androidx.emoji2.text;

import android.annotation.SuppressLint;
import j.InterfaceC42164u;
import j.N;
import j.X;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: EmojiExclusions.java */
/* loaded from: classes.dex */
class k {

    /* compiled from: EmojiExclusions.java */
    @X
    public static class a {
        @InterfaceC42164u
        @N
        public static Set<int[]> a() {
            return b.a();
        }
    }

    /* compiled from: EmojiExclusions.java */
    public static class b {
        @N
        @SuppressLint({"BanUncheckedReflection"})
        public static Set<int[]> a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (objInvoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) objInvoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }
}
