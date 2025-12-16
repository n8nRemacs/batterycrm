package PT0;

import Y61.k;
import Y61.l;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeComponentInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LPT0/b;", "Landroid/view/View;", "V", "", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b<V extends View> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f13074a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public V f13075b;

    public b(@k c[] cVarArr) {
        int iF2 = P0.f(cVarArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
        for (c cVar : cVarArr) {
            linkedHashMap.put(cVar.b(), cVar);
        }
        this.f13074a = linkedHashMap;
    }
}
