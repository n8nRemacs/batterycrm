package xD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import kotlin.Metadata;

/* compiled from: PackageSize.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LxD0/a;", "", "", "id", "title", "", "isSelected", "LxD0/b;", RequestReviewResultKt.INFO_TYPE, "LxD0/d;", "countPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLxD0/b;LxD0/d;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Z", "e", "()Z", "LxD0/b;", "c", "()LxD0/b;", "LxD0/d;", "a", "()LxD0/d;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49821a {

    @com.google.gson.annotations.c("countPrice")
    @l
    private final C49824d countPrice;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
    @l
    private final C49822b info;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C49821a(@k String str, @k String str2, boolean z12, @l C49822b c49822b, @l C49824d c49824d) {
        this.id = str;
        this.title = str2;
        this.isSelected = z12;
        this.info = c49822b;
        this.countPrice = c49824d;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C49824d getCountPrice() {
        return this.countPrice;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C49822b getInfo() {
        return this.info;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
