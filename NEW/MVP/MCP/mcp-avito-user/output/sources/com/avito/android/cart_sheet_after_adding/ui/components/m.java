package com.avito.android.cart_sheet_after_adding.ui.components;

import android.net.Uri;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CartSheetAfterAddingMainSnippet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class m extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f115567l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i12) {
        super(2);
        this.f115567l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f115567l | 1);
        float f12 = p.f115575a;
        androidx.compose.runtime.B bE2 = a12.E(246663700);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-45806439, new l(Uri.parse("https://96.img.avito.st/240x180/9854391196.jpg")), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(iA2);
        }
        return G0.f406611a;
    }
}
