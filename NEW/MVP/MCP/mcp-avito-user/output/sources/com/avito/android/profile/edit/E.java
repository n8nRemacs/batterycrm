package com.avito.android.profile.edit;

import android.view.View;
import com.avito.android.profile.edit.S;
import kotlin.Metadata;

/* compiled from: EditProfilePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class E<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfilePresenterImpl f221944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f221945c;

    public E(EditProfilePresenterImpl editProfilePresenterImpl, S s5) {
        this.f221944b = editProfilePresenterImpl;
        this.f221945c = s5;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        S s5 = this.f221945c;
        this.f221944b.f221970l = false;
        View view = s5.f222004i;
        view.animate().setDuration(200L).alpha(0.0f).setListener(new S.a(view));
    }
}
