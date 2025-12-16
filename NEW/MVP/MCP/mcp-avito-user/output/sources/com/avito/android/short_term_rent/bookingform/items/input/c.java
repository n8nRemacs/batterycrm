package com.avito.android.short_term_rent.bookingform.items.input;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AbsFormInputPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasFocus", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f281554l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f281555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FormInputItem f281556n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, e eVar, FormInputItem formInputItem) {
        super(1);
        this.f281554l = mVar;
        this.f281555m = eVar;
        this.f281556n = formInputItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        m mVar = this.f281554l;
        if (zBooleanValue) {
            mVar.u0(new b(this.f281555m, this.f281556n));
        } else {
            mVar.u0(null);
        }
        return G0.f406611a;
    }
}
