package com.avito.android.installments.fakedoor.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.deep_linking.links.InstallmentsFakeDoorLink;
import com.avito.android.installments.fakedoor.InstallmentsFakedoorDialog;
import com.avito.android.installments.fakedoor.InstallmentsFakedoorParams;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsFakedoorDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InstallmentsFakeDoorLink f172510l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, InstallmentsFakeDoorLink installmentsFakeDoorLink) {
        super(0);
        this.f172510l = installmentsFakeDoorLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        InstallmentsFakeDoorLink installmentsFakeDoorLink = this.f172510l;
        InstallmentsFakedoorParams installmentsFakedoorParams = new InstallmentsFakedoorParams(installmentsFakeDoorLink.f133375b, installmentsFakeDoorLink.f133376c, installmentsFakeDoorLink.f133377d, installmentsFakeDoorLink.f133378e, installmentsFakeDoorLink.f133379f, installmentsFakeDoorLink.f133380g);
        InstallmentsFakedoorDialog.f172488k0.getClass();
        InstallmentsFakedoorDialog installmentsFakedoorDialog = new InstallmentsFakedoorDialog();
        installmentsFakedoorDialog.f172490h0.setValue(installmentsFakedoorDialog, InstallmentsFakedoorDialog.f172489l0[0], installmentsFakedoorParams);
        return installmentsFakedoorDialog;
    }
}
