package com.avito.android.blueprints.publish.header;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: HeaderDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/header/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f106205b;

    public a(@Y61.k Resources resources) {
        this.f106205b = resources;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        recyclerView.getClass();
        if (RecyclerView.U(view) == 0) {
            Integer numValueOf = recyclerView.W(view) instanceof j ? Integer.valueOf(this.f106205b.getDimensionPixelOffset(R.dimen.publish_container_vertical_padding)) : null;
            if (numValueOf != null) {
                rect.bottom = numValueOf.intValue();
            }
        }
    }
}
