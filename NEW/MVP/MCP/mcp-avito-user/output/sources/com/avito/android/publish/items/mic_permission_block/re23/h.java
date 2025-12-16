package com.avito.android.publish.items.mic_permission_block.re23;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import j.e0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishMicPermissionBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/re23/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/mic_permission_block/re23/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f237059c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f237060b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.text_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f237060b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.publish.items.mic_permission_block.re23.g
    public final void H8(@e0 int i12) {
        this.f237060b.setText(i12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f237060b.setOnClickListener(null);
    }

    @Override // com.avito.android.publish.items.mic_permission_block.re23.g
    public final void u1(@k Y41.a<G0> aVar) {
        this.f237060b.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(18, aVar));
    }
}
