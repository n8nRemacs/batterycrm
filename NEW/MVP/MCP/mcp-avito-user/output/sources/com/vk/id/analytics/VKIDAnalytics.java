package com.vk.id.analytics;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.media3.common.C23088b;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.common.InternalVKIDApi;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VKIDAnalytics.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/vk/id/analytics/VKIDAnalytics;", "", "<init>", "()V", "Tracker", "EventParam", "Trackers", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDAnalytics {

    /* renamed from: Trackers, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final ArrayList<Tracker> trackers = new ArrayList<>();

    @k
    private static volatile Tracker[] trackersArray = new Tracker[0];

    /* compiled from: VKIDAnalytics.kt */
    @InternalVKIDApi
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "", "", "accessToken", "name", "", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "params", "Lkotlin/G0;", "trackEvent", "(Ljava/lang/String;Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;)V", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Tracker {

        /* compiled from: VKIDAnalytics.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void trackEvent(@k Tracker tracker, @k String str, @k EventParam... eventParamArr) {
                tracker.trackEvent(null, str, (EventParam[]) Arrays.copyOf(eventParamArr, eventParamArr.length));
            }
        }

        void trackEvent(@l String accessToken, @k String name, @k EventParam... params);
    }

    /* compiled from: VKIDAnalytics.kt */
    @s0
    @InternalVKIDApi
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010j\b\u0012\u0004\u0012\u00020\u0001`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/vk/id/analytics/VKIDAnalytics$Trackers;", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "<init>", "()V", "", "accessToken", "name", "", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "params", "Lkotlin/G0;", "trackEvent", "(Ljava/lang/String;Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;)V", "tracker", "addTracker", "(Lcom/vk/id/analytics/VKIDAnalytics$Tracker;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "Ljava/util/ArrayList;", "trackersArray", "[Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.vk.id.analytics.VKIDAnalytics$Trackers, reason: from kotlin metadata */
    public static final class Companion implements Tracker {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @n
        public final void addTracker(@k Tracker tracker) {
            if (VKIDAnalytics.trackers.contains(tracker)) {
                return;
            }
            if (tracker == this) {
                throw new IllegalArgumentException("Cannot add VKIDAnalytics into itself.");
            }
            synchronized (VKIDAnalytics.trackers) {
                VKIDAnalytics.trackers.add(tracker);
                VKIDAnalytics.trackersArray = (Tracker[]) VKIDAnalytics.trackers.toArray(new Tracker[0]);
                G0 g02 = G0.f406611a;
            }
        }

        public void trackEvent(@k String str, @k EventParam... eventParamArr) {
            Tracker.DefaultImpls.trackEvent(this, str, eventParamArr);
        }

        private Companion() {
        }

        @Override // com.vk.id.analytics.VKIDAnalytics.Tracker
        @n
        public void trackEvent(@l String accessToken, @k String name, @k EventParam... params) {
            for (Tracker tracker : VKIDAnalytics.trackersArray) {
                tracker.trackEvent(accessToken, name, (EventParam[]) Arrays.copyOf(params, params.length));
            }
        }
    }

    private VKIDAnalytics() {
    }

    /* compiled from: VKIDAnalytics.kt */
    @InternalVKIDApi
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "", "", "name", "strValue", "", "intValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getStrValue", "Ljava/lang/Integer;", "getIntValue", "()Ljava/lang/Integer;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EventParam {

        @l
        private final Integer intValue;

        @k
        private final String name;

        @l
        private final String strValue;

        public EventParam(@k String str, @l String str2, @l Integer num) {
            this.name = str;
            this.strValue = str2;
            this.intValue = num;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventParam)) {
                return false;
            }
            EventParam eventParam = (EventParam) other;
            return L.f(this.name, eventParam.name) && L.f(this.strValue, eventParam.strValue) && L.f(this.intValue, eventParam.intValue);
        }

        @l
        public final Integer getIntValue() {
            return this.intValue;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final String getStrValue() {
            return this.strValue;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.strValue;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.intValue;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @k
        public String toString() {
            String str = this.name;
            String str2 = this.strValue;
            Integer num = this.intValue;
            StringBuilder sbB = C23088b.b("EventParam(name=", str, ", strValue=", str2, ", intValue=");
            sbB.append(num);
            sbB.append(")");
            return sbB.toString();
        }

        public /* synthetic */ EventParam(String str, String str2, Integer num, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : num);
        }
    }
}
