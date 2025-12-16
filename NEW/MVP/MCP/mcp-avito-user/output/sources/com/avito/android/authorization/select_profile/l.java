package com.avito.android.authorization.select_profile;

import Rh.C15041a;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.event.AuthWarningPhoneInOtherAccEvent;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: SelectProfilePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectProfilePresenterImpl f94334b;

    public l(SelectProfilePresenterImpl selectProfilePresenterImpl) {
        this.f94334b = selectProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) throws Resources.NotFoundException {
        CharSequence charSequenceC;
        SelectProfilePresenterImpl selectProfilePresenterImpl = this.f94334b;
        selectProfilePresenterImpl.getClass();
        he.q qVar = new he.q(true);
        InterfaceC28373a interfaceC28373a = selectProfilePresenterImpl.f94237i;
        interfaceC28373a.c(qVar);
        AttributedText attributedText = selectProfilePresenterImpl.f94246r;
        if (attributedText == null) {
            SelectProfileActivity selectProfileActivity = selectProfilePresenterImpl.f94240l;
            if (selectProfileActivity != null) {
                selectProfileActivity.a2();
                return;
            }
            return;
        }
        interfaceC28373a.c(new AuthWarningPhoneInOtherAccEvent(AuthWarningPhoneInOtherAccEvent.Source.f93833c));
        attributedText.setOnDeepLinkClickListener(new C15041a(selectProfilePresenterImpl, 14));
        Resources resources = selectProfilePresenterImpl.f94232d;
        String string = resources.getString(R.string.phone_is_bound_error_re23);
        x xVar = selectProfilePresenterImpl.f94239k;
        if (xVar != null) {
            charSequenceC = xVar.f94455a.c(xVar.f94456b.getContext(), attributedText);
        } else {
            charSequenceC = null;
        }
        CharSequence charSequence = charSequenceC;
        selectProfilePresenterImpl.f94242n.b(selectProfilePresenterImpl.f94231c.e(string, charSequence, resources.getString(R.string.phone_is_bound_error_continue_button), resources.getString(R.string.phone_is_bound_error_back_button), true).n(new s(selectProfilePresenterImpl), t.f94443b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
