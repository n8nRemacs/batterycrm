package ru.ok.android.externcalls.sdk.watch_together.internal.listener;

import android.os.Handler;
import android.os.Looper;
import defpackage.a3a;
import defpackage.b3a;
import defpackage.d3a;
import defpackage.e3a;
import defpackage.f3a;
import defpackage.g3a;
import defpackage.h3a;
import defpackage.i3a;
import defpackage.id5;
import defpackage.l3a;
import defpackage.n1h;
import defpackage.nt1;
import defpackage.v2a;
import defpackage.y2a;
import defpackage.z2a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\nJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/listener/WatchTogetherListenerManager;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantsStorage", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "Lqqg;", "sendActualState", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "sendActualStateToAll", "()V", "Lh3a;", "updates", "updateState", "(Lh3a;)V", "", "position", "Lb3a;", "getPosition", "(Ljava/lang/Long;)Lb3a;", "Lf3a;", "startInfo", "onVideoStarted", "(Lf3a;)V", "onVideoStatesUpdatedChanged", "Li3a;", "stopInfo", "onVideoStopped", "(Li3a;)V", "addListener", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "movieStates", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchTogetherListenerManagerImpl implements WatchTogetherListenerManager {
    private final ParticipantStore participantsStorage;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private volatile MovieStates movieStates = new MovieStates(id5.a);
    private final CopyOnWriteArraySet<WatchTogetherListener> listeners = new CopyOnWriteArraySet<>();

    public WatchTogetherListenerManagerImpl(ParticipantStore participantStore) {
        this.participantsStorage = participantStore;
    }

    private final b3a getPosition(Long position) {
        if (position == null || position.longValue() < 0) {
            return a3a.a;
        }
        long jLongValue = position.longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new z2a(jLongValue);
    }

    private final void sendActualState(WatchTogetherListener listener) {
        this.mainHandler.post(new n1h(this, 12, listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendActualState$lambda$5(WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl, WatchTogetherListener watchTogetherListener) {
        if (watchTogetherListenerManagerImpl.listeners.contains(watchTogetherListener) && !watchTogetherListenerManagerImpl.movieStates.getStates().isEmpty()) {
            watchTogetherListener.onVideoStatesChanged(watchTogetherListenerManagerImpl.movieStates);
        }
    }

    private final void sendActualStateToAll() {
        Iterator<WatchTogetherListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoStatesChanged(this.movieStates);
        }
    }

    private final void updateState(h3a updates) {
        HashMap map = new HashMap();
        Iterator it = updates.a.iterator();
        while (it.hasNext()) {
            g3a g3aVar = (g3a) it.next();
            ConversationParticipant byInternal = this.participantsStorage.getByInternal(g3aVar.a.b);
            if (byInternal != null) {
                ParticipantId externalId = byInternal.getExternalId();
                nt1 nt1Var = g3aVar.a;
                y2a y2aVar = nt1Var.c;
                if (y2aVar != null) {
                    int i = e3a.$EnumSwitchMapping$1[nt1Var.a.ordinal()];
                    Object obj = null;
                    d3a d3aVar = i != 1 ? i != 2 ? null : d3a.b : d3a.a;
                    if (d3aVar != null) {
                        Iterator<T> it2 = byInternal.getMovies().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            v2a v2aVar = (v2a) next;
                            if (v2aVar.d == d3aVar && v2aVar.a.equals(y2aVar)) {
                                obj = next;
                                break;
                            }
                        }
                        v2a v2aVar2 = (v2a) obj;
                        b3a position = getPosition(g3aVar.d);
                        boolean z = true ^ g3aVar.c;
                        float f = g3aVar.b;
                        l3a.a(f);
                        map.put(y2aVar, new MovieState(externalId, position, z, f, g3aVar.e, v2aVar2, null));
                        if (!this.movieStates.getStates().containsKey(y2aVar) && v2aVar2 != null) {
                            MovieStartedData movieStartedData = new MovieStartedData(externalId, this.participantsStorage.getActiveRoomId(), v2aVar2);
                            Iterator<T> it3 = this.listeners.iterator();
                            while (it3.hasNext()) {
                                ((WatchTogetherListener) it3.next()).onVideoStarted(movieStartedData);
                            }
                        }
                    }
                }
            }
        }
        this.movieStates = this.movieStates.copy(map);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void addListener(WatchTogetherListener listener) {
        this.listeners.add(listener);
        sendActualState(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public MovieStates getMovieStates() {
        return this.movieStates;
    }

    public final void onVideoStarted(f3a startInfo) {
        ConversationParticipant byInternal = this.participantsStorage.getByInternal(startInfo.a);
        if (byInternal != null) {
            v2a v2aVar = startInfo.c;
            ParticipantId externalId = byInternal.getExternalId();
            MovieStates movieStates = this.movieStates;
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
            y2a y2aVar = v2aVar.a;
            a3a a3aVar = a3a.a;
            float f = l3a.a;
            linkedHashMap.put(y2aVar, new MovieState(externalId, a3aVar, true, 0.0f, true, v2aVar, null));
            this.movieStates = movieStates.copy(linkedHashMap);
            MovieStartedData movieStartedData = new MovieStartedData(byInternal.getExternalId(), startInfo.b, v2aVar);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((WatchTogetherListener) it.next()).onVideoStarted(movieStartedData);
            }
        }
    }

    public final void onVideoStatesUpdatedChanged(h3a updates) {
        updateState(updates);
        sendActualStateToAll();
    }

    public final void onVideoStopped(i3a stopInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
        MovieState movieState = (MovieState) linkedHashMap.remove(stopInfo.c);
        this.movieStates = this.movieStates.copy(linkedHashMap);
        if (movieState != null) {
            MovieStoppedData movieStoppedData = new MovieStoppedData(movieState.getParticipantId(), stopInfo.b, stopInfo.c, stopInfo.d);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((WatchTogetherListener) it.next()).onVideoStopped(movieStoppedData);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void removeListener(WatchTogetherListener listener) {
        this.listeners.remove(listener);
    }
}
