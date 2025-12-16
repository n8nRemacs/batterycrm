package com.avito.android.search_view;

import android.view.View;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Toolbar23SearchView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class s extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Toolbar23SearchView f264590l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Toolbar23SearchView toolbar23SearchView) {
        super(1);
        this.f264590l = toolbar23SearchView;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        this.f264590l.f264456S.accept(Integer.valueOf(R.id.menu_subscription));
        return G0.f406611a;
    }
}
