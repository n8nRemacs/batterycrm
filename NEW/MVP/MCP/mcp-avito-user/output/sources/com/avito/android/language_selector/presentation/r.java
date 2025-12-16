package com.avito.android.language_selector.presentation;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LanguageSelectorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Language f175023l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Language language) {
        super(2);
        this.f175023l = language;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarO = C20588k2.o(androidx.compose.ui.v.f42878y1, 20);
            String str = this.f175023l.f174938c;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, vVarO, false, 0L, null, 0, 0, false, null, a13, 384, 1016);
        }
        return G0.f406611a;
    }
}
