package com.avito.android.service_order_widget.link;

import Y41.p;
import com.avito.android.service_order_widget.link.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: SendServiceOrderRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f278993l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SendServiceOrderRequestWithPhotoLink f278994m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f278995n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p<b.a, Continuation<? super G0>, Object> f278996o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(b bVar, SendServiceOrderRequestWithPhotoLink sendServiceOrderRequestWithPhotoLink, String str, p<? super b.a, ? super Continuation<? super G0>, ? extends Object> pVar) {
        super(0);
        this.f278993l = bVar;
        this.f278994m = sendServiceOrderRequestWithPhotoLink;
        this.f278995n = str;
        this.f278996o = pVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f278993l;
        C43259k.d(bVar.f278961o, null, null, new h(bVar, this.f278994m, this.f278995n, this.f278996o, null), 3);
        return G0.f406611a;
    }
}
