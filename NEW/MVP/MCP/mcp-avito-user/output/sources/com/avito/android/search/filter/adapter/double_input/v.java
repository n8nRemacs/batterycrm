package com.avito.android.search.filter.adapter.double_input;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DoubleInputPayloadItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasFocus", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class v extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f262251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.g f262252m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f262253n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f262254o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar, s sVar2, C c12, ParameterElement.g gVar) {
        super(1);
        this.f262251l = c12;
        this.f262252m = gVar;
        this.f262253n = sVar;
        this.f262254o = sVar2;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            C.k(this.f262253n, this.f262251l, this.f262252m);
            this.f262254o.R20();
        }
        return G0.f406611a;
    }
}
