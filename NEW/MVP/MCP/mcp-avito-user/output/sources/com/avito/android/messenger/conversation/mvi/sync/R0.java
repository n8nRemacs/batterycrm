package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.Q0;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.messenger.video.VideoStatus;
import com.avito.android.remote.model.messenger.video.VideosResponse;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: VideoInfoSyncAgent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/R0;", "Lcom/avito/android/messenger/conversation/mvi/sync/Q0;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "f", "g", "h", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class R0 extends AbstractC32892c<Q0.b> implements Q0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f194685a0 = 0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final String f194686V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194687W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f194688X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<List<LocalMessage>> f194689Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f194690Z;

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "messages", "", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Iterable iterableMe;
            MessageBody body;
            int i12 = R0.f194685a0;
            R0.this.getClass();
            ArrayList arrayList = new ArrayList();
            for (LocalMessage localMessage : (List) obj) {
                List listMe = R0.me(localMessage.getBody());
                Quote quote = localMessage.getQuote();
                if (quote == null || (body = quote.getBody()) == null || (iterableMe = R0.me(body)) == null) {
                    iterableMe = C42784z0.f406748b;
                }
                arrayList.add(C42745f0.h0(iterableMe, listMe));
            }
            ArrayList arrayListH = C42745f0.H(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayListH.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!C43066x.K((String) next)) {
                    arrayList2.add(next);
                }
            }
            return C42745f0.P0(arrayList2);
        }
    }

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0017\u0010\u0005\u001a\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/reactivex/rxjava3/schedulers/d;", "", "", "Lj41/e;", "old", "new", "", "test", "(Lio/reactivex/rxjava3/schedulers/d;Lio/reactivex/rxjava3/schedulers/d;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T1, T2> implements l41.d {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T1, T2> f194692a = new b<>();

        @Override // l41.d
        public final boolean a(Object obj, Object obj2) {
            io.reactivex.rxjava3.schedulers.d dVar = (io.reactivex.rxjava3.schedulers.d) obj;
            io.reactivex.rxjava3.schedulers.d dVar2 = (io.reactivex.rxjava3.schedulers.d) obj2;
            return ((Set) dVar.f404958a).containsAll((Collection) dVar2.f404958a) && dVar2.f404959b - dVar.f404959b < 2000;
        }
    }

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/schedulers/d;", "", "", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/schedulers/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = R0.f194685a0;
            R0 r02 = R0.this;
            r02.le().s(r02.new h((Set) ((io.reactivex.rxjava3.schedulers.d) obj).f404958a, true));
        }
    }

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/w;", "it", "", "test", "(LX81/w;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.r {
        public d() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return kotlin.jvm.internal.L.f(((X81.w) obj).getChannelId(), R0.this.f194686V);
        }
    }

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/w;", "event", "Lkotlin/G0;", "accept", "(LX81/w;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = R0.f194685a0;
            R0 r02 = R0.this;
            r02.le().s(r02.new g((X81.w) obj));
        }
    }

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/R0$f;", "", "<init>", "()V", "", "SAME_IDS_THROTTLE_INTERVAL_MILLIS", "I", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f {
        public /* synthetic */ f(C42822w c42822w) {
            this();
        }

        public f() {
        }
    }

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/R0$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends com.avito.android.mvi.rx3.with_monolithic_state.o<Q0.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final X81.w f194696d;

        public g(@Y61.k X81.w wVar) {
            super(null, "event = " + wVar, 1, null);
            this.f194696d = wVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final Q0.b d(Q0.b bVar) {
            Q0.b bVar2 = bVar;
            X81.w wVar = this.f194696d;
            boolean z12 = wVar.getStatus() instanceof VideoStatus.Uploaded;
            Map<String, VideoInfo> map = bVar2.f194684a;
            if (z12) {
                VideoInfo videoInfo = map.get(wVar.getVideoId());
                if (!((videoInfo != null ? videoInfo.getStatus() : null) instanceof VideoStatus.Uploaded)) {
                    int i12 = R0.f194685a0;
                    R0 r02 = R0.this;
                    r02.le().s(r02.new h(Collections.singleton(wVar.getVideoId()), false));
                }
            }
            VideoInfo videoInfo2 = map.get(wVar.getVideoId());
            VideoInfo videoInfoCopy$default = videoInfo2 != null ? VideoInfo.copy$default(videoInfo2, null, null, null, wVar.getStatus(), 0L, 23, null) : null;
            return videoInfoCopy$default != null ? new Q0.b(kotlin.collections.P0.l(map, new kotlin.Q(videoInfoCopy$default.getId(), videoInfoCopy$default))) : bVar2;
        }
    }

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/R0$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends com.avito.android.mvi.rx3.with_monolithic_state.p<Q0.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Set<String> f194698d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f194699e;

        public h(@Y61.k Set<String> set, boolean z12) {
            super("RequestVideoInfo", "videoIds = " + set + ", doNotRequestAlreadyLoadedInfo = " + z12);
            this.f194698d = set;
            this.f194699e = z12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<Q0.b> b(Q0.b bVar) {
            Q0.b bVar2 = bVar;
            boolean z12 = this.f194699e;
            Set<String> set = this.f194698d;
            Set<String> setF = z12 ? kotlin.collections.b1.f(set, bVar2.f194684a.keySet()) : set;
            boolean zIsEmpty = setF.isEmpty();
            R0 r02 = R0.this;
            if (zIsEmpty) {
                V2 v22 = V2.f318762a;
                int i12 = R0.f194685a0;
                v22.c(r02.f207131E, "videoIds already loaded: " + set, null);
                return io.reactivex.rxjava3.core.I.q(bVar2);
            }
            V2 v23 = V2.f318762a;
            int i13 = R0.f194685a0;
            v23.c(r02.f207131E, "Started loading videoInfo for ids: " + setF, null);
            io.reactivex.rxjava3.core.I<VideosResponse> videos = r02.f194688X.getVideos(C42745f0.M0(setF));
            InterfaceC35745a5 interfaceC35745a5 = r02.f194687W;
            return videos.z(interfaceC35745a5.a()).s(interfaceC35745a5.a()).r(new S0(bVar2)).k(new T0(r02, setF)).i(new U0(r02, setF)).v(bVar2);
        }
    }

    static {
        new f(null);
    }

    @Inject
    public R0(@InterfaceC32438g0 @Y61.k String str, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC47842z interfaceC47842z) {
        super("VideoInfoSyncAgent", new Q0.b(kotlin.collections.P0.c()), interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f194686V = str;
        this.f194687W = interfaceC35745a5;
        this.f194688X = interfaceC47842z;
        com.jakewharton.rxrelay3.c<List<LocalMessage>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f194689Y = cVar;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f194690Z = cVar2;
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = cVar.j0(interfaceC35745a5.a()).d0(new a());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        cVar2.b(b0D0.d0(io.reactivex.rxjava3.internal.functions.a.l(timeUnit, h12)).B(b.f194692a).t0(new c()));
        cVar2.b(interfaceC47842z.C(X81.w.class).N(new d()).t0(new e()));
    }

    public static List me(MessageBody messageBody) {
        if (messageBody instanceof MessageBody.Video) {
            String videoId = ((MessageBody.Video) messageBody).getVideoId();
            return videoId != null ? Collections.singletonList(videoId) : C42784z0.f406748b;
        }
        if (!(messageBody instanceof MessageBody.SystemMessageBody.Platform)) {
            return C42784z0.f406748b;
        }
        List<MessageBody.SystemMessageBody.Platform.Bubble> chunks = ((MessageBody.SystemMessageBody.Platform) messageBody).getChunks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : chunks) {
            if (obj instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String videoId2 = ((MessageBody.SystemMessageBody.Platform.Bubble.Video) it.next()).getVideoId();
            if (videoId2 != null) {
                arrayList2.add(videoId2);
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.Q0
    public final void Cb(@Y61.k ArrayList arrayList) {
        this.f194689Y.accept(arrayList);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f194690Z.e();
        super.onCleared();
    }
}
