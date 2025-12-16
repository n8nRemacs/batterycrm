package Xh;

import Ui.InterfaceC15523b;
import Y61.k;
import bi.C25654c;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.container.banner_gallery.BeduinBannerGalleryContainerModel;
import com.avito.android.beduin.common.utils.C28814j;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinBannerGalleryContainerFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LXh/c;", "Lej/b;", "Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerModel;", "LXh/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17010c implements InterfaceC40113b<BeduinBannerGalleryContainerModel, C17008a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f19029a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Th.a f19030b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C28814j f19031c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC35201t f19032d;

    @Inject
    public C17010c(@k h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar, @k Th.a aVar, @k C28814j c28814j, @k AbstractC35201t abstractC35201t) {
        this.f19029a = eVar;
        this.f19030b = aVar;
        this.f19031c = c28814j;
        this.f19032d = abstractC35201t;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new C17008a(this.f19030b, eVar, interfaceC15523b, (BeduinBannerGalleryContainerModel) beduinModel, new C25654c(this.f19029a), this.f19031c, this.f19032d);
    }
}
