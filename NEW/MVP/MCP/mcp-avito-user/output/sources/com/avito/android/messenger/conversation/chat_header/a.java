package com.avito.android.messenger.conversation.chat_header;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.header.HeaderTitleButton;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: ChatHeader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/a;", "", "a", "b", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C5582a f189376a = C5582a.f189377a;

    /* compiled from: ChatHeader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.chat_header.a$a, reason: collision with other inner class name */
    public static final class C5582a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C5582a f189377a = new C5582a();

        @Y61.k
        public static a a(@Y61.k ConstraintLayout constraintLayout) {
            return new com.avito.android.messenger.conversation.chat_header.c(constraintLayout);
        }
    }

    /* compiled from: ChatHeader.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/a$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/chat_header/a$b$a;", "Lcom/avito/android/messenger/conversation/chat_header/a$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ChatHeader.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/a$b$a;", "Lcom/avito/android/messenger/conversation/chat_header/a$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.chat_header.a$b$a, reason: collision with other inner class name */
        public static final class C5583a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5583a f189378a = new C5583a();

            public C5583a() {
                super(null);
            }
        }

        /* compiled from: ChatHeader.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/a$b$b;", "Lcom/avito/android/messenger/conversation/chat_header/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.chat_header.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5584b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f189379a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f189380b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final com.avito.android.image_loader.k f189381c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f189382d;

            public C5584b() {
                this(null, null, null, null, 15, null);
            }

            public final boolean a() {
                String str;
                return C43066x.K(this.f189379a) && ((str = this.f189380b) == null || C43066x.K(str));
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5584b)) {
                    return false;
                }
                C5584b c5584b = (C5584b) obj;
                return L.f(this.f189379a, c5584b.f189379a) && L.f(this.f189380b, c5584b.f189380b) && L.f(this.f189381c, c5584b.f189381c) && L.f(this.f189382d, c5584b.f189382d);
            }

            public final int hashCode() {
                int iHashCode = this.f189379a.hashCode() * 31;
                String str = this.f189380b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                com.avito.android.image_loader.k kVar = this.f189381c;
                int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
                String str2 = this.f189382d;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Item(itemTitle=");
                sb2.append(this.f189379a);
                sb2.append(", itemPrice=");
                sb2.append(this.f189380b);
                sb2.append(", itemImage=");
                sb2.append(this.f189381c);
                sb2.append(", headerButtonTitle=");
                return C22026a.c(sb2, this.f189382d, ')');
            }

            public /* synthetic */ C5584b(String str, String str2, com.avito.android.image_loader.k kVar, String str3, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : kVar, (i12 & 8) != 0 ? null : str3);
            }

            public C5584b(@Y61.k String str, @l String str2, @l com.avito.android.image_loader.k kVar, @l String str3) {
                super(null);
                this.f189379a = str;
                this.f189380b = str2;
                this.f189381c = kVar;
                this.f189382d = str3;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ChatHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }

    @Y61.k
    /* renamed from: Y9 */
    com.jakewharton.rxrelay3.c getF189402B();

    @Y61.k
    /* renamed from: Z9 */
    com.jakewharton.rxrelay3.c getF189409I();

    @Y61.k
    z<G0> aa();

    @Y61.k
    /* renamed from: ba */
    com.jakewharton.rxrelay3.c getF189408H();

    @Y61.k
    z<G0> ca();

    @Y61.k
    /* renamed from: da */
    com.jakewharton.rxrelay3.c getF189407G();

    void ea();

    void fa(@Y61.k d dVar);

    void ga(boolean z12);

    @Y61.k
    z<G0> ha();

    @Y61.k
    z<G0> ia();

    void j2();

    @Y61.k
    z<G0> ja();

    void show();

    /* compiled from: ChatHeader.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/a$d;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f189383a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f189384b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final b f189385c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f189386d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f189387e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f189388f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Image f189389g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f189390h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f189391i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f189392j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f189393k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f189394l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final Float f189395m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final String f189396n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final HeaderTitleButton f189397o;

        public d(@Y61.k String str, @Y61.k String str2, @Y61.k b bVar, boolean z12, boolean z13, boolean z14, @l Image image, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, @l Float f12, @l String str3, @l HeaderTitleButton headerTitleButton) {
            this.f189383a = str;
            this.f189384b = str2;
            this.f189385c = bVar;
            this.f189386d = z12;
            this.f189387e = z13;
            this.f189388f = z14;
            this.f189389g = image;
            this.f189390h = z15;
            this.f189391i = z16;
            this.f189392j = z17;
            this.f189393k = z18;
            this.f189394l = z19;
            this.f189395m = f12;
            this.f189396n = str3;
            this.f189397o = headerTitleButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f189383a, dVar.f189383a) && L.f(this.f189384b, dVar.f189384b) && L.f(this.f189385c, dVar.f189385c) && this.f189386d == dVar.f189386d && this.f189387e == dVar.f189387e && this.f189388f == dVar.f189388f && L.f(this.f189389g, dVar.f189389g) && this.f189390h == dVar.f189390h && this.f189391i == dVar.f189391i && this.f189392j == dVar.f189392j && this.f189393k == dVar.f189393k && this.f189394l == dVar.f189394l && L.f(this.f189395m, dVar.f189395m) && L.f(this.f189396n, dVar.f189396n) && L.f(this.f189397o, dVar.f189397o);
        }

        public final int hashCode() {
            int i12 = r.i(r.i(r.i((this.f189385c.hashCode() + H.d(this.f189383a.hashCode() * 31, 31, this.f189384b)) * 31, 31, this.f189386d), 31, this.f189387e), 31, this.f189388f);
            Image image = this.f189389g;
            int i13 = r.i(r.i(r.i(r.i(r.i((i12 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f189390h), 31, this.f189391i), 31, this.f189392j), 31, this.f189393k), 31, this.f189394l);
            Float f12 = this.f189395m;
            int iHashCode = (i13 + (f12 == null ? 0 : f12.hashCode())) * 31;
            String str = this.f189396n;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            HeaderTitleButton headerTitleButton = this.f189397o;
            return iHashCode2 + (headerTitleButton != null ? headerTitleButton.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "State(chatTitle=" + this.f189383a + ", chatSubtitle=" + this.f189384b + ", context=" + this.f189385c + ", showOnboardingTooltip=" + this.f189386d + ", showOnboardingB2SCall=" + this.f189387e + ", showOnboardingS2BCall=" + this.f189388f + ", avatarImage=" + this.f189389g + ", isConnecting=" + this.f189390h + ", isUserOnline=" + this.f189391i + ", isB2SCallAvailable=" + this.f189392j + ", isS2BCallAvailable=" + this.f189393k + ", isSystemChannel=" + this.f189394l + ", chatInterlocutorRating=" + this.f189395m + ", description=" + this.f189396n + ", headerTitleButton=" + this.f189397o + ')';
        }

        public /* synthetic */ d(String str, String str2, b bVar, boolean z12, boolean z13, boolean z14, Image image, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Float f12, String str3, HeaderTitleButton headerTitleButton, int i12, C42822w c42822w) {
            this(str, str2, bVar, z12, z13, z14, (i12 & 64) != 0 ? null : image, (i12 & 128) != 0 ? false : z15, (i12 & 256) != 0 ? false : z16, (i12 & 512) != 0 ? false : z17, (i12 & 1024) != 0 ? false : z18, (i12 & 2048) != 0 ? false : z19, (i12 & 4096) != 0 ? null : f12, str3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : headerTitleButton);
        }
    }
}
