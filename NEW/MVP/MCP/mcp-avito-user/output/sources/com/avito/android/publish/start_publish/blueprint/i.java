package com.avito.android.publish.start_publish.blueprint;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CategoryShortcutItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/start_publish/blueprint/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/start_publish/blueprint/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f245356e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f245357b;

    /* renamed from: c, reason: collision with root package name */
    public final ListItem f245358c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f245359d;

    public i(@k View view) {
        super(view);
        this.f245357b = view;
        this.f245358c = (ListItem) view.findViewById(R.id.start_publish_list_item);
        this.f245359d = (SimpleDraweeView) view.findViewById(R.id.start_publish_image);
    }

    @Override // com.avito.android.publish.start_publish.blueprint.h
    public final void J0(@k Y41.a<G0> aVar) {
        this.f245357b.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(9, aVar));
    }

    @Override // com.avito.android.publish.start_publish.blueprint.h
    public final void i(@k UniversalImage universalImage) {
        C35949t5.c(this.f245359d, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f245357b.getContext()))), null, null, null, 14);
    }

    @Override // com.avito.android.publish.start_publish.blueprint.h
    public final void setTitle(@k CharSequence charSequence) {
        this.f245358c.setState((kV.b) new kV.f(charSequence, null, null, null, null, false, false, null, null, 478, null));
    }
}
