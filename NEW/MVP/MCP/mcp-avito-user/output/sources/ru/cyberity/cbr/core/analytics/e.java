package ru.cyberity.cbr.core.analytics;

import androidx.appcompat.app.r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.CBRTrackEvents;
import ru.cyberity.log.logger.Logger;

/* compiled from: AnalyticsEventBuilder.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0019J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0011\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u001eJ#\u0010\u0011\u001a\u00020\u00072\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)H\u0016¢\u0006\u0004\b\u0011\u0010-J;\u0010\u0011\u001a\u00020\u00072*\u00100\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0/0.\"\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0/H\u0016¢\u0006\u0004\b\u0011\u00101J\u000f\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u00103J\u0017\u0010\u0011\u001a\u0002062\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b\u0011\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010;R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010=¨\u0006>"}, d2 = {"Lru/cyberity/cbr/core/analytics/e;", "Lru/cyberity/cbr/core/analytics/i;", "Lru/cyberity/cbr/core/analytics/n;", "Lru/cyberity/cbr/core/analytics/j;", "Lru/cyberity/cbr/core/analytics/h;", "Lru/cyberity/cbr/core/analytics/a;", "Lru/cyberity/cbr/core/analytics/k;", "Lru/cyberity/cbr/core/analytics/l;", "", "ts", "<init>", "(J)V", "Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "p", "()Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "Lru/cyberity/cbr/core/analytics/SdkEvent;", "event", "a", "(Lru/cyberity/cbr/core/analytics/SdkEvent;)Lru/cyberity/cbr/core/analytics/k;", "Lru/cyberity/cbr/core/analytics/Screen;", "screen", "(Lru/cyberity/cbr/core/analytics/Screen;)Lru/cyberity/cbr/core/analytics/n;", "Lru/cyberity/cbr/core/analytics/Action;", "action", "(Lru/cyberity/cbr/core/analytics/Action;)Lru/cyberity/cbr/core/analytics/a;", "()Lru/cyberity/cbr/core/analytics/j;", "Lru/cyberity/cbr/core/analytics/Control;", "control", "(Lru/cyberity/cbr/core/analytics/Control;)Lru/cyberity/cbr/core/analytics/h;", "b", "()Lru/cyberity/cbr/core/analytics/k;", "j", "o", "m", "g", "h", "k", "i", "l", "d", "e", "", "", "", "payload", "(Ljava/util/Map;)Lru/cyberity/cbr/core/analytics/l;", "", "Lkotlin/Q;", "pairs", "([Lkotlin/Q;)Lru/cyberity/cbr/core/analytics/l;", "c", "()Lru/cyberity/cbr/core/analytics/l;", "", "immediately", "Lkotlin/G0;", "(Z)V", "J", "", "Lru/cyberity/cbr/core/analytics/m;", "Ljava/util/List;", "eventDescription", "Ljava/util/Map;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e implements i, n, j, h, a, k, l {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private static final SimpleDateFormat f432539e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long ts;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final List<m> eventDescription = new ArrayList();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private Map<String, ? extends Object> payload;

    /* compiled from: AnalyticsEventBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/analytics/m;", "it", "", "a", "(Lru/cyberity/cbr/core/analytics/m;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.l<m, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f432543a = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@Y61.k m mVar) {
            return mVar.getText();
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f432539e = simpleDateFormat;
    }

    public e(long j12) {
        this.ts = j12;
    }

    private final CBRTrackEvents p() {
        String strConcat = "msdk:".concat(C42745f0.O(this.eventDescription, ":", null, null, b.f432543a, 30));
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        StringBuilder sbZ = r.z(strConcat, " payload: ");
        sbZ.append(this.payload);
        Logger.d$default(aVar, "Analytics", sbZ.toString(), null, 4, null);
        return new CBRTrackEvents(strConcat, f432539e.format(new Date()), this.payload);
    }

    @Override // ru.cyberity.cbr.core.analytics.n
    @Y61.k
    public j a() {
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.j
    @Y61.k
    public k b() {
        this.eventDescription.add(NavigationAction.Open);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.k
    @Y61.k
    public l c() {
        this.payload = ru.cyberity.ff.a.f435638a.c();
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.a
    @Y61.k
    public k d() {
        this.eventDescription.add(ActionState.Failed);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.a
    @Y61.k
    public k e() {
        this.eventDescription.add(ActionState.Completed);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.h
    @Y61.k
    public k g() {
        this.eventDescription.add(ControlAction.Clicked);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.h
    @Y61.k
    public k h() {
        this.eventDescription.add(ControlAction.Changed);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.h
    @Y61.k
    public k i() {
        this.eventDescription.add(ControlAction.Expanded);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.j
    @Y61.k
    public k j() {
        this.eventDescription.add(NavigationAction.Appear);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.h
    @Y61.k
    public k k() {
        this.eventDescription.add(ControlAction.Collapsed);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.a
    @Y61.k
    public k l() {
        this.eventDescription.add(ActionState.Started);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.j
    @Y61.k
    public k m() {
        this.eventDescription.add(NavigationAction.Cancel);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.j
    @Y61.k
    public k o() {
        this.eventDescription.add(NavigationAction.Close);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.i
    @Y61.k
    public k a(@Y61.k SdkEvent event) {
        this.eventDescription.add(event);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.i
    @Y61.k
    public n a(@Y61.k Screen screen) {
        this.eventDescription.add(Domain.Ui);
        this.eventDescription.add(screen);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.i
    @Y61.k
    public a a(@Y61.k Action action) {
        this.eventDescription.add(Domain.PrimaryAction);
        this.eventDescription.add(action);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.n
    @Y61.k
    public h a(@Y61.k Control control) {
        this.eventDescription.add(control);
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.k
    @Y61.k
    public l a(@Y61.k Map<String, ? extends Object> payload) {
        this.payload = P0.k(P0.q(payload), ru.cyberity.ff.a.f435638a.c());
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.k
    @Y61.k
    public l a(@Y61.k Q<String, ? extends Object>... pairs) {
        this.payload = P0.k(P0.s(pairs), ru.cyberity.ff.a.f435638a.c());
        return this;
    }

    @Override // ru.cyberity.cbr.core.analytics.l
    public void a(boolean immediately) {
        ru.cyberity.cbr.core.analytics.b.f432519a.a(p(), immediately);
    }
}
