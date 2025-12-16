package com.avito.android.cart_sheet_after_adding.ui.components;

import android.net.Uri;
import com.avito.android.R;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CartSheetAfterAddingMainSnippet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f115566l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Uri uri) {
        super(2);
        this.f115566l = uri;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            p.a(new gn.f(new Image(Collections.singletonMap(new Size(100, 75), this.f115566l))), "1350 ₽", "1500 ₽", "625 ₽", 10, "Носки «Красные маки»", "Голубые, размер 66", "Антон Смирнов", new Stepper(2, 2, null, null, false, 28, null), k.f115565l, u0.e.a(R.drawable.expected_img_logo_photo_placeholder, 0, a13), null, a13, 953904560, 70, 4096);
        }
        return G0.f406611a;
    }
}
