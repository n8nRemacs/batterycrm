package com.avito.android.profile_phones;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.L;
import com.avito.android.N1;
import com.avito.android.R;
import com.avito.android.profile_phones.PhoneActionActivity;
import com.avito.android.profile_phones.add_phone.AddPhoneArguments;
import com.avito.android.profile_phones.confirm_phone.PhoneConfirmationArguments;
import com.avito.android.profile_phones.confirm_phone.PhoneConfirmationWithCodeRequestArguments;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationArguments;
import com.avito.android.profile_phones.phone_action.PhoneActionArguments;
import com.avito.android.profile_phones.phone_action.PhoneParcelableEntity;
import com.avito.android.profile_phones.phones_list.PhonesListTabFragmentData;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneActionCode;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesIntentFactoryImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/a;", "Lcom/avito/android/N1;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements N1 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f226791a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final L f226792b;

    @Inject
    public a(@k Context context, @k L l12) {
        this.f226791a = context;
        this.f226792b = l12;
    }

    @Override // com.avito.android.N1
    @k
    public final Intent a(int i12, @k String str, @k List list) {
        return j(PhoneActionCode.f228123d, Integer.valueOf(i12), str, list);
    }

    @Override // com.avito.android.N1
    @k
    public final Intent b(@k String str, @k String str2, boolean z12) {
        PhoneActionActivity.a aVar = PhoneActionActivity.f226783m;
        PhoneConfirmationWithCodeRequestArguments phoneConfirmationWithCodeRequestArguments = new PhoneConfirmationWithCodeRequestArguments(str, z12, str2);
        aVar.getClass();
        Intent intent = new Intent(this.f226791a, (Class<?>) PhoneActionActivity.class);
        intent.putExtra("key.arguments", phoneConfirmationWithCodeRequestArguments);
        intent.putExtra("key.action_type", PhoneActionActivity.PhoneActionType.f226786d);
        return intent;
    }

    @Override // com.avito.android.N1
    @k
    public final Intent c(int i12, @k String str, @k String str2, @k AttributedText attributedText, @k String str3, boolean z12) {
        PhoneActionActivity.a aVar = PhoneActionActivity.f226783m;
        LandlinePhoneVerificationArguments landlinePhoneVerificationArguments = new LandlinePhoneVerificationArguments(i12, str, str2, attributedText, str3, z12);
        aVar.getClass();
        Intent intent = new Intent(this.f226791a, (Class<?>) PhoneActionActivity.class);
        intent.putExtra("key.arguments", landlinePhoneVerificationArguments);
        intent.putExtra("key.action_type", PhoneActionActivity.PhoneActionType.f226787e);
        return intent;
    }

    @Override // com.avito.android.N1
    @k
    public final Intent d(@k String str) {
        return j(PhoneActionCode.f228122c, null, str, C42784z0.f406748b);
    }

    @Override // com.avito.android.N1
    @k
    public final Intent e(int i12, @k String str, @k List list) {
        return j(PhoneActionCode.f228121b, Integer.valueOf(i12), str, list);
    }

    @Override // com.avito.android.N1
    @k
    public final Intent f(@l String str) {
        return this.f226792b.d(new PhonesListTabFragmentData(true, str));
    }

    @Override // com.avito.android.N1
    @k
    public final Intent g(@l String str, @l String str2, @l String str3, @l String str4) {
        PhoneActionActivity.a aVar = PhoneActionActivity.f226783m;
        AddPhoneArguments addPhoneArguments = new AddPhoneArguments(str, str2, str3, str4);
        aVar.getClass();
        Intent intent = new Intent(this.f226791a, (Class<?>) PhoneActionActivity.class);
        intent.putExtra("key.arguments", addPhoneArguments);
        intent.putExtra("key.action_type", PhoneActionActivity.PhoneActionType.f226784b);
        return intent;
    }

    @Override // com.avito.android.N1
    @k
    public final Intent h(@k String str) {
        PhoneActionActivity.a aVar = PhoneActionActivity.f226783m;
        Context context = this.f226791a;
        AddPhoneArguments addPhoneArguments = new AddPhoneArguments(context.getString(R.string.add_phone_from_external_profile_setting_phone_replacement), null, "extended_profile", str);
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) PhoneActionActivity.class);
        intent.putExtra("key.arguments", addPhoneArguments);
        intent.putExtra("key.action_type", PhoneActionActivity.PhoneActionType.f226784b);
        return intent;
    }

    @Override // com.avito.android.N1
    @k
    public final Intent i(long j12, @k String str) {
        PhoneActionActivity.a aVar = PhoneActionActivity.f226783m;
        PhoneConfirmationArguments phoneConfirmationArguments = new PhoneConfirmationArguments(str, "profile:add", 5, j12);
        aVar.getClass();
        Intent intent = new Intent(this.f226791a, (Class<?>) PhoneActionActivity.class);
        intent.putExtra("key.arguments", phoneConfirmationArguments);
        intent.putExtra("key.action_type", PhoneActionActivity.PhoneActionType.f226785c);
        return intent;
    }

    public final Intent j(PhoneActionCode phoneActionCode, Integer num, String str, List list) {
        PhoneActionActivity.a aVar = PhoneActionActivity.f226783m;
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new PhoneParcelableEntity((String) it.next()));
        }
        PhoneActionArguments phoneActionArguments = new PhoneActionArguments(phoneActionCode, num, str, arrayList);
        aVar.getClass();
        Intent intent = new Intent(this.f226791a, (Class<?>) PhoneActionActivity.class);
        intent.putExtra("key.arguments", phoneActionArguments);
        intent.putExtra("key.action_type", PhoneActionActivity.PhoneActionType.f226788f);
        return intent;
    }
}
