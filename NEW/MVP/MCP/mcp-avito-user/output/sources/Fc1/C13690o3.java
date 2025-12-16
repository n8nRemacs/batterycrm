package Fc1;

import Fc1.AbstractC13567a6;
import java.util.ArrayList;

/* renamed from: Fc1.o3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13690o3 extends kotlin.jvm.internal.N implements Y41.q<kotlin.ranges.l, kotlin.ranges.l, kotlin.ranges.l, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5718l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13690o3(ArrayList arrayList) {
        super(3);
        this.f5718l = arrayList;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(kotlin.ranges.l lVar, kotlin.ranges.l lVar2, kotlin.ranges.l lVar3) {
        kotlin.ranges.l lVar4 = lVar;
        kotlin.ranges.l lVar5 = lVar2;
        kotlin.ranges.l lVar6 = lVar3;
        ArrayList arrayList = this.f5718l;
        if (lVar4 != null) {
            arrayList.add(new AbstractC13567a6.b(lVar4.f406905b, lVar4.f406906c));
        }
        if (lVar5 != null) {
            arrayList.add(new AbstractC13567a6.e(lVar5.f406905b, lVar5.f406906c));
        }
        if (lVar6 != null) {
            arrayList.add(new AbstractC13567a6.f(lVar6.f406905b, lVar6.f406906c));
        }
        return kotlin.G0.f406611a;
    }
}
