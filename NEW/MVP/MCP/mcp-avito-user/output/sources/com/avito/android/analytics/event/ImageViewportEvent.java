package com.avito.android.analytics.event;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageViewportEvent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/event/ImageViewportEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "EventSource", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageViewportEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f89940b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89941c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f89942d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f89943e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f89944f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f89945g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f89946h;

    /* renamed from: i, reason: collision with root package name */
    public final int f89947i;

    /* renamed from: j, reason: collision with root package name */
    public final int f89948j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageViewportEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/ImageViewportEvent$EventSource;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EventSource {

        /* renamed from: c, reason: collision with root package name */
        public static final EventSource f89949c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EventSource[] f89950d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f89951e;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f89952b;

        static {
            EventSource eventSource = new EventSource("MAIN", 0, "main");
            EventSource eventSource2 = new EventSource("BX_CONTENT", 1, "bx_content");
            f89949c = eventSource2;
            EventSource[] eventSourceArr = {eventSource, eventSource2};
            f89950d = eventSourceArr;
            f89951e = kotlin.enums.c.a(eventSourceArr);
        }

        public EventSource(String str, int i12, String str2) {
            this.f89952b = str2;
        }

        public static EventSource valueOf(String str) {
            return (EventSource) Enum.valueOf(EventSource.class, str);
        }

        public static EventSource[] values() {
            return (EventSource[]) f89950d.clone();
        }
    }

    /* compiled from: ImageViewportEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/analytics/event/ImageViewportEvent$a;", "", "<init>", "()V", "", "THROTTLING_PERCENT", "D", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ ImageViewportEvent(int i12, int i13, String str, String str2, String str3, String str4, String str5, int i14, C42822w c42822w) {
        this(str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, i12, i13, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF89947i() {
        return this.f89947i;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("width", Integer.valueOf(this.f89940b)), new kotlin.Q("height", Integer.valueOf(this.f89941c)), new kotlin.Q("context", this.f89942d));
        String str = this.f89943e;
        if (str != null) {
            linkedHashMapJ.put("screen", str);
        }
        String str2 = this.f89944f;
        if (str2 != null) {
            linkedHashMapJ.put("view_type", str2);
        }
        String str3 = this.f89945g;
        if (str3 != null) {
            linkedHashMapJ.put("item_type", str3);
        }
        String str4 = this.f89946h;
        if (str4 != null) {
            linkedHashMapJ.put("from_page", str4);
        }
        return linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF89948j() {
        return this.f89948j;
    }

    public ImageViewportEvent(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, int i12, int i13, @Y61.l String str4, @Y61.l String str5) {
        this.f89940b = i12;
        this.f89941c = i13;
        this.f89942d = str;
        this.f89943e = str2;
        this.f89944f = str3;
        this.f89945g = str4;
        this.f89946h = str5;
        this.f89947i = 4992;
        this.f89948j = 1;
    }
}
