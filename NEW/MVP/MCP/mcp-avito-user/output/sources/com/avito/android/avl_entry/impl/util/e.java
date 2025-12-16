package com.avito.android.avl_entry.impl.util;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.util.V2;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VideoPlayerController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e;", "Lcom/avito/android/avl_entry/impl/util/d;", "a", "b", "c", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.avl_entry.impl.util.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.player_holder.a f98617a;

    /* renamed from: c, reason: collision with root package name */
    @l
    public StyledPlayerView f98619c;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f98618b = new c();

    /* renamed from: d, reason: collision with root package name */
    public int f98620d = -1;

    /* compiled from: VideoPlayerController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$a;", "", "<init>", "()V", "", "PLAYER_LISTENER_KEY", "Ljava/lang/String;", "READY_LISTENER_KEY", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VideoPlayerController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$b;", "", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: VideoPlayerController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$c;", "Lcom/google/android/exoplayer2/d0$g;", "<init>", "()V", "a", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements d0.g {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.jakewharton.rxrelay3.c<a> f98621b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.jakewharton.rxrelay3.c f98622c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f98623d;

        /* compiled from: VideoPlayerController.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$c$a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/avl_entry/impl/util/e$c$a$a;", "Lcom/avito/android/avl_entry/impl/util/e$c$a$b;", "Lcom/avito/android/avl_entry/impl/util/e$c$a$c;", "Lcom/avito/android/avl_entry/impl/util/e$c$a$d;", "Lcom/avito/android/avl_entry/impl/util/e$c$a$e;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {

            /* compiled from: VideoPlayerController.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$c$a$a;", "Lcom/avito/android/avl_entry/impl/util/e$c$a;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.avl_entry.impl.util.e$c$a$a, reason: collision with other inner class name */
            public static final /* data */ class C2961a implements a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final C2961a f98624a = new C2961a();

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof C2961a);
                }

                public final int hashCode() {
                    return -1150630802;
                }

                @k
                public final String toString() {
                    return "Buffering";
                }
            }

            /* compiled from: VideoPlayerController.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$c$a$b;", "Lcom/avito/android/avl_entry/impl/util/e$c$a;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b implements a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final b f98625a = new b();

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1171310202;
                }

                @k
                public final String toString() {
                    return "Ended";
                }
            }

            /* compiled from: VideoPlayerController.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$c$a$c;", "Lcom/avito/android/avl_entry/impl/util/e$c$a;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.avl_entry.impl.util.e$c$a$c, reason: collision with other inner class name */
            public static final /* data */ class C2962c implements a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f98626a;

                public C2962c(@k String str) {
                    this.f98626a = str;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2962c) && L.f(this.f98626a, ((C2962c) obj).f98626a);
                }

                public final int hashCode() {
                    return this.f98626a.hashCode();
                }

                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Error(error="), this.f98626a, ')');
                }
            }

            /* compiled from: VideoPlayerController.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$c$a$d;", "Lcom/avito/android/avl_entry/impl/util/e$c$a;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class d implements a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final d f98627a = new d();

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return -843300148;
                }

                @k
                public final String toString() {
                    return "FinishedMediaItemPlayback";
                }
            }

            /* compiled from: VideoPlayerController.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/e$c$a$e;", "Lcom/avito/android/avl_entry/impl/util/e$c$a;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.avl_entry.impl.util.e$c$a$e, reason: collision with other inner class name */
            public static final /* data */ class C2963e implements a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final C2963e f98628a = new C2963e();

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof C2963e);
                }

                public final int hashCode() {
                    return -1159575441;
                }

                @k
                public final String toString() {
                    return "Ready";
                }
            }
        }

        public c() {
            com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
            this.f98621b = cVar;
            this.f98622c = cVar;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayWhenReadyChanged(boolean z12, int i12) {
            if (i12 != 5 || this.f98623d) {
                return;
            }
            this.f98621b.accept(a.d.f98627a);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackStateChanged(int i12) {
            com.jakewharton.rxrelay3.c<a> cVar = this.f98621b;
            if (i12 == 2) {
                cVar.accept(a.C2961a.f98624a);
            } else if (i12 == 3) {
                cVar.accept(a.C2963e.f98628a);
            } else {
                if (i12 != 4) {
                    return;
                }
                cVar.accept(a.b.f98625a);
            }
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayerError(@k PlaybackException playbackException) {
            String message = playbackException.getMessage();
            if (message == null) {
                message = "";
            }
            this.f98621b.accept(new a.C2962c(message.concat(playbackException.a())));
        }
    }

    /* compiled from: VideoPlayerController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/exoplayer2/d0$g;", "invoke", "()Lcom/google/android/exoplayer2/d0$g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<d0.g> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final d0.g invoke() {
            return e.this.f98618b;
        }
    }

    /* compiled from: VideoPlayerController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.avl_entry.impl.util.e$e, reason: collision with other inner class name */
    public static final class C2964e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f98631m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2964e(int i12) {
            super(0);
            this.f98631m = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = this.f98631m;
            e eVar = e.this;
            try {
                eVar.f98617a.f(i12, 0L);
                eVar.f98620d = i12;
            } catch (IllegalSeekPositionException e12) {
                V2.f318762a.f(e12);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VideoPlayerController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/exoplayer2/d0$g;", "invoke", "()Lcom/google/android/exoplayer2/d0$g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<d0.g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f98632l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g gVar) {
            super(0);
            this.f98632l = gVar;
        }

        @Override // Y41.a
        public final d0.g invoke() {
            return this.f98632l;
        }
    }

    /* compiled from: VideoPlayerController.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/avl_entry/impl/util/e$g", "Lcom/google/android/exoplayer2/d0$g;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements d0.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f98633b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f98634c;

        public g(Y41.a<G0> aVar, e eVar) {
            this.f98633b = aVar;
            this.f98634c = eVar;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackStateChanged(int i12) {
            if (i12 == 3) {
                this.f98633b.invoke();
                this.f98634c.f98617a.b("ready_listener");
            }
        }
    }

    static {
        new a(null);
    }

    public e(@k com.avito.android.player_holder.a aVar) {
        this.f98617a = aVar;
    }

    @Override // com.avito.android.avl_entry.impl.util.d
    public final void d(@k ArrayList arrayList) {
        com.avito.android.player_holder.a aVar = this.f98617a;
        aVar.d(arrayList);
        aVar.e(com.avito.android.avl_entry.impl.util.f.f98635l);
        aVar.g("player_listener", new com.avito.android.avl_entry.impl.util.g(this));
    }

    @Override // com.avito.android.avl_entry.impl.util.d
    public final void e() {
        com.avito.android.player_holder.a aVar = this.f98617a;
        aVar.b("player_listener");
        StyledPlayerView styledPlayerView = this.f98619c;
        if (styledPlayerView != null) {
            aVar.u(styledPlayerView);
        }
        StyledPlayerView styledPlayerView2 = this.f98619c;
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(null);
        }
        this.f98619c = null;
    }

    @Override // com.avito.android.avl_entry.impl.util.d
    public final void f(int i12, @k Y41.a<G0> aVar) {
        g gVar = new g(aVar, this);
        C2964e c2964e = new C2964e(i12);
        c cVar = this.f98618b;
        cVar.f98623d = true;
        c2964e.invoke();
        cVar.f98623d = false;
        f fVar = new f(gVar);
        com.avito.android.player_holder.a aVar2 = this.f98617a;
        aVar2.g("ready_listener", fVar);
        aVar2.play();
    }

    @Override // com.avito.android.avl_entry.impl.util.d
    public final void g(@k ViewGroup viewGroup, @k Y41.a<G0> aVar) {
        StyledPlayerView styledPlayerView = (StyledPlayerView) viewGroup.findViewById(R.id.player);
        if (styledPlayerView != null) {
            this.f98619c = styledPlayerView;
            com.avito.android.player_holder.a aVar2 = this.f98617a;
            aVar2.E(styledPlayerView);
            aVar2.g("player_listener", new d());
            aVar.invoke();
        }
    }

    @Override // com.avito.android.avl_entry.impl.util.d
    /* renamed from: h, reason: from getter */
    public final int getF98620d() {
        return this.f98620d;
    }

    @Override // com.avito.android.avl_entry.impl.util.d
    @k
    public final com.jakewharton.rxrelay3.c i() {
        return this.f98618b.f98622c;
    }

    @Override // com.avito.android.avl_entry.impl.util.d
    public final void pause() {
        this.f98617a.pause();
    }
}
