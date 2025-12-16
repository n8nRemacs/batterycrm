package com.avito.android.profile_settings_extended;

import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsMviView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class I extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f229043l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f229044m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f229045n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f229046o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f229047p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, String str2, String str3, String str4, Y41.a<G0> aVar) {
        super(2);
        this.f229043l = str;
        this.f229044m = str2;
        this.f229045n = str3;
        this.f229046o = str4;
        this.f229047p = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setTitle(this.f229043l);
        bVar2.setSubtitle(this.f229044m);
        bVar2.setCancelable(true);
        bVar2.setButtonsOrientation(1);
        bVar2.L3(this.f229045n, new G(this.f229047p, dialogInterface2));
        bVar2.M3(this.f229046o, new H(dialogInterface2));
        return G0.f406611a;
    }
}
