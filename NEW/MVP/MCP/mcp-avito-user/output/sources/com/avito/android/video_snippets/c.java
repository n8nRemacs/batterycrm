package com.avito.android.video_snippets;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.View;
import com.avito.android.video_snippets.g;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VideoSnippetsQueueControllerImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_snippets/c;", "Lcom/avito/android/video_snippets/g;", "_avito_video-snippets_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J80.b f326069a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.player_holder.a f326070b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f326071c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HashSet f326072d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final O f326073e = new O.c().a();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinkedHashMap f326074f = new LinkedHashMap();

    /* compiled from: VideoSnippetsQueueControllerImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/video_snippets/c$a", "Lcom/google/android/exoplayer2/analytics/b;", "_avito_video-snippets_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.google.android.exoplayer2.analytics.b {
        public a() {
        }

        @Override // com.google.android.exoplayer2.analytics.b
        public final void ZT(@k b.C10568b c10568b, int i12) {
            c.this.f326069a.e(i12);
        }
    }

    /* compiled from: VideoSnippetsQueueControllerImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/exoplayer2/o;", "Lkotlin/G0;", "invoke", "(Lcom/google/android/exoplayer2/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<InterfaceC36534o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g.c f326076l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f326077m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g.c cVar, c cVar2) {
            super(1);
            this.f326076l = cVar;
            this.f326077m = cVar2;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC36534o interfaceC36534o) {
            InterfaceC36534o interfaceC36534o2 = interfaceC36534o;
            g.c cVar = this.f326076l;
            interfaceC36534o2.setVolume(cVar.f326093g);
            interfaceC36534o2.setRepeatMode(this.f326077m.f326071c.entrySet().size() > 1 ? 0 : cVar.f326094h);
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k J80.b bVar, @k com.avito.android.player_holder.a aVar) {
        this.f326069a = bVar;
        this.f326070b = aVar;
    }

    @Override // com.avito.android.video_snippets.g
    public final void a(@k String str) {
        this.f326069a.a(str);
    }

    @Override // com.avito.android.video_snippets.g
    public final void b(@k String str, boolean z12, @k SimpleDraweeView simpleDraweeView, @Y61.l l41.g<com.avito.android.video_snippets.b> gVar) {
        com.avito.android.player_holder.a aVar = this.f326070b;
        aVar.t(str, new f(z12, aVar.J(), simpleDraweeView, this, gVar));
        aVar.x("video_snippet_listener", new a());
    }

    @Override // com.avito.android.video_snippets.g
    public final void c(@k String str) {
        this.f326070b.c(str);
        this.f326071c.remove(str);
        this.f326072d.remove(str);
    }

    @Override // com.avito.android.video_snippets.g
    @Y61.l
    public final Map.Entry<String, g.c> d() {
        g.c value;
        StyledPlayerView styledPlayerView;
        d0 player;
        g.c value2;
        StyledPlayerView styledPlayerView2;
        d0 player2;
        Map.Entry<String, g.c> entry = (Map.Entry) C42745f0.F(this.f326071c.entrySet());
        if (entry != null && (value2 = entry.getValue()) != null && (styledPlayerView2 = value2.f326090d) != null && (player2 = styledPlayerView2.getPlayer()) != null && player2.getPlaybackState() == 2) {
            return entry;
        }
        if (entry == null || (value = entry.getValue()) == null || (styledPlayerView = value.f326090d) == null || (player = styledPlayerView.getPlayer()) == null || player.getPlaybackState() != 3) {
            return null;
        }
        return entry;
    }

    @Override // com.avito.android.video_snippets.g
    public final void e(@k HashMap map, @k String str, @Y61.l View view) {
        LinkedHashMap linkedHashMap;
        com.avito.android.player_holder.a aVar;
        Map.Entry<String, g.c> entryD = d();
        HashSet hashSet = this.f326072d;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (map.get(it.next()) == null) {
                it.remove();
            }
        }
        Iterator it2 = map.entrySet().iterator();
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            boolean zHasNext = it2.hasNext();
            linkedHashMap = this.f326071c;
            aVar = this.f326070b;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            g.c cVar = (g.c) linkedHashMap.get(entry.getKey());
            if (cVar == null && !hashSet.contains(entry.getKey())) {
                if (entryD == null) {
                    z13 = true;
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (cVar != null && !L.f(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
                if (L.f(entry.getKey(), entryD != null ? entryD.getKey() : null) || entryD == null) {
                    aVar.G();
                    z14 = true;
                }
            }
        }
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            if (map.get(entry2.getKey()) == null) {
                if (L.f(entryD != null ? entryD.getKey() : null, entry2.getKey())) {
                    aVar.G();
                    z12 = true;
                }
                it3.remove();
            }
        }
        if (z12 || z13 || z14) {
            aVar.v(str);
            if (view != null) {
                view.post(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 4));
            } else {
                j();
            }
        }
    }

    @Override // com.avito.android.video_snippets.g
    @k
    /* renamed from: f, reason: from getter */
    public final LinkedHashMap getF326071c() {
        return this.f326071c;
    }

    @Override // com.avito.android.video_snippets.g
    public final void g() {
        this.f326070b.y();
        this.f326071c.clear();
        this.f326074f.clear();
        this.f326072d.clear();
    }

    @Override // com.avito.android.video_snippets.g
    public final synchronized void h(boolean z12) {
        g.c value;
        String key;
        if (!z12) {
            try {
                J80.b bVar = this.f326069a;
                Map.Entry<String, g.c> entryI = i();
                Integer numValueOf = null;
                String key2 = entryI != null ? entryI.getKey() : null;
                String f220326i = this.f326070b.getF220326i();
                Map.Entry<String, g.c> entryI2 = i();
                if (entryI2 != null && (value = entryI2.getValue()) != null) {
                    numValueOf = Integer.valueOf(value.f326089c);
                }
                bVar.f(numValueOf, key2, f220326i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Map.Entry<String, g.c> entryI3 = i();
        if (entryI3 != null && (key = entryI3.getKey()) != null) {
            this.f326071c.remove(key);
            this.f326072d.add(key);
        }
        j();
    }

    public final Map.Entry<String, g.c> i() {
        return (Map.Entry) C42745f0.F(this.f326071c.entrySet());
    }

    public final void j() {
        Map.Entry<String, g.c> entryI = i();
        if (entryI == null) {
            return;
        }
        String key = entryI.getKey();
        g.c value = entryI.getValue();
        StyledPlayerView styledPlayerView = value.f326090d;
        com.avito.android.player_holder.a aVar = this.f326070b;
        aVar.G();
        aVar.w(styledPlayerView);
        aVar.B(new b(value, this));
        LinkedHashMap linkedHashMap = this.f326074f;
        O oA2 = (O) linkedHashMap.get(key);
        if (oA2 == null) {
            O o12 = this.f326073e;
            o12.getClass();
            O.c cVar = new O.c(o12, null);
            String str = value.f326088b;
            cVar.f343535b = str != null ? Uri.parse(str) : null;
            oA2 = cVar.a();
            linkedHashMap.put(key, oA2);
        }
        aVar.z(oA2, value.f326096j);
        aVar.D(key);
        Long l12 = value.f326092f;
        aVar.I(l12 != null ? l12.longValue() : 0L);
        aVar.C();
    }
}
