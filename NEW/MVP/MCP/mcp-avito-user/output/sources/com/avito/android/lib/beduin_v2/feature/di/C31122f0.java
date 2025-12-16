package com.avito.android.lib.beduin_v2.feature.di;

import HU0.b;
import LU0.b;
import MU0.b;
import NU0.b;
import com.avito.beduin.v2.interaction.delay.flow.b;
import com.avito.beduin.v2.interaction.delegate.flow.b;
import com.avito.beduin.v2.interaction.detached.flow.g;
import com.avito.beduin.v2.interaction.detached.flow.modal.r;
import com.avito.beduin.v2.interaction.flow.file_picker.flow.i;
import com.avito.beduin.v2.interaction.launch.flow.c;
import com.avito.beduin.v2.interaction.mutate.flow.b;
import com.avito.beduin.v2.interaction.mutate.flow.h;
import com.avito.beduin.v2.interaction.mutate.flow.i;
import com.avito.beduin.v2.interaction.navigation.flow.l;
import com.avito.beduin.v2.interaction.network.flow.a;
import com.avito.beduin.v2.interaction.network.flow.g;
import com.avito.beduin.v2.interaction.network.flow.m;
import com.avito.beduin.v2.interaction.postmessage.flow.c;
import com.avito.beduin.v2.interaction.sequence.flow.SequenceInteraction;
import com.avito.beduin.v2.interaction.status_bar.flow.c;
import dU0.g;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pU0.C47005b;
import uU0.C48951a;

/* compiled from: BeduinFeatureModule_ProvideInteractionsRegistryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/f0;", "Ldagger/internal/h;", "LdU0/g;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.f0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31122f0 implements dagger.internal.h<dU0.g> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176098c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f176099a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f176100b;

    /* compiled from: BeduinFeatureModule_ProvideInteractionsRegistryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/f0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.f0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31122f0(@Y61.k dagger.internal.A a12, @Y61.k dagger.internal.A a13) {
        this.f176099a = a12;
        this.f176100b = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f176099a.get();
        Set set2 = (Set) this.f176100b.get();
        f176098c.getClass();
        L.f176033a.getClass();
        C47005b.f428548a.getClass();
        g.a aVar = new g.a();
        aVar.a(b.a.f10693b);
        aVar.a(b.a.f337280b);
        aVar.a(b.a.f337290b);
        aVar.a(i.b.f337485b);
        aVar.a(b.a.f337473b);
        aVar.a(h.a.f337482b);
        aVar.a(SequenceInteraction.a.f337843b);
        aVar.a(b.a.f9967b);
        aVar.a(i.a.f337415b);
        aVar.a(com.avito.beduin.v2.interaction.flow.keyboard.b.f337432b);
        aVar.a(com.avito.beduin.v2.interaction.flow.keyboard.h.f337437b);
        aVar.a(a.C10458a.f337582b);
        aVar.a(g.a.f337631b);
        aVar.a(m.a.f337682b);
        aVar.a(b.a.f11534b);
        aVar.a(com.avito.beduin.v2.interaction.navigation.flow.g.f337526b);
        aVar.a(com.avito.beduin.v2.interaction.navigation.flow.c.f337517b);
        aVar.a(com.avito.beduin.v2.interaction.navigation.flow.B.f337497b);
        aVar.a(c.a.f337451b);
        aVar.a(com.avito.beduin.v2.interaction.navigation.flow.w.f337555b);
        aVar.a(g.a.f337330b);
        aVar.a(C48951a.C12718a.f439977b);
        aVar.a(com.avito.beduin.v2.interaction.analytics.flow.e.f337263b);
        aVar.a(com.avito.beduin.v2.interaction.copy.flow.c.f337271b);
        aVar.a(com.avito.beduin.v2.interaction.exception.flow.e.f337401b);
        aVar.a(com.avito.beduin.v2.interaction.scroll_to.flow.b.f337825b);
        aVar.a(b.a.f7098b);
        aVar.a(com.avito.beduin.v2.interaction.openlink.flow.c.f337707b);
        aVar.a(l.a.f337536b);
        aVar.a(c.a.f337860b);
        aVar.a(c.a.f337717b);
        aVar.a(r.a.f337379b);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.a((dU0.c) it.next());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            aVar.a((dU0.c) it2.next());
        }
        return new dU0.g(kotlin.collections.P0.q(aVar.f393894a), null);
    }
}
