package Ve0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.slots.auto_group_block.contact.item.c;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupContactConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVe0/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ve0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15670a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f17336a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f17337b;

    @Inject
    public C15670a(@k g gVar, @N3.c @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f17336a = gVar;
        this.f17337b = interfaceC35945t1;
    }

    public static void a(String str, String str2, ArrayList arrayList) {
        arrayList.add(new c.a(new c.a.b(str, arrayList.isEmpty() ? R.attr.textH40 : R.attr.textH50), new c.a.C7287a(str2, 0, 2, null)));
    }
}
