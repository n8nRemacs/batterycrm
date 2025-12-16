package androidx.compose.foundation.text.selection;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import kotlin.Metadata;

/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/w;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/selection/w;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<C21043w, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21032q f32117l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.collection.H0<C21045x> f32118m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C21045x f32119n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C21032q c21032q, androidx.collection.H0<C21045x> h02, C21045x c21045x) {
        super(1);
        this.f32117l = c21032q;
        this.f32118m = h02;
        this.f32119n = c21045x;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C21043w c21043w) {
        C21043w c21043w2 = c21043w;
        int length = c21043w2.f32154f.f42526a.f42506a.f42127c.length();
        androidx.collection.H0<C21045x> h02 = this.f32118m;
        this.f32117l.getClass();
        C21032q.m(h02, this.f32119n, c21043w2, 0, length);
        return kotlin.G0.f406611a;
    }
}
