package com.avito.android.code_confirmation.phone_management;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneManagementPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class p extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f119698l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar) {
        super(1);
        this.f119698l = wVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        E e12 = this.f119698l.f119713h;
        if (e12 != null) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, e12.f119652b, com.avito.android.printable_text.b.f(str2), null, null, null, null, 0, null, null, false, false, null, null, 4094);
        }
        return G0.f406611a;
    }
}
