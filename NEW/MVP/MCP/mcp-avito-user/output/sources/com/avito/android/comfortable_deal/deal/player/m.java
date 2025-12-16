package com.avito.android.comfortable_deal.deal.player;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.H;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.J;
import androidx.media3.common.z;
import androidx.media3.exoplayer.InterfaceC23144m;
import aq.InterfaceC23651a;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AudioPlayerInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/player/m;", "Lcom/avito/android/comfortable_deal/deal/player/l;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J
/* loaded from: classes12.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC23651a f121785a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.deal.player.a f121786b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC23144m f121787c;

    /* compiled from: AudioPlayerInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/media3/exoplayer/m;", "Lkotlin/G0;", "invoke", "(Landroidx/media3/exoplayer/m;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC23144m, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f121788l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC23144m interfaceC23144m) {
            InterfaceC23144m interfaceC23144m2 = interfaceC23144m;
            interfaceC23144m2.setRepeatMode(0);
            interfaceC23144m2.setPlayWhenReady(false);
            interfaceC23144m2.J();
            interfaceC23144m2.setPlaybackSpeed(1.0f);
            return G0.f406611a;
        }
    }

    /* compiled from: AudioPlayerInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m mVar = m.this;
            mVar.getClass();
            mVar.f121785a.e(new n(0.2f));
            return G0.f406611a;
        }
    }

    /* compiled from: AudioPlayerInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m mVar = m.this;
            mVar.getClass();
            n nVar = new n(1.0f);
            InterfaceC23651a interfaceC23651a = mVar.f121785a;
            interfaceC23651a.e(nVar);
            interfaceC23651a.play();
            return G0.f406611a;
        }
    }

    /* compiled from: AudioPlayerInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f121785a.pause();
            return G0.f406611a;
        }
    }

    /* compiled from: AudioPlayerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Landroidx/media3/common/PlaybackException;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.player.AudioPlayerInteractorImpl$playbackErrors$1", f = "AudioPlayerInteractor.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<I0<? super PlaybackException>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121792q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f121793r;

        /* compiled from: AudioPlayerInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/media3/common/H$g;", "invoke", "()Landroidx/media3/common/H$g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.a<H.g> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ m f121795l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ I0<PlaybackException> f121796m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m mVar, I0<? super PlaybackException> i02) {
                super(0);
                this.f121795l = mVar;
                this.f121796m = i02;
            }

            @Override // Y41.a
            public final H.g invoke() {
                return new o(this.f121795l, this.f121796m);
            }
        }

        /* compiled from: AudioPlayerInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ m f121797l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m mVar) {
                super(0);
                this.f121797l = mVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f121797l.f121785a.b("error_listener");
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = m.this.new e(continuation);
            eVar.f121793r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super PlaybackException> i02, Continuation<? super G0> continuation) {
            return ((e) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f121792q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f121793r;
                m mVar = m.this;
                mVar.f121785a.g("error_listener", new a(mVar, i02));
                b bVar = new b(mVar);
                this.f121792q = 1;
                if (F0.a(i02, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public m(@Y61.k InterfaceC23651a interfaceC23651a, @Y61.k com.avito.android.comfortable_deal.deal.player.a aVar) {
        this.f121785a = interfaceC23651a;
        this.f121786b = aVar;
        this.f121787c = interfaceC23651a.a();
        interfaceC23651a.e(a.f121788l);
        aVar.d(new b());
        aVar.a(new c());
        aVar.b(new d());
    }

    @Override // com.avito.android.comfortable_deal.deal.player.l
    @Y61.k
    public final InterfaceC43160i<PlaybackException> a() {
        return C43175k.d(new e(null));
    }

    @Override // com.avito.android.comfortable_deal.deal.player.l
    public final void b(int i12) {
        this.f121785a.seekTo(kotlin.math.b.c((i12 / 10000.0d) * this.f121787c.getDuration()));
    }

    @Override // com.avito.android.comfortable_deal.deal.player.l
    public final void c(@Y61.k Uri uri) {
        z zVar = z.f47970h;
        z.c cVar = new z.c();
        cVar.f47989b = uri;
        this.f121785a.f(cVar.a());
    }

    @Override // com.avito.android.comfortable_deal.deal.player.l
    public final void d(@Y61.k PlaySpeed playSpeed) {
        this.f121785a.h(playSpeed.f121205b);
    }

    @Override // com.avito.android.comfortable_deal.deal.player.l
    public final void e() {
        if (this.f121787c.getPlayWhenReady()) {
            pause();
        } else {
            this.f121786b.c();
        }
    }

    @Override // com.avito.android.comfortable_deal.deal.player.l
    public final void pause() {
        this.f121786b.e();
    }
}
