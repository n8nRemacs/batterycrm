package androidx.core.text.util;

import androidx.core.text.util.c;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c.b bVar = (c.b) obj;
        c.b bVar2 = (c.b) obj2;
        int i12 = bVar.f44890c;
        int i13 = bVar2.f44890c;
        if (i12 < i13) {
            return -1;
        }
        if (i12 > i13) {
            return 1;
        }
        return Integer.compare(bVar2.f44891d, bVar.f44891d);
    }
}
