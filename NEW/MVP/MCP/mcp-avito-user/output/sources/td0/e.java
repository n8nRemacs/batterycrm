package Td0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LTd0/e;", "LTd0/c;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f15765a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f15766b = new LinkedHashMap();

    /* compiled from: SelectStorage.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTd0/e$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f15767a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f15768b;

        public a(@l String str, @l String str2) {
            this.f15767a = str;
            this.f15768b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f15767a, aVar.f15767a) && L.f(this.f15768b, aVar.f15768b);
        }

        public final int hashCode() {
            String str = this.f15767a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f15768b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitialSelectedValue(valueId=");
            sb2.append(this.f15767a);
            sb2.append(", displayTitle=");
            return C22026a.c(sb2, this.f15768b, ')');
        }
    }

    public e(@k ArrayList arrayList) {
        this.f15765a = arrayList;
    }

    @Override // Td0.c
    public final void a() {
        for (SelectParameter selectParameter : this.f15765a) {
            this.f15766b.put(selectParameter.getId(), new a(selectParameter.getValue(), selectParameter.getDisplayTitle()));
        }
    }

    @Override // Td0.c
    public final void b() {
        for (SelectParameter selectParameter : this.f15765a) {
            LinkedHashMap linkedHashMap = this.f15766b;
            a aVar = (a) linkedHashMap.get(selectParameter.getId());
            String str = null;
            selectParameter.setValue(aVar != null ? aVar.f15767a : null);
            a aVar2 = (a) linkedHashMap.get(selectParameter.getId());
            if (aVar2 != null) {
                str = aVar2.f15768b;
            }
            selectParameter.setDisplayTitle(str);
        }
    }
}
