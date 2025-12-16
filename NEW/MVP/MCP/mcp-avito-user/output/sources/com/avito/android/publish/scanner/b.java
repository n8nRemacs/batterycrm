package com.avito.android.publish.scanner;

import android.content.DialogInterface;
import iR.C41336a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ze0.InterfaceC50553a;

/* compiled from: RecognitionErrorDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f239147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f239148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DialogInterface dialogInterface, k kVar) {
        super(0);
        this.f239147l = dialogInterface;
        this.f239148m = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f239147l.dismiss();
        C41336a.C11375a.a();
        k kVar = this.f239148m;
        kotlin.reflect.n<Object>[] nVarArr = ScannerFragment.f239116D0;
        kVar.f239220a.s5().accept(InterfaceC50553a.C12961a.f444109a);
        return G0.f406611a;
    }
}
