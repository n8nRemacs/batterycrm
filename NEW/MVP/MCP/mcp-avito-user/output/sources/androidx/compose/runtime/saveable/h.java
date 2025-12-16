package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.snapshots.C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/runtime/y1;", "", "it", "invoke", "(Landroidx/compose/runtime/y1;)Landroidx/compose/runtime/y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class h extends N implements Y41.l<InterfaceC22204y1<Object>, InterfaceC22204y1<Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f38567l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w wVar) {
        super(1);
        this.f38567l = wVar;
    }

    @Override // Y41.l
    public final InterfaceC22204y1<Object> invoke(InterfaceC22204y1<Object> interfaceC22204y1) {
        Object objInvoke;
        InterfaceC22204y1<Object> interfaceC22204y12 = interfaceC22204y1;
        if (!(interfaceC22204y12 instanceof C)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC22204y12.getF42167b() != null) {
            objInvoke = this.f38567l.f38610b.invoke(interfaceC22204y12.getF42167b());
        } else {
            objInvoke = null;
        }
        return C22126m3.f(objInvoke, ((C) interfaceC22204y12).h());
    }
}
