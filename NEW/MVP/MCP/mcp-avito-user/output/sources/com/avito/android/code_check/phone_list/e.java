package com.avito.android.code_check.phone_list;

import Qo.InterfaceC14914a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.PhoneList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneListFragment f118974l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PhoneListFragment phoneListFragment) {
        super(1);
        this.f118974l = phoneListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // Y41.l
    public final G0 invoke(String str) {
        ?? arrayList;
        Y41.l<String, G0> lVarA;
        String str2 = str;
        PhoneListFragment phoneListFragment = this.f118974l;
        s sVar = (s) phoneListFragment.f118866E0.getValue();
        com.avito.android.code_check.d dVar = phoneListFragment.f118871w0;
        if (dVar == null) {
            dVar = null;
        }
        List<String> listA = dVar.R5().a();
        if (listA != null) {
            List<String> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Phone.a(To.c.a((String) it.next())));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        sVar.accept(new InterfaceC14914a.C0928a(str2, arrayList));
        PhoneList phoneList = phoneListFragment.f118870v0;
        if (phoneList == null) {
            phoneList = null;
        }
        PhoneList.c cVar = phoneList.f119304d.f119317c;
        PhoneList.c.b bVar = cVar instanceof PhoneList.c.b ? (PhoneList.c.b) cVar : null;
        if (bVar != null && (lVarA = bVar.a()) != null) {
            lVarA.invoke(str2);
        }
        return G0.f406611a;
    }
}
