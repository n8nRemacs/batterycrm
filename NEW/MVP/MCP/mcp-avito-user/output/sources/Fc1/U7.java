package Fc1;

import feedback.shared.sdk.api.network.entities.Page;
import java.util.ArrayList;
import java.util.List;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class U7 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList<Page> f5238a;

    /* renamed from: b, reason: collision with root package name */
    public int f5239b;

    public U7(@Y61.k List<Page> list) {
        ArrayList<Page> arrayList = new ArrayList<>();
        this.f5238a = arrayList;
        int i12 = kotlin.jvm.internal.J.f406821a;
        this.f5239b = 0;
        arrayList.addAll(list);
    }

    @Y61.k
    public final Page a() {
        return this.f5238a.get(this.f5239b);
    }
}
