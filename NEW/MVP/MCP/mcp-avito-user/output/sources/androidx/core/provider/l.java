package androidx.core.provider;

import androidx.collection.o1;
import androidx.core.provider.m;
import androidx.core.util.InterfaceC22791e;
import java.util.ArrayList;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
class l implements InterfaceC22791e<m.a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44834b;

    public l(String str) {
        this.f44834b = str;
    }

    @Override // androidx.core.util.InterfaceC22791e
    public final void accept(m.a aVar) {
        m.a aVar2 = aVar;
        synchronized (m.f44837c) {
            try {
                o1<String, ArrayList<InterfaceC22791e<m.a>>> o1Var = m.f44838d;
                ArrayList<InterfaceC22791e<m.a>> arrayList = o1Var.get(this.f44834b);
                if (arrayList == null) {
                    return;
                }
                o1Var.remove(this.f44834b);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    arrayList.get(i12).accept(aVar2);
                }
            } finally {
            }
        }
    }
}
