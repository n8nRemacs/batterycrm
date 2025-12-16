package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: VideoMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f192625a = new c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f192626b = new C22096n(-429607521, a.f192627l, false);

    /* compiled from: VideoMessageContent.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f192627l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                List listD = C43033p.D(new com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages.p(null, 1, null).a());
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                v vVarB = androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a);
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                C20650b.a(vVarB, null, R1.a(4), false, null, null, null, false, null, new b(listD), a13, 384, 506);
            }
            return G0.f406611a;
        }
    }
}
