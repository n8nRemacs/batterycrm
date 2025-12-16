package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class nc extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f33844l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f33845m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f33846n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(C22096n c22096n, C22096n c22096n2, C22096n c22096n3) {
        super(2);
        this.f33844l = c22096n;
        this.f33845m = c22096n2;
        this.f33846n = c22096n3;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C22096n c22096n = this.f33844l;
            if (c22096n != null) {
                a13.C(-1959304577);
                c22096n.invoke(a13, 0);
            } else {
                a13.C(-608886287);
            }
            a13.h();
            this.f33845m.invoke(a13, 0);
            this.f33846n.invoke(a13, 0);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
