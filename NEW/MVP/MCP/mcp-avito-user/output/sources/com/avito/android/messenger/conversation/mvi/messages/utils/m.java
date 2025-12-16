package com.avito.android.messenger.conversation.mvi.messages.utils;

import androidx.compose.runtime.internal.P;
import com.avito.android.U0;
import com.avito.android.deep_linking.links.ChannelCallLink;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.adapter.C;
import com.avito.android.messenger.conversation.adapter.C31915a;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message.FileMessageData;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import vN.C49237a;

/* compiled from: TestEntities.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/utils/m;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final m f193603a = new m();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.m f193604b = new com.avito.android.messenger.conversation.mvi.messages.builders.m();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.g f193605c = new com.avito.android.messenger.conversation.mvi.messages.builders.g(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.i f193606d = new com.avito.android.messenger.conversation.mvi.messages.builders.i(new C31915a(""), new C(""), new U0(), "ru_RU", "ru", "ru", new GeoMarker(61.385303d, 98.44411d, null, null), "2");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.o f193607e = new com.avito.android.messenger.conversation.mvi.messages.builders.o();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.q f193608f = new com.avito.android.messenger.conversation.mvi.messages.builders.q();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.e f193609g = new com.avito.android.messenger.conversation.mvi.messages.builders.e();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.a f193610h = new com.avito.android.messenger.conversation.mvi.messages.builders.a(new C49237a());

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.k f193611i = new com.avito.android.messenger.conversation.mvi.messages.builders.k();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.avito.android.messenger.conversation.mvi.messages.builders.c f193612j = new com.avito.android.messenger.conversation.mvi.messages.builders.c();

    @Y61.k
    public static MessageBody.AppCall a() {
        return new MessageBody.AppCall("", new Action("call", new ChannelCallLink("someChannelId", "12345", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null), null, null, null, null, null, null, null, null, 512, null);
    }

    public static T1.d b(m mVar, T1.d.b bVar, String str, String str2, boolean z12, MessageDeliveryStatus messageDeliveryStatus, Image image, T1.d.a aVar, T1.c cVar, VideoInfo videoInfo, QuoteViewData quoteViewData, String str3, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar2, FileMessageData fileMessageData, com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVar, String str4, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, LocalMessage localMessage, int i12) {
        String str5 = (i12 & 4) != 0 ? "someUserName" : str;
        String str6 = (i12 & 16) != 0 ? "12:45" : str2;
        boolean z13 = (i12 & 32) != 0 ? false : z12;
        MessageDeliveryStatus messageDeliveryStatus2 = (i12 & 64) != 0 ? MessageDeliveryStatus.f186165d : messageDeliveryStatus;
        Image image2 = (i12 & 2048) != 0 ? null : image;
        T1.d.a aVar2 = (i12 & 4096) != 0 ? null : aVar;
        T1.c cVar2 = (i12 & 8192) != 0 ? null : cVar;
        VideoInfo videoInfo2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : videoInfo;
        QuoteViewData quoteViewData2 = (65536 & i12) != 0 ? null : quoteViewData;
        String str7 = (131072 & i12) != 0 ? null : str3;
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVarA = (262144 & i12) != 0 ? null : mVar2;
        FileMessageData fileMessageDataA = (524288 & i12) != 0 ? null : fileMessageData;
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVarA = (1048576 & i12) != 0 ? null : dVar;
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVarB = (2097152 & i12) != 0 ? null : hVar;
        String str8 = (4194304 & i12) != 0 ? null : str4;
        com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar2 = (8388608 & i12) != 0 ? null : kVar;
        LocalMessage localMessageF = (67108864 & i12) != 0 ? f(mVar, null, 32767) : localMessage;
        UserEntityType userEntityType = UserEntityType.f215315c;
        mVar.getClass();
        Q1 q12 = new Q1("666", "someChannelId", "someLocalId", "file:///tmp/android.txt", "file:///tmp/temp.txt", 42L, null, null, null, 0L, null, 0L, 0L, null, null, null, false, null, null, userEntityType, "666", null, null, 6815680, null);
        boolean z14 = (268435456 & i12) == 0;
        boolean z15 = (i12 & 536870912) == 0;
        mVar.getClass();
        LocalMessage localMessage2 = localMessageF;
        T1.d dVar2 = new T1.d("someLocalId", bVar, str5, "", str6, z13, messageDeliveryStatus2, true, true, null, null, image2, cVar2, localMessage2, q12, videoInfo2, null, quoteViewData2, str8, kVar2, z14, z15, aVar2, str7, null, null, null, null, null, null, null, null, null, null, null, -16777216, 7, null);
        MessageBody f189194a = bVar.getF189194a();
        f193604b.getClass();
        List listA = com.avito.android.messenger.conversation.mvi.messages.builders.m.a(f189194a);
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i iVarA = f193605c.a(dVar2, localMessage2);
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g gVarA = f193606d.a(dVar2);
        f193607e.getClass();
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message.n nVarA = com.avito.android.messenger.conversation.mvi.messages.builders.o.a(dVar2);
        if (mVarA == null) {
            f193608f.getClass();
            mVarA = com.avito.android.messenger.conversation.mvi.messages.builders.q.a(dVar2);
        }
        if (fileMessageDataA == null) {
            f193609g.getClass();
            fileMessageDataA = com.avito.android.messenger.conversation.mvi.messages.builders.e.a(dVar2, null);
        }
        com.avito.android.messenger.conversation.mvi.messages.builders.a aVar3 = f193610h;
        if (dVarA == null) {
            dVarA = aVar3.a(dVar2);
        }
        if (hVarB == null) {
            hVarB = aVar3.b(dVar2);
        }
        f193611i.getClass();
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c cVarA = com.avito.android.messenger.conversation.mvi.messages.builders.k.a(dVar2);
        f193612j.getClass();
        return T1.d.a(dVar2, null, null, false, null, null, null, null, listA, iVarA, gVarA, nVarA, mVarA, fileMessageDataA, dVarA, hVarB, cVarA, com.avito.android.messenger.conversation.mvi.messages.builders.c.a(dVar2), 16777215, 4);
    }

    public static MessageBody.File c(m mVar, String str, long j12) {
        mVar.getClass();
        return new MessageBody.File("someFileId", str, j12, "application/pdf", null);
    }

    public static T1.d d(m mVar, MessageBody messageBody, String str, String str2, String str3, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, T1.c cVar, int i12) {
        RY.a.f14512a.getClass();
        Image image = RY.a.f14516e;
        String str4 = (i12 & 4) != 0 ? null : str;
        String str5 = (i12 & 8) != 0 ? "someUserName" : str2;
        String str6 = (i12 & 16) != 0 ? null : str3;
        com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar2 = (i12 & 32) != 0 ? null : kVar;
        T1.c cVar2 = (i12 & 64) != 0 ? new T1.c(true, true, false, false, false, false, false, false, false, 508, null) : cVar;
        mVar.getClass();
        return b(mVar, new T1.d.b.a(messageBody), str5, "12:45", false, null, image, null, cVar2, null, null, str4, null, null, null, null, str6, kVar2, null, 1061017545);
    }

    public static LocalMessage f(m mVar, MessageBody.SystemMessageBody.Platform platform, int i12) {
        MessageBody unknown = (i12 & 8) != 0 ? new MessageBody.Unknown("someType", null, 2, null) : platform;
        boolean z12 = (i12 & 256) == 0;
        LocalMessage.Type.Default r22 = LocalMessage.Type.Default.INSTANCE;
        mVar.getClass();
        return new LocalMessage("someLocalId", "someRemoteId", "someChannelId", unknown, "666", "someFromId", 42L, false, z12, null, null, true, null, null, null, r22, "666", null, 151552, null);
    }

    public static MessageBody.Item g(m mVar) {
        RY.a.f14512a.getClass();
        Image image = RY.a.f14515d;
        mVar.getClass();
        return new MessageBody.Item("12345", "666", "Подставка для ноутбука из натурального дерева вяза", image, "90 800 ₽", null);
    }

    public static MessageBody.Text.Regular h(m mVar, String str, List list, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = "someText";
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            list = null;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        mVar.getClass();
        return new MessageBody.Text.Regular(str2, null, list2, z12, null, 16, null);
    }

    public static MessageBody.Link i(m mVar, String str, String str2, Image image) {
        mVar.getClass();
        return new MessageBody.Link(str, new MessageBody.Link.Preview.Image(str2, "someDomain", true, "someImageId", image, null, null, null), null, true);
    }

    public static MessageBody.Link j(m mVar, String str, Image image, String str2, String str3) {
        mVar.getClass();
        return new MessageBody.Link(str, new MessageBody.Link.Preview.Snippet("someUrl", null, "someDomain", true, str2, str3, null, "someImageId", image, null, null, null), null, true);
    }

    public static T1.d l(m mVar, MessageBody.SystemMessageBody.Platform.Bubble bubble, String str) {
        MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186165d;
        mVar.getClass();
        return b(mVar, new T1.d.b.C5574b(bubble), null, "12:45", true, messageDeliveryStatus, new Image(P0.c()), null, null, null, null, str, null, null, null, null, null, null, f(mVar, n(mVar, Collections.singletonList(bubble), 14), 32759), 1006499725);
    }

    public static MessageBody.SystemMessageBody.Platform.FromAvito m(m mVar, List list, String str, int i12) {
        if ((i12 & 1) != 0) {
            list = Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText("someText", C42784z0.f406748b, 0, 4, null)));
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            str = null;
        }
        mVar.getClass();
        return new MessageBody.SystemMessageBody.Platform.FromAvito(list2, null, str, null, null, 16, null);
    }

    public static MessageBody.SystemMessageBody.Platform.FromUser n(m mVar, List list, int i12) {
        if ((i12 & 1) != 0) {
            list = Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText("someText", C42784z0.f406748b, 0, 4, null)));
        }
        mVar.getClass();
        return new MessageBody.SystemMessageBody.Platform.FromUser(list, null, null, null, null, 16, null);
    }

    public static MessageBody.SystemMessageBody.Platform.Bubble.Image o(m mVar, Image image) {
        mVar.getClass();
        return new MessageBody.SystemMessageBody.Platform.Bubble.Image("someImageId", image);
    }

    public static MessageBody.SystemMessageBody.Platform.Bubble.Item p(m mVar, String str, String str2, String str3, String str4, Image image, int i12) {
        String str5 = (i12 & 1) != 0 ? "12345" : str;
        String str6 = (i12 & 4) != 0 ? "25999 ₽" : str3;
        String str7 = (i12 & 16) != 0 ? "м. Белорусская" : str4;
        mVar.getClass();
        return new MessageBody.SystemMessageBody.Platform.Bubble.Item(str5, str2, str6, "36000 ₽", str7, image, "ru.avito://1/item/show?itemId=12345", null, 128, null);
    }

    public static QuoteViewData r(m mVar, QuoteViewData.TextType textType, String str, QuoteViewData.Style.Gray gray, QuoteViewData.ImageType imageType, int i12) {
        QuoteViewData.TextType plain = (i12 & 2) != 0 ? new QuoteViewData.TextType.Plain("Hello") : textType;
        String str2 = (i12 & 4) != 0 ? null : str;
        boolean z12 = (i12 & 8) == 0;
        QuoteViewData.Style style = (i12 & 16) != 0 ? QuoteViewData.Style.Regular.f189278b : gray;
        QuoteViewData.ImageType imageType2 = (i12 & 32) != 0 ? null : imageType;
        boolean z13 = (i12 & 64) == 0;
        mVar.getClass();
        return new QuoteViewData("Владимир", plain, str2, z12, style, imageType2, z13, new Quote("", new MessageBody.ItemReference(""), 100L, "", null));
    }

    public static MessageBody.Video s(m mVar, int i12) {
        mVar.getClass();
        return new MessageBody.Video("someFileId", "someVideoId", null);
    }

    public static MessageBody.Voice t(m mVar) {
        mVar.getClass();
        return new MessageBody.Voice("someVoiceId", null);
    }

    public static com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m u(m mVar, m.a aVar, int i12) {
        String str = (i12 & 4) != 0 ? "-:--" : "1:23";
        boolean z12 = (i12 & 8) == 0;
        boolean z13 = (i12 & 16) == 0;
        int i13 = (i12 & 32) != 0 ? 0 : 100;
        mVar.getClass();
        return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m("someVoiceId", aVar, str, z12, z13, i13);
    }

    @Y61.k
    public final T1.d e(@Y61.k MessageBody.SystemMessageBody.Platform.Bubble bubble, @Y61.l String str) {
        Image image = new Image(P0.c());
        return b(this, new T1.d.b.C5574b(bubble), null, "12:45", false, null, image, null, new T1.c(true, true, false, false, false, false, false, false, false, 508, null), null, null, str, null, null, null, null, null, null, f(this, n(this, Collections.singletonList(bubble), 14), 32759), 1006491597);
    }

    @Y61.k
    public final T1.d k(@Y61.k MessageBody messageBody, @Y61.k MessageDeliveryStatus messageDeliveryStatus, @Y61.l String str) {
        T1.d.b.a aVar = new T1.d.b.a(messageBody);
        RY.a.f14512a.getClass();
        return b(this, aVar, null, "12:45", true, messageDeliveryStatus, RY.a.f14516e, null, null, null, null, str, null, null, null, null, null, null, null, 1073608589);
    }

    @Y61.k
    public final T1.d q(@Y61.k MessageBody.SystemMessageBody.Platform.Bubble bubble, @Y61.l String str) {
        RY.a.f14512a.getClass();
        Image image = RY.a.f14517f;
        return b(this, new T1.d.b.C5574b(bubble), null, "12:45", false, null, image, null, new T1.c(true, true, false, false, false, false, false, false, false, 508, null), null, null, str, null, null, null, null, null, null, f(this, m(this, Collections.singletonList(bubble), null, 14), 32759), 1006491597);
    }
}
