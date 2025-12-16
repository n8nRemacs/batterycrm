package com.avito.android.interior_photos_block.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.interior_photos_block.entity.InteriorPhotoBlock;
import iO.C41325d;
import iO.InterfaceC41323b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InteriorPhotosBlockReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/interior_photos_block/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "LiO/b;", "LiO/d;", "<init>", "()V", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements u<InterfaceC41323b, C41325d> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C41325d a(InterfaceC41323b interfaceC41323b, C41325d c41325d) {
        InterfaceC41323b interfaceC41323b2 = interfaceC41323b;
        if (!(interfaceC41323b2 instanceof InterfaceC41323b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InteriorPhotoBlock interiorPhotoBlock = ((InterfaceC41323b.a) interfaceC41323b2).f398510a;
        return new C41325d(interiorPhotoBlock.f173044b, interiorPhotoBlock.f173045c);
    }
}
