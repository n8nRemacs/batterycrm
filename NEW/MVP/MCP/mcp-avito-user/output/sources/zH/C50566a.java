package zh;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.bbl.screens.configure.ui.items.configs.f;
import com.avito.android.bbl.screens.configure.ui.items.header.h;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BblConfigureItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzh/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50566a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f444166b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f444167c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f444168d = y6.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final int f444169e = y6.b(10);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof h;
        int i12 = 0;
        int i13 = this.f444169e;
        int i14 = this.f444168d;
        rect.left = z12 ? i14 : cW2 instanceof f ? i13 : 0;
        rect.top = recyclerView.W(view) instanceof h ? this.f444166b : this.f444167c;
        RecyclerView.C cW3 = recyclerView.W(view);
        if (cW3 instanceof h) {
            i12 = i14;
        } else if (cW3 instanceof f) {
            i12 = i13;
        }
        rect.right = i12;
    }
}
