package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.z;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OnlyEmojiMessageContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* compiled from: OnlyEmojiMessageContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22602e f192585l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f192586m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f192587n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f192588o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22602e c22602e, v vVar, boolean z12, int i12, int i13) {
            super(2);
            this.f192585l = c22602e;
            this.f192586m = vVar;
            this.f192587n = z12;
            this.f192588o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            C22602e c22602e = this.f192585l;
            int i12 = this.f192588o;
            c.a(c22602e, this.f192586m, this.f192587n, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C22602e c22602e, @Y61.l v vVar, boolean z12, @Y61.l A a12, int i12, int i13) {
        boolean z13;
        int i14;
        boolean z14;
        v vVar2;
        B bE2 = a12.E(-685390569);
        int i15 = i12 | (bE2.B(c22602e) ? 4 : 2);
        int i16 = i15 | 48;
        int i17 = i13 & 4;
        if (i17 != 0) {
            i14 = i15 | 432;
            z13 = z12;
        } else {
            z13 = z12;
            i14 = i16 | (bE2.j(z13) ? 256 : 128);
        }
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
            z14 = z13;
        } else {
            v.a aVar = v.f42878y1;
            if (i17 != 0) {
                z13 = true;
            }
            boolean z15 = z13;
            float f12 = 4;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarL = R1.l(aVar, f12, z15 ? f12 : 0, f12, f12);
            bE2.C(2012527820);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                objT = r.a(com.akita.compose.theme.re23.b.f63988f.f65245p, null, z.c(64.0d), 0L, null, 0L, 0L, 1019);
                bE2.H(objT);
            }
            bE2.X(false);
            com.akita.compose.foundation.ui.p.a(c22602e, (r) objT, vVarL, false, 0L, null, 0, 0, false, null, bE2, (i14 & 14) | 3120, 1008);
            z14 = z15;
            vVar2 = aVar;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(c22602e, vVar2, z14, i12, i13);
        }
    }
}
