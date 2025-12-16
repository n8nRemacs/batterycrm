package Oa1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* renamed from: Oa1.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14650i extends kotlin.jvm.internal.N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<C14654m> f12369l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14650i(List list) {
        super(0);
        this.f12369l = list;
    }

    @Override // Y41.a
    public final String invoke() {
        List<C14654m> list = this.f12369l;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new g0(((C14654m) it.next()).f12378a));
        }
        return "Getting first 10 from storage: " + arrayList;
    }
}
