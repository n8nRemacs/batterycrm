package kotlinx.serialization;

import androidx.camera.core.Q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SerializationExceptions.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f412702b;

    public MissingFieldException(@Y61.k String str, @Y61.k String str2) {
        this(Collections.singletonList(str), Q.a("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null);
    }

    public MissingFieldException(@Y61.k List list, @Y61.l String str, @Y61.l MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        this.f412702b = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(@Y61.k ArrayList arrayList, @Y61.k String str) {
        String strH;
        if (arrayList.size() == 1) {
            strH = androidx.camera.camera2.internal.G.h(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strH = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(arrayList, strH, null);
    }
}
