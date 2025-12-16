package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.U1;
import com.avito.android.messenger.conversation.b2;
import com.avito.android.messenger.conversation.c2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelItemContentType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ChannelItemContentType {

    /* renamed from: c, reason: collision with root package name */
    public static final ChannelItemContentType f189031c;

    /* renamed from: d, reason: collision with root package name */
    public static final ChannelItemContentType f189032d;

    /* renamed from: e, reason: collision with root package name */
    public static final ChannelItemContentType f189033e;

    /* renamed from: f, reason: collision with root package name */
    public static final ChannelItemContentType f189034f;

    /* renamed from: g, reason: collision with root package name */
    public static final ChannelItemContentType f189035g;

    /* renamed from: h, reason: collision with root package name */
    public static final ChannelItemContentType f189036h;

    /* renamed from: i, reason: collision with root package name */
    public static final ChannelItemContentType f189037i;

    /* renamed from: j, reason: collision with root package name */
    public static final ChannelItemContentType f189038j;

    /* renamed from: k, reason: collision with root package name */
    public static final ChannelItemContentType f189039k;

    /* renamed from: l, reason: collision with root package name */
    public static final ChannelItemContentType f189040l;

    /* renamed from: m, reason: collision with root package name */
    public static final ChannelItemContentType f189041m;

    /* renamed from: n, reason: collision with root package name */
    public static final ChannelItemContentType f189042n;

    /* renamed from: o, reason: collision with root package name */
    public static final ChannelItemContentType f189043o;

    /* renamed from: p, reason: collision with root package name */
    public static final ChannelItemContentType f189044p;

    /* renamed from: q, reason: collision with root package name */
    public static final ChannelItemContentType f189045q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ ChannelItemContentType[] f189046r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f189047s;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U1 f189048b;

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$A;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class A extends ChannelItemContentType {
        public A() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g) {
                    T1.d.b bVar = dVar.f189168c;
                    if ((bVar.getF189194a() instanceof MessageBody.Video) || ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (bVar.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$B;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class B extends ChannelItemContentType {
        public B() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g && (dVar.f189168c.getF189194a() instanceof MessageBody.Voice)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$C;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C extends ChannelItemContentType {
        public C() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            return t12 instanceof T1.e;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$D;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class D extends ChannelItemContentType {
        public D() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            return t12 instanceof T1.f;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$E;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class E extends ChannelItemContentType {
        public E() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.File)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$F;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class F extends ChannelItemContentType {
        public F() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$G;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class G extends ChannelItemContentType {
        public G() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$H;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class H extends ChannelItemContentType {
        public H() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Item)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$I;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class I extends ChannelItemContentType {
        public I() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Text)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$J;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class J extends ChannelItemContentType {
        public J() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$K;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class K extends ChannelItemContentType {
        public K() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            return t12 instanceof T1.g;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$L;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class L extends ChannelItemContentType {
        public L() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            return (t12 instanceof T1.d) && (((T1.d) t12).f189168c.getF189194a() instanceof MessageBody.SystemMessageBody.Text);
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$M;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class M extends ChannelItemContentType {
        public M() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            return t12 instanceof T1.h;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$N;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class N extends ChannelItemContentType {
        public N() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            return t12 instanceof T1.i;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$O;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class O extends ChannelItemContentType {
        public O() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$a;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$a, reason: case insensitive filesystem */
    public static final class C31897a extends ChannelItemContentType {
        public C31897a() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g && (dVar.f189168c.getF189194a() instanceof MessageBody.AppCall)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$b;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$b, reason: case insensitive filesystem */
    public static final class C31898b extends ChannelItemContentType {
        public C31898b() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            MessageBody messageBodyA;
            if ((t12 instanceof T1.d) && (messageBodyA = ((T1.d) t12).f189168c.getF189194a()) != null) {
                if (!(messageBodyA instanceof MessageBody.Call)) {
                    messageBodyA = null;
                }
                MessageBody.Call call = (MessageBody.Call) messageBodyA;
                if (call != null && call.isIncoming()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$c;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$c, reason: case insensitive filesystem */
    public static final class C31899c extends ChannelItemContentType {
        public C31899c() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g && (dVar.f189168c.getF189194a() instanceof MessageBody.Deleted)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$d;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$d, reason: case insensitive filesystem */
    public static final class C31900d extends ChannelItemContentType {
        public C31900d() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g && (dVar.f189168c.getF189194a() instanceof MessageBody.File)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$e;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$e, reason: case insensitive filesystem */
    public static final class C31901e extends ChannelItemContentType {
        public C31901e() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            MessageBody.Link.Preview preview;
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g) {
                    T1.d.b bVar = dVar.f189168c;
                    if (!(bVar.getF189194a() instanceof MessageBody.ImageBody) && !(bVar.getF189194a() instanceof MessageBody.ImageReference)) {
                        MessageBody messageBodyA = bVar.getF189194a();
                        Image image = null;
                        if (messageBodyA != null) {
                            if (!(messageBodyA instanceof MessageBody.Link)) {
                                messageBodyA = null;
                            }
                            MessageBody.Link link = (MessageBody.Link) messageBodyA;
                            if (link != null && (preview = link.getPreview()) != null) {
                                if (!(preview instanceof MessageBody.Link.Preview.Image)) {
                                    preview = null;
                                }
                                MessageBody.Link.Preview.Image image2 = (MessageBody.Link.Preview.Image) preview;
                                if (image2 != null) {
                                    image = image2.getImage();
                                }
                            }
                        }
                        if (image != null || ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (bVar.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$f;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$f, reason: case insensitive filesystem */
    public static final class C31902f extends ChannelItemContentType {
        public C31902f() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g) {
                    T1.d.b bVar = dVar.f189168c;
                    if ((bVar.getF189194a() instanceof MessageBody.Item) || (bVar.getF189194a() instanceof MessageBody.ItemReference)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$g;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$g, reason: case insensitive filesystem */
    public static final class C31903g extends ChannelItemContentType {
        public C31903g() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [com.avito.android.remote.model.messenger.message.MessageBody] */
        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            T1.d.b bVar;
            ?? A12;
            boolean z12 = t12 instanceof T1.d;
            T1.d dVar = (T1.d) (!z12 ? null : t12);
            if (dVar != null && (bVar = dVar.f189168c) != null && (A12 = bVar.getF189194a()) != 0) {
                link = A12 instanceof MessageBody.Link ? A12 : null;
            }
            return z12 && !((T1.d) t12).f189172g && link != null && (link.getPreview() instanceof MessageBody.Link.Preview.Snippet) && link.getUrlsAreTrusted();
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$h;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$h, reason: case insensitive filesystem */
    public static final class C31904h extends ChannelItemContentType {
        public C31904h() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g) {
                    T1.d.b bVar = dVar.f189168c;
                    if ((bVar.getF189194a() instanceof MessageBody.Location) || ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (bVar.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$i;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$i, reason: case insensitive filesystem */
    public static final class C31905i extends ChannelItemContentType {
        public C31905i() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g && (dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Item)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$j;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$j, reason: case insensitive filesystem */
    public static final class C31906j extends ChannelItemContentType {
        public C31906j() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g && (dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Text)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$k;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$k, reason: case insensitive filesystem */
    public static final class C31907k extends ChannelItemContentType {
        public C31907k() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            MessageBody.Link link;
            T1.d.b bVar;
            MessageBody messageBodyA;
            boolean z12 = t12 instanceof T1.d;
            T1.d dVar = (T1.d) (!z12 ? null : t12);
            if (dVar == null || (bVar = dVar.f189168c) == null || (messageBodyA = bVar.getF189194a()) == null) {
                link = null;
            } else {
                if (!(messageBodyA instanceof MessageBody.Link)) {
                    messageBodyA = null;
                }
                link = (MessageBody.Link) messageBodyA;
            }
            if (z12) {
                T1.d dVar2 = (T1.d) t12;
                if (!dVar2.f189172g) {
                    if (!(dVar2.f189168c.getF189194a() instanceof MessageBody.Text)) {
                        if (link != null) {
                            if (link.getPreview() != null) {
                                if (link.getPreview() instanceof MessageBody.Link.Preview.Image) {
                                    MessageBody.Link.Preview preview = link.getPreview();
                                    if ((preview != null ? preview.getImage() : null) != null) {
                                    }
                                }
                                if (!link.getUrlsAreTrusted()) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$l;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$l, reason: case insensitive filesystem */
    public static final class C31908l extends ChannelItemContentType {
        public C31908l() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if ((dVar.f189168c.getF189194a() instanceof MessageBody.Unknown) && !dVar.f189172g) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$m;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$m, reason: case insensitive filesystem */
    public static final class C31909m extends ChannelItemContentType {
        public C31909m() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g) {
                    T1.d.b bVar = dVar.f189168c;
                    if ((bVar.getF189194a() instanceof MessageBody.Video) || ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (bVar.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$n;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$n, reason: case insensitive filesystem */
    public static final class C31910n extends ChannelItemContentType {
        public C31910n() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (!dVar.f189172g && (dVar.f189168c.getF189194a() instanceof MessageBody.Voice)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$o;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.ChannelItemContentType$o, reason: case insensitive filesystem */
    public static final class C31911o extends ChannelItemContentType {
        public C31911o() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g && (dVar.f189168c.getF189194a() instanceof MessageBody.AppCall)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$p;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p extends ChannelItemContentType {
        public p() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            MessageBody messageBodyA;
            if ((t12 instanceof T1.d) && (messageBodyA = ((T1.d) t12).f189168c.getF189194a()) != null) {
                if (!(messageBodyA instanceof MessageBody.Call)) {
                    messageBodyA = null;
                }
                MessageBody.Call call = (MessageBody.Call) messageBodyA;
                if (call != null && !call.isIncoming()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$q;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q extends ChannelItemContentType {
        public q() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g && (dVar.f189168c.getF189194a() instanceof MessageBody.Deleted)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$r;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class r extends ChannelItemContentType {
        public r() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g && (dVar.f189168c.getF189194a() instanceof MessageBody.File)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$s;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class s extends ChannelItemContentType {
        public s() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            MessageBody.Link.Preview preview;
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g) {
                    T1.d.b bVar = dVar.f189168c;
                    if (!(bVar.getF189194a() instanceof MessageBody.ImageBody) && !(bVar.getF189194a() instanceof MessageBody.ImageReference) && !(bVar.getF189194a() instanceof MessageBody.LocalImage)) {
                        MessageBody messageBodyA = bVar.getF189194a();
                        Image image = null;
                        if (messageBodyA != null) {
                            if (!(messageBodyA instanceof MessageBody.Link)) {
                                messageBodyA = null;
                            }
                            MessageBody.Link link = (MessageBody.Link) messageBodyA;
                            if (link != null && (preview = link.getPreview()) != null) {
                                if (!(preview instanceof MessageBody.Link.Preview.Image)) {
                                    preview = null;
                                }
                                MessageBody.Link.Preview.Image image2 = (MessageBody.Link.Preview.Image) preview;
                                if (image2 != null) {
                                    image = image2.getImage();
                                }
                            }
                        }
                        if (image != null || ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (bVar.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$t;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class t extends ChannelItemContentType {
        public t() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g) {
                    T1.d.b bVar = dVar.f189168c;
                    if ((bVar.getF189194a() instanceof MessageBody.Item) || (bVar.getF189194a() instanceof MessageBody.ItemReference)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$u;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class u extends ChannelItemContentType {
        public u() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [com.avito.android.remote.model.messenger.message.MessageBody] */
        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            T1.d.b bVar;
            ?? A12;
            boolean z12 = t12 instanceof T1.d;
            T1.d dVar = (T1.d) (!z12 ? null : t12);
            if (dVar != null && (bVar = dVar.f189168c) != null && (A12 = bVar.getF189194a()) != 0) {
                link = A12 instanceof MessageBody.Link ? A12 : null;
            }
            return z12 && ((T1.d) t12).f189172g && link != null && (link.getPreview() instanceof MessageBody.Link.Preview.Snippet) && link.getUrlsAreTrusted();
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$v;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class v extends ChannelItemContentType {
        public v() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g) {
                    T1.d.b bVar = dVar.f189168c;
                    if ((bVar.getF189194a() instanceof MessageBody.Location) || ((dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (bVar.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$w;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class w extends ChannelItemContentType {
        public w() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g && (dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Item)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$x;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class x extends ChannelItemContentType {
        public x() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if (dVar.f189172g && (dVar.f189180o.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromUser) && (dVar.f189168c.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.Text)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$y;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class y extends ChannelItemContentType {
        public y() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            MessageBody.Link link;
            T1.d.b bVar;
            MessageBody messageBodyA;
            boolean z12 = t12 instanceof T1.d;
            T1.d dVar = (T1.d) (!z12 ? null : t12);
            if (dVar == null || (bVar = dVar.f189168c) == null || (messageBodyA = bVar.getF189194a()) == null) {
                link = null;
            } else {
                if (!(messageBodyA instanceof MessageBody.Link)) {
                    messageBodyA = null;
                }
                link = (MessageBody.Link) messageBodyA;
            }
            if (z12) {
                T1.d dVar2 = (T1.d) t12;
                if (dVar2.f189172g) {
                    if (!(dVar2.f189168c.getF189194a() instanceof MessageBody.Text)) {
                        if (link != null) {
                            if (link.getPreview() != null) {
                                if (link.getPreview() instanceof MessageBody.Link.Preview.Image) {
                                    MessageBody.Link.Preview preview = link.getPreview();
                                    if ((preview != null ? preview.getImage() : null) != null) {
                                    }
                                }
                                if (!link.getUrlsAreTrusted()) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelItemContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelItemContentType$z;", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class z extends ChannelItemContentType {
        public z() {
            throw null;
        }

        @Override // com.avito.android.messenger.conversation.ChannelItemContentType
        public final boolean a(@Y61.k T1 t12) {
            if (t12 instanceof T1.d) {
                T1.d dVar = (T1.d) t12;
                if ((dVar.f189168c.getF189194a() instanceof MessageBody.Unknown) && dVar.f189172g) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        c2.a aVar = c2.a.f189353b;
        C31897a c31897a = new C31897a("IncomingAppCallMessage", 0, new U1.a.b.C5577a(aVar), null);
        c2.b bVar = c2.b.f189354b;
        C31898b c31898b = new C31898b("IncomingCallMessage", 1, new U1.a.b.C5577a(bVar), null);
        c2.c cVar = c2.c.f189355b;
        C31899c c31899c = new C31899c("IncomingDeletedMessage", 2, new U1.a.b.C5577a(cVar), null);
        c2.d dVar = c2.d.f189356b;
        C31900d c31900d = new C31900d("IncomingFileMessage", 3, new U1.a.b.C5577a(dVar), null);
        c2.e eVar = c2.e.f189357b;
        C31901e c31901e = new C31901e("IncomingImageMessage", 4, new U1.a.b.C5577a(eVar), null);
        f189031c = c31901e;
        c2.f fVar = c2.f.f189358b;
        C31902f c31902f = new C31902f("IncomingItemMessage", 5, new U1.a.b.C5577a(fVar), null);
        c2.g gVar = c2.g.f189359b;
        C31903g c31903g = new C31903g("IncomingLinkSnippetMessage", 6, new U1.a.b.C5577a(gVar), null);
        c2.h hVar = c2.h.f189360b;
        C31904h c31904h = new C31904h("IncomingLocationMessage", 7, new U1.a.b.C5577a(hVar), null);
        f189032d = c31904h;
        c2.i iVar = c2.i.f189361b;
        C31905i c31905i = new C31905i("IncomingPlatformItemMessage", 8, new U1.a.b.C5577a(iVar), null);
        c2.j jVar = c2.j.f189362b;
        C31906j c31906j = new C31906j("IncomingPlatformTextMessage", 9, new U1.a.b.C5577a(jVar), null);
        c2.k kVar = c2.k.f189363b;
        C31907k c31907k = new C31907k("IncomingTextMessage", 10, new U1.a.b.C5577a(kVar), null);
        c2.l lVar = c2.l.f189364b;
        C31908l c31908l = new C31908l("IncomingUnknownMessage", 11, new U1.a.b.C5577a(lVar), null);
        c2.m mVar = c2.m.f189365b;
        C31909m c31909m = new C31909m("IncomingVideoMessage", 12, new U1.a.b.C5577a(mVar), null);
        f189033e = c31909m;
        c2.n nVar = c2.n.f189366b;
        C31910n c31910n = new C31910n("IncomingVoiceMessage", 13, new U1.a.b.C5577a(nVar), null);
        C31911o c31911o = new C31911o("OutgoingAppCallMessage", 14, new U1.a.b.C5578b(aVar), null);
        p pVar = new p("OutgoingCallMessage", 15, new U1.a.b.C5578b(bVar), null);
        q qVar = new q("OutgoingDeletedMessage", 16, new U1.a.b.C5578b(cVar), null);
        r rVar = new r("OutgoingFileMessage", 17, new U1.a.b.C5578b(dVar), null);
        s sVar = new s("OutgoingImageMessage", 18, new U1.a.b.C5578b(eVar), null);
        f189034f = sVar;
        t tVar = new t("OutgoingItemMessage", 19, new U1.a.b.C5578b(fVar), null);
        u uVar = new u("OutgoingLinkSnippetMessage", 20, new U1.a.b.C5578b(gVar), null);
        v vVar = new v("OutgoingLocationMessage", 21, new U1.a.b.C5578b(hVar), null);
        f189035g = vVar;
        w wVar = new w("OutgoingPlatformItemMessage", 22, new U1.a.b.C5578b(iVar), null);
        x xVar = new x("OutgoingPlatformTextMessage", 23, new U1.a.b.C5578b(jVar), null);
        y yVar = new y("OutgoingTextMessage", 24, new U1.a.b.C5578b(kVar), null);
        z zVar = new z("OutgoingUnknownMessage", 25, new U1.a.b.C5578b(lVar), null);
        A a12 = new A("OutgoingVideoMessage", 26, new U1.a.b.C5578b(mVar), null);
        f189036h = a12;
        B b12 = new B("OutgoingVoiceMessage", 27, new U1.a.b.C5578b(nVar), null);
        F f12 = new F("PlatformGeoMessageFromAvito", 28, new U1.a.C5576a(b2.b.f189344b), null);
        f189037i = f12;
        G g12 = new G("PlatformImageMessageFromAvito", 29, new U1.a.C5576a(b2.c.f189345b), null);
        f189038j = g12;
        H h12 = new H("PlatformItemMessageFromAvito", 30, new U1.a.C5576a(b2.d.f189346b), null);
        I i12 = new I("PlatformTextMessageFromAvito", 31, new U1.a.C5576a(b2.e.f189347b), null);
        J j12 = new J("PlatformVideoMessageFromAvito", 32, new U1.a.C5576a(b2.f.f189348b), null);
        f189039k = j12;
        E e12 = new E("PlatformFileMessageFromAvito", 33, new U1.a.C5576a(b2.a.f189343b), null);
        L l12 = new L("SystemTextMessage", 34, U1.a.c.f189227b, null);
        C c12 = new C("PaginationError", 35, U1.b.f189228b, null);
        f189040l = c12;
        D d12 = new D("PaginationInProgress", 36, U1.c.f189229b, null);
        f189041m = d12;
        K k12 = new K("SpamActions", 37, U1.d.f189230b, null);
        f189042n = k12;
        M m12 = new M("TypingIndicator", 38, U1.e.f189231b, null);
        f189043o = m12;
        N n12 = new N("UnreadMessagesDivider", 39, U1.f.f189232b, null);
        f189044p = n12;
        O o12 = new O("Unsupported", 40, U1.g.f189233b, null);
        f189045q = o12;
        ChannelItemContentType[] channelItemContentTypeArr = {c31897a, c31898b, c31899c, c31900d, c31901e, c31902f, c31903g, c31904h, c31905i, c31906j, c31907k, c31908l, c31909m, c31910n, c31911o, pVar, qVar, rVar, sVar, tVar, uVar, vVar, wVar, xVar, yVar, zVar, a12, b12, f12, g12, h12, i12, j12, e12, l12, c12, d12, k12, m12, n12, o12};
        f189046r = channelItemContentTypeArr;
        f189047s = kotlin.enums.c.a(channelItemContentTypeArr);
    }

    public ChannelItemContentType() {
        throw null;
    }

    public ChannelItemContentType(String str, int i12, U1 u12, C42822w c42822w) {
        this.f189048b = u12;
    }

    public static ChannelItemContentType valueOf(String str) {
        return (ChannelItemContentType) Enum.valueOf(ChannelItemContentType.class, str);
    }

    public static ChannelItemContentType[] values() {
        return (ChannelItemContentType[]) f189046r.clone();
    }

    public abstract boolean a(@Y61.k T1 t12);
}
