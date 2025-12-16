package com.avito.android.comfortable_deal_invite.lead;

import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ComfortableDealInviteScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "offset", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class x extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f123739l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f123740m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Y41.l lVar, C22602e c22602e) {
        super(1);
        this.f123739l = c22602e;
        this.f123740m = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        String str;
        int iIntValue = num.intValue();
        C22602e.C1684e c1684e = (C22602e.C1684e) C42745f0.G(this.f123739l.c(iIntValue, iIntValue, "CLICKABLE_TAG"));
        if (c1684e != null && (str = (String) c1684e.f42138a) != null) {
            this.f123740m.invoke(str);
        }
        return G0.f406611a;
    }
}
