package kotlinx.serialization.internal;

import androidx.compose.ui.platform.C22491k0;
import androidx.media3.common.C23088b;
import kotlin.Metadata;
import kotlinx.serialization.SerializationException;

/* compiled from: AbstractPolymorphicSerializer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43395c {
    @X41.i
    @Y61.k
    public static final void a(@Y61.l String str, @Y61.k kotlin.reflect.d dVar) {
        String string;
        String str2 = "in the polymorphic scope of '" + dVar.l0() + '\'';
        if (str == null) {
            string = C22491k0.a('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbB = C23088b.b("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            androidx.media3.exoplayer.analytics.m.p(sbB, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbB.append(dVar.l0());
            sbB.append("' has to be sealed and '@Serializable'.");
            string = sbB.toString();
        }
        throw new SerializationException(string);
    }
}
