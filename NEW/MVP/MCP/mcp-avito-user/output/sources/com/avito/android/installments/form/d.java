package com.avito.android.installments.form;

import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsFormActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f172612l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f172613m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f172614n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f172615o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InstallmentsFormActivity f172616p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, String str4, InstallmentsFormActivity installmentsFormActivity) {
        super(2);
        this.f172612l = str;
        this.f172613m = str2;
        this.f172614n = str3;
        this.f172615o = str4;
        this.f172616p = installmentsFormActivity;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setTitle(this.f172612l);
        bVar2.setSubtitle(this.f172613m);
        InstallmentsFormActivity installmentsFormActivity = this.f172616p;
        bVar2.L3(this.f172614n, new b(installmentsFormActivity));
        bVar2.M3(this.f172615o, new c(installmentsFormActivity));
        bVar2.setButtonsOrientation(1);
        return G0.f406611a;
    }
}
