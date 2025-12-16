package com.avito.android.beduin.common.actionhandler;

import android.content.DialogInterface;
import com.avito.android.beduin.common.action.BeduinShowAlertAction;
import kotlin.Metadata;

/* compiled from: BeduinShowAlertHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.actionhandler.a1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28735a1 extends kotlin.jvm.internal.N implements Y41.l<DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k1 f100161l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BeduinShowAlertAction f100162m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28735a1(k1 k1Var, BeduinShowAlertAction beduinShowAlertAction) {
        super(1);
        this.f100161l = k1Var;
        this.f100162m = beduinShowAlertAction;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(DialogInterface dialogInterface) {
        k1.l(this.f100161l, this.f100162m.getOnDismissActions());
        return kotlin.G0.f406611a;
    }
}
