package ru.cyberity.cbr.camera.photo.presentation.document;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.camera.photo.presentation.document.DocCapture;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.ml.autocapture.a;

/* compiled from: CBRPhotoDocumentPickerViewModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/d;", "Landroidx/lifecycle/a;", "Landroidx/savedstate/e;", SearchParamsConverterKt.OWNER, "Lru/cyberity/cbr/core/b;", "serviceLocator", "Landroid/os/Bundle;", "args", "<init>", "(Landroidx/savedstate/e;Lru/cyberity/cbr/core/b;Landroid/os/Bundle;)V", "Landroidx/lifecycle/M0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/r0;", VoiceInfo.STATE, "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/r0;)Landroidx/lifecycle/M0;", "a", "Lru/cyberity/cbr/core/b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d extends AbstractC22993a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.b serviceLocator;

    public /* synthetic */ d(InterfaceC23487e interfaceC23487e, ru.cyberity.cbr.core.b bVar, Bundle bundle, int i12, C42822w c42822w) {
        this(interfaceC23487e, bVar, (i12 & 4) != 0 ? null : bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.AbstractC22993a
    @k
    public <T extends M0> T create(@k String key, @k Class<T> modelClass, @k C23060r0 state) {
        C42784z0 c42784z0;
        ru.cyberity.ml.autocapture.a aVarA = ru.cyberity.ml.autocapture.a.INSTANCE.a();
        a.C12565a autoCaptureModel = aVarA.getAutoCaptureModel();
        DocumentType documentTypeA = DocumentType.INSTANCE.a((String) state.b("EXTRA_DOCUMENT_TYPE"));
        String str = (String) state.b("EXTRA_ONLY_ID_DOC");
        List list = (List) state.b("EXTRA_DOCUMENT_SIDES");
        if (list != null) {
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IdentitySide identitySideA = IdentitySide.INSTANCE.a((String) it.next());
                if (identitySideA == null) {
                    identitySideA = IdentitySide.Front;
                }
                arrayList.add(identitySideA);
            }
            c42784z0 = arrayList;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        String str2 = (String) state.b("EXTRA_PREFER_AUTO_CAPTURE");
        DocCapture.PreferredMode preferredModeA = str2 != null ? DocCapture.PreferredMode.INSTANCE.a(str2) : null;
        ru.cyberity.cbr.core.data.source.common.a aVarK = this.serviceLocator.k();
        ru.cyberity.cbr.core.data.source.dynamic.c cVarM = this.serviceLocator.m();
        ru.cyberity.ml.core.d<Bitmap, ru.cyberity.ml.badphotos.models.a> dVarA = ru.cyberity.ml.badphotos.a.INSTANCE.a(this.serviceLocator.g(), this.serviceLocator.i(), this.serviceLocator.getSession().getUrl(), aVarA.getBadPhotosModel().getName(), aVarA.getBadPhotosModel().getAllowCache());
        ru.cyberity.ml.docdetector.b bVar = new ru.cyberity.ml.docdetector.b(this.serviceLocator.g(), this.serviceLocator.i(), this.serviceLocator.getSession().getUrl() + "resources/embeddedModels/" + aVarA.getAutoCaptureModel().getName(), autoCaptureModel);
        e.a(e.f432410a, "DocCapture", "autocap config: inputSize=" + autoCaptureModel.getInputSize() + ", outputSize=" + autoCaptureModel.getOutputSize(), null, 4, null);
        G0 g02 = G0.f406611a;
        return new CBRPhotoDocumentPickerViewModel(documentTypeA, str, c42784z0, preferredModeA, aVarK, cVarM, dVarA, bVar, state);
    }

    public d(@k InterfaceC23487e interfaceC23487e, @k ru.cyberity.cbr.core.b bVar, @l Bundle bundle) {
        super(interfaceC23487e, bundle);
        this.serviceLocator = bVar;
    }
}
