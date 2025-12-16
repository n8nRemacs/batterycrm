package Dl;

import Ur0.c;
import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: FeedShortcutsWidgetItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDl/a;", "LUr0/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13410a extends c {

    /* renamed from: s, reason: collision with root package name */
    public final int f3415s;

    public C13410a(@k Resources resources, @k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f3415s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof com.avito.android.feed_shortcuts.widget.k) {
            int i12 = -this.f3415s;
            rect.left = i12;
            rect.right = i12;
            rect.bottom = y6.b(28);
        }
    }
}
