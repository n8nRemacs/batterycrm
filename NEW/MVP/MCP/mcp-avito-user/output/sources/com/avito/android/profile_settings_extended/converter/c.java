package com.avito.android.profile_settings_extended.converter;

import Y41.p;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileSettingsConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "o1", "Lcom/avito/android/profile_management_core/images/entity/UploadImage;", "kotlin.jvm.PlatformType", "o2", "invoke", "(Lcom/avito/android/profile_management_core/images/entity/UploadImage;Lcom/avito/android/profile_management_core/images/entity/UploadImage;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class c extends N implements p<UploadImage, UploadImage, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f230029l = new c();

    public c() {
        super(2);
    }

    @Override // Y41.p
    public final Integer invoke(UploadImage uploadImage, UploadImage uploadImage2) {
        UploadImage uploadImage3 = uploadImage;
        UploadImage uploadImage4 = uploadImage2;
        return Integer.valueOf((!(uploadImage3.getF226677c() instanceof k) || (uploadImage4.getF226677c() instanceof k)) ? ((uploadImage3.getF226677c() instanceof k) || !(uploadImage4.getF226677c() instanceof k)) ? 0 : -1 : 1);
    }
}
