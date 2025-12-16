package com.avito.android.advert_core.contactbar;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.avito.android.R;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.advert_details.SellerOnlineStatus;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertContactsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/contactbar/A;", "Lcom/avito/android/advert_core/contactbar/w;", "Landroid/view/ViewStub$OnInflateListener;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class A implements w, ViewStub.OnInflateListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f83100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f83101c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC28264c f83102d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f83103e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public View f83104f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f83105g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f83106h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f83107i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f83108j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f83109k;

    public A(View view, boolean z12, boolean z13, InterfaceC28264c interfaceC28264c, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, ViewStub viewStub, boolean z19, boolean z22, H h12, int i12, C42822w c42822w) {
        boolean z23 = (i12 & 4) != 0 ? false : z13;
        InterfaceC28264c interfaceC28264c2 = (i12 & 8) != 0 ? null : interfaceC28264c;
        boolean z24 = (i12 & 16) != 0 ? false : z14;
        boolean z25 = (i12 & 32) != 0 ? false : z15;
        boolean z26 = (i12 & 64) != 0 ? false : z16;
        boolean z27 = (i12 & 128) != 0 ? false : z17;
        boolean z28 = (i12 & 256) != 0 ? false : z18;
        ViewStub viewStub2 = (i12 & 512) != 0 ? (ViewStub) view.findViewById(R.id.contact_bar_flying) : viewStub;
        H i13 = (i12 & 4096) != 0 ? new I(view, viewStub2, z12, z27, z28, z26, (i12 & 1024) != 0 ? false : z19, (i12 & 2048) == 0 ? z22 : false) : h12;
        this.f83100b = view;
        this.f83101c = z23;
        this.f83102d = interfaceC28264c2;
        this.f83103e = view.getContext();
        this.f83108j = new com.jakewharton.rxrelay3.c<>();
        this.f83109k = C42727D.b(LazyThreadSafetyMode.f406616d, new y(i13, z24, z25));
        if (viewStub2 != null) {
            viewStub2.setOnInflateListener(this);
        }
        if (z23) {
            a().hide();
        }
    }

    @Override // com.avito.android.advert_core.contactbar.w
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> Cz(@Y61.k List<? extends ContactBar.ContainerClickType> list) {
        return a().ib(list);
    }

    @Override // com.avito.android.advert_core.contactbar.w
    @Y61.l
    public final io.reactivex.rxjava3.core.z<G0> H70(boolean z12) {
        return a().nb(z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024c  */
    @Override // com.avito.android.advert_core.contactbar.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LW(@Y61.l com.avito.android.remote.model.advert_details.ContactBarData r19, @Y61.k java.util.List r20, @Y61.k java.util.List r21, @Y61.l java.util.LinkedHashMap r22, @Y61.l com.avito.android.component.advert_contact_bar.ContactBar.b r23, @Y61.k Y41.p r24, @Y61.k Y41.l r25, @Y61.k com.avito.android.advert_core.contactbar.C28266e.h r26) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.contactbar.A.LW(com.avito.android.remote.model.advert_details.ContactBarData, java.util.List, java.util.List, java.util.LinkedHashMap, com.avito.android.component.advert_contact_bar.ContactBar$b, Y41.p, Y41.l, com.avito.android.advert_core.contactbar.e$h):void");
    }

    @Override // com.avito.android.advert_core.contactbar.w
    /* renamed from: Q1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF83108j() {
        return this.f83108j;
    }

    @Override // com.avito.android.advert_core.contactbar.w
    public final void W6(boolean z12, boolean z13, boolean z14) {
        a().W6(z12, z13, z14);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final ContactBar a() {
        return (ContactBar) this.f83109k.getValue();
    }

    public final void b(boolean z12) {
        a().T2(z12);
    }

    public final void c() {
        a().show();
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(@Y61.l ViewStub viewStub, @Y61.k View view) {
        this.f83104f = view;
    }

    @Override // com.avito.android.advert_core.contactbar.w
    public final void op(@Y61.k String str, @Y61.k String str2, @Y61.k SellerOnlineStatus sellerOnlineStatus) {
        if (this.f83105g) {
            return;
        }
        a().sb(str, str2, sellerOnlineStatus.isOnline() ? this.f83103e.getString(R.string.advert_core_advert_contact_bar_online) : sellerOnlineStatus.getReplySpeed(), sellerOnlineStatus.isOnline(), this.f83106h, this.f83107i);
    }

    @Override // com.avito.android.advert_core.contactbar.w
    public final int va() {
        return a().va();
    }
}
