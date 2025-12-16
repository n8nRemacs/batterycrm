package com.avito.android.profile.edit.refactoring.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.InputItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasFocus", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class n extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f222272l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InputItem f222273m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h hVar, InputItem inputItem) {
        super(1);
        this.f222272l = hVar;
        this.f222273m = inputItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        this.f222272l.w3(bool.booleanValue() ? false : this.f222273m.f222254e);
        return G0.f406611a;
    }
}
