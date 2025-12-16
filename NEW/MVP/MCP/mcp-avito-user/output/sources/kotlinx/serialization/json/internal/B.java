package kotlinx.serialization.json.internal;

import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC43443a;

/* compiled from: StreamingJsonDecoder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/B;", "Lkotlinx/serialization/encoding/a;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B extends kotlinx.serialization.encoding.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC43450a f412998a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.modules.f f412999b;

    public B(@Y61.k AbstractC43450a abstractC43450a, @Y61.k AbstractC43443a abstractC43443a) {
        this.f412998a = abstractC43450a;
        this.f412999b = abstractC43443a.f412956b;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.c
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final kotlinx.serialization.modules.f getF412999b() {
        return this.f412999b;
    }

    @Override // kotlinx.serialization.encoding.c
    public final int j(@Y61.k SerialDescriptor serialDescriptor) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final byte n() {
        AbstractC43450a abstractC43450a = this.f412998a;
        String strL = abstractC43450a.l();
        try {
            return kotlin.text.f0.a(strL);
        } catch (IllegalArgumentException unused) {
            AbstractC43450a.q(abstractC43450a, C22491k0.a('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final long r() {
        AbstractC43450a abstractC43450a = this.f412998a;
        String strL = abstractC43450a.l();
        try {
            return kotlin.text.f0.d(strL);
        } catch (IllegalArgumentException unused) {
            AbstractC43450a.q(abstractC43450a, C22491k0.a('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final short t() {
        AbstractC43450a abstractC43450a = this.f412998a;
        String strL = abstractC43450a.l();
        try {
            return kotlin.text.f0.f(strL);
        } catch (IllegalArgumentException unused) {
            AbstractC43450a.q(abstractC43450a, C22491k0.a('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final int z() {
        AbstractC43450a abstractC43450a = this.f412998a;
        String strL = abstractC43450a.l();
        try {
            return kotlin.text.f0.b(strL);
        } catch (IllegalArgumentException unused) {
            AbstractC43450a.q(abstractC43450a, C22491k0.a('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }
}
