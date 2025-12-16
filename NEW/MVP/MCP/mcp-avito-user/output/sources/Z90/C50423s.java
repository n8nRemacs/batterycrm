package z90;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lz90/s;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "icon", "", "isOnEmployeeMode", "", "subtitle", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;ZLjava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "d", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z90.s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50423s {

    @com.google.gson.annotations.c("icon")
    @Y61.k
    private final AttributedText icon;

    @com.google.gson.annotations.c("isOnEmployeeMode")
    private final boolean isOnEmployeeMode;

    @com.google.gson.annotations.c("subtitle")
    @Y61.k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C50423s(@Y61.k AttributedText attributedText, boolean z12, @Y61.k String str, @Y61.k String str2) {
        this.icon = attributedText;
        this.isOnEmployeeMode = z12;
        this.subtitle = str;
        this.title = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsOnEmployeeMode() {
        return this.isOnEmployeeMode;
    }
}
