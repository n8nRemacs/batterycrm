package com.avito.android.legal_request;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sR.InterfaceC48098a;

/* compiled from: LegalRequestFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l<InterfaceC48098a.f, G0> f175199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LegalRequestFragment f175200m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super InterfaceC48098a.f, G0> lVar, LegalRequestFragment legalRequestFragment) {
        super(0);
        this.f175199l = lVar;
        this.f175200m = legalRequestFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str = this.f175200m.f175187u0;
        if (str == null) {
            str = null;
        }
        ((a) this.f175199l).invoke(new InterfaceC48098a.c(str));
        return G0.f406611a;
    }
}
