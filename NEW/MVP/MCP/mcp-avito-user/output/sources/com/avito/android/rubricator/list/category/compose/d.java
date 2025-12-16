package com.avito.android.rubricator.list.category.compose;

import Y41.l;
import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.C22554b;
import androidx.compose.ui.semantics.F;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryListScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements l<F, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<? extends CategoryListItem> f255895l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<? extends CategoryListItem> list) {
        super(1);
        this.f255895l = list;
    }

    @Override // Y41.l
    public final G0 invoke(F f12) {
        C.k(f12, new C22554b(this.f255895l.size(), 1));
        return G0.f406611a;
    }
}
