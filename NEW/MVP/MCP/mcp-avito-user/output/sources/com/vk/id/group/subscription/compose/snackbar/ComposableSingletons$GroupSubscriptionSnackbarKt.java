package com.vk.id.group.subscription.compose.snackbar;

import Y41.p;
import Y61.k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupSubscriptionSnackbar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$GroupSubscriptionSnackbarKt {

    @k
    public static final ComposableSingletons$GroupSubscriptionSnackbarKt INSTANCE = new ComposableSingletons$GroupSubscriptionSnackbarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    public static p<A, Integer, G0> f22lambda1 = new C22096n(-1035473237, new p<A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.snackbar.ComposableSingletons$GroupSubscriptionSnackbarKt$lambda-1$1
        @Override // Y41.p
        public /* bridge */ /* synthetic */ G0 invoke(A a12, Integer num) {
            invoke(a12, num.intValue());
            return G0.f406611a;
        }

        @InterfaceC22132o
        @InterfaceC22181t
        public final void invoke(A a12, int i12) {
            if ((i12 & 3) == 2 && a12.c()) {
                a12.f();
            } else {
                h.a aVar = h.f42849c;
                C20608p2.a(a12, C20588k2.f(v.f42878y1, 56));
            }
        }
    }, false);

    @k
    /* renamed from: getLambda-1$group_subscription_compose_release, reason: not valid java name */
    public final p<A, Integer, G0> m117getLambda1$group_subscription_compose_release() {
        return f22lambda1;
    }
}
