package androidx.window.embedding;

import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmbeddingCompat.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "values", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.window.embedding.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23531q extends kotlin.jvm.internal.N implements Y41.l<List<?>, G0> {
    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(List<?> list) {
        invoke2(list);
        throw null;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Y61.k List<?> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SplitInfo) {
                arrayList.add(obj);
            }
        }
        C23530p.a();
        throw null;
    }
}
