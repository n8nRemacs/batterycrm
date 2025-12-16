package ru.avito.messenger.internal.gson.adapter;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.C30277e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k91.AbstractC42547e;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l91.C43607c;
import mx0.c;
import ru.avito.messenger.internal.util.InlineRuntimeTypeAdapter;

/* compiled from: SystemMessageTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/SystemMessageTypeAdapter;", "Lru/avito/messenger/internal/util/InlineRuntimeTypeAdapter;", "Lk91/e;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SystemMessageTypeAdapter extends InlineRuntimeTypeAdapter<AbstractC42547e> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Map<C43607c, Class<? extends Object>> f431709f;

    /* compiled from: SystemMessageTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll91/c;", "typeId", "Lcom/google/gson/k;", "<anonymous parameter 1>", "Lk91/e;", "invoke", "(Ll91/c;Lcom/google/gson/k;)Lk91/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<C43607c, com.google.gson.k, AbstractC42547e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f431710l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC42547e invoke(C43607c c43607c, com.google.gson.k kVar) {
            C43607c c43607c2 = c43607c;
            return new AbstractC42547e.t(c43607c2.f413572a, c43607c2.f413573b);
        }
    }

    public SystemMessageTypeAdapter(@k Set<c> set, @l C30277e1 c30277e1) {
        Map<C43607c, Class<? extends Object>> mapP;
        super(null, a.f431710l, c30277e1, 1, null);
        Map mapG = P0.g(new Q(new C43607c("session", null, 2, null), AbstractC42547e.r.class), new Q(new C43607c("Message", null, 2, null), AbstractC42547e.l.class), new Q(new C43607c("MessageUpdate", null, 2, null), AbstractC42547e.n.class), new Q(new C43607c("ChatRead", null, 2, null), AbstractC42547e.h.class), new Q(new C43607c("ChatUnread", null, 2, null), AbstractC42547e.k.class), new Q(new C43607c("ChatPinned", null, 2, null), AbstractC42547e.g.class), new Q(new C43607c("ChatUnpinned", null, 2, null), AbstractC42547e.j.class), new Q(new C43607c("ChatClear", null, 2, null), AbstractC42547e.f.class), new Q(new C43607c("MessagesRead", null, 2, null), AbstractC42547e.m.class), new Q(new C43607c("Blacklist", null, 2, null), AbstractC42547e.b.class), new Q(new C43607c("BlacklistRemove", null, 2, null), AbstractC42547e.c.class), new Q(new C43607c("messenger.VideoUpdated", null, 2, null), AbstractC42547e.u.class), new Q(new C43607c("messenger.UpdateChannelCustomTag", null, 2, null), AbstractC42547e.d.class), new Q(new C43607c("messenger.MessagesMarkedAsSpam", null, 2, null), AbstractC42547e.o.class), new Q(new C43607c("messenger.MessagesUnmarkedAsSpam", null, 2, null), AbstractC42547e.p.class), new Q(new C43607c("ChatTyping", null, 2, null), AbstractC42547e.i.class), new Q(new C43607c("ChannelsUpdate", null, 2, null), AbstractC42547e.C11605e.class), new Q(new C43607c("OptionsUpdate", null, 2, null), AbstractC42547e.q.class), new Q(new C43607c("Batch", null, 2, null), AbstractC42547e.a.class), new Q(new C43607c("Voip", null, 2, null), AbstractC42547e.v.class));
        Set<c> set2 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Q(new C43607c(((c) it.next()).f414831b.f414833a, null, 2, null), AbstractC42547e.s.class));
        }
        if (mapG.isEmpty()) {
            mapP = P0.p(arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapG);
            P0.m(linkedHashMap, arrayList);
            mapP = linkedHashMap;
        }
        this.f431709f = mapP;
    }

    @Override // ru.avito.messenger.internal.util.RuntimeTypeAdapter
    @k
    public final Map<C43607c, Class<? extends Object>> b() {
        return this.f431709f;
    }
}
