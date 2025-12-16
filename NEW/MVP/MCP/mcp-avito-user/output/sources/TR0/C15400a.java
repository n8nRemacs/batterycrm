package Tr0;

import Ur0.c;
import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.cv.cv_creation.h;
import com.avito.android.serp.adapter.vertical_main.cv.cv_display.j;
import kotlin.Metadata;

/* compiled from: CvItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTr0/a;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tr0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15400a extends c {

    /* renamed from: s, reason: collision with root package name */
    public final int f15953s;

    /* renamed from: t, reason: collision with root package name */
    public final int f15954t;

    public C15400a(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f15953s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f15954t = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if ((cW2 instanceof h) || (cW2 instanceof j)) {
            int i12 = -this.f15953s;
            rect.left = i12;
            rect.right = i12;
            int i13 = this.f15954t;
            rect.top = i13;
            rect.bottom = i13;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
