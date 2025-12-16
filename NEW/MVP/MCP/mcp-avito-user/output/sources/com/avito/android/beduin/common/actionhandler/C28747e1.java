package com.avito.android.beduin.common.actionhandler;

import android.content.DialogInterface;
import com.avito.android.beduin.common.action.BeduinShowAlertAction;
import kotlin.Metadata;

/* compiled from: BeduinShowAlertHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.actionhandler.e1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28747e1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k1 f100233l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f100234m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BeduinShowAlertAction.Button f100235n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28747e1(k1 k1Var, DialogInterface dialogInterface, BeduinShowAlertAction.Button button) {
        super(0);
        this.f100233l = k1Var;
        this.f100234m = dialogInterface;
        this.f100235n = button;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        new C28744d1(this.f100233l, this.f100235n).invoke();
        this.f100234m.dismiss();
        return kotlin.G0.f406611a;
    }
}
