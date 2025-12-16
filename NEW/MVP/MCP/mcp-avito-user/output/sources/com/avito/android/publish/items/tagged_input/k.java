package com.avito.android.publish.items.tagged_input;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.items.tagged_input.A;
import kotlin.Metadata;

/* compiled from: MultiStateInputWithTagsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/tagged_input/k;", "Lcom/avito/android/llm/ui/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements com.avito.android.llm.ui.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f237147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.H f237148b;

    public k(A a12, ParameterElement.H h12) {
        this.f237147a = a12;
        this.f237148b = h12;
    }

    @Override // com.avito.android.llm.ui.d
    public final void a(@Y61.k String str) {
        this.f237147a.x2(str);
    }

    @Override // com.avito.android.llm.ui.d
    public final void b(@Y61.l String str, boolean z12) {
        this.f237147a.h3(str, z12);
    }

    @Override // com.avito.android.llm.ui.d
    public final void c(boolean z12) {
        this.f237147a.q2(z12);
    }

    @Override // com.avito.android.llm.ui.d
    public final void j3(@Y61.k String str) {
        this.f237148b.f117309o = new ItemWithState.State.Error.ErrorWithMessage(str);
        A.a.a(this.f237147a, str, null, 2);
    }

    @Override // com.avito.android.llm.ui.d
    public final void y0(@Y61.k String str) {
        this.f237147a.f8(str);
    }
}
