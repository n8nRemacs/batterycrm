package ru.cyberity.cbr.core.data.model;

import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.C43385d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;

/* compiled from: CBRTrackEvents.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRTrackEvents.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRTrackEvents;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@InterfaceC42830m
/* loaded from: classes9.dex */
public final class CBRTrackEvents$$serializer implements N<CBRTrackEvents> {

    @Y61.k
    public static final CBRTrackEvents$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CBRTrackEvents$$serializer cBRTrackEvents$$serializer = new CBRTrackEvents$$serializer();
        INSTANCE = cBRTrackEvents$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRTrackEvents", cBRTrackEvents$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("activity", false);
        pluginGeneratedSerialDescriptor.j("ts", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CBRTrackEvents$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] childSerializers() {
        V0 v02 = V0.f412822a;
        return new KSerializer[]{v02, L51.a.a(v02), L51.a.a(new C43400e0(v02, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])))};
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public CBRTrackEvents deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
        Object objF = null;
        boolean z12 = true;
        int i12 = 0;
        Object objF2 = null;
        String strS = null;
        while (z12) {
            int iJ2 = cVarC.j(f332717a);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                strS = cVarC.s(f332717a, 0);
                i12 |= 1;
            } else if (iJ2 == 1) {
                objF = cVarC.f(f332717a, 1, V0.f412822a, objF);
                i12 |= 2;
            } else {
                if (iJ2 != 2) {
                    throw new UnknownFieldException(iJ2);
                }
                objF2 = cVarC.f(f332717a, 2, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), objF2);
                i12 |= 4;
            }
        }
        cVarC.d(f332717a);
        return new CBRTrackEvents(i12, strS, (String) objF, (Map) objF2, (P0) null);
    }

    @Override // kotlinx.serialization.x
    public void serialize(@Y61.k Encoder encoder, @Y61.k CBRTrackEvents value) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
        CBRTrackEvents.write$Self(value, dVarC, f332717a);
        dVarC.d(f332717a);
    }
}
