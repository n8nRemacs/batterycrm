package com.avito.android.profile_settings_extended.adapter.banner;

import Y41.l;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yc0.InterfaceC50219c;

/* compiled from: ExtendedSettingsBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImage;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_management_core/images/entity/UploadImage;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<UploadImage, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f229188l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(1);
        this.f229188l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(UploadImage uploadImage) {
        g gVar = this.f229188l;
        gVar.f229190b.invoke(new InterfaceC50219c.b(uploadImage));
        return G0.f406611a;
    }
}
