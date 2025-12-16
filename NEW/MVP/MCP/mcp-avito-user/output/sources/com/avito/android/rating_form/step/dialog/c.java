package com.avito.android.rating_form.step.dialog;

import android.net.Uri;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: BottomSheetDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class c extends H implements Y41.l<String, G0> {
    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(String str) {
        invoke2(str);
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Y61.k String str) {
        BottomSheetDialogFragment bottomSheetDialogFragment = (BottomSheetDialogFragment) this.receiver;
        InterfaceC35845m2 interfaceC35845m2 = bottomSheetDialogFragment.f249326k0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        C35966w1.g(bottomSheetDialogFragment, interfaceC35845m2.u(Uri.parse(str), (6 & 2) == 0, (6 & 4) == 0), new e(bottomSheetDialogFragment));
    }
}
