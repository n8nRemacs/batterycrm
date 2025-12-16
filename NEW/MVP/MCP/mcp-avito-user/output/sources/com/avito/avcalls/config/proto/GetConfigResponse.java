package com.avito.avcalls.config.proto;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import com.avito.avcalls.config.Config;
import com.avito.avcalls.signaling.a;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: GetConfig.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\nB%\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/avcalls/config/proto/GetConfigResponse;", "Lcom/avito/avcalls/signaling/a;", "", "seen1", "Lcom/avito/avcalls/config/Config;", Navigation.CONFIG, "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/config/Config;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class GetConfigResponse implements a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Config f332873a;

    /* compiled from: GetConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/config/proto/GetConfigResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/config/proto/GetConfigResponse;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<GetConfigResponse> serializer() {
            return GetConfigResponse$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ GetConfigResponse(int i12, Config config, P0 p02) {
        if (1 == (i12 & 1)) {
            this.f332873a = config;
        } else {
            E0.b(i12, 1, GetConfigResponse$$serializer.INSTANCE.getF412706c());
            throw null;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetConfigResponse) && L.f(this.f332873a, ((GetConfigResponse) obj).f332873a);
    }

    public final int hashCode() {
        return this.f332873a.hashCode();
    }

    @k
    public final String toString() {
        return "GetConfigResponse(config=" + this.f332873a + ')';
    }
}
