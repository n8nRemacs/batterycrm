package com.avito.android.mortgage.person_form.list.items.checkbox;

import E00.b;
import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckboxPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f200601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CheckboxItem f200602m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, CheckboxItem checkboxItem) {
        super(1);
        this.f200601l = dVar;
        this.f200602m = checkboxItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        d dVar = this.f200601l;
        dVar.f200603b.invoke(new b.w(this.f200602m.f200592b, zBooleanValue));
        return G0.f406611a;
    }
}
