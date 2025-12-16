package no0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: TfaEnableCodeRequestV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lno0/b;", "", "a", "b", "Lno0/b$a;", "Lno0/b$b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: no0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC44459b {

    /* compiled from: TfaEnableCodeRequestV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lno0/b$a;", "Lno0/b;", "Lno0/a;", "messages", "<init>", "(Lno0/a;)V", "Lno0/a;", "a", "()Lno0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: no0.b$a */
    public static final class a implements InterfaceC44459b {

        @c("messages")
        @k
        private final C44458a messages;

        public a(@k C44458a c44458a) {
            this.messages = c44458a;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C44458a getMessages() {
            return this.messages;
        }
    }

    /* compiled from: TfaEnableCodeRequestV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lno0/b$b;", "Lno0/b;", "", "timer", "<init>", "(J)V", "J", "a", "()J", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: no0.b$b, reason: collision with other inner class name */
    public static final class C12151b implements InterfaceC44459b {

        @c("timer")
        private final long timer;

        public C12151b(long j12) {
            this.timer = j12;
        }

        /* renamed from: a, reason: from getter */
        public final long getTimer() {
            return this.timer;
        }
    }
}
