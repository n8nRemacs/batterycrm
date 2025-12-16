package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.VideoRender;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

/* loaded from: classes.dex */
public final class gob implements fob {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final VideoRender d = new VideoRender();
    public final ConcurrentHashMap.KeySetView o = ConcurrentHashMap.newKeySet();

    public gob(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var3;
        this.b = k18Var;
        this.c = k18Var2;
    }

    public final Conversation c() {
        return ((n64) this.b.getValue()).a();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void clear() {
        ConcurrentHashMap.KeySetView keySetView = this.o;
        Iterator it = keySetView.iterator();
        while (it.hasNext()) {
            qt1 qt1Var = (qt1) ((eob) it.next());
            qt1Var.d();
            qt1Var.s0 = null;
            qt1Var.t0 = false;
        }
        this.d.clear();
        keySetView.clear();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* renamed from: createVideoViewInstance */
    public final RendererView mo153createVideoViewInstance(Context context) {
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context, null, 0, 6, null);
        textureViewRenderer.setId(View.generateViewId());
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL, RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        return textureViewRenderer;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, TextureViewRenderer textureViewRenderer) {
        Conversation conversationC = c();
        if (conversationC != null) {
            VideoRender videoRender = this.d;
            if (videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
                videoRender.removeDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
                textureViewRenderer.clearImage();
                ConversationParticipant conversationParticipant = conversationC.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId());
                if (conversationParticipant == null || !conversationParticipant.isUseable()) {
                    return;
                }
                conversationC.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation conversationC = c();
        if (conversationC != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationC.getMe().getExternalId()).build();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraChanged() {
        TextureViewRenderer textureViewRenderer;
        for (eob eobVar : this.o) {
            boolean zB = ((f41) this.a.getValue()).b();
            qt1 qt1Var = (qt1) eobVar;
            vch vchVar = qt1Var.u0;
            if (vchVar != null && vchVar.c && (textureViewRenderer = qt1Var.c) != null) {
                textureViewRenderer.setMirror(zB);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void rebindParticipantViews() {
        Conversation conversationC = c();
        if (conversationC == null) {
            return;
        }
        for (ConversationParticipant conversationParticipant : conversationC.getParticipants()) {
            VideoRenderManager videoRenderManager = conversationC.getVideoRenderManager();
            if (conversationParticipant.isUseable()) {
                for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : videoRenderManager.getRenderers(conversationParticipant.getExternalId()).keySet()) {
                    videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, this.d.asOkVideoSink(conversationVideoTrackParticipantKey));
                }
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void releaseParticipantView(RendererView rendererView) {
        ((TextureViewRenderer) rendererView).release();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void removeOwnVideoParticipantView(RendererView rendererView) {
        removeParticipantView(((onb) ((dob) ((nnb) this.c.getValue())).z0.getValue()).a.a.s().b, (TextureViewRenderer) rendererView);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setOwnVideoParticipantView(RendererView rendererView, FrameDecorator frameDecorator) {
        setParticipantView(((onb) ((dob) ((nnb) this.c.getValue())).z0.getValue()).a.a.s().b, (TextureViewRenderer) rendererView);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, RendererView rendererView, FrameDecorator frameDecorator) {
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) rendererView;
        Conversation conversationC = c();
        if (conversationC == null || conversationVideoTrackParticipantKey == null) {
            return;
        }
        VideoRender videoRender = this.d;
        if (videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
            return;
        }
        videoRender.addDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
        textureViewRenderer.setMirror(fni.a(conversationC.getMe().getExternalId(), conversationVideoTrackParticipantKey.getParticipantId()) && conversationVideoTrackParticipantKey.getType() == cdh.a && ((f41) this.a.getValue()).b());
        VideoRenderManager videoRenderManager = conversationC.getVideoRenderManager();
        videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
        ah1 callRenderer = videoRenderManager.getCallRenderer();
        if (callRenderer != null) {
            RendererView.init$default(textureViewRenderer, callRenderer, null, null, 4, null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void updateDisplayLayout(Collection collection) {
        Conversation conversationC = c();
        DisplayLayoutSender displayLayoutSender = conversationC != null ? conversationC.getDisplayLayoutSender() : null;
        if (displayLayoutSender != null) {
            displayLayoutSender.sendDisplayLayouts(collection);
        }
    }
}
