package ru.ok.android.externcalls.sdk.id.peer;

import defpackage.bk8;
import defpackage.j7d;
import defpackage.k7d;
import defpackage.tk4;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import ru.ok.android.onelog.impl.BuildConfig;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "", "()V", "generatePeerId", "", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PeerIdGenerator {
    private static final Companion Companion = new Companion(null);
    private static final long MIN_JS_SAFE_LONG = -9007199254740991L;
    private static final long MAX_JS_SAFE_LONG = 9007199254740991L;
    private static final bk8 PEER_ID_RANGE = new bk8(MIN_JS_SAFE_LONG, MAX_JS_SAFE_LONG);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator$Companion;", "", "<init>", "()V", "", "MAX_JS_SAFE_LONG", "J", "MIN_JS_SAFE_LONG", "Lbk8;", "PEER_ID_RANGE", "Lbk8;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    public final long generatePeerId() {
        bk8 bk8Var = PEER_ID_RANGE;
        j7d j7dVar = k7d.a;
        try {
            long j = bk8Var.a;
            if (bk8Var.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + bk8Var);
            }
            long j2 = bk8Var.b;
            if (j2 < BuildConfig.MAX_TIME_TO_UPLOAD) {
                return k7d.b.f(j, j2 + 1);
            }
            if (j <= Long.MIN_VALUE) {
                return k7d.b.d();
            }
            return k7d.b.f(j - 1, j2) + 1;
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
