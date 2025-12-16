package Oi0;

import TV0.g;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DestroyableViewHolderBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOi0/c;", "LOi0/b;", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14699c implements InterfaceC14698b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g<com.avito.konveyor.adapter.b> f12492b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f12493c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public C14699c(@k g<? extends com.avito.konveyor.adapter.b> gVar) {
        this.f12492b = gVar;
    }

    @Override // Oi0.InterfaceC14698b
    public final void destroy() {
        ArrayList arrayList = this.f12493c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC14697a) it.next()).destroy();
        }
        arrayList.clear();
    }

    @Override // TV0.g
    @l
    public final com.avito.konveyor.adapter.b k(@k ViewGroup viewGroup, int i12, @k Y41.l<? super Integer, ? extends View> lVar) {
        com.avito.konveyor.adapter.b bVarK = this.f12492b.k(viewGroup, i12, lVar);
        if (bVarK instanceof InterfaceC14697a) {
            this.f12493c.add(bVarK);
        }
        return bVarK;
    }
}
