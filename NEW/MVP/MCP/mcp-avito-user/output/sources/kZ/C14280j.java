package KZ;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: ApplicationAppealsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LKZ/j;", "", "", "title", "", "badge", VoiceInfo.STATE, "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "a", "()Z", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14280j {

    @com.google.gson.annotations.c("badge")
    private final boolean badge;

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @Y61.k
    private final String state;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14280j(@Y61.k String str, boolean z12, @Y61.k String str2) {
        this.title = str;
        this.badge = z12;
        this.state = str2;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getBadge() {
        return this.badge;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14280j)) {
            return false;
        }
        C14280j c14280j = (C14280j) obj;
        return kotlin.jvm.internal.L.f(this.title, c14280j.title) && this.badge == c14280j.badge && kotlin.jvm.internal.L.f(this.state, c14280j.state);
    }

    public final int hashCode() {
        return this.state.hashCode() + androidx.appcompat.app.r.i(this.title.hashCode() * 31, 31, this.badge);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationAppealTab(title=");
        sb2.append(this.title);
        sb2.append(", badge=");
        sb2.append(this.badge);
        sb2.append(", state=");
        return C22026a.c(sb2, this.state, ')');
    }
}
