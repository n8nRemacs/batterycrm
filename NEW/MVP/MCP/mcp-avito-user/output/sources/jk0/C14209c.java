package Jk0;

import Y61.k;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApicoNotificationsSettingsResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJk0/c;", "", "", RequestReviewResultKt.INFO_TYPE, "", "LJk0/a;", "sections", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jk0.c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C14209c {

    @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
    @k
    private final String info;

    @com.google.gson.annotations.c("sections")
    @k
    private final List<C14207a> sections;

    public C14209c(@k String str, @k List<C14207a> list) {
        this.info = str;
        this.sections = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @k
    public final List<C14207a> b() {
        return this.sections;
    }
}
