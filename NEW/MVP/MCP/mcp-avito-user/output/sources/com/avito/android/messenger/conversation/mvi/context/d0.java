package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.header.HeaderTitleButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: ChannelContextView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d0 extends com.avito.android.mvi.e<c> {

    /* compiled from: ChannelContextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ChannelContextView.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/context/d0$b$a;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$b$b;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ChannelContextView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$b$a;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f190300a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: ChannelContextView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$b$b;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.context.d0$b$b, reason: collision with other inner class name */
        public static final class C5635b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5635b f190301a = new C5635b();

            public C5635b() {
                super(null);
            }
        }

        /* compiled from: ChannelContextView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$b$c;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @X41.f
            @Y61.k
            public final String f190302a;

            /* renamed from: b, reason: collision with root package name */
            @X41.f
            @Y61.k
            public final String f190303b;

            /* renamed from: c, reason: collision with root package name */
            @X41.f
            @Y61.k
            public final com.avito.android.image_loader.a f190304c;

            /* renamed from: d, reason: collision with root package name */
            @X41.f
            @Y61.l
            public final String f190305d;

            /* renamed from: e, reason: collision with root package name */
            @X41.f
            @Y61.l
            public final DeepLink f190306e;

            public c(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str3, @Y61.l DeepLink deepLink) {
                super(null);
                this.f190302a = str;
                this.f190303b = str2;
                this.f190304c = aVar;
                this.f190305d = str3;
                this.f190306e = deepLink;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ChannelContextView.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c$a;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c$b;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: ChannelContextView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$c$a;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f190307a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Image f190308b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f190309c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final b f190310d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f190311e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f190312f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f190313g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f190314h;

            /* renamed from: i, reason: collision with root package name */
            public final boolean f190315i;

            /* renamed from: j, reason: collision with root package name */
            public final boolean f190316j;

            /* renamed from: k, reason: collision with root package name */
            public final boolean f190317k;

            /* renamed from: l, reason: collision with root package name */
            public final boolean f190318l;

            /* renamed from: m, reason: collision with root package name */
            @Y61.l
            public final Float f190319m;

            /* renamed from: n, reason: collision with root package name */
            @Y61.l
            public final String f190320n;

            /* renamed from: o, reason: collision with root package name */
            @Y61.l
            public final HeaderTitleButton f190321o;

            public a() {
                this(null, null, null, null, false, false, false, false, false, false, false, false, null, null, null, 32767, null);
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final Image getF190353b() {
                return this.f190308b;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.l
            /* renamed from: b, reason: from getter */
            public final Float getF190364m() {
                return this.f190319m;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF190352a() {
                return this.f190307a;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.l
            /* renamed from: d, reason: from getter */
            public final String getF190365n() {
                return this.f190320n;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.l
            /* renamed from: e, reason: from getter */
            public final HeaderTitleButton getF190366o() {
                return this.f190321o;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.k
            /* renamed from: f, reason: from getter */
            public final b getF190355d() {
                return this.f190310d;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.k
            /* renamed from: g, reason: from getter */
            public final String getF190354c() {
                return this.f190309c;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: h, reason: from getter */
            public final boolean getF190358g() {
                return this.f190313g;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: i, reason: from getter */
            public final boolean getF190359h() {
                return this.f190314h;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: j, reason: from getter */
            public final boolean getF190357f() {
                return this.f190312f;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: k, reason: from getter */
            public final boolean getF190362k() {
                return this.f190317k;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: l, reason: from getter */
            public final boolean getF190356e() {
                return this.f190311e;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: m, reason: from getter */
            public final boolean getF190363l() {
                return this.f190318l;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: n, reason: from getter */
            public final boolean getF190361j() {
                return this.f190316j;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: o, reason: from getter */
            public final boolean getF190360i() {
                return this.f190315i;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Image image, String str2, b bVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Float f12, String str3, HeaderTitleButton headerTitleButton, int i12, C42822w c42822w) {
                super(null);
                String str4 = (i12 & 1) != 0 ? "" : str;
                Image image2 = (i12 & 2) != 0 ? null : image;
                String str5 = (i12 & 4) == 0 ? str2 : "";
                b bVar2 = (i12 & 8) != 0 ? b.a.f190300a : bVar;
                boolean z22 = (i12 & 16) != 0 ? false : z12;
                boolean z23 = (i12 & 32) != 0 ? false : z13;
                boolean z24 = (i12 & 64) != 0 ? false : z14;
                boolean z25 = (i12 & 128) != 0 ? false : z15;
                boolean z26 = (i12 & 256) != 0 ? false : z16;
                boolean z27 = (i12 & 512) != 0 ? false : z17;
                boolean z28 = (i12 & 1024) != 0 ? false : z18;
                boolean z29 = (i12 & 2048) == 0 ? z19 : false;
                Float f13 = (i12 & 4096) != 0 ? null : f12;
                String str6 = (i12 & 8192) != 0 ? null : str3;
                HeaderTitleButton headerTitleButton2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : headerTitleButton;
                this.f190307a = str4;
                this.f190308b = image2;
                this.f190309c = str5;
                this.f190310d = bVar2;
                this.f190311e = z22;
                this.f190312f = z23;
                this.f190313g = z24;
                this.f190314h = z25;
                this.f190315i = z26;
                this.f190316j = z27;
                this.f190317k = z28;
                this.f190318l = z29;
                this.f190319m = f13;
                this.f190320n = str6;
                this.f190321o = headerTitleButton2;
            }
        }

        /* compiled from: ChannelContextView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$c$b;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f190322a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Image f190323b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f190324c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final b f190325d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f190326e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f190327f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f190328g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f190329h;

            /* renamed from: i, reason: collision with root package name */
            public final boolean f190330i;

            /* renamed from: j, reason: collision with root package name */
            public final boolean f190331j;

            /* renamed from: k, reason: collision with root package name */
            public final boolean f190332k;

            /* renamed from: l, reason: collision with root package name */
            public final boolean f190333l;

            /* renamed from: m, reason: collision with root package name */
            @Y61.l
            public final Float f190334m;

            /* renamed from: n, reason: collision with root package name */
            @Y61.l
            public final String f190335n;

            /* renamed from: o, reason: collision with root package name */
            @Y61.l
            public final HeaderTitleButton f190336o;

            public b() {
                this(null, null, null, null, false, false, false, false, false, false, false, false, null, null, null, 32767, null);
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final Image getF190353b() {
                return this.f190323b;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.l
            /* renamed from: b, reason: from getter */
            public final Float getF190364m() {
                return this.f190334m;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF190352a() {
                return this.f190322a;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.l
            /* renamed from: d, reason: from getter */
            public final String getF190365n() {
                return this.f190335n;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.l
            /* renamed from: e, reason: from getter */
            public final HeaderTitleButton getF190366o() {
                return this.f190336o;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.k
            /* renamed from: f, reason: from getter */
            public final b getF190355d() {
                return this.f190325d;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            @Y61.k
            /* renamed from: g, reason: from getter */
            public final String getF190354c() {
                return this.f190324c;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: h, reason: from getter */
            public final boolean getF190358g() {
                return this.f190328g;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: i, reason: from getter */
            public final boolean getF190359h() {
                return this.f190329h;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: j, reason: from getter */
            public final boolean getF190357f() {
                return this.f190327f;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: k, reason: from getter */
            public final boolean getF190362k() {
                return this.f190332k;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: l, reason: from getter */
            public final boolean getF190356e() {
                return this.f190326e;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: m, reason: from getter */
            public final boolean getF190363l() {
                return this.f190333l;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: n, reason: from getter */
            public final boolean getF190361j() {
                return this.f190331j;
            }

            @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
            /* renamed from: o, reason: from getter */
            public final boolean getF190360i() {
                return this.f190330i;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Image image, String str2, b bVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Float f12, String str3, HeaderTitleButton headerTitleButton, int i12, C42822w c42822w) {
                super(null);
                String str4 = (i12 & 1) != 0 ? "" : str;
                Image image2 = (i12 & 2) != 0 ? null : image;
                String str5 = (i12 & 4) == 0 ? str2 : "";
                b bVar2 = (i12 & 8) != 0 ? b.a.f190300a : bVar;
                boolean z22 = (i12 & 16) != 0 ? false : z12;
                boolean z23 = (i12 & 32) != 0 ? false : z13;
                boolean z24 = (i12 & 64) != 0 ? false : z14;
                boolean z25 = (i12 & 128) != 0 ? false : z15;
                boolean z26 = (i12 & 256) != 0 ? false : z16;
                boolean z27 = (i12 & 512) != 0 ? false : z17;
                boolean z28 = (i12 & 1024) != 0 ? false : z18;
                boolean z29 = (i12 & 2048) == 0 ? z19 : false;
                Float f13 = (i12 & 4096) != 0 ? null : f12;
                String str6 = (i12 & 8192) != 0 ? null : str3;
                HeaderTitleButton headerTitleButton2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : headerTitleButton;
                this.f190322a = str4;
                this.f190323b = image2;
                this.f190324c = str5;
                this.f190325d = bVar2;
                this.f190326e = z22;
                this.f190327f = z23;
                this.f190328g = z24;
                this.f190329h = z25;
                this.f190330i = z26;
                this.f190331j = z27;
                this.f190332k = z28;
                this.f190333l = z29;
                this.f190334m = f13;
                this.f190335n = str6;
                this.f190336o = headerTitleButton2;
            }
        }

        /* compiled from: ChannelContextView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$c$c;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c$c$a;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c$c$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.context.d0$c$c, reason: collision with other inner class name */
        public static abstract class AbstractC5636c extends c {

            /* compiled from: ChannelContextView.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$c$c$a;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.context.d0$c$c$a */
            public static final class a extends AbstractC5636c {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f190337a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final Image f190338b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final String f190339c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final b.c f190340d;

                /* renamed from: e, reason: collision with root package name */
                public final boolean f190341e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f190342f;

                /* renamed from: g, reason: collision with root package name */
                public final boolean f190343g;

                /* renamed from: h, reason: collision with root package name */
                public final boolean f190344h;

                /* renamed from: i, reason: collision with root package name */
                public final boolean f190345i;

                /* renamed from: j, reason: collision with root package name */
                public final boolean f190346j;

                /* renamed from: k, reason: collision with root package name */
                public final boolean f190347k;

                /* renamed from: l, reason: collision with root package name */
                public final boolean f190348l;

                /* renamed from: m, reason: collision with root package name */
                @Y61.l
                public final Float f190349m;

                /* renamed from: n, reason: collision with root package name */
                @Y61.l
                public final String f190350n;

                /* renamed from: o, reason: collision with root package name */
                @Y61.l
                public final HeaderTitleButton f190351o;

                /* JADX WARN: Illegal instructions before constructor call */
                public a(String str, Image image, String str2, b.c cVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Float f12, String str3, HeaderTitleButton headerTitleButton, int i12, C42822w c42822w) {
                    C42822w c42822w2 = null;
                    HeaderTitleButton headerTitleButton2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : headerTitleButton;
                    super(c42822w2);
                    this.f190337a = str;
                    this.f190338b = image;
                    this.f190339c = str2;
                    this.f190340d = cVar;
                    this.f190341e = z12;
                    this.f190342f = z13;
                    this.f190343g = z14;
                    this.f190344h = z15;
                    this.f190345i = z16;
                    this.f190346j = z17;
                    this.f190347k = z18;
                    this.f190348l = z19;
                    this.f190349m = f12;
                    this.f190350n = str3;
                    this.f190351o = headerTitleButton2;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.l
                /* renamed from: a, reason: from getter */
                public final Image getF190353b() {
                    return this.f190338b;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.l
                /* renamed from: b, reason: from getter */
                public final Float getF190364m() {
                    return this.f190349m;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final String getF190352a() {
                    return this.f190337a;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.l
                /* renamed from: d, reason: from getter */
                public final String getF190365n() {
                    return this.f190350n;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.l
                /* renamed from: e, reason: from getter */
                public final HeaderTitleButton getF190366o() {
                    return this.f190351o;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: f */
                public final b getF190355d() {
                    return this.f190340d;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.k
                /* renamed from: g, reason: from getter */
                public final String getF190354c() {
                    return this.f190339c;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: h, reason: from getter */
                public final boolean getF190358g() {
                    return this.f190343g;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: i, reason: from getter */
                public final boolean getF190359h() {
                    return this.f190344h;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: j, reason: from getter */
                public final boolean getF190357f() {
                    return this.f190342f;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: k, reason: from getter */
                public final boolean getF190362k() {
                    return this.f190347k;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: l, reason: from getter */
                public final boolean getF190356e() {
                    return this.f190341e;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: m, reason: from getter */
                public final boolean getF190363l() {
                    return this.f190348l;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: n, reason: from getter */
                public final boolean getF190361j() {
                    return this.f190346j;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: o, reason: from getter */
                public final boolean getF190360i() {
                    return this.f190345i;
                }
            }

            /* compiled from: ChannelContextView.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$c$c$b;", "Lcom/avito/android/messenger/conversation/mvi/context/d0$c$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.context.d0$c$c$b */
            public static final class b extends AbstractC5636c {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f190352a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final Image f190353b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final String f190354c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final b f190355d;

                /* renamed from: e, reason: collision with root package name */
                public final boolean f190356e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f190357f;

                /* renamed from: g, reason: collision with root package name */
                public final boolean f190358g;

                /* renamed from: h, reason: collision with root package name */
                public final boolean f190359h;

                /* renamed from: i, reason: collision with root package name */
                public final boolean f190360i;

                /* renamed from: j, reason: collision with root package name */
                public final boolean f190361j;

                /* renamed from: k, reason: collision with root package name */
                public final boolean f190362k;

                /* renamed from: l, reason: collision with root package name */
                public final boolean f190363l;

                /* renamed from: m, reason: collision with root package name */
                @Y61.l
                public final Float f190364m;

                /* renamed from: n, reason: collision with root package name */
                @Y61.l
                public final String f190365n;

                /* renamed from: o, reason: collision with root package name */
                @Y61.l
                public final HeaderTitleButton f190366o;

                /* JADX WARN: Illegal instructions before constructor call */
                public b(String str, Image image, String str2, b bVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Float f12, String str3, HeaderTitleButton headerTitleButton, int i12, C42822w c42822w) {
                    b bVar2 = (i12 & 8) != 0 ? b.C5635b.f190301a : bVar;
                    C42822w c42822w2 = null;
                    HeaderTitleButton headerTitleButton2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : headerTitleButton;
                    super(c42822w2);
                    this.f190352a = str;
                    this.f190353b = image;
                    this.f190354c = str2;
                    this.f190355d = bVar2;
                    this.f190356e = z12;
                    this.f190357f = z13;
                    this.f190358g = z14;
                    this.f190359h = z15;
                    this.f190360i = z16;
                    this.f190361j = z17;
                    this.f190362k = z18;
                    this.f190363l = z19;
                    this.f190364m = f12;
                    this.f190365n = str3;
                    this.f190366o = headerTitleButton2;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.l
                /* renamed from: a, reason: from getter */
                public final Image getF190353b() {
                    return this.f190353b;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.l
                /* renamed from: b, reason: from getter */
                public final Float getF190364m() {
                    return this.f190364m;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final String getF190352a() {
                    return this.f190352a;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.l
                /* renamed from: d, reason: from getter */
                public final String getF190365n() {
                    return this.f190365n;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.l
                /* renamed from: e, reason: from getter */
                public final HeaderTitleButton getF190366o() {
                    return this.f190366o;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.k
                /* renamed from: f, reason: from getter */
                public final b getF190355d() {
                    return this.f190355d;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                @Y61.k
                /* renamed from: g, reason: from getter */
                public final String getF190354c() {
                    return this.f190354c;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: h, reason: from getter */
                public final boolean getF190358g() {
                    return this.f190358g;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: i, reason: from getter */
                public final boolean getF190359h() {
                    return this.f190359h;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: j, reason: from getter */
                public final boolean getF190357f() {
                    return this.f190357f;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: k, reason: from getter */
                public final boolean getF190362k() {
                    return this.f190362k;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: l, reason: from getter */
                public final boolean getF190356e() {
                    return this.f190356e;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: m, reason: from getter */
                public final boolean getF190363l() {
                    return this.f190363l;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: n, reason: from getter */
                public final boolean getF190361j() {
                    return this.f190361j;
                }

                @Override // com.avito.android.messenger.conversation.mvi.context.d0.c
                /* renamed from: o, reason: from getter */
                public final boolean getF190360i() {
                    return this.f190360i;
                }
            }

            public /* synthetic */ AbstractC5636c(C42822w c42822w) {
                this();
            }

            public AbstractC5636c() {
                super(null);
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @Y61.l
        /* renamed from: a */
        public abstract Image getF190353b();

        @Y61.l
        /* renamed from: b */
        public abstract Float getF190364m();

        @Y61.k
        /* renamed from: c */
        public abstract String getF190352a();

        @Y61.l
        /* renamed from: d */
        public abstract String getF190365n();

        @Y61.l
        /* renamed from: e */
        public abstract HeaderTitleButton getF190366o();

        @Y61.k
        /* renamed from: f */
        public abstract b getF190355d();

        @Y61.k
        /* renamed from: g */
        public abstract String getF190354c();

        /* renamed from: h */
        public abstract boolean getF190358g();

        /* renamed from: i */
        public abstract boolean getF190359h();

        /* renamed from: j */
        public abstract boolean getF190357f();

        /* renamed from: k */
        public abstract boolean getF190362k();

        /* renamed from: l */
        public abstract boolean getF190356e();

        /* renamed from: m */
        public abstract boolean getF190363l();

        /* renamed from: n */
        public abstract boolean getF190361j();

        /* renamed from: o */
        public abstract boolean getF190360i();

        public c() {
        }
    }
}
