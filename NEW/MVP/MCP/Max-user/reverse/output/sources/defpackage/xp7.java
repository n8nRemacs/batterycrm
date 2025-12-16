package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class xp7 implements t3h {
    public Object X;
    public long a;
    public long b;
    public String c;
    public String d;
    public long o;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.t3h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp7.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void b(Object obj, String str) {
        us usVar = (us) this.X;
        if (usVar == null) {
            usVar = new us(1);
            this.X = usVar;
        }
        usVar.put(str, obj);
    }

    public void c(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        us usVar = (us) this.X;
        if (usVar == null) {
            usVar = new us(map.size());
            this.X = usVar;
        }
        usVar.putAll(map);
    }

    public hg8 d() {
        String str = this.c;
        String str2 = this.d;
        us usVar = (us) this.X;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        if (this.a == 0) {
            this.a = System.currentTimeMillis();
        }
        long j = this.a;
        long j2 = this.b;
        if (usVar == null) {
            usVar = new us(0);
        }
        return new hg8(j2, this.o, j, str, str2, usVar);
    }
}
