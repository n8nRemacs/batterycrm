package com.avito.android.profile_settings_extended.adapter.banner;

import Y41.l;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedSettingsBannerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImage;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_management_core/images/entity/UploadImage;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements l<UploadImage, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f229192l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UploadImage f229193m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, UploadImage uploadImage) {
        super(1);
        this.f229192l = kVar;
        this.f229193m = uploadImage;
    }

    @Override // Y41.l
    public final G0 invoke(UploadImage uploadImage) {
        l<? super UploadImage, G0> lVar = this.f229192l.f229204k;
        if (lVar != null) {
            lVar.invoke(this.f229193m);
        }
        return G0.f406611a;
    }
}
