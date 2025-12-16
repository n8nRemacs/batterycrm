package JN0;

import kotlin.Metadata;

/* compiled from: GetClientInfoApiResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LJN0/a;", "", "", "contactInfoHidden", "editable", "<init>", "(ZZ)V", "Z", "a", "()Z", "b", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("contactInfoHidden")
    private final boolean contactInfoHidden;

    @com.google.gson.annotations.c("editable")
    private final boolean editable;

    public a(boolean z12, boolean z13) {
        this.contactInfoHidden = z12;
        this.editable = z13;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getContactInfoHidden() {
        return this.contactInfoHidden;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }
}
