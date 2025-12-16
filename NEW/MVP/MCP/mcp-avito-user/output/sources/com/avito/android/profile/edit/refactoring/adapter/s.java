package com.avito.android.profile.edit.refactoring.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.PhoneInputItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasFocus", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class s extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f222280l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PhoneInputItem f222281m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f fVar, PhoneInputItem phoneInputItem) {
        super(1);
        this.f222280l = fVar;
        this.f222281m = phoneInputItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        this.f222280l.w3(bool.booleanValue() ? false : this.f222281m.f222261e);
        return G0.f406611a;
    }
}
