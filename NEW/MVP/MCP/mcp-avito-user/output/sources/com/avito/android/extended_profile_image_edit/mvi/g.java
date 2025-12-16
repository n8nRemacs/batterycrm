package com.avito.android.extended_profile_image_edit.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.extended_profile_image_edit.x;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vA.InterfaceC49183a;
import vA.InterfaceC49184b;

/* compiled from: BannerImageEditActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LvA/a;", "LvA/b;", "LvA/d;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC49183a, InterfaceC49184b, vA.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f151065a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f151066b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f151067c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f151068d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public N0 f151069e;

    @Inject
    public g(@Y61.k x xVar, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k R0 r02) {
        this.f151065a = xVar;
        this.f151066b = bVar;
        this.f151067c = sharedPhotosStorage;
        this.f151068d = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC49184b> b(InterfaceC49183a interfaceC49183a, vA.d dVar) {
        InterfaceC49183a interfaceC49183a2 = interfaceC49183a;
        vA.d dVar2 = dVar;
        if (interfaceC49183a2 instanceof InterfaceC49183a.b) {
            return new C43152f0(new C43137a0(new b(2, null), C43175k.G(new a(this, interfaceC49183a2, dVar2, null))), new c(3, null));
        }
        if (!(interfaceC49183a2 instanceof InterfaceC49183a.c)) {
            if (interfaceC49183a2 instanceof InterfaceC49183a.C12745a) {
                return C43175k.G(new f(dVar2, null));
            }
            if (interfaceC49183a2 instanceof InterfaceC49183a.d) {
                return new C43210w(InterfaceC49184b.C12746b.f440494a);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!this.f151065a.f151134c) {
            return C43175k.w();
        }
        N0 n02 = this.f151069e;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        return new C43152f0(C43175k.G(new d(this, null, interfaceC49183a2)), new e(3, null));
    }
}
