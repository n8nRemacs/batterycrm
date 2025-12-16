package com.avito.android.code_confirmation.phone_management;

import kotlin.Metadata;

/* compiled from: PhoneManagementPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f119694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f119695c;

    public m(E e12, w wVar) {
        this.f119694b = e12;
        this.f119695c = wVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f119694b.a();
        PhoneManagementActivity phoneManagementActivity = this.f119695c.f119714i;
        if (phoneManagementActivity != null) {
            phoneManagementActivity.a2(false);
        }
    }
}
