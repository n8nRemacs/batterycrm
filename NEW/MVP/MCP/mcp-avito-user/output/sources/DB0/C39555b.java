package dB0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff.cpr.configure.advance.items.hints.g;
import com.avito.android.tariff.cpr.configure.advance.items.reviews.h;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvancePaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdB0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39555b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f393733b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f393734c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f393735d = y6.b(24);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        rect.top = cW2 instanceof h ? this.f393734c : cW2 instanceof g ? this.f393735d : 0;
        rect.bottom = 0;
        boolean z12 = recyclerView.W(view) instanceof h;
        int i12 = this.f393733b;
        rect.left = z12 ? 0 : i12;
        rect.right = recyclerView.W(view) instanceof h ? 0 : i12;
    }
}
