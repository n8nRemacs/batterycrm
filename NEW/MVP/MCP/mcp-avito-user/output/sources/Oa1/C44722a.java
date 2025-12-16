package oa1;

import Bh0.RunnableC13149a;
import Y41.p;
import android.os.Handler;
import android.os.Looper;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* renamed from: oa1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44722a extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419911l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44722a(ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar) {
        super(2);
        this.f419911l = hVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        int i12 = 1;
        new Handler(Looper.getMainLooper()).post(new RunnableC13149a(i12, this.f419911l, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
        return G0.f406611a;
    }
}
