package ru.ok.android.externcalls.sdk.capabilities;

import defpackage.f2;
import defpackage.fni;
import defpackage.gke;
import defpackage.i2;
import defpackage.rd5;
import defpackage.tk4;
import defpackage.to8;
import defpackage.yg5;
import defpackage.zg5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities;", "", "caps", "", "Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities$Capability;", "([Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities$Capability;)V", "", "(Ljava/util/Set;)V", "getValue", "", "has", "", "cap", "minus", "bit", "plus", "set", "Capability", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClientCapabilities {
    private static final int BIT_ADD_PARTICIPANT = 15;
    private static final int BIT_ADMIN_MUTE_NOTIFY = 5;
    private static final int BIT_AUDIENCE_MODE = 11;
    private static final int BIT_CALL_TO_CONTACTS = 10;
    private static final int BIT_FILTER_DEFAULTS = 3;
    private static final int BIT_SCREEN_TRACK_CONSUMER = 4;
    private static final int BIT_SCREEN_TRACK_PRODUCER = 0;
    private static final int BIT_SESSION_ROOMS = 8;
    private static final int BIT_SESSION_STATE_UPDATES = 14;
    private static final int BIT_VIDEO_TRACKS = 1;
    private static final int BIT_VMOJI = 9;
    private static final int BIT_WAITING_HALL = 2;
    private static final int BIT_WATCH_MOVIE = 6;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Set<Capability> caps;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities$Capability;", "", "bit", "", "(Ljava/lang/String;II)V", "getBit$calls_sdk_release", "()I", "SCREEN_TRACK_PRODUCER", "VIDEO_TRACKS", "WAITING_HALL", "FILTER_DEFAULTS", "SCREEN_TRACK_CONSUMER", "ADMIN_MUTE_NOTIFY", "WATCH_MOVIE", "SESSION_ROOMS", "VMOJI", "CALL_TO_CONTACTS", "SESSION_STATE_UPDATES", "AUDIENCE_MODE", "ADD_PARTICIPANT", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Capability {
        private static final /* synthetic */ yg5 $ENTRIES;
        private static final /* synthetic */ Capability[] $VALUES;
        private final int bit;
        public static final Capability SCREEN_TRACK_PRODUCER = new Capability("SCREEN_TRACK_PRODUCER", 0, 0);
        public static final Capability VIDEO_TRACKS = new Capability("VIDEO_TRACKS", 1, 1);
        public static final Capability WAITING_HALL = new Capability("WAITING_HALL", 2, 2);
        public static final Capability FILTER_DEFAULTS = new Capability("FILTER_DEFAULTS", 3, 3);
        public static final Capability SCREEN_TRACK_CONSUMER = new Capability("SCREEN_TRACK_CONSUMER", 4, 4);
        public static final Capability ADMIN_MUTE_NOTIFY = new Capability("ADMIN_MUTE_NOTIFY", 5, 5);
        public static final Capability WATCH_MOVIE = new Capability("WATCH_MOVIE", 6, 6);
        public static final Capability SESSION_ROOMS = new Capability("SESSION_ROOMS", 7, 8);
        public static final Capability VMOJI = new Capability("VMOJI", 8, 9);
        public static final Capability CALL_TO_CONTACTS = new Capability("CALL_TO_CONTACTS", 9, 10);
        public static final Capability SESSION_STATE_UPDATES = new Capability("SESSION_STATE_UPDATES", 10, 14);
        public static final Capability AUDIENCE_MODE = new Capability("AUDIENCE_MODE", 11, 11);
        public static final Capability ADD_PARTICIPANT = new Capability("ADD_PARTICIPANT", 12, 15);

        private static final /* synthetic */ Capability[] $values() {
            return new Capability[]{SCREEN_TRACK_PRODUCER, VIDEO_TRACKS, WAITING_HALL, FILTER_DEFAULTS, SCREEN_TRACK_CONSUMER, ADMIN_MUTE_NOTIFY, WATCH_MOVIE, SESSION_ROOMS, VMOJI, CALL_TO_CONTACTS, SESSION_STATE_UPDATES, AUDIENCE_MODE, ADD_PARTICIPANT};
        }

        static {
            Capability[] capabilityArr$values = $values();
            $VALUES = capabilityArr$values;
            $ENTRIES = new zg5(capabilityArr$values);
        }

        private Capability(String str, int i, int i2) {
            this.bit = i2;
        }

        public static yg5 getEntries() {
            return $ENTRIES;
        }

        public static Capability valueOf(String str) {
            return (Capability) Enum.valueOf(Capability.class, str);
        }

        public static Capability[] values() {
            return (Capability[]) $VALUES.clone();
        }

        /* renamed from: getBit$calls_sdk_release, reason: from getter */
        public final int getBit() {
            return this.bit;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities$Companion;", "", "()V", "BIT_ADD_PARTICIPANT", "", "BIT_ADMIN_MUTE_NOTIFY", "BIT_AUDIENCE_MODE", "BIT_CALL_TO_CONTACTS", "BIT_FILTER_DEFAULTS", "BIT_SCREEN_TRACK_CONSUMER", "BIT_SCREEN_TRACK_PRODUCER", "BIT_SESSION_ROOMS", "BIT_SESSION_STATE_UPDATES", "BIT_VIDEO_TRACKS", "BIT_VMOJI", "BIT_WAITING_HALL", "BIT_WATCH_MOVIE", "default", "Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities;", "empty", "from", SdkMetricStatEvent.VALUE_KEY, "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        /* renamed from: default, reason: not valid java name */
        public final ClientCapabilities m136default() {
            return new ClientCapabilities(gke.h(Capability.SCREEN_TRACK_PRODUCER, Capability.VIDEO_TRACKS, Capability.WAITING_HALL, Capability.FILTER_DEFAULTS, Capability.SCREEN_TRACK_CONSUMER, Capability.ADMIN_MUTE_NOTIFY, Capability.WATCH_MOVIE, Capability.SESSION_ROOMS, Capability.VMOJI, Capability.CALL_TO_CONTACTS, Capability.AUDIENCE_MODE, Capability.ADD_PARTICIPANT), null);
        }

        public final ClientCapabilities empty() {
            return new ClientCapabilities(rd5.a, null);
        }

        public final ClientCapabilities from(int value) {
            HashSet hashSet = new HashSet();
            i2 i2Var = (i2) Capability.getEntries();
            i2Var.getClass();
            f2 f2Var = new f2(0, i2Var);
            while (f2Var.hasNext()) {
                Capability capability = (Capability) f2Var.next();
                if (((1 << capability.getBit()) & value) != 0) {
                    hashSet.add(capability);
                }
            }
            return new ClientCapabilities(hashSet, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClientCapabilities(Set set, tk4 tk4Var) {
        this((Set<? extends Capability>) set);
    }

    /* renamed from: default, reason: not valid java name */
    public static final ClientCapabilities m135default() {
        return INSTANCE.m136default();
    }

    public static final ClientCapabilities empty() {
        return INSTANCE.empty();
    }

    public static final ClientCapabilities from(int i) {
        return INSTANCE.from(i);
    }

    public final int getValue() {
        Iterator<Capability> it = this.caps.iterator();
        int bit = 0;
        while (it.hasNext()) {
            bit |= 1 << it.next().getBit();
        }
        return bit;
    }

    public final boolean has(Capability cap) {
        return this.caps.contains(cap);
    }

    public final ClientCapabilities minus(Capability bit) {
        return set(bit, false);
    }

    public final ClientCapabilities plus(Capability bit) {
        return set(bit, true);
    }

    public final ClientCapabilities set(Capability cap, boolean set) {
        if (set && !this.caps.contains(cap)) {
            return new ClientCapabilities(gke.f(this.caps, cap));
        }
        if (set || !this.caps.contains(cap)) {
            return this;
        }
        Set<Capability> set2 = this.caps;
        LinkedHashSet linkedHashSet = new LinkedHashSet(to8.i(set2.size()));
        boolean z = false;
        for (Object obj : set2) {
            boolean z2 = true;
            if (!z && fni.a(obj, cap)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        return new ClientCapabilities(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ClientCapabilities(Set<? extends Capability> set) {
        this.caps = set;
    }

    public ClientCapabilities(Capability... capabilityArr) {
        this((Set<? extends Capability>) gke.h(Arrays.copyOf(capabilityArr, capabilityArr.length)));
    }
}
