package com.avito.android.comfortable_deal.end_deal;

import Hp.InterfaceC14016a;
import androidx.compose.ui.platform.InterfaceC22489j2;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EndDealScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.comfortable_deal.end_deal.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29488s extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14016a, G0> f122367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.Q<String, EndDealField> f122368m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f122369n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29488s(Y41.l<? super InterfaceC14016a, G0> lVar, kotlin.Q<String, ? extends EndDealField> q12, InterfaceC22489j2 interfaceC22489j2) {
        super(1);
        this.f122367l = lVar;
        this.f122368m = q12;
        this.f122369n = interfaceC22489j2;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f122367l.invoke(new InterfaceC14016a.g(this.f122368m.f406619b, str));
        InterfaceC22489j2 interfaceC22489j2 = this.f122369n;
        if (interfaceC22489j2 != null) {
            interfaceC22489j2.hide();
        }
        return G0.f406611a;
    }
}
