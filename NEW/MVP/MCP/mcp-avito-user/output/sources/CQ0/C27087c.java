package cQ0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"LcQ0/c;", "", "", "banEndTime", "LcQ0/d;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "title", "<init>", "(Ljava/lang/String;LcQ0/d;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LcQ0/d;", "b", "()LcQ0/d;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cQ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27087c {

    @com.google.gson.annotations.c("banEndTime")
    @Y61.k
    private final String banEndTime;

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final C27088d button;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C27087c(@Y61.k String str, @Y61.k C27088d c27088d, @Y61.k AttributedText attributedText, @Y61.k String str2) {
        this.banEndTime = str;
        this.button = c27088d;
        this.description = attributedText;
        this.title = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getBanEndTime() {
        return this.banEndTime;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C27088d getButton() {
        return this.button;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
