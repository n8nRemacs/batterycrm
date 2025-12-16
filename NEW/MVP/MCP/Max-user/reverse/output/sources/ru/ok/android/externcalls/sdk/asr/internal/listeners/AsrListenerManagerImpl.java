package ru.ok.android.externcalls.sdk.asr.internal.listeners;

import defpackage.fje;
import defpackage.fni;
import defpackage.fp1;
import defpackage.gp1;
import defpackage.hp1;
import defpackage.ip1;
import defpackage.jp1;
import defpackage.k21;
import defpackage.l21;
import defpackage.m21;
import defpackage.n21;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.asr.AsrInfo;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0%j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManager;", "Ln21;", "Ljp1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;", "listener", "Lqqg;", "notifyOnNewListener", "(Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;)V", "Lru/ok/android/externcalls/sdk/asr/AsrInfo;", "asrInfo", "notifyAsrRecordStarted", "(Lru/ok/android/externcalls/sdk/asr/AsrInfo;)V", "notifyAsrRecordStopped", "()V", "addAsrRecordListener", "removeAsrRecordListener", "Ll21;", "startInfo", "onAsrRecordStarted", "(Ll21;)V", "Lm21;", "stopInfo", "onAsrRecordStopped", "(Lm21;)V", "Lfp1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lfp1;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lfje;", "Lkotlin/collections/HashMap;", "sessionRoomToAsrInfo", "Ljava/util/HashMap;", "activeRoomId", "Lfje;", "getAsrInfo", "()Lru/ok/android/externcalls/sdk/asr/AsrInfo;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AsrListenerManagerImpl implements AsrListenerManager, n21, jp1 {
    private fje activeRoomId;
    private final CopyOnWriteArraySet<AsrRecordListener> listeners = new CopyOnWriteArraySet<>();
    private final HashMap<fje, AsrInfo> sessionRoomToAsrInfo = new HashMap<>();
    private final ParticipantStore store;

    public AsrListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
        this.activeRoomId = participantStore.getActiveRoomId();
    }

    private final void notifyAsrRecordStarted(AsrInfo asrInfo) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AsrRecordListener) it.next()).onAsrRecordStarted(asrInfo);
        }
    }

    private final void notifyAsrRecordStopped() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AsrRecordListener) it.next()).onAsrRecordStopped();
        }
    }

    private final void notifyOnNewListener(AsrRecordListener listener) {
        AsrInfo asrInfo = getAsrInfo();
        if (asrInfo == null) {
            return;
        }
        listener.onAsrRecordStarted(asrInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager
    public void addAsrRecordListener(AsrRecordListener listener) {
        this.listeners.add(listener);
        notifyOnNewListener(listener);
    }

    public final AsrInfo getAsrInfo() {
        return this.sessionRoomToAsrInfo.get(this.activeRoomId);
    }

    @Override // defpackage.n21
    public void onAsrRecordStarted(l21 startInfo) {
        fje fjeVar = startInfo.a;
        k21 k21Var = startInfo.b;
        ConversationParticipant byInternal = this.store.getByInternal(k21Var.a);
        if (byInternal == null) {
            return;
        }
        AsrInfo asrInfo = new AsrInfo(byInternal, k21Var.b);
        this.sessionRoomToAsrInfo.put(fjeVar, asrInfo);
        if (fni.a(fjeVar, this.activeRoomId)) {
            notifyAsrRecordStarted(asrInfo);
        }
    }

    @Override // defpackage.n21
    public void onAsrRecordStopped(m21 stopInfo) {
        HashMap<fje, AsrInfo> map = this.sessionRoomToAsrInfo;
        fje fjeVar = stopInfo.a;
        AsrInfo asrInfoRemove = map.remove(fjeVar);
        if (!fni.a(fjeVar, this.activeRoomId) || asrInfoRemove == null) {
            return;
        }
        notifyAsrRecordStopped();
    }

    @Override // defpackage.jp1
    public void onCurrentParticipantActiveRoomChanged(fp1 params) {
        fje fjeVar = params.a;
        if (fni.a(fjeVar, this.activeRoomId)) {
            return;
        }
        fje fjeVar2 = this.activeRoomId;
        this.activeRoomId = fjeVar;
        if (this.sessionRoomToAsrInfo.get(fjeVar2) != null) {
            notifyAsrRecordStopped();
        }
        AsrInfo asrInfo = this.sessionRoomToAsrInfo.get(fjeVar);
        if (asrInfo != null) {
            notifyAsrRecordStarted(asrInfo);
        }
    }

    @Override // defpackage.jp1
    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(gp1 gp1Var) {
    }

    @Override // defpackage.jp1
    public /* bridge */ /* synthetic */ void onRoomRemoved(hp1 hp1Var) {
    }

    @Override // defpackage.jp1
    public /* bridge */ /* synthetic */ void onRoomUpdated(ip1 ip1Var) {
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager
    public void removeAsrRecordListener(AsrRecordListener listener) {
        this.listeners.remove(listener);
    }
}
