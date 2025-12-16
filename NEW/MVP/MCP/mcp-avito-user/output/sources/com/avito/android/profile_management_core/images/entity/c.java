package com.avito.android.profile_management_core.images.entity;

import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UploadImageState.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_profile-management-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {
    @Y61.k
    public static final UploadImageState a(@Y61.k ModerationStatus moderationStatus) {
        if (moderationStatus instanceof ModerationStatus.ModerationPending) {
            ModerationStatus.ModerationPending moderationPending = (ModerationStatus.ModerationPending) moderationStatus;
            return new UploadImageState.ModerationPending(moderationPending.f226778d, moderationPending.f226779e, moderationPending.f226780f);
        }
        if (moderationStatus instanceof ModerationStatus.ModerationFailed) {
            ModerationStatus.ModerationFailed moderationFailed = (ModerationStatus.ModerationFailed) moderationStatus;
            return new UploadImageState.ModerationFailed(moderationFailed.f226772d, moderationFailed.f226773e, moderationFailed.f226774f);
        }
        if (!(moderationStatus instanceof ModerationStatus.ModerationPassed)) {
            throw new NoWhenBranchMatchedException();
        }
        ModerationStatus.ModerationPassed moderationPassed = (ModerationStatus.ModerationPassed) moderationStatus;
        return new UploadImageState.ModerationPassed(moderationPassed.f226775d, moderationPassed.f226776e, moderationPassed.f226777f);
    }
}
