package com.avito.android.messenger.channels.action_banner;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.v;
import com.avito.android.remote.model.UniversalImage;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsBanner.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/channels/action_banner/d;", "", "a", "b", "c", "Lcom/avito/android/messenger/channels/action_banner/d$a;", "Lcom/avito/android/messenger/channels/action_banner/d$b;", "Lcom/avito/android/messenger/channels/action_banner/d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f186716a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f186717b;

    /* renamed from: c, reason: collision with root package name */
    public final int f186718c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f186719d;

    /* renamed from: e, reason: collision with root package name */
    public final int f186720e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f186721f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f186722g;

    /* compiled from: ChannelsBanner.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/action_banner/d$a;", "Lcom/avito/android/messenger/channels/action_banner/d;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f186723h;

        /* renamed from: i, reason: collision with root package name */
        public final long f186724i;

        /* compiled from: ChannelsBanner.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/action_banner/d$a$a;", "", "<init>", "()V", "", "ID", "I", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.action_banner.d$a$a, reason: collision with other inner class name */
        public static final class C5482a {
            public /* synthetic */ C5482a(C42822w c42822w) {
                this();
            }

            public C5482a() {
            }
        }

        static {
            new C5482a(null);
        }

        public a(@Y61.l String str) {
            super(-5, Integer.valueOf(R.string.messenger_auto_replies_banner_message), R.string.messenger_auto_replies_banner_action_text, Integer.valueOf(R.attr.img_bannerNotifications), 3, null, Integer.valueOf(R.string.messenger_auto_replies_banner_title), str, 32, null);
            this.f186723h = str;
            this.f186724i = TimeUnit.DAYS.toMillis(3L);
        }

        @Override // com.avito.android.messenger.channels.action_banner.d
        /* renamed from: a, reason: from getter */
        public final long getF186724i() {
            return this.f186724i;
        }

        @Override // com.avito.android.messenger.channels.action_banner.d
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getF186722g() {
            return this.f186723h;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f186723h, ((a) obj).f186723h);
        }

        public final int hashCode() {
            String str = this.f186723h;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AutoReplies(url="), this.f186723h, ')');
        }
    }

    /* compiled from: ChannelsBanner.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/action_banner/d$b;", "Lcom/avito/android/messenger/channels/action_banner/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final b f186725h = new b();

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public static final UniversalImage f186726i = (UniversalImage) com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner.g.f186939a.getValue();

        /* renamed from: j, reason: collision with root package name */
        public static final long f186727j = TimeUnit.DAYS.toMillis(5);

        public b() {
            super(-2, Integer.valueOf(R.string.messenger_iac_problem_banner_message), R.string.messenger_iac_problem_banner_action, null, 1, null, null, null, 224, null);
        }

        @Override // com.avito.android.messenger.channels.action_banner.d
        /* renamed from: a */
        public final long getF186724i() {
            return f186727j;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1401578645;
        }

        @Y61.k
        public final String toString() {
            return "IacProblem";
        }
    }

    /* compiled from: ChannelsBanner.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/action_banner/d$c;", "Lcom/avito/android/messenger/channels/action_banner/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final c f186728h = new c();

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public static final UniversalImage f186729i = (UniversalImage) v.f187030a.getValue();

        /* renamed from: j, reason: collision with root package name */
        public static final long f186730j = TimeUnit.DAYS.toMillis(45);

        public c() {
            super(-1, Integer.valueOf(R.string.messenger_notifications_banner_message), R.string.messenger_notifications_banner_action, Integer.valueOf(R.attr.img_bannerNotifications), 0, null, null, null, 224, null);
        }

        @Override // com.avito.android.messenger.channels.action_banner.d
        /* renamed from: a */
        public final long getF186724i() {
            return f186730j;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2135326666;
        }

        @Y61.k
        public final String toString() {
            return "NotificationsSettings";
        }
    }

    public /* synthetic */ d(int i12, Integer num, int i13, Integer num2, int i14, String str, Integer num3, String str2, int i15, C42822w c42822w) {
        this(i12, num, i13, num2, i14, (i15 & 32) != 0 ? null : str, (i15 & 64) != 0 ? null : num3, (i15 & 128) != 0 ? null : str2, null);
    }

    /* renamed from: a */
    public abstract long getF186724i();

    @Y61.l
    /* renamed from: b, reason: from getter */
    public String getF186722g() {
        return this.f186722g;
    }

    public d(int i12, Integer num, int i13, Integer num2, int i14, String str, Integer num3, String str2, C42822w c42822w) {
        this.f186716a = i12;
        this.f186717b = num;
        this.f186718c = i13;
        this.f186719d = num2;
        this.f186720e = i14;
        this.f186721f = num3;
        this.f186722g = str2;
    }
}
