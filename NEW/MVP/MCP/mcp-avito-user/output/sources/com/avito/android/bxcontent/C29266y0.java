package com.avito.android.bxcontent;

import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.deep_linking.links.PhoneLink;
import kotlin.Metadata;

/* compiled from: BxContentPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.y0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29266y0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29253t0 f113249l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f113250m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f113251n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PhoneLink f113252o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29266y0(C29253t0 c29253t0, String str, String str2, PhoneLink phoneLink) {
        super(0);
        this.f113249l = c29253t0;
        this.f113250m = str;
        this.f113251n = str2;
        this.f113252o = phoneLink;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C29253t0 c29253t0 = this.f113249l;
        C29235n c29235n = c29253t0.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.L(null));
        }
        com.avito.android.bxcontent.analytics.a aVar = c29253t0.f112931B;
        String str = this.f113250m;
        String str2 = this.f113251n;
        aVar.d(str, str2);
        c29253t0.J(this.f113252o, str, str2);
        return kotlin.G0.f406611a;
    }
}
