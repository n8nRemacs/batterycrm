package ru.ok.android.externcalls.sdk.wt.internal;

import defpackage.b97;
import defpackage.ctc;
import defpackage.epi;
import defpackage.ev1;
import defpackage.kk8;
import defpackage.lb2;
import defpackage.m4;
import defpackage.nie;
import defpackage.ov3;
import defpackage.pie;
import defpackage.qie;
import defpackage.qqg;
import defpackage.r0i;
import defpackage.rie;
import defpackage.sm6;
import defpackage.tb3;
import defpackage.tk4;
import defpackage.u08;
import defpackage.v87;
import defpackage.y6d;
import defpackage.y87;
import defpackage.yhe;
import defpackage.ysc;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;
import ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 ?2\u00020\u0001:\u0003?@AB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0014JG\u0010\u001b\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010:\u001a\n 9*\u0004\u0018\u000108088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket;", "", "", ApiProtocol.KEY_ENDPOINT, "Ly6d;", "log", "Lv87;", "client", "Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$CompressorDecompressor;", "compressorDecompressor", "Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;", "listener", "<init>", "(Ljava/lang/String;Ly6d;Lv87;Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$CompressorDecompressor;Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;)V", "Lqqg;", "connect", "(Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;)V", "Lyhe;", "session", "configureSession", "(Lyhe;Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;)V", "openSession", "T", "action", "context", "Lkotlin/Function2;", "handler", "handleAsync", "(Ljava/lang/String;Ljava/lang/Object;Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;Lsm6;)V", "Lr0i;", "stream", "sendStreamData", "(Lr0i;Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;)V", "readStreamData", "(Lyhe;Lr0i;Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;)V", "message", "send", "(Ljava/lang/String;)V", "", "code", IceCandidatePairChangedStat.KEY_REASON, "close", "(ILjava/lang/String;)V", "Ljava/lang/String;", "getEndpoint$wtsignaling_release", "()Ljava/lang/String;", "Ly6d;", "Lv87;", "Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$CompressorDecompressor;", "Lyhe;", "Ljava/util/LinkedList;", "messageQueue", "Ljava/util/LinkedList;", "Ljava/util/concurrent/locks/ReentrantLock;", "messageQueueLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "messageQueueCondition", "Ljava/util/concurrent/locks/Condition;", "", "released", "Z", "Companion", "CompressorDecompressor", "Listener", "wtsignaling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebTransportSocket {

    @Deprecated
    public static final int INITIAL_MESSAGE_SIZE = 1024;

    @Deprecated
    public static final String LOG_TAG = "WebTransportSocket";
    private final v87 client;
    private final CompressorDecompressor compressorDecompressor;
    private final String endpoint;
    private final y6d log;
    private final LinkedList<String> messageQueue = new LinkedList<>();
    private final Condition messageQueueCondition;
    private final ReentrantLock messageQueueLock;
    private volatile boolean released;
    private yhe session;
    private static final Companion Companion = new Companion(null);
    private static final AtomicInteger identityProvider = new AtomicInteger(0);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqqg;", "<anonymous parameter 0>", "Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;", "listener", "invoke", "(Lqqg;Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements sm6 {
        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.sm6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((qqg) obj, (Listener) obj2);
            return qqg.a;
        }

        public final void invoke(qqg qqgVar, Listener listener) {
            WebTransportSocket.this.connect(listener);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Companion;", "", "()V", "INITIAL_MESSAGE_SIZE", "", "LOG_TAG", "", "identityProvider", "Ljava/util/concurrent/atomic/AtomicInteger;", "getIdentityProvider", "()Ljava/util/concurrent/atomic/AtomicInteger;", "wtsignaling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        public final AtomicInteger getIdentityProvider() {
            return WebTransportSocket.identityProvider;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$CompressorDecompressor;", "", "", "rawData", "", "offset", "length", "compress", "([BII)[B", "compressedData", "decompress", "Lqqg;", "release", "()V", "wtsignaling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CompressorDecompressor {
        byte[] compress(byte[] rawData, int offset, int length);

        byte[] decompress(byte[] compressedData, int offset, int length);

        void release();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$Listener;", "", "Lqqg;", "onOpen", "()V", "", "text", "onMessage", "(Ljava/lang/String;)V", "", "code", IceCandidatePairChangedStat.KEY_REASON, "onClosed", "(ILjava/lang/String;)V", "", "onFailure", "(Ljava/lang/Throwable;)V", "wtsignaling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onClosed(int code, String reason);

        void onFailure(Throwable reason);

        void onMessage(String text);

        void onOpen();
    }

    public WebTransportSocket(String str, y6d y6dVar, v87 v87Var, CompressorDecompressor compressorDecompressor, Listener listener) {
        this.endpoint = str;
        this.log = y6dVar;
        this.client = v87Var;
        this.compressorDecompressor = compressorDecompressor;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.messageQueueLock = reentrantLock;
        this.messageQueueCondition = reentrantLock.newCondition();
        handleAsync("connect-and-read", qqg.a, listener, new AnonymousClass1());
    }

    private final void configureSession(yhe session, Listener listener) {
        ov3 ov3Var = new ov3(6, this);
        rie rieVar = (rie) session;
        rieVar.getClass();
        rieVar.j = ov3Var;
        final int i = 0;
        rieVar.i = new Consumer(this) { // from class: q0i
            public final /* synthetic */ WebTransportSocket b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        WebTransportSocket.configureSession$lambda$4(this.b, (r0i) obj);
                        break;
                    default:
                        WebTransportSocket.configureSession$lambda$5(this.b, (r0i) obj);
                        break;
                }
            }
        };
        final int i2 = 1;
        rieVar.h = new Consumer(this) { // from class: q0i
            public final /* synthetic */ WebTransportSocket b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        WebTransportSocket.configureSession$lambda$4(this.b, (r0i) obj);
                        break;
                    default:
                        WebTransportSocket.configureSession$lambda$5(this.b, (r0i) obj);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$3(WebTransportSocket webTransportSocket, Long l, String str) {
        webTransportSocket.log.log(LOG_TAG, "session has terminated with " + l + ", " + str);
        int iLongValue = l != null ? (int) l.longValue() : 0;
        if (str == null) {
            str = "-";
        }
        webTransportSocket.close(iLongValue, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$4(WebTransportSocket webTransportSocket, r0i r0iVar) {
        webTransportSocket.log.log(LOG_TAG, "Got new BIDI stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$5(WebTransportSocket webTransportSocket, r0i r0iVar) {
        webTransportSocket.log.log(LOG_TAG, "Got new UNI stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connect(Listener listener) {
        try {
            URI uriCreate = URI.create(this.endpoint);
            rie rieVarB = new tb3(uriCreate, this.client).b(uriCreate);
            this.session = rieVarB;
            configureSession(rieVarB, listener);
            openSession(rieVarB, listener);
        } catch (Throwable th) {
            listener.onFailure(th);
        }
    }

    private final <T> void handleAsync(String action, T context, Listener listener, sm6 handler) {
        Thread thread = new Thread(new ev1((Object) this, action, (Object) handler, (Object) context, (Object) listener, 6));
        thread.setName("wt-" + action);
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAsync$lambda$7(WebTransportSocket webTransportSocket, String str, sm6 sm6Var, Object obj, Listener listener) {
        webTransportSocket.log.log(LOG_TAG, str.concat(" thread is about to start"));
        try {
            sm6Var.invoke(obj, listener);
        } finally {
            try {
            } finally {
            }
        }
    }

    private final void openSession(yhe session, Listener listener) throws IOException {
        rie rieVar = (rie) session;
        qie qieVar = qie.b;
        rieVar.a(qieVar, new kk8(27), new nie(0));
        tb3 tb3Var = rieVar.d;
        tb3Var.b.lock();
        try {
            List list = (List) tb3Var.c.remove(Long.valueOf(rieVar.c));
            if (list != null) {
                list.forEach(new m4(0, rieVar));
                tb3Var.d -= list.size();
            }
            tb3Var.b.unlock();
            listener.onOpen();
            if (rieVar.e == qie.a) {
                throw new IllegalStateException("Session is not opened yet");
            }
            if (rieVar.e != qieVar) {
                throw new IOException("Session is closed");
            }
            ctc ctcVarC = ((ysc) ((y87) rieVar.a).f).c(true);
            b97 b97Var = new b97(ctcVarC, ctcVarC.e);
            OutputStream outputStreamA = b97Var.a();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            int iC = epi.c(65L, byteBufferAllocate);
            for (int i = 0; i < iC; i++) {
                outputStreamA.write(byteBufferAllocate.get());
            }
            long j = rieVar.c;
            OutputStream outputStreamA2 = b97Var.a();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(8);
            int iC2 = epi.c(j, byteBufferAllocate2);
            for (int i2 = 0; i2 < iC2; i2++) {
                outputStreamA2.write(byteBufferAllocate2.get());
            }
            rieVar.k.add(b97Var);
            rieVar.l.add(b97Var);
            pie pieVar = new pie(b97Var, 0);
            handleAsync("send", pieVar, listener, new WebTransportSocket$openSession$1$1(this));
            readStreamData(session, pieVar, listener);
        } catch (Throwable th) {
            tb3Var.b.unlock();
            throw th;
        }
    }

    private final void readStreamData(yhe session, r0i stream, Listener listener) throws IOException {
        InputStream inputStreamB;
        try {
            try {
                inputStreamB = stream.b();
            } catch (IOException e) {
                if (!this.released) {
                    this.log.logException(LOG_TAG, "Error on read from wt stream", e);
                    throw e;
                }
            }
            if (inputStreamB == null) {
                throw new IOException("wt stream has no input");
            }
            byte[] bArr = new byte[1024];
            loop0: while (true) {
                try {
                    int iE = epi.e(inputStreamB);
                    if (iE > bArr.length) {
                        bArr = new byte[iE];
                    }
                    int i = 0;
                    while (i < iE) {
                        int i2 = inputStreamB.read(bArr, i, iE - i);
                        if (i2 < 0) {
                            break loop0;
                        } else {
                            i += i2;
                        }
                    }
                    byte[] bArrDecompress = this.compressorDecompressor.decompress(bArr, 0, i);
                    listener.onMessage(new String(bArrDecompress, 0, bArrDecompress.length, lb2.a));
                } catch (EOFException unused) {
                    this.log.log(LOG_TAG, "Got EOF while trying to parse next packet length. Guess the stream is closed, exit silently");
                }
            }
            this.log.log(LOG_TAG, "stream closed, leave recv loop");
            this.log.log(LOG_TAG, "Read thread has completed");
        } catch (Throwable th) {
            this.log.log(LOG_TAG, "Read thread has completed");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendStreamData(r0i stream, Listener listener) throws IOException {
        byte[] bArr = new byte[8];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        while (true) {
            try {
                ReentrantLock reentrantLock = this.messageQueueLock;
                reentrantLock.lock();
                try {
                    try {
                        this.messageQueueCondition.await();
                        if (this.released) {
                            break;
                        }
                        OutputStream outputStreamA = stream.a();
                        if (outputStreamA == null) {
                            throw new IOException("wt stream has no output");
                        }
                        while (!this.messageQueue.isEmpty()) {
                            byte[] bytes = this.messageQueue.remove(0).getBytes(lb2.a);
                            byte[] bArrCompress = this.compressorDecompressor.compress(bytes, 0, bytes.length);
                            try {
                                byteBufferWrap.position(0);
                                epi.b(bArrCompress.length, byteBufferWrap);
                                outputStreamA.write(bArr, 0, byteBufferWrap.position());
                                outputStreamA.write(bArrCompress);
                                outputStreamA.flush();
                            } catch (IOException e) {
                                this.log.logException(LOG_TAG, "Error on write to wt stream", e);
                                throw e;
                            }
                        }
                    } catch (InterruptedException e2) {
                        this.log.logException(LOG_TAG, "Send stream interrputed", e2);
                        reentrantLock.unlock();
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } finally {
                this.log.log(LOG_TAG, "Write thread has completed");
            }
        }
    }

    public final void close(int code, String reason) {
        try {
            if (!this.released) {
                this.released = true;
                ReentrantLock reentrantLock = this.messageQueueLock;
                reentrantLock.lock();
                try {
                    this.messageQueueCondition.signalAll();
                    reentrantLock.unlock();
                    yhe yheVar = this.session;
                    if (yheVar != null) {
                        ((rie) yheVar).b(code, reason);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: getEndpoint$wtsignaling_release, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    public final void send(String message) {
        ReentrantLock reentrantLock = this.messageQueueLock;
        reentrantLock.lock();
        try {
            this.messageQueue.add(message);
            this.messageQueueCondition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
