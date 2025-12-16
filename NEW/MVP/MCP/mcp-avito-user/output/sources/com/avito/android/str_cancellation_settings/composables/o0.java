package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrCancellationSettingsContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class o0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f288246l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i12) {
        super(2);
        this.f288246l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f288246l | 1);
        androidx.compose.runtime.B bE2 = a12.E(996332104);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C35123x.f288269a.getClass();
            com.akita.compose.theme.re23.c.a(false, C35123x.f288270b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o0(iA2);
        }
        return G0.f406611a;
    }
}
