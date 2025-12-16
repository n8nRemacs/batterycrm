package Qy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1StrSellerBookingCalendarParametersRefundSettingsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LQy0/a;", "", "LQy0/b;", "cancellation", "LQy0/c;", "cancellationDiscount", "LQy0/f;", "explanations", "<init>", "(LQy0/b;LQy0/c;LQy0/f;)V", "LQy0/b;", "a", "()LQy0/b;", "LQy0/c;", "b", "()LQy0/c;", "LQy0/f;", "c", "()LQy0/f;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14950a {

    @com.google.gson.annotations.c("cancellation")
    @k
    private final b cancellation;

    @com.google.gson.annotations.c("cancellationDiscount")
    @l
    private final c cancellationDiscount;

    @com.google.gson.annotations.c("explanations")
    @k
    private final f explanations;

    public C14950a(@k b bVar, @l c cVar, @k f fVar) {
        this.cancellation = bVar;
        this.cancellationDiscount = cVar;
        this.explanations = fVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getCancellation() {
        return this.cancellation;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final c getCancellationDiscount() {
        return this.cancellationDiscount;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final f getExplanations() {
        return this.explanations;
    }
}
