package com.avito.android.mortgage.person_form.suggestion;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestionScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class s extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f201496l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i12) {
        super(2);
        this.f201496l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f201496l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-984834334);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C32667a.f201376a.getClass();
            com.akita.compose.theme.re23.c.a(false, C32667a.f201379d, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new s(iA2);
        }
        return G0.f406611a;
    }
}
