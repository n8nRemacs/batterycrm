package com.avito.android.messenger.conversation.mvi.video;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.m0;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.video.h;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.E;
import com.avito.android.mvi.rx3.with_monolithic_state.u;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.messenger.video.VideoStatus;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.X2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import p41.AbstractC46895b;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: VideoMessageClickInteractor.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/j;", "Lcom/avito/android/messenger/conversation/mvi/video/h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/video/h$b;", "a", "b", "c", "d", "e", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends AbstractC32892c<h.b> implements h {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f195001V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final String f195002W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f f195003X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f195004Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f195005Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final D f195006a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f195007b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f195008c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f195009d0;

    /* compiled from: VideoMessageClickInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/j$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/video/h$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends C32891b<h.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f195010d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final C30277e1 f195011e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final T1.d.b f195012f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final VideoInfo f195013g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k LocalMessage localMessage, @Y61.k C30277e1 c30277e1, @Y61.k T1.d.b bVar, @Y61.l VideoInfo videoInfo) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f195010d = localMessage;
            this.f195011e = c30277e1;
            this.f195012f = bVar;
            this.f195013g = videoInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(h.b bVar) {
            Q q12;
            VideoStatus status;
            T1.d.b bVar2 = this.f195012f;
            MessageBody f189194a = bVar2.getF189194a();
            MessageBody.SystemMessageBody.Platform.Bubble f189195a = bVar2.getF189195a();
            boolean z12 = f189194a instanceof MessageBody.Video;
            VideoInfo videoInfo = this.f195013g;
            if (z12) {
                q12 = new Q(((MessageBody.Video) f189194a).getVideoId(), videoInfo != null ? videoInfo.getStatus() : null);
            } else if (f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video) {
                String videoId = ((MessageBody.SystemMessageBody.Platform.Bubble.Video) f189195a).getVideoId();
                if (videoInfo == null || (status = videoInfo.getStatus()) == null) {
                    status = VideoStatus.Uploaded.INSTANCE;
                }
                q12 = new Q(videoId, status);
            } else {
                q12 = new Q(null, null);
            }
            String str = (String) q12.f406619b;
            VideoStatus videoStatus = (VideoStatus) q12.f406620c;
            boolean z13 = true;
            boolean zF2 = videoStatus == null ? true : videoStatus.equals(VideoStatus.Created.INSTANCE) ? true : L.f(videoStatus, VideoStatus.Uploading.INSTANCE);
            j jVar = j.this;
            if (zF2) {
                X2.f318778a.i(jVar.f207131E, "BubbleClickMutator: clicked video with " + videoStatus + " => do nothing", null);
                return I.q(G0.f406611a);
            }
            if (L.f(videoStatus, VideoStatus.Uploaded.INSTANCE)) {
                if (str != null && !C43066x.K(str)) {
                    z13 = false;
                }
                if (z13) {
                    X2.f318778a.j(jVar.f207131E, "BubbleClickMutator failed: videoId = " + str + ", status = " + videoStatus, null);
                    G0 g02 = G0.f406611a;
                    jVar.f195009d0.accept(g02);
                    return I.q(g02);
                }
                LocalMessage localMessage = this.f195010d;
                String remoteId = localMessage.getRemoteId();
                if (remoteId != null) {
                    jVar.f195004Y.c(new m0(localMessage.getChannelId(), remoteId, str));
                }
                if (videoInfo != null) {
                    C30277e1 c30277e1 = this.f195011e;
                    c30277e1.getClass();
                    kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[11];
                    if (((Boolean) c30277e1.f145025m.a().invoke()).booleanValue()) {
                        jVar.f195006a0.postValue(Uri.parse(videoInfo.getEmbedUrl()));
                        jVar.f195007b0.accept(Uri.parse(videoInfo.getEmbedUrl()));
                        return I.q(G0.f406611a);
                    }
                }
                return jVar.f195001V.getVideos(Collections.singletonList(str)).r(new i(jVar)).u(new androidx.room.rxjava3.b(jVar, 12));
            }
            if (L.f(videoStatus, VideoStatus.Error.INSTANCE)) {
                X2.f318778a.i(jVar.f207131E, "BubbleClickMutator: clicked video with " + videoStatus + " => do nothing", null);
                return I.q(G0.f406611a);
            }
            if (L.f(videoStatus, VideoStatus.Banned.INSTANCE)) {
                X2.f318778a.i(jVar.f207131E, "BubbleClickMutator: clicked video with " + videoStatus + " => do nothing", null);
                return I.q(G0.f406611a);
            }
            if (!(videoStatus instanceof VideoStatus.Unsupported) && videoStatus != null) {
                z13 = false;
            }
            if (!z13) {
                throw new NoWhenBranchMatchedException();
            }
            X2.f318778a.i(jVar.f207131E, "BubbleClickMutator: clicked video with " + videoStatus + " => do nothing", null);
            G0 g03 = G0.f406611a;
            jVar.f195009d0.accept(g03);
            return I.q(g03);
        }
    }

    /* compiled from: VideoMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/j$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/conversation/mvi/video/h$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements E<h.b> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f195015b = new b();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k x<h.b> xVar, @Y61.k x<h.b> xVar2) {
            c cVar = c.f195016a;
            return L.f(cVar.a(xVar), cVar.a(xVar2));
        }
    }

    /* compiled from: VideoMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/j$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$b;", "Lcom/avito/android/messenger/conversation/mvi/video/h$b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements u.b<h.b, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f195016a = new c();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.b
        @Y61.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String a(@Y61.k x<h.b> xVar) {
            if (xVar instanceof a) {
                return "OnBubbleClickAction(localMessageId = " + ((a) xVar).f195010d.getLocalId() + ')';
            }
            if (!(xVar instanceof d)) {
                return null;
            }
            return "OnCancelClickAction(localMessageId = " + ((d) xVar).f195017d.getLocalId() + ')';
        }
    }

    /* compiled from: VideoMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/j$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/video/h$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends C32891b<h.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f195017d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k LocalMessage localMessage) {
            super(null, "message = " + localMessage, 1, 0 == true ? 1 : 0);
            this.f195017d = localMessage;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(h.b bVar) {
            LocalMessage localMessage = this.f195017d;
            String remoteId = localMessage.getRemoteId();
            if (remoteId != null && !C43066x.K(remoteId)) {
                return I.q(G0.f406611a);
            }
            j jVar = j.this;
            com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f fVar = jVar.f195003X;
            MessengerUserHashInfo messengerUserHashInfoC = com.avito.android.messenger.util.i.c(localMessage);
            return fVar.a(jVar.f195002W, localMessage.getLocalId(), messengerUserHashInfoC).i(new k(jVar, this)).v(Boolean.FALSE);
        }
    }

    /* compiled from: VideoMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/j$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$c;", "Lcom/avito/android/messenger/conversation/mvi/video/h$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements u.c<h.b, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final H f195019a;

        public e(@Y61.k H h12) {
            this.f195019a = h12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.c
        public final z a(Object obj, AbstractC46895b abstractC46895b) {
            return ((String) obj) == null ? abstractC46895b : abstractC46895b.D0(1500L, TimeUnit.MILLISECONDS, this.f195019a);
        }
    }

    public j() {
        throw null;
    }

    @Inject
    public j(@Y61.k InterfaceC47842z interfaceC47842z, @InterfaceC32438g0 @Y61.k String str, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f fVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C30277e1 c30277e1) {
        super("VideoMessageClickInteractor", h.b.f194999a, interfaceC35745a5, b.f195015b, new u(interfaceC35745a5.a(), c.f195016a, new e(interfaceC35745a5.a())), null, null, null, 224, null);
        this.f195001V = interfaceC47842z;
        this.f195002W = str;
        this.f195003X = fVar;
        this.f195004Y = interfaceC28373a;
        this.f195005Z = c30277e1;
        this.f195006a0 = new D();
        this.f195007b0 = new com.jakewharton.rxrelay3.c();
        this.f195008c0 = new com.jakewharton.rxrelay3.c();
        this.f195009d0 = new com.jakewharton.rxrelay3.c();
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.h
    public final z Q() {
        return this.f195008c0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.h
    public final void a6(@Y61.k LocalMessage localMessage) {
        le().s(new d(localMessage));
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.h
    /* renamed from: ca, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF195007b0() {
        return this.f195007b0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.h
    /* renamed from: pb, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF195009d0() {
        return this.f195009d0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.h
    public final void r2(@Y61.k LocalMessage localMessage, @Y61.k T1.d.b bVar, @Y61.l VideoInfo videoInfo) {
        le().s(new a(localMessage, this.f195005Z, bVar, videoInfo));
    }
}
