package x2;

import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* renamed from: x2.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49749e implements InterfaceC43160i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f442125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C49751g f442126c;

    public C49749e(InterfaceC43160i interfaceC43160i, C49751g c49751g) {
        this.f442125b = interfaceC43160i;
        this.f442126c = c49751g;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    public final Object collect(InterfaceC43172j interfaceC43172j, Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f442125b).collect(new C49748d(interfaceC43172j, this.f442126c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
