package defpackage;

import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public abstract class sr3 {
    public final ConcurrentHashMap a;
    public volatile byte[] b;
    public final bh8 c;
    public final SecureRandom d;
    public final int e;

    public sr3(Integer num, bh8 bh8Var) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        int iIntValue = num != null ? num.intValue() : 8;
        this.e = iIntValue;
        this.c = bh8Var;
        SecureRandom secureRandom = new SecureRandom();
        this.d = secureRandom;
        byte[] bArr = new byte[iIntValue];
        secureRandom.nextBytes(bArr);
        this.b = bArr;
        concurrentHashMap.put(0, new or3(0, this.b, 2));
    }

    public final byte[] a() {
        return (byte[]) this.a.entrySet().stream().filter(new gb3(1)).map(new m0(8)).findFirst().orElse(null);
    }

    public final List b() {
        return (List) this.a.values().stream().filter(new gb3(2)).map(new m0(9)).collect(Collectors.toList());
    }

    public final byte[] c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(numValueOf)) {
            return null;
        }
        or3 or3Var = (or3) concurrentHashMap.get(Integer.valueOf(i));
        if (az1.c(or3Var.c, 4)) {
            return null;
        }
        or3Var.c = 4;
        return or3Var.b;
    }
}
