package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NotSupportedIntrinsicSizeComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p {

    /* compiled from: NotSupportedIntrinsicSizeComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f338094l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f338095m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i12, Y41.l lVar, String str) {
            super(2);
            this.f338094l = (N) lVar;
            this.f338095m = str;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            p.a(this.f338094l, this.f338095m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(@Y61.k Y41.l<? super m, n> lVar, @Y61.k String str, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(752761969);
        int i13 = (bE2.u(lVar) ? 4 : 2) | i12 | (bE2.B(str) ? 32 : 16);
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            ((G) bE2.o(C36345b.f338050a)).a(0, bE2, o.b(lVar, bE2, i13 & 14), "UnsupportedIntrinsicSizeIn".concat(str), str.concat(" doesn't support IntrinsicSize used in parent container. Read FAQ in documentation to resolve this problem https://docs.k.avito.ru/beduin-v2/guide/faq/"));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, lVar, str);
        }
    }
}
