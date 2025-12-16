package com.facebook.drawee.components;

import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ArrayBlockingQueue;

@Nullsafe
/* loaded from: classes.dex */
public class DraweeEventTracker {

    /* renamed from: b, reason: collision with root package name */
    public static final DraweeEventTracker f339950b = new DraweeEventTracker();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f339951c = true;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f339952a = new ArrayBlockingQueue(20);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Event {

        /* renamed from: b, reason: collision with root package name */
        public static final Event f339953b;

        /* renamed from: c, reason: collision with root package name */
        public static final Event f339954c;

        /* renamed from: d, reason: collision with root package name */
        public static final Event f339955d;

        /* renamed from: e, reason: collision with root package name */
        public static final Event f339956e;

        /* renamed from: f, reason: collision with root package name */
        public static final Event f339957f;

        /* renamed from: g, reason: collision with root package name */
        public static final Event f339958g;

        /* renamed from: h, reason: collision with root package name */
        public static final Event f339959h;

        /* renamed from: i, reason: collision with root package name */
        public static final Event f339960i;

        /* renamed from: j, reason: collision with root package name */
        public static final Event f339961j;

        /* renamed from: k, reason: collision with root package name */
        public static final Event f339962k;

        /* renamed from: l, reason: collision with root package name */
        public static final Event f339963l;

        /* renamed from: m, reason: collision with root package name */
        public static final Event f339964m;

        /* renamed from: n, reason: collision with root package name */
        public static final Event f339965n;

        /* renamed from: o, reason: collision with root package name */
        public static final Event f339966o;

        /* renamed from: p, reason: collision with root package name */
        public static final Event f339967p;

        /* renamed from: q, reason: collision with root package name */
        public static final Event f339968q;

        /* renamed from: r, reason: collision with root package name */
        public static final Event f339969r;

        /* renamed from: s, reason: collision with root package name */
        public static final Event f339970s;

        /* renamed from: t, reason: collision with root package name */
        public static final Event f339971t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ Event[] f339972u;

        static {
            Event event = new Event("ON_SET_HIERARCHY", 0);
            f339953b = event;
            Event event2 = new Event("ON_CLEAR_HIERARCHY", 1);
            f339954c = event2;
            Event event3 = new Event("ON_SET_CONTROLLER", 2);
            f339955d = event3;
            Event event4 = new Event("ON_CLEAR_OLD_CONTROLLER", 3);
            f339956e = event4;
            Event event5 = new Event("ON_CLEAR_CONTROLLER", 4);
            f339957f = event5;
            Event event6 = new Event("ON_INIT_CONTROLLER", 5);
            f339958g = event6;
            Event event7 = new Event("ON_ATTACH_CONTROLLER", 6);
            f339959h = event7;
            Event event8 = new Event("ON_DETACH_CONTROLLER", 7);
            f339960i = event8;
            Event event9 = new Event("ON_RELEASE_CONTROLLER", 8);
            f339961j = event9;
            Event event10 = new Event("ON_DATASOURCE_SUBMIT", 9);
            f339962k = event10;
            Event event11 = new Event("ON_DATASOURCE_RESULT", 10);
            f339963l = event11;
            Event event12 = new Event("ON_DATASOURCE_RESULT_INT", 11);
            f339964m = event12;
            Event event13 = new Event("ON_DATASOURCE_FAILURE", 12);
            f339965n = event13;
            Event event14 = new Event("ON_DATASOURCE_FAILURE_INT", 13);
            f339966o = event14;
            Event event15 = new Event("ON_HOLDER_ATTACH", 14);
            f339967p = event15;
            Event event16 = new Event("ON_HOLDER_DETACH", 15);
            f339968q = event16;
            Event event17 = new Event("ON_DRAWABLE_SHOW", 16);
            f339969r = event17;
            Event event18 = new Event("ON_DRAWABLE_HIDE", 17);
            f339970s = event18;
            Event event19 = new Event("ON_ACTIVITY_START", 18);
            Event event20 = new Event("ON_ACTIVITY_STOP", 19);
            Event event21 = new Event("ON_RUN_CLEAR_CONTROLLER", 20);
            Event event22 = new Event("ON_SCHEDULE_CLEAR_CONTROLLER", 21);
            Event event23 = new Event("ON_SAME_CONTROLLER_SKIPPED", 22);
            Event event24 = new Event("ON_SUBMIT_CACHE_HIT", 23);
            f339971t = event24;
            f339972u = new Event[]{event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11, event12, event13, event14, event15, event16, event17, event18, event19, event20, event21, event22, event23, event24};
        }

        public Event() {
            throw null;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) f339972u.clone();
        }
    }

    public final void a(Event event) {
        if (f339951c) {
            ArrayBlockingQueue arrayBlockingQueue = this.f339952a;
            if (arrayBlockingQueue.size() + 1 > 20) {
                arrayBlockingQueue.poll();
            }
            arrayBlockingQueue.add(event);
        }
    }

    public final String toString() {
        return this.f339952a.toString();
    }
}
