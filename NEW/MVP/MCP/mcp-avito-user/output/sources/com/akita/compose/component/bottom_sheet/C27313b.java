package com.akita.compose.component.bottom_sheet;

import androidx.compose.foundation.layout.R1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.component.bottom_sheet.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27313b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f60585l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27313b(O o12) {
        super(2);
        this.f60585l = o12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            T.a(R1.h(androidx.compose.ui.v.f42878y1, this.f60585l.f60547i), null, a13, 0);
        }
        return G0.f406611a;
    }
}
