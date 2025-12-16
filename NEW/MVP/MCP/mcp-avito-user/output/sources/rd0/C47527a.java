package rD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ConfigureCategory.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"LrD0/a;", "", "", "id", "title", "", "isEnabled", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "Z", "d", "()Z", "setEnabled", "(Z)V", "b", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47527a {

    @c("id")
    @k
    private final String id;

    @c("isEnabled")
    private boolean isEnabled;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    public C47527a(@k String str, @k String str2, boolean z12, @l String str3) {
        this.id = str;
        this.title = str2;
        this.isEnabled = z12;
        this.subtitle = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }
}
