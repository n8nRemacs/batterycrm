package qK0;

import Y61.k;
import androidx.view.InterfaceC22983P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qK0.C47313c;
import qK0.d;

/* compiled from: AutoClearedDestroyable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"LqK0/a;", "LqK0/d;", "T", "LqK0/c;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47311a<T extends d> extends C47313c<T> {
    public C47311a() {
        this(null, 1, null);
    }

    @Override // qK0.C47313c, androidx.view.InterfaceC23057q
    public final void onDestroy(@k InterfaceC22983P interfaceC22983P) {
        T t12 = this.f429190c;
        if (t12 != null) {
            t12.destroy();
        }
        super.onDestroy(interfaceC22983P);
    }

    public C47311a(C47313c.a aVar, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? null : aVar);
    }
}
