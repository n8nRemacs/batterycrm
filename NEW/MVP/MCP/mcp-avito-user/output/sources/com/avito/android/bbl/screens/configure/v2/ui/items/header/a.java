package com.avito.android.bbl.screens.configure.v2.ui.items.header;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BblHeader.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: BblHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bbl.screens.configure.v2.ui.items.header.a$a, reason: collision with other inner class name */
    public static final class C2995a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f99454l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2995a(int i12, AttributedText attributedText) {
            super(2);
            this.f99454l = attributedText;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            a.a(this.f99454l, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k AttributedText attributedText, @l A a12, int i12) {
        B bE2 = a12.E(915245428);
        v.a aVar = v.f42878y1;
        h.a aVar2 = h.f42849c;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, R1.m(R1.m(R1.k(6, 0.0f, 2, aVar), 0.0f, 12, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, 24, 7), R.attr.textH10, null, null, 0, bE2, 56, 56);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C2995a(i12, attributedText);
        }
    }
}
