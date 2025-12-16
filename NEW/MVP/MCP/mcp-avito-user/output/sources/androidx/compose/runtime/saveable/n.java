package androidx.compose.runtime.saveable;

import androidx.collection.R0;
import androidx.compose.runtime.InterfaceC22118l0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f38591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f38593c;

    public n(m mVar, Object obj, r rVar) {
        this.f38591a = mVar;
        this.f38592b = obj;
        this.f38593c = rVar;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        m mVar = this.f38591a;
        R0<Object, r> r02 = mVar.f38585b;
        Object obj = this.f38592b;
        r rVarK = r02.k(obj);
        r rVar = this.f38593c;
        if (rVarK == rVar) {
            Map<String, List<Object>> mapC = rVar.c();
            boolean zIsEmpty = mapC.isEmpty();
            Map<Object, Map<String, List<Object>>> map = mVar.f38584a;
            if (zIsEmpty) {
                map.remove(obj);
            } else {
                map.put(obj, mapC);
            }
        }
    }
}
