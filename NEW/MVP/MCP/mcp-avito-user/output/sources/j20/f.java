package j20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetParticipantFormGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lj20/f;", "", "", "isMasked", "", ChannelContext.Item.PLACEHOLDER, "title", "value", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    @com.google.gson.annotations.c("isMasked")
    @l
    private final Boolean isMasked;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @k
    private final String placeholder;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @l
    private final String value;

    public f(@l Boolean bool, @k String str, @k String str2, @l String str3) {
        this.isMasked = bool;
        this.placeholder = str;
        this.title = str2;
        this.value = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsMasked() {
        return this.isMasked;
    }
}
