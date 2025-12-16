package com.avito.avcalls.network_test.api;

import Y61.k;
import Y61.l;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: PrepareNetworkTest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/network_test/api/PrepareNetworkTest;", "", "Companion", "a", "Request", "Response", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PrepareNetworkTest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = Companion.f332994a;

    /* compiled from: PrepareNetworkTest.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/avcalls/network_test/api/PrepareNetworkTest$Request;", "", "", "seen1", "", "testId", "scenario", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final class Request {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f332988a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f332989b;

        /* compiled from: PrepareNetworkTest.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/network_test/api/PrepareNetworkTest$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/network_test/api/PrepareNetworkTest$Request;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<Request> serializer() {
                return PrepareNetworkTest$Request$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ Request(int i12, String str, String str2, P0 p02) {
            if (3 != (i12 & 3)) {
                E0.b(i12, 3, PrepareNetworkTest$Request$$serializer.INSTANCE.getF332717a());
                throw null;
            }
            this.f332988a = str;
            this.f332989b = str2;
        }

        public Request(@k String str) {
            this.f332988a = str;
            this.f332989b = "app_foreground";
        }
    }

    /* compiled from: PrepareNetworkTest.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rB=\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/avito/avcalls/network_test/api/PrepareNetworkTest$Response;", "", "", "seen1", "", "targetAddr", "numPackets", "delayMs", "packetSize", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;IIILkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final class Response {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f332990a;

        /* renamed from: b, reason: collision with root package name */
        public final int f332991b;

        /* renamed from: c, reason: collision with root package name */
        public final int f332992c;

        /* renamed from: d, reason: collision with root package name */
        public final int f332993d;

        /* compiled from: PrepareNetworkTest.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/network_test/api/PrepareNetworkTest$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/network_test/api/PrepareNetworkTest$Response;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<Response> serializer() {
                return PrepareNetworkTest$Response$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ Response(int i12, String str, int i13, int i14, int i15, P0 p02) {
            if (15 != (i12 & 15)) {
                E0.b(i12, 15, PrepareNetworkTest$Response$$serializer.INSTANCE.getF332717a());
                throw null;
            }
            this.f332990a = str;
            this.f332991b = i13;
            this.f332992c = i14;
            this.f332993d = i15;
        }
    }

    /* compiled from: PrepareNetworkTest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/network_test/api/PrepareNetworkTest$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.network_test.api.PrepareNetworkTest$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f332994a = new Companion();
    }
}
