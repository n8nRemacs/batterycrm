package com.avito.android.bxcontent;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.anonymous_number_dialog.k;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: BxContentPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class I0 extends kotlin.jvm.internal.N implements Y41.l<C43501a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29253t0 f109346l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(C29253t0 c29253t0) {
        super(1);
        this.f109346l = c29253t0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C43501a c43501a) {
        String string;
        C43501a c43501a2 = c43501a;
        C29253t0 c29253t0 = this.f109346l;
        c29253t0.getClass();
        Bundle bundle = c43501a2.f413260a.f134522c;
        if (bundle != null && (string = bundle.getString("key_advert_id")) != null) {
            String string2 = bundle.getString("key_call_context");
            k.b bVar = k.b.f91298b;
            InterfaceC14249c interfaceC14249c = c43501a2.f413261b;
            if (kotlin.jvm.internal.L.f(interfaceC14249c, bVar)) {
                c29253t0.f112931B.d(string, string2);
                C29235n c29235n = c29253t0.f112947R;
                if (c29235n != null) {
                    c29235n.accept(new InterfaceC29127b.L(null));
                }
            } else if (kotlin.jvm.internal.L.f(interfaceC14249c, k.a.f91297b)) {
                C29235n c29235n2 = c29253t0.f112947R;
                if (c29235n2 != null) {
                    c29235n2.accept(new InterfaceC29127b.L(null));
                }
            } else if (kotlin.jvm.internal.L.f(interfaceC14249c, AbstractC14250d.c.f9171c)) {
                C29235n c29235n3 = c29253t0.f112947R;
                if (c29235n3 != null) {
                    c29235n3.accept(new InterfaceC29127b.L(null));
                }
                com.avito.android.bxcontent.call.a aVar = c29253t0.f112969o;
                aVar.f109646c = string;
                aVar.f109647d = System.currentTimeMillis();
            } else if (!(interfaceC14249c instanceof InterfaceC14249c.a)) {
                boolean z12 = interfaceC14249c instanceof InterfaceC14249c.b;
            }
        }
        return kotlin.G0.f406611a;
    }
}
