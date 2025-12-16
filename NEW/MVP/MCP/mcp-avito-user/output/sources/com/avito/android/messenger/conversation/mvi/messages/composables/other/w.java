package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TypingIndicatorContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class w extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f192848l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i12) {
        super(2);
        this.f192848l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192848l | 1);
        B bE2 = a12.E(-186541080);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            e.f192753a.getClass();
            com.avito.android.messenger.conversation.mvi.messages.preview.preview_wrappers.d.a(vVarD, false, false, e.f192754b, bE2, 24582, 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new w(iA2);
        }
        return G0.f406611a;
    }
}
