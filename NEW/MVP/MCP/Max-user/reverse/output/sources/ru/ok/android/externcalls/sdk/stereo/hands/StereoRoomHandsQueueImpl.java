package ru.ok.android.externcalls.sdk.stereo.hands;

import defpackage.b5j;
import defpackage.cm6;
import defpackage.em6;
import defpackage.qqg;
import defpackage.sm6;
import defpackage.ti1;
import defpackage.tt1;
import defpackage.u08;
import defpackage.ue3;
import defpackage.um6;
import defpackage.we3;
import defpackage.wt1;
import defpackage.y8g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u001e\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010(J;\u0010)\u001a\u00020\t2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R6\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R,\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R8\u00106\u001a&\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a04j\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010:¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lkotlin/Function2;", "", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lkotlin/Function0;", "Lqqg;", "idsResolverHelper", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "getExternalId", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Ly8g;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Lsm6;Lem6;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Ly8g;)V", "onSuccess", "", "onError", "loadHandsQueue", "(Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "item", "", "raised", "participantHandChanged", "(Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;Z)V", "notifyHandsStatusChanged", "()V", "getQueue", "()Ljava/util/List;", "", "getTotalCount", "()I", "hasMore", "()Z", "loadMoreElements", "(Lem6;Lem6;)V", "Lwt1;", "event", "onHandUp", "(Lwt1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lsm6;", "Lem6;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Ly8g;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "handQueue", "Ljava/util/HashMap;", "totalCount", "I", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StereoRoomHandsQueueImpl implements StereoRoomHandsQueue {
    private final StereoRoomCommandExecutor commandExecutor;
    private final em6 getExternalId;
    private final HashMap<ParticipantId, StereoHandQueueItem> handQueue = new HashMap<>();
    private boolean hasMore = true;
    private final sm6 idsResolverHelper;
    private final StereoRoomListenerManagerImpl listenersManager;
    private final y8g timeProvider;
    private int totalCount;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "totalCount", "", "hasMore", "", "Ltt1;", "queue", "Lqqg;", "invoke", "(IZLjava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$loadHandsQueue$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements um6 {
        final /* synthetic */ cm6 $onSuccess;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$loadHandsQueue$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends u08 implements cm6 {
            final /* synthetic */ cm6 $onSuccess;
            final /* synthetic */ List<tt1> $queue;
            final /* synthetic */ StereoRoomHandsQueueImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(List<tt1> list, cm6 cm6Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
                super(0);
                this.$queue = list;
                this.$onSuccess = cm6Var;
                this.this$0 = stereoRoomHandsQueueImpl;
            }

            @Override // defpackage.cm6
            public /* bridge */ /* synthetic */ Object invoke() {
                m146invoke();
                return qqg.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m146invoke() {
                List<tt1> list = this.$queue;
                StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = this.this$0;
                for (tt1 tt1Var : list) {
                    ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke(tt1Var.b);
                    if (participantId != null) {
                        stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, tt1Var.a), true);
                    }
                }
                this.$onSuccess.invoke();
                this.this$0.notifyHandsStatusChanged();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cm6 cm6Var) {
            super(3);
            this.$onSuccess = cm6Var;
        }

        @Override // defpackage.um6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (List<tt1>) obj3);
            return qqg.a;
        }

        public final void invoke(int i, boolean z, List<tt1> list) {
            StereoRoomHandsQueueImpl.this.totalCount = i;
            StereoRoomHandsQueueImpl.this.hasMore = z;
            sm6 sm6Var = StereoRoomHandsQueueImpl.this.idsResolverHelper;
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((tt1) it.next()).b);
            }
            sm6Var.invoke(arrayList, new AnonymousClass2(list, this.$onSuccess, StereoRoomHandsQueueImpl.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$loadMoreElements$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00591 extends u08 implements cm6 {
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ StereoRoomHandsQueueImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00591(em6 em6Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
            super(0);
            this.$onSuccess = em6Var;
            this.this$0 = stereoRoomHandsQueueImpl;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m147invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m147invoke() {
            em6 em6Var = this.$onSuccess;
            if (em6Var != null) {
                em6Var.invoke(this.this$0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$onHandUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00601 extends u08 implements cm6 {
        final /* synthetic */ wt1 $event;
        final /* synthetic */ StereoRoomHandsQueueImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00601(wt1 wt1Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
            super(0);
            this.$event = wt1Var;
            this.this$0 = stereoRoomHandsQueueImpl;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m148invoke();
            return qqg.a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
        /* renamed from: invoke, reason: collision with other method in class */
        public final void m148invoke() {
            ?? r0 = this.$event.c;
            StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = this.this$0;
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke((ti1) it.next());
                if (participantId != null) {
                    stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, stereoRoomHandsQueueImpl.timeProvider.utcTimeMs()), false);
                }
            }
            ?? r02 = this.$event.b;
            StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl2 = this.this$0;
            Iterator it2 = r02.iterator();
            while (it2.hasNext()) {
                ParticipantId participantId2 = (ParticipantId) stereoRoomHandsQueueImpl2.getExternalId.invoke((ti1) it2.next());
                if (participantId2 != null) {
                    stereoRoomHandsQueueImpl2.participantHandChanged(new StereoHandQueueItem(participantId2, stereoRoomHandsQueueImpl2.timeProvider.utcTimeMs()), true);
                }
            }
            this.this$0.totalCount = this.$event.a;
            this.this$0.notifyHandsStatusChanged();
        }
    }

    public StereoRoomHandsQueueImpl(StereoRoomCommandExecutor stereoRoomCommandExecutor, sm6 sm6Var, em6 em6Var, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, y8g y8gVar) {
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idsResolverHelper = sm6Var;
        this.getExternalId = em6Var;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.timeProvider = y8gVar;
    }

    private final void loadHandsQueue(cm6 onSuccess, em6 onError) {
        this.commandExecutor.getHandsQueue(new AnonymousClass1(onSuccess), onError);
    }

    public static /* synthetic */ void loadHandsQueue$default(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            em6Var = null;
        }
        stereoRoomHandsQueueImpl.loadHandsQueue(cm6Var, em6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyHandsStatusChanged() {
        this.listenersManager.onHandStatusChange(new StereoRoomManagerListener.HandStatusUpdated(this.totalCount, getQueue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void participantHandChanged(StereoHandQueueItem item, boolean raised) {
        if (raised) {
            this.handQueue.put(item.getParticipantId(), item);
        } else {
            this.handQueue.remove(item.getParticipantId());
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public int getTotalCount() {
        return this.totalCount;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    /* renamed from: hasMore, reason: from getter */
    public boolean getHasMore() {
        return this.hasMore;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public void loadMoreElements(em6 onSuccess, em6 onError) {
        loadHandsQueue(new C00591(onSuccess, this), onError);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void onHandUp(wt1 event) {
        this.idsResolverHelper.invoke(ue3.T(event.b, event.c), new C00601(event, this));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public List<StereoHandQueueItem> getQueue() {
        HashMap<ParticipantId, StereoHandQueueItem> map = this.handQueue;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<ParticipantId, StereoHandQueueItem>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            StereoHandQueueItem value = it.next().getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        return ue3.X(arrayList, new Comparator() { // from class: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$getQueue$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return b5j.b(Long.valueOf(((StereoHandQueueItem) t).getAddedTs()), Long.valueOf(((StereoHandQueueItem) t2).getAddedTs()));
            }
        });
    }
}
