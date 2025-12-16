package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.sequences.C43018a;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.DecodeSequenceMode;
import okhttp3.internal.http2.Http2;

/* compiled from: JsonStreams.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Q {
    @InterfaceC43387f
    @Y61.k
    @E
    public static final C43018a a(@Y61.k AbstractC43443a abstractC43443a, @Y61.k A a12, @Y61.k KSerializer kSerializer, @Y61.k DecodeSequenceMode decodeSequenceMode) {
        DecodeSequenceMode decodeSequenceMode2;
        Iterator h12;
        f0 f0Var = new f0(a12, new char[Http2.INITIAL_MAX_FRAME_SIZE]);
        int iOrdinal = decodeSequenceMode.ordinal();
        if (iOrdinal == 0) {
            decodeSequenceMode2 = DecodeSequenceMode.f412943b;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (f0Var.v() == 8) {
                f0Var.g((byte) 8);
                decodeSequenceMode2 = DecodeSequenceMode.f412944c;
            } else {
                decodeSequenceMode2 = DecodeSequenceMode.f412943b;
            }
        } else {
            if (f0Var.v() != 8) {
                f0Var.r((byte) 8, true);
                throw null;
            }
            f0Var.g((byte) 8);
            decodeSequenceMode2 = DecodeSequenceMode.f412944c;
        }
        int iOrdinal2 = decodeSequenceMode2.ordinal();
        if (iOrdinal2 == 0) {
            h12 = new H(abstractC43443a, f0Var, kSerializer);
        } else {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
            }
            h12 = new F(abstractC43443a, f0Var, kSerializer);
        }
        return new C43018a(new P(h12));
    }
}
