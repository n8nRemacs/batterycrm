package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import kotlin.Metadata;

/* compiled from: TextAreaPreview.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B3 {

    /* compiled from: TextAreaPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.input.v> f65262l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65263m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, kotlin.Q q12) {
            super(2);
            this.f65262l = q12;
            this.f65263m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65263m | 1);
            B3.a(this.f65262l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.input.v> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1282447826);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C27395g2.a(q12, bE2, i13 & 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, q12);
        }
    }
}
