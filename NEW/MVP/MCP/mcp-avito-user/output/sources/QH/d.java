package qh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.generated.api.api_1_get_available_contacts.ProgressBar;
import kotlin.Metadata;

/* compiled from: Api1GetAvailableContactsResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqh/d;", "", "", "isSelected", "", "limit", "", "price", "Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar;", "progress", "<init>", "(ZJLjava/lang/String;Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar;)V", "Z", "d", "()Z", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar;", "c", "()Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("limit")
    private final long limit;

    @com.google.gson.annotations.c("price")
    @k
    private final String price;

    @com.google.gson.annotations.c("progress")
    @l
    private final ProgressBar progress;

    public d(boolean z12, long j12, @k String str, @l ProgressBar progressBar) {
        this.isSelected = z12;
        this.limit = j12;
        this.price = str;
        this.progress = progressBar;
    }

    /* renamed from: a, reason: from getter */
    public final long getLimit() {
        return this.limit;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ProgressBar getProgress() {
        return this.progress;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
