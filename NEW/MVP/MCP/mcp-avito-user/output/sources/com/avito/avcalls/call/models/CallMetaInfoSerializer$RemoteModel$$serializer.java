package com.avito.avcalls.call.models;

import L51.a;
import Y61.k;
import com.avito.avcalls.call.models.CallMetaInfoSerializer;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;

/* compiled from: CallMetaInfo.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/call/models/CallMetaInfoSerializer.RemoteModel.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/call/models/CallMetaInfoSerializer$RemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/call/models/CallMetaInfoSerializer$RemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/call/models/CallMetaInfoSerializer$RemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class CallMetaInfoSerializer$RemoteModel$$serializer implements N<CallMetaInfoSerializer.RemoteModel> {

    @k
    public static final CallMetaInfoSerializer$RemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CallMetaInfoSerializer$RemoteModel$$serializer callMetaInfoSerializer$RemoteModel$$serializer = new CallMetaInfoSerializer$RemoteModel$$serializer();
        INSTANCE = callMetaInfoSerializer$RemoteModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CallMetaInfo", callMetaInfoSerializer$RemoteModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("scenario", false);
        pluginGeneratedSerialDescriptor.j("itemId", true);
        pluginGeneratedSerialDescriptor.j("itemTitle", true);
        pluginGeneratedSerialDescriptor.j("itemPrice", true);
        pluginGeneratedSerialDescriptor.j("itemImageUrls", true);
        pluginGeneratedSerialDescriptor.j("peerName", true);
        pluginGeneratedSerialDescriptor.j("peerAvatarUrls", true);
        pluginGeneratedSerialDescriptor.j("gsmLink", true);
        pluginGeneratedSerialDescriptor.j("msgLink", true);
        pluginGeneratedSerialDescriptor.j("startCallDelayMs", true);
        pluginGeneratedSerialDescriptor.j("itemLink", true);
        pluginGeneratedSerialDescriptor.j("extraInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CallMetaInfoSerializer$RemoteModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        KSerializer<Object>[] kSerializerArr = CallMetaInfoSerializer.RemoteModel.f332718m;
        V0 v02 = V0.f412822a;
        C43412k0 c43412k0 = C43412k0.f412877a;
        return new KSerializer[]{v02, a.a(c43412k0), a.a(v02), a.a(c43412k0), a.a(kSerializerArr[4]), a.a(v02), a.a(kSerializerArr[6]), a.a(v02), a.a(v02), a.a(c43412k0), a.a(v02), a.a(kSerializerArr[11])};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public CallMetaInfoSerializer.RemoteModel deserialize(@k Decoder decoder) {
        Long l12;
        KSerializer<Object>[] kSerializerArr;
        Long l13;
        SerialDescriptor f332717a = getF332717a();
        c cVarC = decoder.c(f332717a);
        KSerializer<Object>[] kSerializerArr2 = CallMetaInfoSerializer.RemoteModel.f332718m;
        String str = null;
        Map map = null;
        String str2 = null;
        Long l14 = null;
        String str3 = null;
        Long l15 = null;
        String str4 = null;
        Long l16 = null;
        Map map2 = null;
        String str5 = null;
        Map map3 = null;
        String str6 = null;
        int i12 = 0;
        boolean z12 = true;
        while (true) {
            String strS = str3;
            if (!z12) {
                cVarC.d(f332717a);
                return new CallMetaInfoSerializer.RemoteModel(i12, str3, l15, str4, l16, map2, str5, map3, str6, str, l14, str2, map, (P0) null);
            }
            int iJ2 = cVarC.j(f332717a);
            switch (iJ2) {
                case -1:
                    kSerializerArr = kSerializerArr2;
                    l15 = l15;
                    z12 = false;
                    kSerializerArr2 = kSerializerArr;
                    str3 = strS;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    l13 = l15;
                    strS = cVarC.s(f332717a, 0);
                    i12 |= 1;
                    l15 = l13;
                    kSerializerArr2 = kSerializerArr;
                    str3 = strS;
                case 1:
                    kSerializerArr = kSerializerArr2;
                    l13 = (Long) cVarC.f(f332717a, 1, C43412k0.f412877a, l15);
                    i12 |= 2;
                    l15 = l13;
                    kSerializerArr2 = kSerializerArr;
                    str3 = strS;
                case 2:
                    l12 = l15;
                    str4 = (String) cVarC.f(f332717a, 2, V0.f412822a, str4);
                    i12 |= 4;
                    str3 = strS;
                    l15 = l12;
                case 3:
                    l12 = l15;
                    l16 = (Long) cVarC.f(f332717a, 3, C43412k0.f412877a, l16);
                    i12 |= 8;
                    str3 = strS;
                    l15 = l12;
                case 4:
                    l12 = l15;
                    map2 = (Map) cVarC.f(f332717a, 4, kSerializerArr2[4], map2);
                    i12 |= 16;
                    str3 = strS;
                    l15 = l12;
                case 5:
                    l12 = l15;
                    str5 = (String) cVarC.f(f332717a, 5, V0.f412822a, str5);
                    i12 |= 32;
                    str3 = strS;
                    l15 = l12;
                case 6:
                    l12 = l15;
                    map3 = (Map) cVarC.f(f332717a, 6, kSerializerArr2[6], map3);
                    i12 |= 64;
                    str3 = strS;
                    l15 = l12;
                case 7:
                    l12 = l15;
                    str6 = (String) cVarC.f(f332717a, 7, V0.f412822a, str6);
                    i12 |= 128;
                    str3 = strS;
                    l15 = l12;
                case 8:
                    l12 = l15;
                    str = (String) cVarC.f(f332717a, 8, V0.f412822a, str);
                    i12 |= 256;
                    str3 = strS;
                    l15 = l12;
                case 9:
                    l12 = l15;
                    l14 = (Long) cVarC.f(f332717a, 9, C43412k0.f412877a, l14);
                    i12 |= 512;
                    str3 = strS;
                    l15 = l12;
                case 10:
                    l12 = l15;
                    str2 = (String) cVarC.f(f332717a, 10, V0.f412822a, str2);
                    i12 |= 1024;
                    str3 = strS;
                    l15 = l12;
                case 11:
                    l12 = l15;
                    map = (Map) cVarC.f(f332717a, 11, kSerializerArr2[11], map);
                    i12 |= 2048;
                    str3 = strS;
                    l15 = l12;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k CallMetaInfoSerializer.RemoteModel value) {
        SerialDescriptor f332717a = getF332717a();
        d dVarC = encoder.c(f332717a);
        dVarC.l(f332717a, 0, value.f332719a);
        boolean zU2 = dVarC.u();
        Long l12 = value.f332720b;
        if (zU2 || l12 != null) {
            dVarC.p(f332717a, 1, C43412k0.f412877a, l12);
        }
        boolean zU3 = dVarC.u();
        String str = value.f332721c;
        if (zU3 || str != null) {
            dVarC.p(f332717a, 2, V0.f412822a, str);
        }
        boolean zU4 = dVarC.u();
        Long l13 = value.f332722d;
        if (zU4 || l13 != null) {
            dVarC.p(f332717a, 3, C43412k0.f412877a, l13);
        }
        boolean zU5 = dVarC.u();
        KSerializer<Object>[] kSerializerArr = CallMetaInfoSerializer.RemoteModel.f332718m;
        Map<String, String> map = value.f332723e;
        if (zU5 || map != null) {
            dVarC.p(f332717a, 4, kSerializerArr[4], map);
        }
        boolean zU6 = dVarC.u();
        String str2 = value.f332724f;
        if (zU6 || str2 != null) {
            dVarC.p(f332717a, 5, V0.f412822a, str2);
        }
        boolean zU7 = dVarC.u();
        Map<String, String> map2 = value.f332725g;
        if (zU7 || map2 != null) {
            dVarC.p(f332717a, 6, kSerializerArr[6], map2);
        }
        boolean zU8 = dVarC.u();
        String str3 = value.f332726h;
        if (zU8 || str3 != null) {
            dVarC.p(f332717a, 7, V0.f412822a, str3);
        }
        boolean zU9 = dVarC.u();
        String str4 = value.f332727i;
        if (zU9 || str4 != null) {
            dVarC.p(f332717a, 8, V0.f412822a, str4);
        }
        boolean zU10 = dVarC.u();
        Long l14 = value.f332728j;
        if (zU10 || l14 != null) {
            dVarC.p(f332717a, 9, C43412k0.f412877a, l14);
        }
        boolean zU11 = dVarC.u();
        String str5 = value.f332729k;
        if (zU11 || str5 != null) {
            dVarC.p(f332717a, 10, V0.f412822a, str5);
        }
        boolean zU12 = dVarC.u();
        Map<String, String> map3 = value.f332730l;
        if (zU12 || map3 != null) {
            dVarC.p(f332717a, 11, kSerializerArr[11], map3);
        }
        dVarC.d(f332717a);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
