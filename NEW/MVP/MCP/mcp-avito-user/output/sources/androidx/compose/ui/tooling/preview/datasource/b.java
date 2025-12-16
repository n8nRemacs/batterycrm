package androidx.compose.ui.tooling.preview.datasource;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LoremIpsum.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class b extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f42822l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f42823m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l0.f fVar, int i12) {
        super(0);
        this.f42822l = fVar;
        this.f42823m = i12;
    }

    @Override // Y41.a
    public final String invoke() {
        List<String> list = d.f42824a;
        l0.f fVar = this.f42822l;
        int i12 = fVar.f406840b;
        fVar.f406840b = i12 + 1;
        return list.get(i12 % this.f42823m);
    }
}
