package ru.rustore.sdk.core.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class s {
    public static final void a(Y41.l lVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lVar.invoke(it.next());
            it.remove();
        }
    }
}
