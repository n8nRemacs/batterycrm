package Td0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiSelectStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTd0/d;", "LTd0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f15763a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f15764b = new LinkedHashMap();

    public d(@k ArrayList arrayList) {
        this.f15763a = arrayList;
    }

    @Override // Td0.c
    public final void a() {
        for (MultiselectParameter multiselectParameter : this.f15763a) {
            List<? extends String> value = multiselectParameter.getValue();
            if (value != null) {
                this.f15764b.put(multiselectParameter.getId(), value);
            }
        }
    }

    @Override // Td0.c
    public final void b() {
        for (MultiselectParameter multiselectParameter : this.f15763a) {
            multiselectParameter.setValue(this.f15764b.get(multiselectParameter.getId()));
        }
    }
}
