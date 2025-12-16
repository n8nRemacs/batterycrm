package g91;

import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import ru.avito.messenger.generated.api.send_text_message.MessageBodyAppCallNullable;
import ru.avito.messenger.generated.api.send_text_message.MessageBodyCompositeNullable;

/* compiled from: SendTextMessageResponse.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lg91/t;", "", "Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable;", MessageBody.AppCall.TYPE, "Lg91/u;", "call", "Lru/avito/messenger/generated/api/send_text_message/MessageBodyCompositeNullable;", "composite", "Lg91/v;", "file", "", "idempotencyKey", "Lg91/w;", "image", "Lg91/x;", "item", "Lg91/y;", "link", "Lg91/z;", "location", "Lg91/A;", "text", "Lg91/B;", "video", "Lg91/C;", "voice", "<init>", "(Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable;Lg91/u;Lru/avito/messenger/generated/api/send_text_message/MessageBodyCompositeNullable;Lg91/v;Ljava/lang/String;Lg91/w;Lg91/x;Lg91/y;Lg91/z;Lg91/A;Lg91/B;Lg91/C;)V", "Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable;", "a", "()Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable;", "Lg91/u;", "b", "()Lg91/u;", "Lru/avito/messenger/generated/api/send_text_message/MessageBodyCompositeNullable;", "c", "()Lru/avito/messenger/generated/api/send_text_message/MessageBodyCompositeNullable;", "Lg91/v;", "d", "()Lg91/v;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lg91/w;", "f", "()Lg91/w;", "Lg91/x;", "g", "()Lg91/x;", "Lg91/y;", "h", "()Lg91/y;", "Lg91/z;", "i", "()Lg91/z;", "Lg91/A;", "j", "()Lg91/A;", "Lg91/B;", "k", "()Lg91/B;", "Lg91/C;", "l", "()Lg91/C;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class t {

    @com.google.gson.annotations.c(MessageBody.AppCall.TYPE)
    @Y61.l
    private final MessageBodyAppCallNullable appCall;

    @com.google.gson.annotations.c("call")
    @Y61.l
    private final u call;

    @com.google.gson.annotations.c("composite")
    @Y61.l
    private final MessageBodyCompositeNullable composite;

    @com.google.gson.annotations.c("file")
    @Y61.l
    private final v file;

    @com.google.gson.annotations.c("idempotencyKey")
    @Y61.l
    private final String idempotencyKey;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final w image;

    @com.google.gson.annotations.c("item")
    @Y61.l
    private final x item;

    @com.google.gson.annotations.c("link")
    @Y61.l
    private final y link;

    @com.google.gson.annotations.c("location")
    @Y61.l
    private final z location;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final C40551A text;

    @com.google.gson.annotations.c("video")
    @Y61.l
    private final C40552B video;

    @com.google.gson.annotations.c("voice")
    @Y61.l
    private final C40553C voice;

    public t(@Y61.l MessageBodyAppCallNullable messageBodyAppCallNullable, @Y61.l u uVar, @Y61.l MessageBodyCompositeNullable messageBodyCompositeNullable, @Y61.l v vVar, @Y61.l String str, @Y61.l w wVar, @Y61.l x xVar, @Y61.l y yVar, @Y61.l z zVar, @Y61.l C40551A c40551a, @Y61.l C40552B c40552b, @Y61.l C40553C c40553c) {
        this.appCall = messageBodyAppCallNullable;
        this.call = uVar;
        this.composite = messageBodyCompositeNullable;
        this.file = vVar;
        this.idempotencyKey = str;
        this.image = wVar;
        this.item = xVar;
        this.link = yVar;
        this.location = zVar;
        this.text = c40551a;
        this.video = c40552b;
        this.voice = c40553c;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final MessageBodyAppCallNullable getAppCall() {
        return this.appCall;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final u getCall() {
        return this.call;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final MessageBodyCompositeNullable getComposite() {
        return this.composite;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final v getFile() {
        return this.file;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final w getImage() {
        return this.image;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final x getItem() {
        return this.item;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final y getLink() {
        return this.link;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final z getLocation() {
        return this.location;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final C40551A getText() {
        return this.text;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final C40552B getVideo() {
        return this.video;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final C40553C getVoice() {
        return this.voice;
    }
}
