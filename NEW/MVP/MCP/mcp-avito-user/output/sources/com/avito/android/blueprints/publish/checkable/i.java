package com.avito.android.blueprints.publish.checkable;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprint.date.interval.j;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/checkable/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/checkable/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f106100c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckmark f106101b;

    public i(@k View view) {
        super(view);
        this.f106101b = (ListItemCheckmark) view;
    }

    @Override // com.avito.android.blueprints.publish.checkable.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f106101b.setOnClickListener(new j(14, aVar));
    }

    @Override // com.avito.android.blueprints.publish.checkable.h
    public final void f(@l String str) {
        this.f106101b.setSubtitle(str);
    }

    @Override // com.avito.android.blueprints.publish.checkable.h
    public final void setChecked(boolean z12) {
        this.f106101b.setChecked(z12);
    }

    @Override // com.avito.android.blueprints.publish.checkable.h
    public final void setTitle(@k String str) {
        this.f106101b.setTitle(str);
    }
}
