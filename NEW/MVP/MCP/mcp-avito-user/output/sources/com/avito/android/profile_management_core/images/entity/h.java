package com.avito.android.profile_management_core.images.entity;

import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UploadImageViewHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/h;", "Lcom/avito/android/profile_management_core/images/entity/f;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoUploaderImage f226716b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UploadImage f226717c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<UploadImage, G0> f226718d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.k PhotoUploaderImage photoUploaderImage, @Y61.k UploadImage uploadImage, @Y61.l Drawable drawable, @Y61.k Y41.l<? super UploadImage, G0> lVar) {
        this.f226716b = photoUploaderImage;
        this.f226717c = uploadImage;
        this.f226718d = lVar;
    }

    @Override // com.avito.android.profile_management_core.images.entity.f
    public final void c0() {
        this.f226716b.n();
    }

    @Override // com.avito.android.profile_management_core.images.entity.f
    public final void c80() {
        this.f226716b.j();
    }

    @Override // com.avito.android.profile_management_core.images.entity.f
    public final void y3() {
        PhotoUploaderImage photoUploaderImage = this.f226716b;
        photoUploaderImage.l((2 & 1) == 0, true);
        photoUploaderImage.setErrorClickedListener(new g(this));
    }

    @Override // com.avito.android.profile_management_core.images.entity.f
    public final void zI() {
        this.f226716b.i();
    }
}
