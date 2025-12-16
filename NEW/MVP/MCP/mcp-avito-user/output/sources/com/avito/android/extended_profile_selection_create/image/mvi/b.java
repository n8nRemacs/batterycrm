package com.avito.android.extended_profile_selection_create.image.mvi;

import Y41.p;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.remote.model.extended.modification.ModificationBody;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileSetSelectionImageActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/extended/modification/ModificationBody;", "<anonymous parameter 0>", "Lcom/avito/android/profile_management_core/images/entity/UploadImage$ImageFromPhotoPicker;", "uploadId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class b extends N implements p<UploadImage.ImageFromPhotoPicker, Long, ModificationBody> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f151758l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(2);
        this.f151758l = dVar;
    }

    @Override // Y41.p
    public final ModificationBody invoke(UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, Long l12) {
        return this.f151758l.f151765c.a(Long.valueOf(l12.longValue()));
    }
}
