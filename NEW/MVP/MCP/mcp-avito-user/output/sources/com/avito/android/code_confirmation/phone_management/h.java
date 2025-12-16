package com.avito.android.code_confirmation.phone_management;

import Vo.C15699a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.InterfaceC29394g;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneManagementInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/h;", "Lcom/avito/android/code_confirmation/phone_management/g;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29394g f119690a;

    @Inject
    public h(@Y61.k InterfaceC29394g interfaceC29394g) {
        this.f119690a = interfaceC29394g;
    }

    @Override // com.avito.android.code_confirmation.phone_management.g
    @Y61.k
    public final io.reactivex.rxjava3.core.q<C15699a> a(@Y61.k String str, @Y61.l CodeConfirmationSource codeConfirmationSource) {
        return this.f119690a.b(str, codeConfirmationSource, false);
    }
}
