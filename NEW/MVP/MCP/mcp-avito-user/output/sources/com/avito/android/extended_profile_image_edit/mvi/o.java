package com.avito.android.extended_profile_image_edit.mvi;

import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import vA.InterfaceC49184b;
import vA.InterfaceC49185c;

/* compiled from: BannerImageEditOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "LvA/b;", "LvA/c;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements t<InterfaceC49184b, InterfaceC49185c> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49185c b(InterfaceC49184b interfaceC49184b) {
        InterfaceC49184b interfaceC49184b2 = interfaceC49184b;
        if (interfaceC49184b2 instanceof InterfaceC49184b.d) {
            return InterfaceC49185c.a.f440502a;
        }
        if (interfaceC49184b2 instanceof InterfaceC49184b.c) {
            return new InterfaceC49185c.b(((InterfaceC49184b.c) interfaceC49184b2).f440495a);
        }
        if (interfaceC49184b2 instanceof InterfaceC49184b.h) {
            return InterfaceC49185c.C12747c.f440504a;
        }
        return null;
    }
}
