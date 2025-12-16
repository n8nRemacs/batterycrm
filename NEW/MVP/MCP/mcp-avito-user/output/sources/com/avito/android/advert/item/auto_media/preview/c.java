package com.avito.android.advert.item.auto_media.preview;

import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoMediaPreviewPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f72948l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f72949m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AutoMediaPreviewItem f72950n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z12, d dVar, AutoMediaPreviewItem autoMediaPreviewItem) {
        super(0);
        this.f72948l = z12;
        this.f72949m = dVar;
        this.f72950n = autoMediaPreviewItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        boolean z12 = this.f72948l;
        AutoMediaPreviewItem autoMediaPreviewItem = this.f72950n;
        d dVar = this.f72949m;
        if (z12) {
            dVar.f72952c.a(autoMediaPreviewItem.f72938c, autoMediaPreviewItem.f72943h);
        }
        b.a.a(dVar.f72951b, autoMediaPreviewItem.f72942g, null, null, 6);
        return G0.f406611a;
    }
}
