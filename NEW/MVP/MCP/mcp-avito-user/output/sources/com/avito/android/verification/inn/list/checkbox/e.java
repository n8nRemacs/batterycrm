package com.avito.android.verification.inn.list.checkbox;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckboxItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f323946l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f323947m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, g gVar) {
        super(1);
        this.f323946l = aVar;
        this.f323947m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        a aVar = this.f323946l;
        if (aVar.f323939h != zBooleanValue) {
            aVar.f323939h = zBooleanValue;
            aVar.f323937f = null;
            this.f323947m.f323949b.c(aVar);
        }
        return G0.f406611a;
    }
}
