package CM0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VerificationViewDisclaimerApiV4Request.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B-\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LCM0/c;", "", "", "", "deepLinkArgs", MessageBody.SystemMessageBody.Platform.FLOW, "type", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "getDeepLinkArgs", "()Ljava/util/Map;", "Ljava/lang/String;", "getFlow", "()Ljava/lang/String;", "getType", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c("deepLinkArgs")
    @l
    private final Map<String, String> deepLinkArgs;

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.FLOW)
    @k
    private final String flow;

    @com.google.gson.annotations.c("type")
    @k
    private final String type;

    public c(@l Map<String, String> map, @k String str, @k String str2) {
        this.deepLinkArgs = map;
        this.flow = str;
        this.type = str2;
    }
}
