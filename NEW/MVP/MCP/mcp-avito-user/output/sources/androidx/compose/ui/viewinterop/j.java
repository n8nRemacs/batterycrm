package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidView.android.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class j extends N implements Y41.a<Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k<View> f42992l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k<View> kVar) {
        super(0);
        this.f42992l = kVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f42992l.f42993B.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
