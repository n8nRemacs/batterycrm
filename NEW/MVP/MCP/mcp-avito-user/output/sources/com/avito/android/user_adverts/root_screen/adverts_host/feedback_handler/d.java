package com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler;

import Y61.k;
import androidx.view.C22977J;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;

/* compiled from: FeedbackHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/d;", "LSK0/d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements SK0.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f312666b;

    public d(b bVar) {
        this.f312666b = bVar;
    }

    @Override // SK0.d
    public final void W2(@k String str) {
        int i12 = b.f312652e;
        b bVar = this.f312666b;
        C22977J c22977j = bVar.f312654b;
        if (U.e(c22977j)) {
            C43259k.d(c22977j, null, null, new f(bVar, str, null), 3);
        }
    }

    @Override // SK0.d
    public final void v5(@k String str) {
        b bVar = this.f312666b;
        if (U.e(bVar.f312654b)) {
            C43259k.d(bVar.f312654b, null, null, new g(bVar, str, null), 3);
        }
    }

    @Override // SK0.d
    public final void Od(@k String str) {
    }

    @Override // SK0.d
    public final void ha(@k String str) {
    }
}
