package com.avito.android.code_check.phone_list.mvi;

import Qo.C14915b;
import Qo.InterfaceC14914a;
import Y61.k;
import com.avito.android.arch.mvi.a;
import com.avito.android.code_check.phone_list.adapter.empty_search.EmptySearchItem;
import com.avito.android.code_check.phone_list.adapter.new_phone.NewPhoneItem;
import com.avito.android.code_check.phone_list.adapter.phone.PhoneItem;
import com.avito.android.code_check.phone_list.mvi.entity.PhoneListInternalAction;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check/phone_list/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LQo/a;", "Lcom/avito/android/code_check/phone_list/mvi/entity/PhoneListInternalAction;", "LQo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14914a, PhoneListInternalAction, C14915b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.code_check.d f118988a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f118989b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PhoneList f118990c;

    @Inject
    public a(@k com.avito.android.code_check.d dVar, @k h hVar, @k PhoneList phoneList) {
        this.f118988a = dVar;
        this.f118989b = hVar;
        this.f118990c = phoneList;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.code_check.phone_list.mvi.h] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v25, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PhoneListInternalAction> b(InterfaceC14914a interfaceC14914a, C14915b c14915b) {
        ?? arrayList;
        PhoneList phoneList;
        PhoneList.a aVar;
        InterfaceC14914a interfaceC14914a2 = interfaceC14914a;
        if (!(interfaceC14914a2 instanceof InterfaceC14914a.C0928a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC14914a.C0928a c0928a = (InterfaceC14914a.C0928a) interfaceC14914a2;
        List<String> listA = this.f118988a.R5().a();
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
        ArrayList arrayListA = this.f118989b.a(c0928a.f14008a, arrayList);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it2 = arrayListA.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            phoneList = this.f118990c;
            if (!zHasNext) {
                break;
            }
            PhoneItem phoneItem = (PhoneItem) it2.next();
            arrayList2.add(new PhoneItem(phoneItem.f118942b, phoneItem.f118943c, phoneItem.f118944d, phoneItem.f118945e, phoneList.f119304d.f119320f, null));
        }
        if (arrayList2.isEmpty()) {
            PrintableText printableText = phoneList.f119304d.f119316b;
            arrayList2 = printableText == null ? C42784z0.f406748b : Collections.singletonList(new EmptySearchItem(printableText));
        }
        ArrayList arrayListH0 = arrayList2;
        if (!(C42745f0.G(arrayListH0) instanceof EmptySearchItem) && (aVar = phoneList.f119304d.f119321g) != null) {
            NewPhoneItem newPhoneItem = new NewPhoneItem(aVar.f119312a, aVar.f119314c);
            arrayListH0 = phoneList.f119304d.f119323i ? C42745f0.h0(arrayListH0, Collections.singletonList(newPhoneItem)) : C42745f0.i0(newPhoneItem, arrayListH0);
        }
        return new C43210w(new PhoneListInternalAction.ShowFilteredPhones(arrayListH0));
    }
}
