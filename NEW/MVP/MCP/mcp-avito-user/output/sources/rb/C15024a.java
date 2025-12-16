package Rb;

import com.avito.android.ai_assistant.generated.api.send_v_2.BadgeStyle;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;

/* compiled from: SendV2Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"LRb/a;", "", "", "id", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/BadgeStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "version", "<init>", "(JLcom/avito/android/ai_assistant/generated/api/send_v_2/BadgeStyle;Ljava/lang/String;J)V", "J", "a", "()J", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/BadgeStyle;", "b", "()Lcom/avito/android/ai_assistant/generated/api/send_v_2/BadgeStyle;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15024a {

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.k
    private final BadgeStyle style;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("version")
    private final long version;

    public C15024a(long j12, @Y61.k BadgeStyle badgeStyle, @Y61.k String str, long j13) {
        this.id = j12;
        this.style = badgeStyle;
        this.title = str;
        this.version = j13;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final BadgeStyle getStyle() {
        return this.style;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final long getVersion() {
        return this.version;
    }
}
