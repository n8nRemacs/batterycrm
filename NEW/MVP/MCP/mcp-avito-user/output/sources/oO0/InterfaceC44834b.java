package oo0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TfaEnableConfirmV2Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Loo0/b;", "", "a", "b", "c", "Loo0/b$a;", "Loo0/b$b;", "Loo0/b$c;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC44834b {

    /* compiled from: TfaEnableConfirmV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Loo0/b$a;", "Loo0/b;", "Loo0/a;", "messages", "<init>", "(Loo0/a;)V", "Loo0/a;", "a", "()Loo0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oo0.b$a */
    public static final class a implements InterfaceC44834b {

        @com.google.gson.annotations.c("messages")
        @k
        private final C44833a messages;

        public a(@k C44833a c44833a) {
            this.messages = c44833a;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C44833a getMessages() {
            return this.messages;
        }
    }

    /* compiled from: TfaEnableConfirmV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Loo0/b$b;", "Loo0/b;", "", "hash", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oo0.b$b, reason: collision with other inner class name */
    public static final class C12197b implements InterfaceC44834b {

        @com.google.gson.annotations.c("hash")
        @k
        private final String hash;

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public C12197b(@k String str, @k String str2) {
            this.hash = str;
            this.message = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getHash() {
            return this.hash;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: TfaEnableConfirmV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Loo0/b$c;", "Loo0/b;", "", "isEnabled", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oo0.b$c */
    public static final class c implements InterfaceC44834b {

        @com.google.gson.annotations.c("isEnabled")
        private final boolean isEnabled;

        public c(boolean z12) {
            this.isEnabled = z12;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }
}
