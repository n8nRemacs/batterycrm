package androidx.compose.ui.tooling;

import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComposeViewAdapter.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.tooling.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22701p extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.A f42821l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22701p(androidx.compose.runtime.A a12) {
        super(0);
        this.f42821l = a12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        try {
            C22679a c22679a = C22679a.f42765a;
            androidx.compose.runtime.A a12 = this.f42821l;
            Object[] objArrA = J.a(null, 0);
            Object[] objArrCopyOf = Arrays.copyOf(objArrA, objArrA.length);
            c22679a.getClass();
            C22679a.c(null, null, a12, objArrCopyOf);
            return G0.f406611a;
        } catch (Throwable th2) {
            th = th2;
            while ((th instanceof ReflectiveOperationException) && (th = th.getCause()) != null) {
            }
            int i12 = C22704t.f42825f;
            throw null;
        }
    }
}
