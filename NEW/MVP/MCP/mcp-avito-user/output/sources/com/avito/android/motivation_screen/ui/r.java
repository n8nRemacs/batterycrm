package com.avito.android.motivation_screen.ui;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MotivationErrorScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class r extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f206452l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i12) {
        super(2);
        this.f206452l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f206452l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-789964644);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            o.a("Что-то сломалось", "Немного подождите и обновите экран —\nдолжно заработать ", "Обновить", p.f206450l, q.f206451l, bE2, 28086);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(iA2);
        }
        return G0.f406611a;
    }
}
