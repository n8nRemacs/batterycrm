package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIControlButtonsToggleCamera.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUIControlButtonsToggleCameraState f167254l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f167255m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f167256n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f167257o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(IacUIControlButtonsToggleCameraState iacUIControlButtonsToggleCameraState, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f167254l = iacUIControlButtonsToggleCameraState;
        this.f167255m = (N) aVar;
        this.f167256n = vVar;
        this.f167257o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167257o | 1);
        ?? r02 = this.f167255m;
        androidx.compose.ui.v vVar = this.f167256n;
        z.a(this.f167254l, r02, vVar, a12, iA2);
        return G0.f406611a;
    }
}
