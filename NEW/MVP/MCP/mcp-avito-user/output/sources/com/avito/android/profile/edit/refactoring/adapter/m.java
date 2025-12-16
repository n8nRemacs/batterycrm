package com.avito.android.profile.edit.refactoring.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.InputItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: InputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InputItem f222269l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f222270m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f222271n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InputItem inputItem, o oVar, h hVar) {
        super(1);
        this.f222269l = inputItem;
        this.f222270m = oVar;
        this.f222271n = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        InputItem inputItem = this.f222269l;
        if (!L.f(inputItem.f222253d, str2)) {
            inputItem.f222253d = str2;
            this.f222270m.f222274b.accept(inputItem);
            if (inputItem.f222254e) {
                inputItem.f222254e = false;
                this.f222271n.w3(false);
            }
        }
        return G0.f406611a;
    }
}
