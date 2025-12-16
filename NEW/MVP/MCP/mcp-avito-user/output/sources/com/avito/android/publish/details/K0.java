package com.avito.android.publish.details;

import com.avito.android.intermediary_verification.deeplink.d;
import com.avito.android.publish.C33864h0;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class K0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f232959b;

    public K0(PublishDetailsFragment publishDetailsFragment) {
        this.f232959b = publishDetailsFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C43501a c43501a = (C43501a) obj;
        PublishDetailsFragment publishDetailsFragment = this.f232959b;
        D6.w(publishDetailsFragment.getView());
        InterfaceC33746e0 interfaceC33746e0 = publishDetailsFragment.f233127f1;
        if (interfaceC33746e0 == null) {
            interfaceC33746e0 = null;
        }
        interfaceC33746e0.e();
        com.avito.android.intermediary_verification.deeplink.d dVar = (com.avito.android.intermediary_verification.deeplink.d) c43501a.f413261b;
        if (dVar instanceof d.a) {
            com.avito.android.publish.C0 c02 = publishDetailsFragment.f233129h1;
            (c02 != null ? c02 : null).ye();
            return;
        }
        if (dVar instanceof d.b) {
            C33864h0 c33864h0 = publishDetailsFragment.f233122a1;
            if (c33864h0 == null) {
                c33864h0 = null;
            }
            c33864h0.g(null, true);
            publishDetailsFragment.E0();
            return;
        }
        if (dVar.equals(d.c.f173130b)) {
            com.avito.android.publish.C0 c03 = publishDetailsFragment.f233129h1;
            if (c03 == null) {
                c03 = null;
            }
            c03.ye();
            com.avito.android.publish.C0 c04 = publishDetailsFragment.f233129h1;
            if (c04 == null) {
                c04 = null;
            }
            c04.xe(null);
        }
    }
}
