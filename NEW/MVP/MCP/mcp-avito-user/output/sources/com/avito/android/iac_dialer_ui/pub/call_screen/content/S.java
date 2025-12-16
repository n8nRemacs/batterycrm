package com.avito.android.iac_dialer_ui.pub.call_screen.content;

import androidx.compose.runtime.C22066f2;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacUICallScreenIdleModeContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class S extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUICallScreenState.IdleModeContent f167094l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f167095m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f167096n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f167097o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(IacUICallScreenState.IdleModeContent idleModeContent, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f167094l = idleModeContent;
        this.f167095m = lVar;
        this.f167096n = vVar;
        this.f167097o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167097o | 1);
        ?? r02 = this.f167095m;
        androidx.compose.ui.v vVar = this.f167096n;
        U.a(this.f167094l, r02, vVar, a12, iA2);
        return G0.f406611a;
    }
}
