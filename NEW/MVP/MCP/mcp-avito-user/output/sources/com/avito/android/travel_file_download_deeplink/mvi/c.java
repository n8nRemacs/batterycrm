package com.avito.android.travel_file_download_deeplink.mvi;

import HE0.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FileDownloadActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LHE0/a;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "LHE0/c;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<HE0.a, FileDownloadInternalAction, HE0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f301774a;

    @Inject
    public c(@Y61.k p pVar) {
        this.f301774a = pVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FileDownloadInternalAction> b(HE0.a aVar, HE0.c cVar) {
        HE0.a aVar2 = aVar;
        HE0.c cVar2 = cVar;
        if (aVar2 instanceof a.c ? true : aVar2 instanceof a.C0401a) {
            return C43175k.G(new a(cVar2, null));
        }
        if (aVar2 instanceof a.b) {
            return C43175k.G(new b(cVar2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
