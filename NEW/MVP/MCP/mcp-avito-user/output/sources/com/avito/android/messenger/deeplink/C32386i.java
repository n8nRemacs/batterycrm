package com.avito.android.messenger.deeplink;

import com.avito.android.R;
import kotlin.Metadata;
import yk0.C50261a;

/* compiled from: ChannelCallDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyk0/a;", "result", "Lkotlin/G0;", "accept", "(Lyk0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.deeplink.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32386i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32402q f195515b;

    public C32386i(C32402q c32402q) {
        this.f195515b = c32402q;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String phone = ((C50261a) obj).getPhone();
        C32402q c32402q = this.f195515b;
        c32402q.f195550n = phone;
        c32402q.f195542f.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new C32400p(c32402q, phone));
    }
}
