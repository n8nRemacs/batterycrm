package com.avito.android.advert.item;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.l;
import com.avito.android.R;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.util.InterfaceC35945t1;
import iR.C41336a;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class Q1 extends kotlin.jvm.internal.N implements Y41.l<Context, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I1 f71791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PhoneLink f71792m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(I1 i12, PhoneLink phoneLink) {
        super(1);
        this.f71791l = i12;
        this.f71792m = phoneLink;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Context context) {
        l.a title = new l.a(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23)).setTitle(R.string.advert_core_phone);
        final I1 i12 = this.f71791l;
        InterfaceC35945t1<String> interfaceC35945t1 = i12.f71735q;
        final PhoneLink phoneLink = this.f71792m;
        androidx.appcompat.app.l lVarCreate = title.setMessage(interfaceC35945t1.a(phoneLink.getF133573b())).setPositiveButton(R.string.call, new DialogInterface.OnClickListener() { // from class: com.avito.android.advert.item.O1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                C41336a.C11375a.a();
                i12.f71739s.ob(phoneLink);
            }
        }).setOnDismissListener(new DialogInterfaceOnDismissListenerC28158p1(1, i12)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.avito.android.advert.item.P1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                i12.f71739s.Wa();
            }
        }).create();
        i12.f71672Q0 = lVarCreate;
        if (lVarCreate != null) {
            com.avito.android.lib.util.g.a(lVarCreate);
        }
        i12.f71739s.qb();
        return kotlin.G0.f406611a;
    }
}
