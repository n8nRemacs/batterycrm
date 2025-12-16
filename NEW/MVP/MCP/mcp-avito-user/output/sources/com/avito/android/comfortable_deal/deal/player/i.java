package com.avito.android.comfortable_deal.deal.player;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.H;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.z;
import androidx.media3.datasource.okhttp.c;
import androidx.media3.exoplayer.C;
import androidx.media3.exoplayer.C23145n;
import androidx.media3.exoplayer.InterfaceC23144m;
import androidx.media3.exoplayer.source.C23161l;
import androidx.media3.extractor.C23192k;
import aq.InterfaceC23651a;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.OkHttpClient;

/* compiled from: AudioPlayerHolderImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/player/i;", "Laq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@J
/* loaded from: classes12.dex */
public final class i implements InterfaceC23651a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f121778a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final OkHttpClient f121779b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f121780c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f121781d = C42727D.c(new a());

    /* compiled from: AudioPlayerHolderImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/media3/exoplayer/m;", "invoke", "()Landroidx/media3/exoplayer/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<InterfaceC23144m> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC23144m invoke() {
            i iVar = i.this;
            c.a aVar = new c.a(iVar.f121779b);
            Context applicationContext = iVar.f121778a.getApplicationContext();
            InterfaceC23144m.c cVar = new InterfaceC23144m.c(applicationContext, new C23145n(applicationContext, 1), new C23145n(applicationContext, 2));
            C23161l c23161l = new C23161l(aVar, new C23192k());
            C23110a.g(!cVar.f49243v);
            cVar.f49225d = new C(c23161l, 1);
            return cVar.a();
        }
    }

    @Inject
    public i(@Y61.k Context context, @Y61.k OkHttpClient okHttpClient) {
        this.f121778a = context;
        this.f121779b = okHttpClient;
    }

    @Override // aq.InterfaceC23651a
    @Y61.k
    public final InterfaceC23144m a() {
        return c();
    }

    @Override // aq.InterfaceC23651a
    public final void b(@Y61.k String str) {
        LinkedHashMap linkedHashMap = this.f121780c;
        if (linkedHashMap.get(str) != null) {
            c().E((H.g) linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
    }

    public final InterfaceC23144m c() {
        return (InterfaceC23144m) this.f121781d.getValue();
    }

    @Override // aq.InterfaceC23651a
    public final void e(@Y61.k Y41.l<? super InterfaceC23144m, G0> lVar) {
        lVar.invoke(c());
    }

    @Override // aq.InterfaceC23651a
    public final void f(@Y61.k z zVar) {
        c().f(zVar);
        c().prepare();
    }

    @Override // aq.InterfaceC23651a
    public final void g(@Y61.k String str, @Y61.k Y41.a<? extends H.g> aVar) {
        H.g gVarInvoke = aVar.invoke();
        b(str);
        this.f121780c.put(str, gVarInvoke);
        c().F(gVarInvoke);
    }

    @Override // aq.InterfaceC23651a
    public final void h(float f12) {
        c().setPlaybackSpeed(f12);
    }

    @Override // aq.InterfaceC23651a
    public final void pause() {
        c().pause();
    }

    @Override // aq.InterfaceC23651a
    public final void play() {
        c().play();
    }

    @Override // aq.InterfaceC23651a
    public final void seekTo(long j12) {
        c().seekTo(j12);
    }
}
