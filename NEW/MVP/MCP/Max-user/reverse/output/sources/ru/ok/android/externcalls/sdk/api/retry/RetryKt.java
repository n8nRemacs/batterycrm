package ru.ok.android.externcalls.sdk.api.retry;

import androidx.work.WorkRequest;
import defpackage.dg0;
import defpackage.e2f;
import defpackage.em6;
import defpackage.hn6;
import defpackage.ln5;
import defpackage.ora;
import defpackage.qqg;
import defpackage.sm6;
import defpackage.u08;
import defpackage.u0e;
import defpackage.vm8;
import defpackage.wk3;
import defpackage.y6d;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Metadata;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a1\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0006\u001a1\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0006\u001a9\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"", "T", "Le2f;", "Ly6d;", "logger", "retryApiCallForOutgoing", "(Le2f;Ly6d;)Le2f;", "retryApiCallForJoining", "retryApiCallForIncoming", "retryApiCallForBackgroundWork", "retryApiCallForFastWorkRequired", "retryWithFastBackoff", "retryWithSlowBackoff", "Ldg0;", "backoff", "retryApiWithBackoff", "(Le2f;Ly6d;Ldg0;)Le2f;", "createFastBackoff", "()Ldg0;", "createSlowBackoff", "", "throwable", "", "retryApiExceptionFilter", "(Ljava/lang/Throwable;)Z", "", "LOG_TAG", "Ljava/lang/String;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RetryKt {
    private static final String LOG_TAG = "CallsApiRetry";

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.api.retry.RetryKt$retryApiWithBackoff$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends hn6 implements em6 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, RetryKt.class, "retryApiExceptionFilter", "retryApiExceptionFilter(Ljava/lang/Throwable;)Z", 1);
        }

        @Override // defpackage.em6
        public final Boolean invoke(Throwable th) {
            return Boolean.valueOf(RetryKt.retryApiExceptionFilter(th));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "", "throwable", "", "attempt", "Lqqg;", "invoke", "(Ljava/lang/Throwable;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.api.retry.RetryKt$retryApiWithBackoff$2, reason: invalid class name */
    public static final class AnonymousClass2 extends u08 implements sm6 {
        final /* synthetic */ y6d $logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(y6d y6dVar) {
            super(2);
            this.$logger = y6dVar;
        }

        @Override // defpackage.sm6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Throwable) obj, ((Number) obj2).intValue());
            return qqg.a;
        }

        public final void invoke(Throwable th, int i) {
            this.$logger.log(RetryKt.LOG_TAG, "retry attempt " + i + " after " + th);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lqqg;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.api.retry.RetryKt$retryApiWithBackoff$3, reason: invalid class name */
    public static final class AnonymousClass3 extends u08 implements em6 {
        final /* synthetic */ y6d $logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(y6d y6dVar) {
            super(1);
            this.$logger = y6dVar;
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return qqg.a;
        }

        public final void invoke(Throwable th) {
            this.$logger.log(RetryKt.LOG_TAG, "retry failed with last exception " + th);
        }
    }

    private static final dg0 createFastBackoff() {
        return new dg0(new ln5(15), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
    }

    private static final dg0 createSlowBackoff() {
        return new dg0(new ln5(10), WorkRequest.MIN_BACKOFF_MILLIS);
    }

    public static final <T> e2f retryApiCallForBackgroundWork(e2f e2fVar, y6d y6dVar) {
        return retryWithSlowBackoff(e2fVar, y6dVar);
    }

    public static final <T> e2f retryApiCallForFastWorkRequired(e2f e2fVar, y6d y6dVar) {
        return retryWithFastBackoff(e2fVar, y6dVar);
    }

    public static final <T> e2f retryApiCallForIncoming(e2f e2fVar, y6d y6dVar) {
        return retryWithSlowBackoff(e2fVar, y6dVar);
    }

    public static final <T> e2f retryApiCallForJoining(e2f e2fVar, y6d y6dVar) {
        return retryWithFastBackoff(e2fVar, y6dVar);
    }

    public static final <T> e2f retryApiCallForOutgoing(e2f e2fVar, y6d y6dVar) {
        return retryWithFastBackoff(e2fVar, y6dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryApiExceptionFilter(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof SocketException) || (th instanceof SSLProtocolException) || (th instanceof SSLPeerUnverifiedException) || (th instanceof SSLHandshakeException) || (th instanceof SSLException) || (th instanceof HttpRetryException)) {
            return true;
        }
        if (!(th instanceof HttpStatusApiException)) {
            return (th instanceof ProtocolException) || (th instanceof IOException);
        }
        int i = ((HttpStatusApiException) th).a;
        return i == 502 || i == 504;
    }

    private static final <T> e2f retryApiWithBackoff(e2f e2fVar, y6d y6dVar, dg0 dg0Var) {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(y6dVar);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(y6dVar);
        return new wk3(1, new ora(e2fVar.n(), new vm8(anonymousClass1, dg0Var, anonymousClass2, u0e.a(), anonymousClass3), 7));
    }

    private static final <T> e2f retryWithFastBackoff(e2f e2fVar, y6d y6dVar) {
        return retryApiWithBackoff(e2fVar, y6dVar, createFastBackoff());
    }

    private static final <T> e2f retryWithSlowBackoff(e2f e2fVar, y6d y6dVar) {
        return retryApiWithBackoff(e2fVar, y6dVar, createSlowBackoff());
    }
}
