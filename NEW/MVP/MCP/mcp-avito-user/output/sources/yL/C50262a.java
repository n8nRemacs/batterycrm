package yl;

import Ur0.c;
import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin_content.e;
import kotlin.Metadata;

/* compiled from: BeduinSerpItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyl/a;", "LUr0/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50262a extends c {

    /* renamed from: s, reason: collision with root package name */
    public final int f443483s;

    /* renamed from: t, reason: collision with root package name */
    public final int f443484t;

    public C50262a(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f443483s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f443484t = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof e) {
            int i12 = -this.f443483s;
            rect.left = i12;
            rect.right = i12;
            rect.bottom = this.f443484t;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
