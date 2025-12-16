package androidx.datastore.core;

import java.io.FileInputStream;
import java.io.OutputStream;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Serializer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/m;", "T", "", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface m<T> {
    @Y61.l
    G0 a(Object obj, @Y61.k OutputStream outputStream);

    @Y61.l
    androidx.datastore.preferences.core.a b(@Y61.k FileInputStream fileInputStream);

    androidx.datastore.preferences.core.a getDefaultValue();
}
