package com.vk.id.captcha.api.data;

import X41.i;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKCaptchaError.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u001b\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError;", "", "", "error", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Cancelled", "IllegalArgumentError", "NetworkError", "WebviewIsUpdatingError", "Lcom/vk/id/captcha/api/data/VKCaptchaError$Cancelled;", "Lcom/vk/id/captcha/api/data/VKCaptchaError$IllegalArgumentError;", "Lcom/vk/id/captcha/api/data/VKCaptchaError$NetworkError;", "Lcom/vk/id/captcha/api/data/VKCaptchaError$WebviewIsUpdatingError;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class VKCaptchaError {

    @l
    private final Throwable error;

    @k
    private final String message;

    /* compiled from: VKCaptchaError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError$Cancelled;", "Lcom/vk/id/captcha/api/data/VKCaptchaError;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Cancelled extends VKCaptchaError {
        /* JADX WARN: Multi-variable type inference failed */
        public Cancelled() {
            super("You've cancelled the captcha flow", null, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: VKCaptchaError.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError$IllegalArgumentError;", "Lcom/vk/id/captcha/api/data/VKCaptchaError;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IllegalArgumentError extends VKCaptchaError {
    }

    /* compiled from: VKCaptchaError.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError$NetworkError;", "Lcom/vk/id/captcha/api/data/VKCaptchaError;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkError extends VKCaptchaError {
        public /* synthetic */ NetworkError(String str, Throwable th2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : th2);
        }

        public NetworkError(@k String str, @l Throwable th2) {
            super(str, th2, null);
        }
    }

    /* compiled from: VKCaptchaError.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError$WebviewIsUpdatingError;", "Lcom/vk/id/captcha/api/data/VKCaptchaError;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WebviewIsUpdatingError extends VKCaptchaError {
        public WebviewIsUpdatingError(@k String str, @l Throwable th2) {
            super(str, th2, null);
        }
    }

    public /* synthetic */ VKCaptchaError(String str, Throwable th2, C42822w c42822w) {
        this(str, th2);
    }

    @l
    @i
    public final Throwable getError() {
        return this.error;
    }

    @i
    @k
    public final String getMessage() {
        return this.message;
    }

    private VKCaptchaError(String str, Throwable th2) {
        this.message = str;
        this.error = th2;
    }
}
