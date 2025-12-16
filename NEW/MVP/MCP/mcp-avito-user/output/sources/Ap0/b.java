package AP0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: WalletPinBiometry.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LAP0/b;", "", "", "title", "subtitle", "description", "cancelButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "b", "a", "_avito_wallet-biometry_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c("cancel_button")
    @l
    private final String cancelButton;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public b(@l String str, @l String str2, @l String str3, @l String str4) {
        this.title = str;
        this.subtitle = str2;
        this.description = str3;
        this.cancelButton = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getCancelButton() {
        return this.cancelButton;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean e() {
        String str;
        String str2 = this.title;
        return (str2 == null || str2.length() == 0 || (str = this.cancelButton) == null || str.length() == 0) ? false : true;
    }
}
