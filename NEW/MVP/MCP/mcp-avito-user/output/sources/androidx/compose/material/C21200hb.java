package androidx.compose.material;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.hb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21200hb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.q<List<Ta>, androidx.compose.runtime.A, Integer, kotlin.G0> f33626l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f33627m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21200hb(Y41.q qVar, ArrayList arrayList) {
        super(2);
        this.f33626l = qVar;
        this.f33627m = arrayList;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f33626l.invoke(this.f33627m, a13, 0);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
