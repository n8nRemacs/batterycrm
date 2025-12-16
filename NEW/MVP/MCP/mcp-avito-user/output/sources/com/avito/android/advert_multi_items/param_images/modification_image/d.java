package com.avito.android.advert_multi_items.param_images.modification_image;

import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import com.avito.android.image_loader.i;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: ImageRequests.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f85973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModificationImageItem f85974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ModificationImageItem f85975d;

    public d(c cVar, ModificationImageItem modificationImageItem, ModificationImageItem modificationImageItem2) {
        this.f85973b = cVar;
        this.f85974c = modificationImageItem;
        this.f85975d = modificationImageItem2;
    }

    @Override // com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        c cVar = this.f85973b;
        View view = cVar.f85966d;
        Context context = cVar.f85965c;
        ModificationImageItem modificationImageItem = this.f85974c;
        view.setForeground(C43852a.a(context, cVar.B80(modificationImageItem.f85954d == ModificationViewState.f85897c)));
        cVar.f85967e.setVisibility(8);
        cVar.C80(modificationImageItem);
    }

    @Override // com.avito.android.image_loader.i
    public final void b2(@l Throwable th2) {
        int i12 = c.f85963i;
        this.f85973b.C80(this.f85975d);
    }

    @Override // com.avito.android.image_loader.i
    public final void S2() {
    }
}
