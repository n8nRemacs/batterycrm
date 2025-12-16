package com.avito.android.profile.edit.refactoring.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.PhoneInputItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PhoneInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class r extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneInputItem f222277l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f222278m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f222279n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(PhoneInputItem phoneInputItem, t tVar, f fVar) {
        super(1);
        this.f222277l = phoneInputItem;
        this.f222278m = tVar;
        this.f222279n = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        PhoneInputItem phoneInputItem = this.f222277l;
        if (!L.f(phoneInputItem.f222260d, str2)) {
            phoneInputItem.f222260d = str2;
            this.f222278m.f222282b.accept(phoneInputItem);
            if (phoneInputItem.f222261e) {
                phoneInputItem.f222261e = false;
                this.f222279n.w3(false);
            }
        }
        return G0.f406611a;
    }
}
