package com.avito.android.dialog;

import android.os.Bundle;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DialogWithDeeplinkActions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class y extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeepLinksDialogInfo f144808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f144809m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(DeepLinksDialogInfo deepLinksDialogInfo, boolean z12) {
        super(1);
        this.f144808l = deepLinksDialogInfo;
        this.f144809m = z12;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putParcelable("key_dialog_info", this.f144808l);
        bundle2.putBoolean("key_re23_style", this.f144809m);
        return G0.f406611a;
    }
}
