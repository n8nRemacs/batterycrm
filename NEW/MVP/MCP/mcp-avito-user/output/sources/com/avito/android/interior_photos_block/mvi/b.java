package com.avito.android.interior_photos_block.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.interior_photos_block.m;
import iO.C41325d;
import iO.InterfaceC41322a;
import iO.InterfaceC41323b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InteriorPhotosBlockActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/interior_photos_block/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LiO/a;", "LiO/b;", "LiO/d;", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC41322a, InterfaceC41323b, C41325d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f173058a;

    @Inject
    public b(@Y61.k m mVar) {
        this.f173058a = mVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC41323b> b(InterfaceC41322a interfaceC41322a, C41325d c41325d) {
        InterfaceC41322a interfaceC41322a2 = interfaceC41322a;
        if (interfaceC41322a2 instanceof InterfaceC41322a.C11374a) {
            return new C43210w(new InterfaceC41323b.a(((InterfaceC41322a.C11374a) interfaceC41322a2).f398506a));
        }
        if (interfaceC41322a2 instanceof InterfaceC41322a.b) {
            return C43175k.G(new a(this, interfaceC41322a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
