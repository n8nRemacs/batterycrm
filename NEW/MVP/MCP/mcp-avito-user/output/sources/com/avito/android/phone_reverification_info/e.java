package com.avito.android.phone_reverification_info;

import android.content.Context;
import android.content.Intent;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneReverificationInfoIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_reverification_info/e;", "Lcom/avito/android/phone_reverification_info/d;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f216099a;

    @Inject
    public e(@Y61.k Context context) {
        this.f216099a = context;
    }

    @Override // com.avito.android.phone_reverification_info.d
    @Y61.l
    public final String a(@Y61.l Intent intent) {
        if (intent != null) {
            return intent.getStringExtra("extra_phone_reverification_result");
        }
        return null;
    }

    @Override // com.avito.android.phone_reverification_info.d
    @Y61.k
    public final Intent b(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        PhoneReverificationInfo.Allow allow = new PhoneReverificationInfo.Allow(str, str3, str2);
        Intent intent = new Intent(this.f216099a, (Class<?>) PhoneReverificationInfoActivity.class);
        intent.putExtra("phone_reverification_info_extra", allow);
        return intent;
    }

    @Override // com.avito.android.phone_reverification_info.d
    @Y61.k
    public final Intent c(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k String str4) {
        PhoneReverificationInfo.Disallow disallow = new PhoneReverificationInfo.Disallow(str, str3, str2, str4);
        Intent intent = new Intent(this.f216099a, (Class<?>) PhoneReverificationInfoActivity.class);
        intent.putExtra("phone_reverification_info_extra", disallow);
        return intent;
    }
}
