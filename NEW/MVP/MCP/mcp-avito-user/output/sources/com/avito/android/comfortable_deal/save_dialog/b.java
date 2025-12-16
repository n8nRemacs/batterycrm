package com.avito.android.comfortable_deal.save_dialog;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.avito.android.comfortable_deal.save_dialog.SaveDialog;
import com.avito.android.comfortable_deal.save_dialog.model.SaveArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SaveDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SaveDialog f122633l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SaveDialog saveDialog) {
        super(0);
        this.f122633l = saveDialog;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SaveDialog.a aVar = SaveDialog.f122629h0;
        SaveDialog saveDialog = this.f122633l;
        SaveArguments saveArgumentsF5 = saveDialog.f5();
        FragmentManager parentFragmentManager = saveDialog.getParentFragmentManager();
        SaveArguments saveArgumentsF52 = saveDialog.f5();
        Bundle bundle = new Bundle();
        bundle.putBoolean("result.key", saveArgumentsF5.f122640h);
        G0 g02 = G0.f406611a;
        parentFragmentManager.o0(bundle, saveArgumentsF52.f122634b);
        saveDialog.dismiss();
        return G0.f406611a;
    }
}
