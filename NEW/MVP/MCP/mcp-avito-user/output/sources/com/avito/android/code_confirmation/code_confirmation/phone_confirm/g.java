package com.avito.android.code_confirmation.code_confirmation.phone_confirm;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneConfirmResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/g;", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/f;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f119611a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119612b;

    @Inject
    public g(@k Resources resources) {
        this.f119611a = resources.getString(R.string.phone_confirm_error_already_added);
        this.f119612b = resources.getString(R.string.phone_confirm_error);
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.phone_confirm.f
    @k
    /* renamed from: a, reason: from getter */
    public final String getF119611a() {
        return this.f119611a;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.phone_confirm.f
    @k
    /* renamed from: b, reason: from getter */
    public final String getF119612b() {
        return this.f119612b;
    }
}
