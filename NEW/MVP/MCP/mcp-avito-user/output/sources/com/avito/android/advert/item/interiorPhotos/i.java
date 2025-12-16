package com.avito.android.advert.item.interiorPhotos;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InteriorPhotosPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f76598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InteriorPhotosItem f76599m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, InteriorPhotosItem interiorPhotosItem) {
        super(1);
        this.f76598l = jVar;
        this.f76599m = interiorPhotosItem;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        j jVar = this.f76598l;
        InteriorPhotosItem interiorPhotosItem = this.f76599m;
        Map<String, Object> map = interiorPhotosItem.f76586i;
        String str2 = interiorPhotosItem.f76587j;
        jVar.f76600b.a(str, str2, map);
        return G0.f406611a;
    }
}
