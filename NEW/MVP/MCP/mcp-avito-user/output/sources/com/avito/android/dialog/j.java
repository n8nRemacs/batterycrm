package com.avito.android.dialog;

import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DialogPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f144772l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f144773m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<a.b, G0> f144774n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f144775o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f144776p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.s<G0> f144777q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(boolean z12, String str, Y41.l<? super a.b, G0> lVar, String str2, String str3, io.reactivex.rxjava3.core.s<G0> sVar) {
        super(2);
        this.f144772l = z12;
        this.f144773m = str;
        this.f144774n = lVar;
        this.f144775o = str2;
        this.f144776p = str3;
        this.f144777q = sVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setCancelable(this.f144772l);
        bVar2.setTitle(this.f144773m);
        ((f) this.f144774n).invoke(bVar2);
        bVar2.setButtonsOrientation(1);
        io.reactivex.rxjava3.core.s<G0> sVar = this.f144777q;
        String str = this.f144775o;
        if (str != null) {
            bVar2.L3(str, new h(sVar));
        }
        String str2 = this.f144776p;
        if (str2 != null) {
            bVar2.M3(str2, new i(dialogInterface2, sVar));
        }
        return G0.f406611a;
    }
}
