package com.avito.android.mortgage.person_form.list.items.child;

import E00.b;
import Y41.l;
import com.avito.android.mortgage.person_form.list.items.input.InputItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChildPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f200621l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f200622m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f200623n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InputItem f200624o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, String str2, InputItem inputItem) {
        super(1);
        this.f200621l = gVar;
        this.f200622m = str;
        this.f200623n = str2;
        this.f200624o = inputItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        g gVar = this.f200621l;
        InputItem inputItem = this.f200624o;
        String str = this.f200623n;
        String str2 = this.f200622m;
        l<E00.b, G0> lVar = gVar.f200629b;
        if (zBooleanValue) {
            lVar.invoke(new b.C13466d(str2, str, inputItem.f200688b));
        } else {
            lVar.invoke(new b.e(str2, str, inputItem.f200688b, inputItem.f200689c));
        }
        return G0.f406611a;
    }
}
