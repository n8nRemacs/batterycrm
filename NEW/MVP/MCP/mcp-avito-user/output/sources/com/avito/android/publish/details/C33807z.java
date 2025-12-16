package com.avito.android.publish.details;

import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import kotlin.Metadata;

/* compiled from: ItemDetailsView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33807z extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f235109l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f235110m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f235111n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f235112o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f235113p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33807z(Y41.a aVar, Y41.a aVar2, String str, String str2, String str3) {
        super(2);
        this.f235109l = str;
        this.f235110m = str2;
        this.f235111n = str3;
        this.f235112o = aVar;
        this.f235113p = aVar2;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setTitle(this.f235109l);
        bVar2.setSubtitle(this.f235110m);
        bVar2.L3(this.f235111n, new C33798w(this.f235112o, dialogInterface2));
        Y41.a<kotlin.G0> aVar = this.f235113p;
        bVar2.P3(new C33801x(aVar));
        bVar2.H3(new C33804y(aVar, dialogInterface2));
        return kotlin.G0.f406611a;
    }
}
