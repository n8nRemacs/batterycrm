package com.avito.avcalls.signaling.proto;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;

/* compiled from: IncomingPush.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/signaling/proto/IncomingPush.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/signaling/proto/IncomingPush;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/signaling/proto/IncomingPush;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/signaling/proto/IncomingPush;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class IncomingPush$$serializer implements N<IncomingPush> {

    @k
    public static final IncomingPush$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        IncomingPush$$serializer incomingPush$$serializer = new IncomingPush$$serializer();
        INSTANCE = incomingPush$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.signaling.proto.IncomingPush", incomingPush$$serializer, 4);
        pluginGeneratedSerialDescriptor.j(FailedBinderCallBack.CALLER_ID, false);
        pluginGeneratedSerialDescriptor.j(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, false);
        pluginGeneratedSerialDescriptor.j("isVideo", false);
        pluginGeneratedSerialDescriptor.j(Constants.REFERRER_API_META, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IncomingPush$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = IncomingPush.f333331e[3];
        V0 v02 = V0.f412822a;
        return new KSerializer[]{v02, v02, C43407i.f412866a, kSerializer};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public IncomingPush deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        c cVarC = decoder.c(f412706c);
        KSerializer<Object>[] kSerializerArr = IncomingPush.f333331e;
        int i12 = 0;
        boolean zD2 = false;
        String strS = null;
        String strS2 = null;
        CallMetaInfo callMetaInfo = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                strS = cVarC.s(f412706c, 0);
                i12 |= 1;
            } else if (iJ2 == 1) {
                strS2 = cVarC.s(f412706c, 1);
                i12 |= 2;
            } else if (iJ2 == 2) {
                zD2 = cVarC.D(f412706c, 2);
                i12 |= 4;
            } else {
                if (iJ2 != 3) {
                    throw new UnknownFieldException(iJ2);
                }
                callMetaInfo = (CallMetaInfo) cVarC.v(f412706c, 3, kSerializerArr[3], callMetaInfo);
                i12 |= 8;
            }
        }
        cVarC.d(f412706c);
        return new IncomingPush(i12, strS, strS2, zD2, callMetaInfo, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k IncomingPush value) {
        SerialDescriptor f412706c = getF412706c();
        d dVarC = encoder.c(f412706c);
        dVarC.l(f412706c, 0, value.f333332a);
        dVarC.l(f412706c, 1, value.f333333b);
        dVarC.k(f412706c, 2, value.f333334c);
        dVarC.F(f412706c, 3, IncomingPush.f333331e[3], value.f333335d);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
