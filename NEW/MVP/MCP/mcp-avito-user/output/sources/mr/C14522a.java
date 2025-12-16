package Mr;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.cpt.activation.ui.items.alert.i;
import com.avito.android.cpt.activation.ui.items.delivery.h;
import com.avito.android.cpt.activation.ui.items.header.g;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: CptActivationItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMr/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14522a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f11031b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f11032c = y6.b(12);

    /* renamed from: d, reason: collision with root package name */
    public final int f11033d = y6.b(24);

    /* renamed from: e, reason: collision with root package name */
    public final int f11034e = y6.b(20);

    /* renamed from: f, reason: collision with root package name */
    public final int f11035f = y6.b(20);

    /* renamed from: g, reason: collision with root package name */
    public final int f11036g = y6.b(20);

    /* renamed from: h, reason: collision with root package name */
    public final int f11037h = y6.b(24);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        rect.top = cW2 instanceof g ? this.f11032c : cW2 instanceof com.avito.android.cpt.activation.ui.items.advert.g ? this.f11033d : cW2 instanceof h ? this.f11034e : cW2 instanceof com.avito.android.cpt.activation.ui.items.dbs.h ? this.f11035f : cW2 instanceof com.avito.android.cpt.activation.ui.items.cnc.h ? this.f11036g : cW2 instanceof i ? this.f11037h : 0;
        rect.bottom = 0;
        int i12 = this.f11031b;
        rect.left = i12;
        rect.right = i12;
    }
}
