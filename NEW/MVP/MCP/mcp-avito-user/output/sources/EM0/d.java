package EM0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VerificationViewStartApiV3Request.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0014\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"LEM0/d;", "", "", "billAmount", "", "deepLinkArgs", MessageBody.SystemMessageBody.Platform.FLOW, "itemId", "phoneInput", "presentationStyle", "type", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getBillAmount", "()Ljava/lang/String;", "Ljava/util/Map;", "getDeepLinkArgs", "()Ljava/util/Map;", "getFlow", "getItemId", "getPhoneInput", "getPresentationStyle", "getType", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @com.google.gson.annotations.c("billAmount")
    @l
    private final String billAmount;

    @com.google.gson.annotations.c("deepLinkArgs")
    @l
    private final Map<String, String> deepLinkArgs;

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.FLOW)
    @k
    private final String flow;

    @com.google.gson.annotations.c("itemId")
    @l
    private final String itemId;

    @com.google.gson.annotations.c("phoneInput")
    @l
    private final String phoneInput;

    @com.google.gson.annotations.c("presentationStyle")
    @l
    private final String presentationStyle;

    @com.google.gson.annotations.c("type")
    @l
    private final String type;

    public d(@l String str, @l Map<String, String> map, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.billAmount = str;
        this.deepLinkArgs = map;
        this.flow = str2;
        this.itemId = str3;
        this.phoneInput = str4;
        this.presentationStyle = str5;
        this.type = str6;
    }
}
