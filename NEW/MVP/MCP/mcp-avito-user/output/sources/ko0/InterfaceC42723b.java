package ko0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TfaDisableConfirmV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lko0/b;", "", "a", "b", "Lko0/b$a;", "Lko0/b$b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ko0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42723b {

    /* compiled from: TfaDisableConfirmV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lko0/b$a;", "Lko0/b;", "Lko0/c;", "messages", "<init>", "(Lko0/c;)V", "Lko0/c;", "a", "()Lko0/c;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ko0.b$a */
    public static final class a implements InterfaceC42723b {

        @com.google.gson.annotations.c("messages")
        @k
        private final C42724c messages;

        public a(@k C42724c c42724c) {
            this.messages = c42724c;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C42724c getMessages() {
            return this.messages;
        }
    }

    /* compiled from: TfaDisableConfirmV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"Lko0/b$b;", "Lko0/b;", "", "isEnabled", "<init>", "(Z)V", "Z", "()Z", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ko0.b$b, reason: collision with other inner class name */
    public static final class C11627b implements InterfaceC42723b {

        @com.google.gson.annotations.c("isEnabled")
        private final boolean isEnabled;

        public C11627b(boolean z12) {
            this.isEnabled = z12;
        }
    }
}
