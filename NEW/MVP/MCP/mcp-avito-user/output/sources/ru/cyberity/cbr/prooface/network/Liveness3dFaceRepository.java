package ru.cyberity.cbr.prooface.network;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.G;
import java.util.concurrent.Executors;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.T;
import kotlinx.serialization.C;
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import ru.cyberity.cbr.core.c;
import ru.cyberity.cbr.core.common.CBRSession;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.p0;
import ru.cyberity.cbr.core.data.listener.TokenExpirationHandler;
import ru.cyberity.cbr.prooface.data.LivenessMessageType;
import ru.cyberity.cbr.prooface.data.Mvd4a63GEdh6H;
import ru.cyberity.cbr.prooface.data.NriLyb2MNC2;
import ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx;
import ru.cyberity.log.a;
import ru.cyberity.log.b;
import ru.cyberity.log.logger.Logger;

@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\t*\u00012\u0018\u0000 62\u00020\u0001:\u0003789B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u00101\u001a\u00020*2\u0006\u0010.\u001a\u00020*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b\u001b\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository;", "", "Lokhttp3/OkHttpClient;", "httpClient", "", "idDocSetType", "Lru/cyberity/cbr/core/common/CBRSession;", "session", "Lkotlinx/serialization/json/a;", "json", "Lru/cyberity/cbr/core/c;", "tokenProvider", "<init>", "(Lokhttp3/OkHttpClient;Ljava/lang/String;Lru/cyberity/cbr/core/common/CBRSession;Lkotlinx/serialization/json/a;Lru/cyberity/cbr/core/c;)V", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "()V", "MyHc7quGyJKbnAIkFgd", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$VEkdd97RzWe;", "callback", "(Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$VEkdd97RzWe;)V", "uz93gWN1OYgIQ", "Lru/cyberity/cbr/prooface/data/NriLyb2MNC2;", "message", "(Lru/cyberity/cbr/prooface/data/NriLyb2MNC2;)V", "Lokhttp3/OkHttpClient;", "Ljava/lang/String;", "peujtyiBSfZOKD0yphJi2", "Lru/cyberity/cbr/core/common/CBRSession;", "Lkotlinx/serialization/json/a;", "U4mhkUewPl2fPUTo32", "Lru/cyberity/cbr/core/c;", "", "E9gFqwO2FE5yBJACCUilu8lqyiR", "I", "reconnectAttempts", "Lokhttp3/WebSocket;", "Hxrfc64cpBNzdXtCQnYxNm1uSR", "Lokhttp3/WebSocket;", "socket", "hKhP1IV1YI8WgJ4nSpWmOP", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$VEkdd97RzWe;", "", "qDU6tWL1eFyUpkx72FqDl7Rs8Zhj", "Z", "isClosed", "<set-?>", "wHwI6WiVaPW36cHlnYtNbdyeJ6", "()Z", "isConnected", "ru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$d8gDEgxuRMWxWXii0", "ro5yTlDmHIztT", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$d8gDEgxuRMWxWXii0;", "listener", "ixRCtjLaoPvSdVLG7eWTMMZt4s", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "LivenessRepositoryResult", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class Liveness3dFaceRepository {

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @k
    private final OkHttpClient httpClient;

    /* renamed from: E9gFqwO2FE5yBJACCUilu8lqyiR, reason: from kotlin metadata */
    private int reconnectAttempts;

    /* renamed from: Hxrfc64cpBNzdXtCQnYxNm1uSR, reason: from kotlin metadata */
    @l
    private WebSocket socket;

    /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from kotlin metadata */
    @k
    private final AbstractC43443a json;

    /* renamed from: U4mhkUewPl2fPUTo32, reason: from kotlin metadata */
    @k
    private final c<String> tokenProvider;

    /* renamed from: hKhP1IV1YI8WgJ4nSpWmOP, reason: from kotlin metadata */
    @l
    private VEkdd97RzWe callback;

    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
    @k
    private final CBRSession session;

    /* renamed from: qDU6tWL1eFyUpkx72FqDl7Rs8Zhj, reason: from kotlin metadata */
    private boolean isClosed;

    /* renamed from: ro5yTlDmHIztT, reason: from kotlin metadata */
    @k
    private final d8gDEgxuRMWxWXii0 listener = new d8gDEgxuRMWxWXii0();

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @k
    private final String idDocSetType;

    /* renamed from: wHwI6WiVaPW36cHlnYtNbdyeJ6, reason: from kotlin metadata */
    private boolean isConnected;

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "", "<init>", "()V", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "d8gDEgxuRMWxWXii0", "W6LpgmOhfkE9MxK", "P5t5x18Nr9Zgcg9u0Pj", "b8k1CqqNgacAsHleVkUzBdlNS", "gCh8O9vEEXKO12FpnjmYuc29DG", "NriLyb2MNC2", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$VEkdd97RzWe;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$d8gDEgxuRMWxWXii0;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$W6LpgmOhfkE9MxK;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$P5t5x18Nr9Zgcg9u0Pj;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$b8k1CqqNgacAsHleVkUzBdlNS;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$gCh8O9vEEXKO12FpnjmYuc29DG;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$NriLyb2MNC2;", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class LivenessRepositoryResult {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$NriLyb2MNC2;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "", "AnZ4ntgRZiVOQFYAd", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final class NriLyb2MNC2 extends LivenessRepositoryResult {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @l
            private final String message;

            public NriLyb2MNC2(@l String str) {
                super(null);
                this.message = str;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$P5t5x18Nr9Zgcg9u0Pj;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final class P5t5x18Nr9Zgcg9u0Pj extends LivenessRepositoryResult {

            @k
            public static final P5t5x18Nr9Zgcg9u0Pj AnZ4ntgRZiVOQFYAd = new P5t5x18Nr9Zgcg9u0Pj();

            private P5t5x18Nr9Zgcg9u0Pj() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$VEkdd97RzWe;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final class VEkdd97RzWe extends LivenessRepositoryResult {

            @k
            public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd = new VEkdd97RzWe();

            private VEkdd97RzWe() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$W6LpgmOhfkE9MxK;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "AnZ4ntgRZiVOQFYAd", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "()Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "session", "<init>", "(Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final class W6LpgmOhfkE9MxK extends LivenessRepositoryResult {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @l
            private final Snkgl4azaPYl3o9T8p9tjFx session;

            public W6LpgmOhfkE9MxK(@l Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx) {
                super(null);
                this.session = snkgl4azaPYl3o9T8p9tjFx;
            }

            @l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final Snkgl4azaPYl3o9T8p9tjFx getSession() {
                return this.session;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "AnZ4ntgRZiVOQFYAd", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "getSession", "()Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "session", "<init>", "(Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final class ar2zdFahlgqFwCDaNcK2mMj8NV2W extends LivenessRepositoryResult {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @l
            private final Snkgl4azaPYl3o9T8p9tjFx session;

            public ar2zdFahlgqFwCDaNcK2mMj8NV2W(@l Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx) {
                super(null);
                this.session = snkgl4azaPYl3o9T8p9tjFx;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$b8k1CqqNgacAsHleVkUzBdlNS;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "AnZ4ntgRZiVOQFYAd", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "()Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "session", "<init>", "(Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final class b8k1CqqNgacAsHleVkUzBdlNS extends LivenessRepositoryResult {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @l
            private final Snkgl4azaPYl3o9T8p9tjFx session;

            public b8k1CqqNgacAsHleVkUzBdlNS(@l Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx) {
                super(null);
                this.session = snkgl4azaPYl3o9T8p9tjFx;
            }

            @l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final Snkgl4azaPYl3o9T8p9tjFx getSession() {
                return this.session;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$d8gDEgxuRMWxWXii0;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "", "AnZ4ntgRZiVOQFYAd", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "e", "<init>", "(Ljava/lang/Throwable;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final class d8gDEgxuRMWxWXii0 extends LivenessRepositoryResult {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @k
            private final Throwable e;

            public d8gDEgxuRMWxWXii0(@k Throwable th2) {
                super(null);
                this.e = th2;
            }

            @k
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final Throwable getE() {
                return this.e;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$gCh8O9vEEXKO12FpnjmYuc29DG;", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "AnZ4ntgRZiVOQFYAd", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "()Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "session", "<init>", "(Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        public static final class gCh8O9vEEXKO12FpnjmYuc29DG extends LivenessRepositoryResult {

            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
            @l
            private final Snkgl4azaPYl3o9T8p9tjFx session;

            public gCh8O9vEEXKO12FpnjmYuc29DG(@l Snkgl4azaPYl3o9T8p9tjFx snkgl4azaPYl3o9T8p9tjFx) {
                super(null);
                this.session = snkgl4azaPYl3o9T8p9tjFx;
            }

            @l
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
            public final Snkgl4azaPYl3o9T8p9tjFx getSession() {
                return this.session;
            }
        }

        public /* synthetic */ LivenessRepositoryResult(C42822w c42822w) {
            this();
        }

        private LivenessRepositoryResult() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$VEkdd97RzWe;", "", "Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "result", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public interface VEkdd97RzWe {
        void AnZ4ntgRZiVOQFYAd(@k LivenessRepositoryResult result);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.prooface.network.Liveness3dFaceRepository$updateToken$1$1", f = "Liveness3dFaceRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class W6LpgmOhfkE9MxK extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int AnZ4ntgRZiVOQFYAd;
        private /* synthetic */ Object uz93gWN1OYgIQ;

        public W6LpgmOhfkE9MxK(Continuation<? super W6LpgmOhfkE9MxK> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((W6LpgmOhfkE9MxK) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            W6LpgmOhfkE9MxK w6LpgmOhfkE9MxK = Liveness3dFaceRepository.this.new W6LpgmOhfkE9MxK(continuation);
            w6LpgmOhfkE9MxK.uz93gWN1OYgIQ = obj;
            return w6LpgmOhfkE9MxK;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.AnZ4ntgRZiVOQFYAd != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            T t12 = (T) this.uz93gWN1OYgIQ;
            String strOnTokenExpired = null;
            try {
                TokenExpirationHandler tokenExpirationHandler = n0.f432787a.getTokenExpirationHandler();
                if (tokenExpirationHandler != null) {
                    strOnTokenExpired = tokenExpirationHandler.onTokenExpired();
                }
            } catch (Exception e12) {
                a aVar = a.f436064a;
                String strA = ru.cyberity.log.c.a(t12);
                String message = e12.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(strA, message, e12);
            }
            if (strOnTokenExpired != null && p0.b(strOnTokenExpired)) {
                Logger.d$default(a.f436064a, ru.cyberity.log.c.a(t12), G.f("Liveness3dFaceRepository.New token is available. Token is ", strOnTokenExpired), null, 4, null);
                Liveness3dFaceRepository.this.tokenProvider.put(strOnTokenExpired);
                Liveness3dFaceRepository.this.AnZ4ntgRZiVOQFYAd();
            }
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/cyberity/cbr/prooface/network/Liveness3dFaceRepository$d8gDEgxuRMWxWXii0", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Lkotlin/G0;", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "", "text", "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "", "code", "reason", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosing", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    public static final class d8gDEgxuRMWxWXii0 extends WebSocketListener {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class VEkdd97RzWe {
            public static final /* synthetic */ int[] AnZ4ntgRZiVOQFYAd;

            static {
                int[] iArr = new int[LivenessMessageType.values().length];
                iArr[LivenessMessageType.livenessSessionStarted.ordinal()] = 1;
                iArr[LivenessMessageType.livenessSessionInProgress.ordinal()] = 2;
                iArr[LivenessMessageType.livenessSessionCompleted.ordinal()] = 3;
                iArr[LivenessMessageType.livenessSessionTerminated.ordinal()] = 4;
                AnZ4ntgRZiVOQFYAd = iArr;
            }
        }

        public d8gDEgxuRMWxWXii0() {
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(@k WebSocket webSocket, int code, @k String reason) {
            Logger.d$default(a.f436064a, ru.cyberity.log.c.a(this), "Liveness3dFaceRepository.onClosed: code=" + code + " reason=" + reason, null, 4, null);
            Liveness3dFaceRepository.this.isConnected = false;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(@k WebSocket webSocket, int code, @k String reason) {
            Logger.d$default(a.f436064a, ru.cyberity.log.c.a(this), "Liveness3dFaceRepository.onClosing: code=" + code + " reason=" + reason, null, 4, null);
            if (code != 4001 && code != 4002) {
                Liveness3dFaceRepository.this.isClosed = true;
                return;
            }
            VEkdd97RzWe vEkdd97RzWe = Liveness3dFaceRepository.this.callback;
            if (vEkdd97RzWe != null) {
                vEkdd97RzWe.AnZ4ntgRZiVOQFYAd(LivenessRepositoryResult.P5t5x18Nr9Zgcg9u0Pj.AnZ4ntgRZiVOQFYAd);
            }
            Liveness3dFaceRepository.this.MyHc7quGyJKbnAIkFgd();
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(@k WebSocket webSocket, @k Throwable t12, @l Response response) {
            if (!Liveness3dFaceRepository.this.isClosed) {
                Logger.d$default(a.f436064a, ru.cyberity.log.c.a(this), "Liveness3dFaceRepository.onFailure: e=" + t12 + ' ', null, 4, null);
                VEkdd97RzWe vEkdd97RzWe = Liveness3dFaceRepository.this.callback;
                if (vEkdd97RzWe != null) {
                    vEkdd97RzWe.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.d8gDEgxuRMWxWXii0(t12));
                }
            }
            Liveness3dFaceRepository.this.isConnected = false;
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(@k WebSocket webSocket, @k String text) {
            try {
                AbstractC43443a abstractC43443a = Liveness3dFaceRepository.this.json;
                NriLyb2MNC2 nriLyb2MNC2 = (NriLyb2MNC2) abstractC43443a.d(text, C.e(abstractC43443a.f412956b, m0.c(NriLyb2MNC2.class)));
                int i12 = VEkdd97RzWe.AnZ4ntgRZiVOQFYAd[LivenessMessageType.INSTANCE.AnZ4ntgRZiVOQFYAd(nriLyb2MNC2.getType()).ordinal()];
                if (i12 == 1) {
                    Liveness3dFaceRepository.this.reconnectAttempts = 0;
                    VEkdd97RzWe vEkdd97RzWe = Liveness3dFaceRepository.this.callback;
                    if (vEkdd97RzWe != null) {
                        vEkdd97RzWe.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.b8k1CqqNgacAsHleVkUzBdlNS(nriLyb2MNC2.getSession()));
                    }
                } else if (i12 == 2) {
                    VEkdd97RzWe vEkdd97RzWe2 = Liveness3dFaceRepository.this.callback;
                    if (vEkdd97RzWe2 != null) {
                        vEkdd97RzWe2.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.W6LpgmOhfkE9MxK(nriLyb2MNC2.getSession()));
                    }
                } else if (i12 == 3) {
                    VEkdd97RzWe vEkdd97RzWe3 = Liveness3dFaceRepository.this.callback;
                    if (vEkdd97RzWe3 != null) {
                        vEkdd97RzWe3.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.ar2zdFahlgqFwCDaNcK2mMj8NV2W(nriLyb2MNC2.getSession()));
                    }
                } else if (i12 != 4) {
                    VEkdd97RzWe vEkdd97RzWe4 = Liveness3dFaceRepository.this.callback;
                    if (vEkdd97RzWe4 != null) {
                        vEkdd97RzWe4.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.NriLyb2MNC2(text));
                    }
                } else {
                    VEkdd97RzWe vEkdd97RzWe5 = Liveness3dFaceRepository.this.callback;
                    if (vEkdd97RzWe5 != null) {
                        vEkdd97RzWe5.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.gCh8O9vEEXKO12FpnjmYuc29DG(nriLyb2MNC2.getSession()));
                    }
                }
            } catch (Exception e12) {
                b.b(a.f436064a, ru.cyberity.log.c.a(this), "Can't parse liveness message=" + text, e12);
                VEkdd97RzWe vEkdd97RzWe6 = Liveness3dFaceRepository.this.callback;
                if (vEkdd97RzWe6 != null) {
                    vEkdd97RzWe6.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.d8gDEgxuRMWxWXii0(e12));
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(@k WebSocket webSocket, @k Response response) {
            Liveness3dFaceRepository.this.isClosed = false;
            Liveness3dFaceRepository.this.isConnected = true;
            Liveness3dFaceRepository liveness3dFaceRepository = Liveness3dFaceRepository.this;
            liveness3dFaceRepository.AnZ4ntgRZiVOQFYAd(Mvd4a63GEdh6H.uz93gWN1OYgIQ(liveness3dFaceRepository.idDocSetType));
        }
    }

    public Liveness3dFaceRepository(@k OkHttpClient okHttpClient, @k String str, @k CBRSession cBRSession, @k AbstractC43443a abstractC43443a, @k c<String> cVar) {
        this.httpClient = okHttpClient;
        this.idDocSetType = str;
        this.session = cBRSession;
        this.json = abstractC43443a;
        this.tokenProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MyHc7quGyJKbnAIkFgd() {
        a aVar = a.f436064a;
        Logger.d$default(aVar, ru.cyberity.log.c.a(this), "Liveness3dFaceRepository.updateToken", null, 4, null);
        int i12 = this.reconnectAttempts + 1;
        this.reconnectAttempts = i12;
        if (i12 > 3) {
            Logger.d$default(aVar, ru.cyberity.log.c.a(this), "Liveness3dFaceRepository. Max reconnect attempts reached", null, 4, null);
            VEkdd97RzWe vEkdd97RzWe = this.callback;
            if (vEkdd97RzWe != null) {
                vEkdd97RzWe.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.d8gDEgxuRMWxWXii0(new Exception("Invalid access token")));
                return;
            }
            return;
        }
        C43315z0 c43315z0 = new C43315z0(Executors.newSingleThreadExecutor());
        try {
            C43259k.e(EmptyCoroutineContext.INSTANCE, new W6LpgmOhfkE9MxK(null));
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(c43315z0, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(c43315z0, th2);
                throw th3;
            }
        }
    }

    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public final void uz93gWN1OYgIQ() {
        Logger.d$default(a.f436064a, ru.cyberity.log.c.a(this), "Liveness3dFaceRepository.disconnect", null, 4, null);
        WebSocket webSocket = this.socket;
        if (webSocket != null) {
            webSocket.close(1000, "disconnect");
        }
        this.socket = null;
    }

    public final void AnZ4ntgRZiVOQFYAd(@k VEkdd97RzWe callback) {
        this.reconnectAttempts = 0;
        this.callback = callback;
        AnZ4ntgRZiVOQFYAd();
    }

    public final void AnZ4ntgRZiVOQFYAd(@k NriLyb2MNC2 message) {
        Logger.d$default(a.f436064a, ru.cyberity.log.c.a(this), "Liveness3dFaceRepository.send: " + message.getType() + " isClosed=" + this.isClosed, null, 4, null);
        if (this.isClosed) {
            return;
        }
        WebSocket webSocket = this.socket;
        if (webSocket != null) {
            AbstractC43443a abstractC43443a = this.json;
            webSocket.send(abstractC43443a.c(C.e(abstractC43443a.f412956b, m0.c(NriLyb2MNC2.class)), message));
        } else {
            VEkdd97RzWe vEkdd97RzWe = this.callback;
            if (vEkdd97RzWe != null) {
                vEkdd97RzWe.AnZ4ntgRZiVOQFYAd(LivenessRepositoryResult.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AnZ4ntgRZiVOQFYAd() {
        try {
            Logger.d$default(a.f436064a, ru.cyberity.log.c.a(this), "Liveness3dFaceRepository.newWebSocket", null, 4, null);
            WebSocket webSocket = this.socket;
            if (webSocket != null) {
                webSocket.close(1000, "reconnect");
            }
            this.socket = null;
            this.socket = this.httpClient.newWebSocket(new Request.Builder().url(this.session.getUrl() + "ws/liveness?token=" + this.session.getAccessToken()).build(), this.listener);
        } catch (Exception e12) {
            VEkdd97RzWe vEkdd97RzWe = this.callback;
            if (vEkdd97RzWe != null) {
                vEkdd97RzWe.AnZ4ntgRZiVOQFYAd(new LivenessRepositoryResult.d8gDEgxuRMWxWXii0(e12));
            }
        }
    }
}
