package com.avito.konveyor.item_visibility_tracker;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.view.InterfaceC22983P;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.decoder.h;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.video.n;
import com.google.common.util.concurrent.D0;
import com.my.target.Z;
import com.my.target.p1;
import com.my.tracker.campaign.CampaignService;
import com.vk.id.captcha.okhttp.api.Error14HandlingInterceptor;
import com.yandex.mobile.ads.exo.drm.f;
import e11.AbstractC39858c1;
import e11.C39865f;
import e11.F;
import e11.K1;
import e11.O1;
import e11.k2;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l0;
import n11.RunnableC44167a;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import ru.cyberity.cbr.core.domain.camera.CameraX;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f338533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f338534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f338535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f338536e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i12) {
        this.f338533b = i12;
        this.f338534c = obj;
        this.f338535d = obj2;
        this.f338536e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.drm.e, com.google.android.exoplayer2.source.A, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Object obj = this.f338534c;
        Object obj2 = this.f338536e;
        ?? r42 = this.f338535d;
        switch (this.f338533b) {
            case 0:
                TrackedInfo trackedInfo = (TrackedInfo) ((l0.h) obj2).f406842b;
                if (trackedInfo.f338529f != null) {
                    d dVar = (d) obj;
                    TrackKey trackKey = (TrackKey) r42;
                    if (dVar.f338541e.containsKey(trackKey)) {
                        dVar.l(trackKey, trackedInfo);
                        break;
                    }
                }
                break;
            case 1:
                i.a aVar = (i.a) obj;
                aVar.getClass();
                int i12 = U.f348106a;
                i iVar = aVar.f343997b;
                iVar.getClass();
                iVar.M7((I) r42, (h) obj2);
                break;
            case 2:
                e.a aVar2 = (e.a) obj;
                r42.i(aVar2.f344336a, aVar2.f344337b, (Exception) obj2);
                break;
            case 3:
                A.a aVar3 = (A.a) obj;
                r42.q(aVar3.f345902a, aVar3.f345903b, (C36557u) obj2);
                break;
            case 4:
                n.a aVar4 = (n.a) obj;
                aVar4.getClass();
                int i13 = U.f348106a;
                aVar4.f348319b.Yc((I) r42, (h) obj2);
                break;
            case 5:
                Error14HandlingInterceptor.passCaptchaAndGetToken$lambda$3$lambda$1((String) obj, (AtomicReference) r42, (Error14HandlingInterceptor) obj2);
                break;
            case 6:
                ((f.a) obj).a((com.yandex.mobile.ads.exo.drm.f) r42, (Exception) obj2);
                break;
            case 7:
                Z z12 = (Z) obj;
                z12.getClass();
                p1 p1Var = (p1) r42;
                Context context = (Context) obj2;
                z12.g(p1Var, context, new FX0.b(z12, p1Var, context, 18));
                break;
            case 8:
                Z z13 = (Z) obj;
                Z.b<T> bVar = z13.f364679d;
                if (bVar != 0) {
                    bVar.c((AbstractC39858c1) r42, (String) obj2);
                    z13.f364679d = null;
                    break;
                }
                break;
            case 9:
                k11.b bVar2 = (k11.b) r42;
                Context context2 = (Context) obj2;
                O1.b(O1.a((String) obj, bVar2.f406004a, bVar2.f406007d, bVar2.f406008e, bVar2.f406012i, bVar2.f406011h, bVar2.f406010g, bVar2.f406009f, bVar2.f406005b, bVar2.f406006c, false, context2), context2);
                break;
            case 10:
                k11.c cVar = (k11.c) r42;
                Context context3 = (Context) obj2;
                O1.b(O1.a((String) obj, cVar.f406004a, cVar.f406007d, cVar.f406008e, cVar.f406012i, cVar.f406011h, cVar.f406010g, cVar.f406009f, cVar.f406005b, cVar.f406006c, cVar.f406016m, context3), context3);
                break;
            case 11:
                k2 k2Var = k2.f394669a;
                ((k2) obj).getClass();
                k2.b((C39865f) r42, null, null, (Context) obj2);
                break;
            case 12:
                k2 k2Var2 = k2.f394669a;
                ((k2) obj).getClass();
                String strA = F.a((String) r42);
                if (!URLUtil.isNetworkUrl(strA)) {
                    strA = null;
                }
                if (strA != null) {
                    new K1().b(strA, null, null, (Context) obj2);
                    break;
                }
                break;
            case 13:
                ((CampaignService) obj).a((String) r42, (RunnableC44167a) obj2);
                break;
            case 14:
                ((EglRenderer) obj).lambda$removeFrameListener$2((CountDownLatch) r42, (EglRenderer.FrameListener) obj2);
                break;
            case 15:
                ((VideoFileRenderer) obj).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) r42, (VideoFrame) obj2);
                break;
            default:
                CameraX.a((D0) obj, (CameraX) r42, (InterfaceC22983P) obj2);
                break;
        }
    }
}
