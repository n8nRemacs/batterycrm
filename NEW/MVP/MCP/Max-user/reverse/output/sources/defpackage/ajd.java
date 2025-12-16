package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ajd extends LinkedHashMap {
    public final /* synthetic */ bj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajd(bj bjVar, int i) {
        super(i, 0.75f, true);
        this.a = bjVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.b;
    }
}
