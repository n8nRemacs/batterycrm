package com.avito.android.publish.details.adapter.edit_category;

import Y61.k;
import Y61.l;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EditCategoryItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/adapter/edit_category/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/details/adapter/edit_category/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f233225d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f233226b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f233227c;

    public i(@k View view) {
        super(view);
        ComponentContainer componentContainer = (ComponentContainer) view;
        this.f233226b = componentContainer;
        View viewFindViewById = view.findViewById(R.id.select);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f233227c = input;
        componentContainer.setTitle(R.string.category_title);
        input.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // com.avito.android.publish.details.adapter.edit_category.g
    public final void G() {
        ComponentContainer componentContainer = this.f233226b;
        componentContainer.q(componentContainer.f178848i);
    }

    @Override // com.avito.android.publish.details.adapter.edit_category.g
    public final void H(@l CharSequence charSequence) {
        ComponentContainer.n(this.f233226b, charSequence, 2);
    }

    @Override // com.avito.android.publish.details.adapter.edit_category.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f233227c.setOnClickListener(new h(0, aVar));
    }

    @Override // com.avito.android.publish.details.adapter.edit_category.g
    public final void g0(@k CharSequence charSequence) {
        Input.t(this.f233227c, charSequence, false, 6);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f233227c.setOnClickListener(null);
    }

    @Override // com.avito.android.publish.details.adapter.edit_category.g
    public final void s(@k String str) {
        this.f233226b.setTag("edit_category_root");
    }

    @Override // com.avito.android.publish.details.adapter.edit_category.g
    public final void setEnabled(boolean z12) {
        this.f233226b.setEnabled(z12);
    }
}
