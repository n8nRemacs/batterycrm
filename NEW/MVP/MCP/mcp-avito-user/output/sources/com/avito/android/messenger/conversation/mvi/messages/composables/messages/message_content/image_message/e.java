package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f192499l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i12) {
        super(2);
        this.f192499l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192499l | 1);
        v vVar = f.f192500a;
        B bE2 = a12.E(871546947);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            a.f192487a.getClass();
            com.akita.compose.theme.re23.c.a(false, a.f192489c, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(iA2);
        }
        return G0.f406611a;
    }
}
