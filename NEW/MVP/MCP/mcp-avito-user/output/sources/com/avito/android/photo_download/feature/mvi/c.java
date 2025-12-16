package com.avito.android.photo_download.feature.mvi;

import J70.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.permissions.u;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhotoDownloadActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_download/feature/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LJ70/a;", "LJ70/b;", "Lkotlin/G0;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.a<J70.a, J70.b, G0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_download.d f216450a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f216451b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f216452c;

    @Inject
    public c(@Y61.k com.avito.android.photo_download.d dVar, @Y61.k u uVar, @Y61.k C c12) {
        this.f216450a = dVar;
        this.f216451b = uVar;
        this.f216452c = c12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<J70.b> b(J70.a aVar, G0 g02) {
        J70.a aVar2 = aVar;
        if (aVar2 instanceof a.C0506a) {
            return new C43152f0(C43175k.G(new a(this, aVar2, null)), new b(3, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
