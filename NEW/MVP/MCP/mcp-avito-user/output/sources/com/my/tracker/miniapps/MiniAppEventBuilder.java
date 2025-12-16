package com.my.tracker.miniapps;

import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public abstract class MiniAppEventBuilder {

    /* renamed from: a, reason: collision with root package name */
    final int f365251a;

    /* renamed from: b, reason: collision with root package name */
    final String f365252b;

    /* renamed from: c, reason: collision with root package name */
    final String f365253c;

    /* renamed from: d, reason: collision with root package name */
    String f365254d;

    /* renamed from: e, reason: collision with root package name */
    String f365255e;

    /* renamed from: f, reason: collision with root package name */
    String f365256f;

    /* renamed from: g, reason: collision with root package name */
    Map<String, String> f365257g;

    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        public CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        public CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f365256f = str3;
        }

        public CustomEventBuilder withCustomUserId(String str) {
            this.f365255e = str;
            return this;
        }

        public CustomEventBuilder withEventParams(Map<String, String> map) {
            this.f365257g = map;
            return this;
        }
    }

    public static final class EventBuilder {

        /* renamed from: a, reason: collision with root package name */
        final String f365258a;

        /* renamed from: b, reason: collision with root package name */
        final String f365259b;

        public EventBuilder(String str, String str2) {
            this.f365258a = str;
            this.f365259b = str2;
        }

        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.f365258a, this.f365259b);
        }

        public CustomEventBuilder customEvent(String str) {
            return new CustomEventBuilder(this.f365258a, this.f365259b, str);
        }

        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.f365258a, this.f365259b);
        }

        public OpenEventBuilder openEvent(String str) {
            return new OpenEventBuilder(this.f365258a, this.f365259b, str);
        }

        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.f365258a, this.f365259b);
        }
    }

    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        public OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.f365254d = str3;
        }
    }

    public static final class UserEventBuilder extends MiniAppEventBuilder {
        public UserEventBuilder(int i12, String str, String str2) {
            super(i12, str, str2);
        }

        public UserEventBuilder withCustomUserId(String str) {
            this.f365255e = str;
            return this;
        }
    }

    public MiniAppEventBuilder(int i12, String str, String str2) {
        this.f365251a = i12;
        this.f365252b = str;
        this.f365253c = str2;
    }

    public static EventBuilder newEventBuilder(String str, String str2) {
        return new EventBuilder(str, str2);
    }

    public final MiniAppEvent build() {
        return new MiniAppEvent(this.f365251a, this.f365252b, this.f365253c, this.f365254d, this.f365255e, this.f365256f, this.f365257g == null ? null : new TreeMap(this.f365257g));
    }
}
