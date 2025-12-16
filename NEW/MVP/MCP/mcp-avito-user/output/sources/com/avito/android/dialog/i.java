package com.avito.android.dialog;

import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f144770l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.s<G0> f144771m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DialogInterface dialogInterface, io.reactivex.rxjava3.core.s<G0> sVar) {
        super(0);
        this.f144770l = dialogInterface;
        this.f144771m = sVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f144770l.dismiss();
        this.f144771m.e();
        return G0.f406611a;
    }
}
