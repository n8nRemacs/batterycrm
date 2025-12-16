package com.avito.android.code_confirmation.phone_management;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: PhoneManagementIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/d;", "Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.code_confirmation.phone_management.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29416d implements PhoneManagementIntentFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f119667a;

    @Inject
    public C29416d(@Y61.k Context context) {
        this.f119667a = context;
    }

    @Override // com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory
    @Y61.k
    public final Intent a(@Y61.k String str) {
        CodeConfirmationSource[] codeConfirmationSourceArrValues = CodeConfirmationSource.values();
        int iF2 = P0.f(codeConfirmationSourceArrValues.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (CodeConfirmationSource codeConfirmationSource : codeConfirmationSourceArrValues) {
            linkedHashMap.put(codeConfirmationSource.f92770b, codeConfirmationSource);
        }
        return new Intent(this.f119667a, (Class<?>) PhoneManagementActivity.class).putExtra("call_source", PhoneManagementIntentFactory.CallSource.Deeplink.f119664b).putExtra(SearchParamsConverterKt.SOURCE, (Parcelable) (linkedHashMap.containsKey(str) ? (CodeConfirmationSource) linkedHashMap.get(str) : CodeConfirmationSource.f92767o));
    }

    @Override // com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory
    @Y61.k
    public final Intent b(@Y61.k PhoneManagementIntentFactory.CallSource.Messenger messenger) {
        return new Intent(this.f119667a, (Class<?>) PhoneManagementActivity.class).putExtra("call_source", messenger).putExtra(SearchParamsConverterKt.SOURCE, (Parcelable) CodeConfirmationSource.f92767o);
    }
}
