package yo;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.checkout.ui.items.header.g;
import com.avito.android.checkout.ui.items.price.h;
import com.avito.android.checkout.ui.items.promocode.j;
import com.avito.android.checkout.ui.items.service.i;
import com.avito.android.mnz_common.extensions.f;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: CheckoutItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyo/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yo.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50275c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f443496b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f443497c = y6.b(12);

    /* renamed from: d, reason: collision with root package name */
    public final int f443498d = y6.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final int f443499e = y6.b(8);

    /* renamed from: f, reason: collision with root package name */
    public final int f443500f = y6.b(16);

    /* renamed from: g, reason: collision with root package name */
    public final int f443501g = y6.b(16);

    /* renamed from: h, reason: collision with root package name */
    public final int f443502h;

    public C50275c(@k com.avito.konveyor.a aVar) {
        this.f443502h = aVar.Y(com.avito.android.checkout.ui.items.service.c.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = this.f443496b;
        rect.left = i12;
        RecyclerView.C cW2 = recyclerView.W(view);
        rect.top = cW2 instanceof g ? this.f443497c : cW2 instanceof i ? this.f443502h == f.a(view, recyclerView) ? this.f443499e : this.f443498d : cW2 instanceof j ? this.f443500f : cW2 instanceof h ? this.f443501g : 0;
        rect.right = i12;
    }
}
