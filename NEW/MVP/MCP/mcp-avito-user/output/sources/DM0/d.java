package DM0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VerificationViewRedirectApiV3Request.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B7\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"LDM0/d;", "", "", "", "deepLinkArgs", MessageBody.SystemMessageBody.Platform.FLOW, "", "skipChooseCategoryStep", "type", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/util/Map;", "getDeepLinkArgs", "()Ljava/util/Map;", "Ljava/lang/String;", "getFlow", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getSkipChooseCategoryStep", "()Ljava/lang/Boolean;", "getType", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @com.google.gson.annotations.c("deepLinkArgs")
    @l
    private final Map<String, String> deepLinkArgs;

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.FLOW)
    @k
    private final String flow;

    @com.google.gson.annotations.c("skipChooseCategoryStep")
    @l
    private final Boolean skipChooseCategoryStep;

    @com.google.gson.annotations.c("type")
    @k
    private final String type;

    public d(@l Map<String, String> map, @k String str, @l Boolean bool, @k String str2) {
        this.deepLinkArgs = map;
        this.flow = str;
        this.skipChooseCategoryStep = bool;
        this.type = str2;
    }
}
