package Sx0;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LSx0/P;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "hasFeedback", "", "mobileApiKey", "paramsHash", "userHashId", "", ChannelContext.Item.USER_ID, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "b", "()Z", "Ljava/lang/String;", "getMobileApiKey", "()Ljava/lang/String;", "getParamsHash", "getUserHashId", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class P {

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("hasFeedback")
    private final boolean hasFeedback;

    @com.google.gson.annotations.c("mobileApiKey")
    @Y61.l
    private final String mobileApiKey;

    @com.google.gson.annotations.c("paramsHash")
    @Y61.l
    private final String paramsHash;

    @com.google.gson.annotations.c("userHashId")
    @Y61.l
    private final String userHashId;

    @com.google.gson.annotations.c(ChannelContext.Item.USER_ID)
    @Y61.l
    private final Long userId;

    public P(@Y61.l AttributedText attributedText, boolean z12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12) {
        this.description = attributedText;
        this.hasFeedback = z12;
        this.mobileApiKey = str;
        this.paramsHash = str2;
        this.userHashId = str3;
        this.userId = l12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasFeedback() {
        return this.hasFeedback;
    }
}
