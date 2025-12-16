package com.avito.android.installments.form;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.avito.android.util.L5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsFormActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InstallmentsFormActivity f172693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f172694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InstallmentsFormActivity installmentsFormActivity, String str) {
        super(0);
        this.f172693l = installmentsFormActivity;
        this.f172694m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InstallmentsFormActivity installmentsFormActivity = this.f172693l;
        ClipboardManager clipboardManager = (ClipboardManager) installmentsFormActivity.f172588w.getValue();
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("post_message", this.f172694m));
        }
        L5.b(installmentsFormActivity, "Copied 🍻", 0);
        return G0.f406611a;
    }
}
