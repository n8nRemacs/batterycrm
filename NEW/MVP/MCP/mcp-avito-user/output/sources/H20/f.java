package h20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetClientFormGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lh20/f;", "", "", "isMasked", "isRequired", "", ChannelContext.Item.PLACEHOLDER, "title", "value", "<init>", "(Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Z", "e", "()Z", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    @com.google.gson.annotations.c("isMasked")
    @l
    private final Boolean isMasked;

    @com.google.gson.annotations.c("isRequired")
    private final boolean isRequired;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @k
    private final String placeholder;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @l
    private final String value;

    public f(@l Boolean bool, boolean z12, @k String str, @k String str2, @l String str3) {
        this.isMasked = bool;
        this.isRequired = z12;
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

    /* renamed from: e, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }
}
