package ru.rustore.sdk.pushclient.internal.arbiter;

import Qa1.j;
import Qa1.n;
import Qa1.p;
import T11.c;
import T11.f;
import Y61.k;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cb1.C27166e;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/pushclient/internal/arbiter/ArbiterBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes9.dex */
public final class ArbiterBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f436827a = C42727D.c(new a());

    public static final class a extends N implements Y41.a<f> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final f invoke() {
            ArbiterBroadcastReceiver arbiterBroadcastReceiver = ArbiterBroadcastReceiver.this;
            p pVar = C27166e.f57981b;
            return (pVar != null ? pVar.f13854c : new c("VkpnsClientSdk")).c(arbiterBroadcastReceiver);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@l Context context, @l Intent intent) {
        j jVar;
        ((f) this.f436827a.getValue()).info("Master update broadcast received");
        String action = intent != null ? intent.getAction() : null;
        if (action == null || action.hashCode() != 1854594276 || !action.equals("com.vk.push.ACTION_MASTER_HOST_UPDATE") || (jVar = j.f13811r) == null) {
            return;
        }
        jVar.f13813b.info("Update master");
        C43259k.d(jVar.f13826o, null, null, new n(jVar, null), 3);
    }
}
