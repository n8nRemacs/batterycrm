package com.avito.android.deeplink_handler.view;

import Y61.l;
import android.content.Intent;
import androidx.appcompat.app.m;
import androidx.fragment.app.Fragment;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.deeplink_handler.view.impl.h;
import com.avito.android.deeplink_handler.view.impl.i;
import com.avito.android.deeplink_handler.view.impl.k;
import com.avito.android.notificationdeeplink.NotificationDeepLinkActivity;
import kotlin.Metadata;

/* compiled from: DeeplinkViewBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/d;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: DeeplinkViewBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(d dVar, m mVar, i iVar, NotificationDeepLinkActivity.b bVar, int i12) {
            if ((i12 & 2) != 0) {
                iVar = new i(mVar);
            }
            i iVar2 = iVar;
            k kVar = new k(mVar, null, 2, false ? 1 : 0);
            h hVar = new h(mVar);
            a.InterfaceC4053a c4058a = bVar;
            if ((i12 & 16) != 0) {
                c4058a = new a.C4058a(mVar);
            }
            dVar.c(mVar, iVar2, kVar, hVar, c4058a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(d dVar, Fragment fragment, i iVar, int i12) {
            int i13 = 2;
            if ((i12 & 2) != 0) {
                iVar = new i(fragment.requireActivity());
            }
            dVar.b(fragment, iVar, new k(fragment.requireActivity(), null, i13, 0 == true ? 1 : 0), new h(fragment.requireActivity()), new d.a(fragment));
        }
    }

    void a(int i12, int i13, @l Intent intent);

    void b(@Y61.k Fragment fragment, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k h hVar, @Y61.k a.InterfaceC4053a interfaceC4053a);

    void c(@Y61.k m mVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k h hVar, @Y61.k a.InterfaceC4053a interfaceC4053a);
}
