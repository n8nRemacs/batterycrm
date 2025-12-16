package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.c;

/* loaded from: classes6.dex */
public final class MessagingClientEvent {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f361891m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f361892a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361893b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361894c;

    /* renamed from: d, reason: collision with root package name */
    public final MessageType f361895d;

    /* renamed from: e, reason: collision with root package name */
    public final SDKPlatform f361896e;

    /* renamed from: f, reason: collision with root package name */
    public final String f361897f;

    /* renamed from: g, reason: collision with root package name */
    public final String f361898g;

    /* renamed from: h, reason: collision with root package name */
    public final int f361899h;

    /* renamed from: i, reason: collision with root package name */
    public final String f361900i;

    /* renamed from: j, reason: collision with root package name */
    public final Event f361901j;

    /* renamed from: k, reason: collision with root package name */
    public final String f361902k;

    /* renamed from: l, reason: collision with root package name */
    public final String f361903l;

    public enum Event implements c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);


        /* renamed from: b, reason: collision with root package name */
        public final int f361907b;

        Event(int i12) {
            this.f361907b = i12;
        }

        @Override // com.google.firebase.encoders.proto.c
        public final int getNumber() {
            return this.f361907b;
        }
    }

    public enum MessageType implements c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: b, reason: collision with root package name */
        public final int f361912b;

        MessageType(int i12) {
            this.f361912b = i12;
        }

        @Override // com.google.firebase.encoders.proto.c
        public final int getNumber() {
            return this.f361912b;
        }
    }

    public enum SDKPlatform implements c {
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);


        /* renamed from: b, reason: collision with root package name */
        public final int f361916b;

        SDKPlatform(int i12) {
            this.f361916b = i12;
        }

        @Override // com.google.firebase.encoders.proto.c
        public final int getNumber() {
            return this.f361916b;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f361917a = 0;

        /* renamed from: b, reason: collision with root package name */
        public String f361918b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f361919c = "";

        /* renamed from: d, reason: collision with root package name */
        public MessageType f361920d = MessageType.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        public SDKPlatform f361921e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        public String f361922f = "";

        /* renamed from: g, reason: collision with root package name */
        public String f361923g = "";

        /* renamed from: h, reason: collision with root package name */
        public int f361924h = 0;

        /* renamed from: i, reason: collision with root package name */
        public String f361925i = "";

        /* renamed from: j, reason: collision with root package name */
        public Event f361926j = Event.UNKNOWN_EVENT;

        /* renamed from: k, reason: collision with root package name */
        public String f361927k = "";

        /* renamed from: l, reason: collision with root package name */
        public String f361928l = "";

        public final MessagingClientEvent a() {
            return new MessagingClientEvent(this.f361917a, this.f361918b, this.f361919c, this.f361920d, this.f361921e, this.f361922f, this.f361923g, this.f361924h, this.f361925i, this.f361926j, this.f361927k, this.f361928l);
        }
    }

    static {
        new a().a();
    }

    public MessagingClientEvent(long j12, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i12, String str5, Event event, String str6, String str7) {
        this.f361892a = j12;
        this.f361893b = str;
        this.f361894c = str2;
        this.f361895d = messageType;
        this.f361896e = sDKPlatform;
        this.f361897f = str3;
        this.f361898g = str4;
        this.f361899h = i12;
        this.f361900i = str5;
        this.f361901j = event;
        this.f361902k = str6;
        this.f361903l = str7;
    }
}
