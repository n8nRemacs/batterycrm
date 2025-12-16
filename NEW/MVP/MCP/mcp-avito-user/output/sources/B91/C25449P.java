package b91;

import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import ru.avito.messenger.generated.api.get_channel_by_id.MessageBodyAppCallNullable;
import ru.avito.messenger.generated.api.get_channel_by_id.MessageBodyCompositeNullable;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lb91/P;", "", "Lru/avito/messenger/generated/api/get_channel_by_id/MessageBodyAppCallNullable;", MessageBody.AppCall.TYPE, "Lb91/Q;", "call", "Lru/avito/messenger/generated/api/get_channel_by_id/MessageBodyCompositeNullable;", "composite", "Lb91/S;", "file", "", "idempotencyKey", "Lb91/T;", "image", "Lb91/U;", "item", "Lb91/V;", "link", "Lb91/W;", "location", "Lb91/X;", "text", "Lb91/Y;", "video", "Lb91/Z;", "voice", "<init>", "(Lru/avito/messenger/generated/api/get_channel_by_id/MessageBodyAppCallNullable;Lb91/Q;Lru/avito/messenger/generated/api/get_channel_by_id/MessageBodyCompositeNullable;Lb91/S;Ljava/lang/String;Lb91/T;Lb91/U;Lb91/V;Lb91/W;Lb91/X;Lb91/Y;Lb91/Z;)V", "Lru/avito/messenger/generated/api/get_channel_by_id/MessageBodyAppCallNullable;", "a", "()Lru/avito/messenger/generated/api/get_channel_by_id/MessageBodyAppCallNullable;", "Lb91/Q;", "b", "()Lb91/Q;", "Lru/avito/messenger/generated/api/get_channel_by_id/MessageBodyCompositeNullable;", "c", "()Lru/avito/messenger/generated/api/get_channel_by_id/MessageBodyCompositeNullable;", "Lb91/S;", "d", "()Lb91/S;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lb91/T;", "f", "()Lb91/T;", "Lb91/U;", "g", "()Lb91/U;", "Lb91/V;", "h", "()Lb91/V;", "Lb91/W;", "i", "()Lb91/W;", "Lb91/X;", "j", "()Lb91/X;", "Lb91/Y;", "k", "()Lb91/Y;", "Lb91/Z;", "l", "()Lb91/Z;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b91.P, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C25449P {

    @com.google.gson.annotations.c(MessageBody.AppCall.TYPE)
    @Y61.l
    private final MessageBodyAppCallNullable appCall;

    @com.google.gson.annotations.c("call")
    @Y61.l
    private final C25450Q call;

    @com.google.gson.annotations.c("composite")
    @Y61.l
    private final MessageBodyCompositeNullable composite;

    @com.google.gson.annotations.c("file")
    @Y61.l
    private final C25451S file;

    @com.google.gson.annotations.c("idempotencyKey")
    @Y61.l
    private final String idempotencyKey;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final C25452T image;

    @com.google.gson.annotations.c("item")
    @Y61.l
    private final C25453U item;

    @com.google.gson.annotations.c("link")
    @Y61.l
    private final C25454V link;

    @com.google.gson.annotations.c("location")
    @Y61.l
    private final C25455W location;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final C25456X text;

    @com.google.gson.annotations.c("video")
    @Y61.l
    private final C25457Y video;

    @com.google.gson.annotations.c("voice")
    @Y61.l
    private final C25458Z voice;

    public C25449P(@Y61.l MessageBodyAppCallNullable messageBodyAppCallNullable, @Y61.l C25450Q c25450q, @Y61.l MessageBodyCompositeNullable messageBodyCompositeNullable, @Y61.l C25451S c25451s, @Y61.l String str, @Y61.l C25452T c25452t, @Y61.l C25453U c25453u, @Y61.l C25454V c25454v, @Y61.l C25455W c25455w, @Y61.l C25456X c25456x, @Y61.l C25457Y c25457y, @Y61.l C25458Z c25458z) {
        this.appCall = messageBodyAppCallNullable;
        this.call = c25450q;
        this.composite = messageBodyCompositeNullable;
        this.file = c25451s;
        this.idempotencyKey = str;
        this.image = c25452t;
        this.item = c25453u;
        this.link = c25454v;
        this.location = c25455w;
        this.text = c25456x;
        this.video = c25457y;
        this.voice = c25458z;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final MessageBodyAppCallNullable getAppCall() {
        return this.appCall;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C25450Q getCall() {
        return this.call;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final MessageBodyCompositeNullable getComposite() {
        return this.composite;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C25451S getFile() {
        return this.file;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final C25452T getImage() {
        return this.image;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final C25453U getItem() {
        return this.item;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final C25454V getLink() {
        return this.link;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final C25455W getLocation() {
        return this.location;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final C25456X getText() {
        return this.text;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final C25457Y getVideo() {
        return this.video;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final C25458Z getVoice() {
        return this.voice;
    }
}
