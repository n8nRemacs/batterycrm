package com.avito.android.profile_management_core.images.entity;

import com.avito.android.profile_management_core.images.entity.UploadImageState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UploadImageStatePresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/d;", "", "<init>", "()V", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {
    @Inject
    public d() {
    }

    public static void a(@Y61.k f fVar, @Y61.k UploadImageState uploadImageState) {
        if (uploadImageState instanceof UploadImageState.Selected) {
            fVar.c0();
            return;
        }
        if (uploadImageState instanceof UploadImageState.Uploading) {
            fVar.c0();
            return;
        }
        if (uploadImageState instanceof UploadImageState.UploadingError) {
            fVar.y3();
            return;
        }
        if (uploadImageState instanceof UploadImageState.Uploaded) {
            fVar.c0();
            return;
        }
        if (uploadImageState instanceof UploadImageState.Setting) {
            fVar.c0();
            return;
        }
        if (uploadImageState instanceof UploadImageState.SettingError) {
            fVar.y3();
            return;
        }
        if (uploadImageState instanceof UploadImageState.ModerationFailed) {
            fVar.y3();
            return;
        }
        if (uploadImageState instanceof UploadImageState.ModerationPending) {
            fVar.zI();
        } else if (uploadImageState instanceof UploadImageState.ModerationPassed) {
            fVar.c80();
        } else if (uploadImageState instanceof UploadImageState.Set) {
            fVar.c80();
        }
    }
}
