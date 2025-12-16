package com.avito.android.profile_phones.landline_verification;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: LandlinePhoneVerificationFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.l<LandlinePhoneVerificationViewModel.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LandlinePhoneVerificationFragment f227222l;

    /* compiled from: LandlinePhoneVerificationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LandlinePhoneVerificationViewModel.ResultStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LandlinePhoneVerificationViewModel.ResultStatus resultStatus = LandlinePhoneVerificationViewModel.ResultStatus.f227191b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LandlinePhoneVerificationViewModel.ResultStatus resultStatus2 = LandlinePhoneVerificationViewModel.ResultStatus.f227191b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LandlinePhoneVerificationFragment landlinePhoneVerificationFragment) {
        super(1);
        this.f227222l = landlinePhoneVerificationFragment;
    }

    @Override // Y41.l
    public final G0 invoke(LandlinePhoneVerificationViewModel.c cVar) {
        String string;
        LandlinePhoneVerificationViewModel.c cVar2 = cVar;
        boolean z12 = cVar2 instanceof LandlinePhoneVerificationViewModel.c.C6901c;
        LandlinePhoneVerificationFragment landlinePhoneVerificationFragment = this.f227222l;
        if (z12) {
            LandlinePhoneVerificationViewModel.c.C6901c c6901c = (LandlinePhoneVerificationViewModel.c.C6901c) cVar2;
            int iOrdinal = c6901c.f227209b.ordinal();
            String str = c6901c.f227208a;
            if (iOrdinal == 0) {
                string = landlinePhoneVerificationFragment.getString(R.string._onfirm_phone_success_res_0x7f131a03, str);
            } else if (iOrdinal == 1) {
                string = landlinePhoneVerificationFragment.getString(R.string._onfirm_phone_cancel_res_0x7f131a01, str);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                string = landlinePhoneVerificationFragment.getString(R.string._onfirm_phone_manual_res_0x7f131a02, str);
            }
            ActivityC22955m activityC22955mRequireActivity = landlinePhoneVerificationFragment.requireActivity();
            Intent intent = new Intent();
            intent.putExtra("extra_phone", str);
            intent.putExtra("extra_result_status", c6901c.f227209b);
            intent.putExtra("result_message", string);
            G0 g02 = G0.f406611a;
            activityC22955mRequireActivity.setResult(-1, intent);
            activityC22955mRequireActivity.finish();
        } else if (cVar2 instanceof LandlinePhoneVerificationViewModel.c.a) {
            ActivityC22955m activityC22955mRequireActivity2 = landlinePhoneVerificationFragment.requireActivity();
            activityC22955mRequireActivity2.setResult(0);
            activityC22955mRequireActivity2.finish();
        } else if (cVar2 instanceof LandlinePhoneVerificationViewModel.c.b) {
            InterfaceC30751h interfaceC30751h = landlinePhoneVerificationFragment.f227170w0;
            if (interfaceC30751h == null) {
                interfaceC30751h = null;
            }
            landlinePhoneVerificationFragment.startActivity(interfaceC30751h.a(((LandlinePhoneVerificationViewModel.c.b) cVar2).f227207a));
        }
        return G0.f406611a;
    }
}
