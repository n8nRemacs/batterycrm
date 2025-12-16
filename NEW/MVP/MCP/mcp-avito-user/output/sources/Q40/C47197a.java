package q40;

import Y61.k;
import com.avito.android.offlinization.beduin.e;
import com.avito.android.offlinization.beduin.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import org.json.JSONObject;
import v40.b;

/* compiled from: MemoryAwareBeduinPatternCacheProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq40/a;", "Lcom/avito/android/offlinization/beduin/e;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C47197a implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f429014b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f429015c;

    public C47197a(@k f fVar, @k b bVar) {
        this.f429014b = fVar;
        this.f429015c = bVar;
    }

    @Override // com.avito.android.offlinization.beduin.e
    @k
    public final List<String> a(@k String str) {
        if (this.f429015c.a()) {
            return this.f429014b.a(str);
        }
        e.f208543a.getClass();
        e.a.f208545b.getClass();
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.offlinization.beduin.e
    @k
    public final String b(@k JSONObject jSONObject, @k String str, boolean z12) {
        if (this.f429015c.a()) {
            return this.f429014b.b(jSONObject, str, z12);
        }
        e.f208543a.getClass();
        e.a.f208545b.getClass();
        return jSONObject.toString();
    }
}
