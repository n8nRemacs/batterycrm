package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: CpuInfoProvider.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012BA\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R)\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R/\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/i;", "", "", "Lkotlin/Q;", "", "commonInfo", "perProcessorInfo", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "e", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class i {

    /* renamed from: d, reason: collision with root package name */
    @k
    private static final i f436019d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<Q<String, String>> commonInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<List<Q<String, String>>> perProcessorInfo;

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f436019d = new i(c42784z0, c42784z0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@k List<Q<String, String>> list, @k List<? extends List<Q<String, String>>> list2) {
        this.commonInfo = list;
        this.perProcessorInfo = list2;
    }

    @k
    public final List<Q<String, String>> d() {
        return this.commonInfo;
    }

    @k
    public final List<List<Q<String, String>>> e() {
        return this.perProcessorInfo;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return L.f(this.commonInfo, iVar.commonInfo) && L.f(this.perProcessorInfo, iVar.perProcessorInfo);
    }

    public int hashCode() {
        return this.perProcessorInfo.hashCode() + (this.commonInfo.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CpuInfo(commonInfo=");
        sb2.append(this.commonInfo);
        sb2.append(", perProcessorInfo=");
        return H.p(sb2, this.perProcessorInfo, ')');
    }
}
