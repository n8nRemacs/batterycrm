package Zo0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiConfirmDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LZo0/b;", "", "", "dueDate", "", "sendsLeft", "totalSends", "<init>", "(Ljava/lang/String;JJ)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "J", "b", "()J", "c", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19582b {

    @c("dueDate")
    @k
    private final String dueDate;

    @c("sendsLeft")
    private final long sendsLeft;

    @c("totalSends")
    private final long totalSends;

    public C19582b(@k String str, long j12, long j13) {
        this.dueDate = str;
        this.sendsLeft = j12;
        this.totalSends = j13;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* renamed from: b, reason: from getter */
    public final long getSendsLeft() {
        return this.sendsLeft;
    }

    /* renamed from: c, reason: from getter */
    public final long getTotalSends() {
        return this.totalSends;
    }
}
