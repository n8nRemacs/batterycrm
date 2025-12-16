package h20;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetClientFormGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lh20/b;", "", "Lh20/c;", "action", "", "description", "title", "<init>", "(Lh20/c;Ljava/lang/String;Ljava/lang/String;)V", "Lh20/c;", "a", "()Lh20/c;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    @com.google.gson.annotations.c("action")
    @k
    private final c action;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public b(@k c cVar, @k String str, @k String str2) {
        this.action = cVar;
        this.description = str;
        this.title = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final c getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
