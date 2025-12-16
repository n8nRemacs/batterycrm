package com.avito.android.wallet.pin.impl.ui.components.attributed_text;

import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AttributedTextView.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_wallet-pin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l AttributedText attributedText, @l v vVar, @l A a12, int i12) {
        B bE2 = a12.E(-2139061199);
        com.avito.android.lib.compose.design.component.attributedtext.a.a(vVar, null, new a(attributedText), 0, bE2, (i12 >> 3) & 14, 10);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(attributedText, vVar, i12);
        }
    }
}
