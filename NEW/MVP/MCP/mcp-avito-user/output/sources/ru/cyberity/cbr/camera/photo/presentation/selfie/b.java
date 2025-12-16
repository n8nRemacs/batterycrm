package ru.cyberity.cbr.camera.photo.presentation.selfie;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.presentation.helper.camera.CBRCameraHelperStateFactory;
import ru.cyberity.cbr.core.presentation.helper.camera.CBRHelperViewState;
import ru.cyberity.cbr.core.presentation.intro.CBRStepInfo;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRSelfieWithDocumentPickerViewModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/selfie/b;", "Lru/cyberity/cbr/camera/c;", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "", "countryCode", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "a", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/model/DocumentType;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends ru.cyberity.cbr.camera.c {
    public b(@k DocumentType documentType, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(documentType, null, aVar, cVar, 2, null);
    }

    @Override // ru.cyberity.cbr.camera.d
    @k
    public CBRHelperViewState a(@k g applicant, @k CBRStepInfo stepInfo, @l String countryCode) {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Selfie With Document Picker", null, 4, null);
        return CBRCameraHelperStateFactory.INSTANCE.prepareBriefDetails(getStrings(), getType(), applicant.a(getType()), stepInfo, countryCode, (96 & 32) != 0 ? C42784z0.f406748b : null, (96 & 64) != 0 ? null : null);
    }
}
