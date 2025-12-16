package com.avito.android.beduin_content;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.R;
import com.avito.android.beduin_content.utils.NoTouchEventRecyclerView;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSerpItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin_content/BeduinSerpItemViewImpl;", "Lcom/avito/android/beduin_content/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinSerpItemViewImpl extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.beduin_shared.common.component.adapter.b f105221b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NoTouchEventRecyclerView f105222c;

    /* compiled from: BeduinSerpItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin_content/BeduinSerpItemViewImpl$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_content.BeduinSerpItemViewImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    public BeduinSerpItemViewImpl(@k View view, @k com.avito.android.beduin_shared.common.component.adapter.b bVar) {
        super(view);
        this.f105221b = bVar;
        View viewFindViewById = view.findViewById(R.id.serp_beduin_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.beduin_content.utils.NoTouchEventRecyclerView");
        }
        NoTouchEventRecyclerView noTouchEventRecyclerView = (NoTouchEventRecyclerView) viewFindViewById;
        this.f105222c = noTouchEventRecyclerView;
        noTouchEventRecyclerView.setAdapter(bVar);
        noTouchEventRecyclerView.setScrollContainer(false);
        noTouchEventRecyclerView.getContext();
        noTouchEventRecyclerView.setLayoutManager(new AnonymousClass1());
    }

    @Override // com.avito.android.beduin_content.e
    public final void Z00(@k String str, @l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
        NoTouchEventRecyclerView noTouchEventRecyclerView = this.f105222c;
        noTouchEventRecyclerView.setTag(R.id.serp_beduin_block_form_id, str);
        noTouchEventRecyclerView.setTag(str);
        if (list.isEmpty()) {
            return;
        }
        noTouchEventRecyclerView.setVisibility(0);
        this.f105221b.k(list);
    }
}
