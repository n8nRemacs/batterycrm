package l91;

import Y61.k;
import com.google.gson.Gson;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: GsonDeserializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll91/a;", "Lcom/avito/android/jsonrpc/client/a;", "Lcom/google/gson/i;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C43605a implements com.avito.android.jsonrpc.client.a<i> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f413570a;

    public C43605a(@k Gson gson) {
        this.f413570a = gson;
    }

    @Override // com.avito.android.jsonrpc.client.a
    public final Object a(Object obj, Type type) {
        i iVar = (i) obj;
        Gson gson = this.f413570a;
        gson.getClass();
        if (iVar == null) {
            return null;
        }
        return gson.c(new com.google.gson.internal.bind.a(iVar), type);
    }
}
