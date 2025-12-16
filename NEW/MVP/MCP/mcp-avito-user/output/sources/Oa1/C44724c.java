package oa1;

import android.graphics.Bitmap;
import androidx.view.N0;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* renamed from: oa1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44724c extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419913l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44724c(ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar) {
        super(1);
        this.f419913l = hVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = this.f419913l;
            Ba1.k kVar = hVar.f436509i0;
            kotlin.reflect.n nVar = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0[0];
            C44736o c44736o = (C44736o) kVar.a(hVar);
            C43259k.d(N0.a(c44736o), null, null, new C44735n(c44736o, bitmap, hVar.requireContext(), null), 3);
        }
        return G0.f406611a;
    }
}
