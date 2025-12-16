package com.avito.android.saved_searches.presentation.main;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchMainView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f258602l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(0);
        this.f258602l = view;
    }

    @Override // Y41.a
    public final View invoke() {
        View viewFindViewById = this.f258602l.findViewById(R.id.saved_search_list);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }
}
