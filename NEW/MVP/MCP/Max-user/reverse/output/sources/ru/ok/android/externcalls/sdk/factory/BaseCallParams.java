package ru.ok.android.externcalls.sdk.factory;

import defpackage.aj0;
import defpackage.cm6;
import defpackage.em6;
import defpackage.eu3;
import defpackage.hqa;
import defpackage.hu3;
import defpackage.r52;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u00010Bm\b\u0004\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "T", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "B", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lqqg;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lr52;", "frameInterceptor", "Lhqa;", "cameraCapturerFactory", "", "fieldTrials", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lem6;Lem6;ZLr52;Lhqa;Ljava/lang/String;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lem6;", "getOnPrepared", "()Lem6;", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "Lr52;", "getFrameInterceptor", "()Lr52;", "Lhqa;", "getCameraCapturerFactory", "()Lhqa;", "Ljava/lang/String;", "getFieldTrials", "()Ljava/lang/String;", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseCallParams<T, B extends Builder<T, B>> {
    private final hqa cameraCapturerFactory;
    private final ConversationEventsListener eventListener;
    private final String fieldTrials;
    private final r52 frameInterceptor;
    private final ParticipantId myId;
    private final em6 onError;
    private final em6 onPrepared;
    private final boolean shouldStartWithVideo;

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0014\b\u0003\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00028\u00032\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00028\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00028\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\u00028\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u0017\u001a\u00028\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u001bH\u0007¢\u0006\u0004\b\u0017\u0010\u001cJ\u0017\u0010\u0017\u001a\u00028\u00032\u0006\u0010\u0016\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010!\u001a\u00028\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b!\u0010\u0018J\u001b\u0010!\u001a\u00028\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010$\u001a\u00028\u00032\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00028\u00032\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00028\u00032\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00028\u0002H&¢\u0006\u0004\b.\u0010/R*\u00100\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b\t\u00104R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\b6\u00107\"\u0004\b\r\u00108R$\u00109\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b\u0011\u0010=R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@\"\u0004\b\u0017\u0010AR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010>\u001a\u0004\bB\u0010@\"\u0004\b!\u0010AR\"\u0010'\u001a\u00020&8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010#\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010H\u001a\u0004\bI\u0010J\"\u0004\b$\u0010KR$\u0010+\u001a\u0004\u0018\u00010*8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b+\u0010L\u001a\u0004\bM\u0010N\"\u0004\b,\u0010O¨\u0006P"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "T", "B", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "callerId", "setMyId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "setEventListener", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lhqa;", "factory", "setCameraCapturerFactory", "(Lhqa;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lqqg;", "onPrepared", "setOnPrepared", "(Lem6;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lhu3;", "(Lhu3;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function0;", "(Lcm6;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "onError", "setOnError", "Lr52;", "frameInterceptor", "setFrameInterceptor", "(Lr52;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "shouldStartWithVideo", "setStartWithVideo", "(Z)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "fieldTrials", "setFieldTrials", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "build", "()Ljava/lang/Object;", "myId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)V", "cameraCapturerFactory", "Lhqa;", "getCameraCapturerFactory", "()Lhqa;", "(Lhqa;)V", "Lem6;", "getOnPrepared", "()Lem6;", "(Lem6;)V", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "setShouldStartWithVideo", "(Z)V", "Lr52;", "getFrameInterceptor", "()Lr52;", "(Lr52;)V", "Ljava/lang/String;", "getFieldTrials", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Builder<T, B extends Builder<T, B>> {
        private hqa cameraCapturerFactory;
        private ConversationEventsListener eventListener;
        private String fieldTrials;
        private r52 frameInterceptor;
        private ParticipantId myId;
        private em6 onError;
        private em6 onPrepared;
        private boolean shouldStartWithVideo;

        public abstract T build();

        public final hqa getCameraCapturerFactory() {
            return this.cameraCapturerFactory;
        }

        public final ConversationEventsListener getEventListener() {
            return this.eventListener;
        }

        public final String getFieldTrials() {
            return this.fieldTrials;
        }

        public final r52 getFrameInterceptor() {
            return null;
        }

        public final ParticipantId getMyId() {
            return this.myId;
        }

        public final em6 getOnError() {
            return this.onError;
        }

        public final em6 getOnPrepared() {
            return this.onPrepared;
        }

        public final boolean getShouldStartWithVideo() {
            return this.shouldStartWithVideo;
        }

        /* renamed from: setCameraCapturerFactory, reason: collision with other method in class */
        public final void m137setCameraCapturerFactory(hqa hqaVar) {
            this.cameraCapturerFactory = hqaVar;
        }

        /* renamed from: setEventListener, reason: collision with other method in class */
        public final void m138setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
        }

        /* renamed from: setFieldTrials, reason: collision with other method in class */
        public final void m139setFieldTrials(String str) {
            this.fieldTrials = str;
        }

        /* renamed from: setFrameInterceptor, reason: collision with other method in class */
        public final void m140setFrameInterceptor(r52 r52Var) {
        }

        /* renamed from: setMyId, reason: collision with other method in class */
        public final void m141setMyId(ParticipantId participantId) {
            this.myId = participantId;
        }

        /* renamed from: setOnError, reason: collision with other method in class */
        public final void m142setOnError(em6 em6Var) {
            this.onError = em6Var;
        }

        public final B setOnPrepared(Runnable onPrepared) {
            setOnPrepared(new eu3(0, onPrepared));
            return this;
        }

        public final void setShouldStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
        }

        public final B setStartWithVideo(boolean shouldStartWithVideo) {
            this.shouldStartWithVideo = shouldStartWithVideo;
            return this;
        }

        public final B setCameraCapturerFactory(hqa factory) {
            this.cameraCapturerFactory = factory;
            return this;
        }

        public final B setEventListener(ConversationEventsListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        public final B setFieldTrials(String fieldTrials) {
            this.fieldTrials = fieldTrials;
            return this;
        }

        public final B setFrameInterceptor(r52 frameInterceptor) {
            return this;
        }

        public final B setMyId(ParticipantId callerId) {
            this.myId = callerId;
            return this;
        }

        public final B setOnError(em6 onError) {
            this.onError = onError;
            return this;
        }

        public final B setOnError(hu3 onError) {
            this.onError = new BaseCallParams$Builder$setOnError$1(onError);
            return this;
        }

        /* renamed from: setOnPrepared, reason: collision with other method in class */
        public final void m143setOnPrepared(em6 em6Var) {
            this.onPrepared = em6Var;
        }

        public B setOnPrepared(em6 onPrepared) {
            this.onPrepared = onPrepared;
            return this;
        }

        public final B setOnPrepared(hu3 onPrepared) {
            this.onPrepared = new BaseCallParams$Builder$setOnPrepared$1(onPrepared);
            return this;
        }

        public final B setOnPrepared(cm6 onPrepared) {
            int i = 0;
            setOnPrepared(new eu3(i, new aj0(i, onPrepared)));
            return this;
        }
    }

    public BaseCallParams(ParticipantId participantId, ConversationEventsListener conversationEventsListener, em6 em6Var, em6 em6Var2, boolean z, r52 r52Var, hqa hqaVar, String str) {
        this.myId = participantId;
        this.eventListener = conversationEventsListener;
        this.onPrepared = em6Var;
        this.onError = em6Var2;
        this.shouldStartWithVideo = z;
        this.cameraCapturerFactory = hqaVar;
        this.fieldTrials = str;
    }

    public final hqa getCameraCapturerFactory() {
        return this.cameraCapturerFactory;
    }

    public final ConversationEventsListener getEventListener() {
        return this.eventListener;
    }

    public final String getFieldTrials() {
        return this.fieldTrials;
    }

    public final r52 getFrameInterceptor() {
        return null;
    }

    public final ParticipantId getMyId() {
        return this.myId;
    }

    public final em6 getOnError() {
        return this.onError;
    }

    public final em6 getOnPrepared() {
        return this.onPrepared;
    }

    public final boolean getShouldStartWithVideo() {
        return this.shouldStartWithVideo;
    }
}
