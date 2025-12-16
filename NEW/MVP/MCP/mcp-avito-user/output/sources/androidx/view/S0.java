package androidx.view;

import Y61.k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: ViewModelStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/S0;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class S0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f46714a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f46714a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((M0) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
