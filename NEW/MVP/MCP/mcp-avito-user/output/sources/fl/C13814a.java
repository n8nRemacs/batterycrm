package Fl;

import Ur0.c;
import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.horizontal_list.f;
import kotlin.Metadata;

/* compiled from: HorizontalListWidgetDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFl/a;", "LUr0/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13814a extends c {

    /* renamed from: s, reason: collision with root package name */
    public final int f5969s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5970t;

    public C13814a(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f5969s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f5970t = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof f) {
            int i12 = -this.f5969s;
            rect.left = i12;
            rect.right = i12;
            int i13 = this.f5970t;
            rect.top = i13;
            rect.bottom = i13;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
