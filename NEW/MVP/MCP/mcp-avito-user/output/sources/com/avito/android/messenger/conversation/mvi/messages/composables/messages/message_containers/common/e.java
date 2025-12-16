package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.avito.android.R;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MessagesDivider.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {

    /* compiled from: MessagesDivider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f192354l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f192355m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i12) {
            super(2);
            this.f192354l = str;
            this.f192355m = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f192355m | 1);
            e.a(this.f192354l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: MessagesDivider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f192356l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1.c f192357m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f192358n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, T1.c cVar, int i12) {
            super(2);
            this.f192356l = str;
            this.f192357m = cVar;
            this.f192358n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f192358n | 1);
            e.b(this.f192356l, this.f192357m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.l A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(949167663);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65239j;
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i14 = androidx.compose.ui.text.style.i.f42678e;
            v vVarD = C20588k2.d(v.f42878y1, 1.0f);
            float f12 = 16;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, R1.m(vVarD, 0.0f, f12, 0.0f, f12, 5), false, jC2, androidx.compose.ui.text.style.i.a(i14), 0, 0, false, null, bE2, (i13 & 14) | 3456, 960);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(str, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.l String str, @Y61.l T1.c cVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-2054013267);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(cVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else if (str != null && !C43066x.K(str)) {
            bE2.C(491755030);
            a(str, bE2, i13 & 14);
            bE2.X(false);
        } else if (cVar == null || !cVar.f189147a || cVar.f189149c || cVar.f189151e || cVar.f189153g) {
            bE2.C(491984244);
            C20608p2.a(bE2, C20588k2.f(v.f42878y1, u0.f.a(bE2, R.dimen.messenger_compose_between_messages_divider)));
            bE2.X(false);
        } else {
            bE2.C(491853455);
            C20608p2.a(bE2, C20588k2.f(v.f42878y1, u0.f.a(bE2, R.dimen.messenger_message_group_divider)));
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, cVar, i12);
        }
    }
}
