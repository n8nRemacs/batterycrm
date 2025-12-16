package com.avito.android.edit_text_field;

import Ay.InterfaceC13103a;
import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditTextFieldView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class E extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f146884l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f146885m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(y yVar, DialogInterface dialogInterface) {
        super(0);
        this.f146884l = yVar;
        this.f146885m = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        y yVar = this.f146884l;
        yVar.f147038d.accept(InterfaceC13103a.c.f737a);
        this.f146885m.dismiss();
        yVar.f147039e.d();
        return G0.f406611a;
    }
}
