package K31;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes8.dex */
public final class c implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f9244b;

    public c(InterfaceC22204y1 interfaceC22204y1) {
        this.f9244b = interfaceC22204y1;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        this.f9244b.setValue(obj);
        return G0.f406611a;
    }
}
