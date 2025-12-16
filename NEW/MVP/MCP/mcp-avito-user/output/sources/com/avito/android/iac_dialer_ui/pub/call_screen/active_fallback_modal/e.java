package com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIActiveFallbackModal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43108m f166943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f166944m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f166945n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(C43108m c43108m, Y41.a aVar, int i12) {
        super(2);
        this.f166943l = c43108m;
        this.f166944m = (N) aVar;
        this.f166945n = i12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f166945n | 1);
        t.a(this.f166943l, this.f166944m, a12, iA2);
        return G0.f406611a;
    }
}
