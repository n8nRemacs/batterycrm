package qK0;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qK0.C47313c;

/* compiled from: AutoClearedRecyclerView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LqK0/b;", "LqK0/c;", "Landroidx/recyclerview/widget/RecyclerView;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qK0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47312b extends C47313c<RecyclerView> {
    public C47312b() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qK0.C47313c, androidx.view.InterfaceC23057q
    public final void onDestroy(@k InterfaceC22983P interfaceC22983P) {
        RecyclerView recyclerView = (RecyclerView) this.f429190c;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        super.onDestroy(interfaceC22983P);
    }

    public C47312b(C47313c.a aVar, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? null : aVar);
    }
}
