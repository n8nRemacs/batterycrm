package com.avito.android.beduin.common.actionhandler;

import android.content.DialogInterface;
import com.avito.android.beduin.common.action.BeduinShowAlertAction;
import kotlin.Metadata;

/* compiled from: BeduinShowAlertHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.actionhandler.g1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28753g1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k1 f100243l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f100244m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BeduinShowAlertAction.Button f100245n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28753g1(k1 k1Var, DialogInterface dialogInterface, BeduinShowAlertAction.Button button) {
        super(0);
        this.f100243l = k1Var;
        this.f100244m = dialogInterface;
        this.f100245n = button;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        new C28750f1(this.f100243l, this.f100245n).invoke();
        this.f100244m.dismiss();
        return kotlin.G0.f406611a;
    }
}
