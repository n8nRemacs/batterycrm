package com.avito.android.profile_phones.confirm_phone;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile_phones.confirm_phone.l;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/confirm_phone/l$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements Y41.l<l.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConfirmPhoneFragment f227003l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConfirmPhoneFragment confirmPhoneFragment) {
        super(1);
        this.f227003l = confirmPhoneFragment;
    }

    @Override // Y41.l
    public final G0 invoke(l.b bVar) {
        l.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof l.b.d;
        ConfirmPhoneFragment confirmPhoneFragment = this.f227003l;
        if (z12) {
            Input input = confirmPhoneFragment.f226981u0;
            if (input == null) {
                input = null;
            }
            K2.d(input, true);
            ActivityC22955m activityC22955mRequireActivity = confirmPhoneFragment.requireActivity();
            Intent intent = new Intent();
            l.b.d dVar = (l.b.d) bVar2;
            intent.putExtra("extra_phone", dVar.f227053a);
            intent.putExtra("result_message", activityC22955mRequireActivity.getString(R.string._onfirm_phone_success_res_0x7f131a03, dVar.f227053a));
            intent.putExtra("result_link", dVar.f227054b);
            G0 g02 = G0.f406611a;
            activityC22955mRequireActivity.setResult(-1, intent);
            activityC22955mRequireActivity.finish();
        } else if (bVar2 instanceof l.b.a) {
            K2.e(confirmPhoneFragment);
            ActivityC22955m activityC22955mRequireActivity2 = confirmPhoneFragment.requireActivity();
            activityC22955mRequireActivity2.setResult(0);
            activityC22955mRequireActivity2.finish();
        } else if (bVar2 instanceof l.b.C6895b) {
            confirmPhoneFragment.f226972C0.b(bVar2);
        } else if (bVar2 instanceof l.b.c) {
            confirmPhoneFragment.f226973D0.b(bVar2);
        }
        return G0.f406611a;
    }
}
