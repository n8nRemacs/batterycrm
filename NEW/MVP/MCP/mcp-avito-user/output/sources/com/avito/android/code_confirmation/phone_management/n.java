package com.avito.android.code_confirmation.phone_management;

import com.avito.android.R;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.util.C5;
import io.reactivex.rxjava3.internal.operators.maybe.C41927v;
import io.reactivex.rxjava3.internal.operators.maybe.c0;
import io.reactivex.rxjava3.internal.operators.maybe.g0;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: PhoneManagementPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f119696b;

    public n(w wVar) {
        this.f119696b = wVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        w wVar = this.f119696b;
        if (!C5.f318568b.e(wVar.f119717l)) {
            E e12 = wVar.f119713h;
            if (e12 != null) {
                e12.c(wVar.f119707b.getF15141a().getString(R.string.empty_input_error));
                return;
            }
            return;
        }
        PhoneManagementIntentFactory.CallSource callSource = wVar.f119709d;
        if (callSource instanceof PhoneManagementIntentFactory.CallSource.Deeplink ? true : callSource instanceof PhoneManagementIntentFactory.CallSource.Messenger) {
            String str = wVar.f119717l;
            CodeConfirmationSource codeConfirmationSource = CodeConfirmationSource.f92767o;
            CodeConfirmationSource codeConfirmationSource2 = wVar.f119711f;
            if (codeConfirmationSource2 == codeConfirmationSource || !(callSource instanceof PhoneManagementIntentFactory.CallSource.Messenger)) {
                codeConfirmationSource2 = (codeConfirmationSource2 == codeConfirmationSource && (callSource instanceof PhoneManagementIntentFactory.CallSource.Messenger)) ? CodeConfirmationSource.f92759g : CodeConfirmationSource.f92764l;
            }
            c0 c0VarK = wVar.f119706a.a(str, codeConfirmationSource2).k(wVar.f119708c.e());
            t tVar = new t(wVar);
            l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            wVar.f119715j.b(new C41927v(new g0(c0VarK, tVar, gVar, gVar, interfaceC43543a, interfaceC43543a, interfaceC43543a), new k(wVar)).n(new u(wVar), new v(wVar), interfaceC43543a));
        }
    }
}
