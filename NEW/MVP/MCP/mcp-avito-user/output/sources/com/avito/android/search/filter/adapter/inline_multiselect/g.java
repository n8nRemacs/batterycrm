package com.avito.android.search.filter.adapter.inline_multiselect;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InlineMultiselectItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MultiselectParameter.FilterHint f262370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f262371m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MultiselectParameter.FilterHint filterHint, i iVar) {
        super(1);
        this.f262370l = filterHint;
        this.f262371m = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        DeepLink url = this.f262370l.getUrl();
        if (url != null) {
            this.f262371m.f262375d.accept(url);
        }
        return G0.f406611a;
    }
}
