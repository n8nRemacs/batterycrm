package com.avito.android.profile.edit;

import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: EditProfilePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class I<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfilePresenterImpl f221986b;

    public I(EditProfilePresenterImpl editProfilePresenterImpl) {
        this.f221986b = editProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        EditProfilePresenterImpl editProfilePresenterImpl = this.f221986b;
        S s5 = editProfilePresenterImpl.f221967i;
        if (s5 != null) {
            D6.H(s5.f222000e);
        }
        S s12 = editProfilePresenterImpl.f221967i;
        if (s12 != null) {
            s12.b(false);
        }
    }
}
