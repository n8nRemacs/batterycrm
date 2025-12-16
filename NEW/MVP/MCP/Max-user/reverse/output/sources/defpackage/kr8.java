package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kr8 extends LinkedHashMap {
    public final /* synthetic */ int a;
    public final int b;

    public kr8(int i) {
        this.a = 0;
        this.b = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (super.size() > this.b) {
                }
                break;
            default:
                if (size() > this.b) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr8(int i, int i2) {
        super(4, 0.75f, true);
        this.a = 0;
        this.b = i;
    }

    public kr8() {
        this.a = 1;
        this.b = 10;
    }
}
