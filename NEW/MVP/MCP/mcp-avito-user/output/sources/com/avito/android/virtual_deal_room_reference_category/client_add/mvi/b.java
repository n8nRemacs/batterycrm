package com.avito.android.virtual_deal_room_reference_category.client_add.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.R0;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rO0.C47580d;
import rO0.InterfaceC47577a;
import rO0.InterfaceC47578b;
import tO0.InterfaceC48588a;

/* compiled from: ClientAddActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LrO0/a;", "LrO0/b;", "LrO0/d;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC47577a, InterfaceC47578b, C47580d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48588a f327193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f327194b;

    @Inject
    public b(@Y61.k InterfaceC48588a interfaceC48588a, @Y61.k R0 r02) {
        this.f327193a = interfaceC48588a;
        this.f327194b = r02;
    }

    public static final PrintableText c(b bVar, String str) {
        bVar.getClass();
        if (str.length() > 50) {
            return com.avito.android.printable_text.b.c(R.string.virtual_deal_room_reference_category_too_long_field_error, new Serializable[0]);
        }
        if (C43066x.K(str)) {
            return com.avito.android.printable_text.b.c(R.string.virtual_deal_room_reference_category_empty_field_error, new Serializable[0]);
        }
        return null;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC47578b> b(InterfaceC47577a interfaceC47577a, C47580d c47580d) {
        C43210w c43210w;
        InterfaceC47577a interfaceC47577a2 = interfaceC47577a;
        C47580d c47580d2 = c47580d;
        if (interfaceC47577a2 instanceof InterfaceC47577a.C12372a) {
            return new C43210w(InterfaceC47578b.a.f429782a);
        }
        if (interfaceC47577a2 instanceof InterfaceC47577a.b) {
            c43210w = new C43210w(new InterfaceC47578b.c(((InterfaceC47577a.b) interfaceC47577a2).f429777a));
        } else if (interfaceC47577a2 instanceof InterfaceC47577a.c) {
            c43210w = new C43210w(new InterfaceC47578b.e(((InterfaceC47577a.c) interfaceC47577a2).f429778a));
        } else if (interfaceC47577a2 instanceof InterfaceC47577a.d) {
            c43210w = new C43210w(new InterfaceC47578b.g(((InterfaceC47577a.d) interfaceC47577a2).f429779a));
        } else {
            if (!(interfaceC47577a2 instanceof InterfaceC47577a.f)) {
                if (!(interfaceC47577a2 instanceof InterfaceC47577a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                return C43175k.I(this.f327194b.a(), C43175k.G(new a(this, c47580d2, null)));
            }
            c43210w = new C43210w(new InterfaceC47578b.l(((InterfaceC47577a.f) interfaceC47577a2).f429781a));
        }
        return c43210w;
    }
}
