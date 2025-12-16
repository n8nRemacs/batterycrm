package LA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiEditSellerAddressInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"LLA0/b;", "", "", "error", "id", "", "isRequired", "", "LLA0/c;", "options", "title", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Z", "f", "()Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "e", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c("error")
    @l
    private final String error;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isRequired")
    private final boolean isRequired;

    @com.google.gson.annotations.c("options")
    @k
    private final List<c> options;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @l
    private final String value;

    public b(@l String str, @k String str2, boolean z12, @k List<c> list, @k String str3, @l String str4) {
        this.error = str;
        this.id = str2;
        this.isRequired = z12;
        this.options = list;
        this.title = str3;
        this.value = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final List<c> c() {
        return this.options;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }
}
