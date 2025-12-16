package kB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.configure.advance.items.cards.a;
import com.avito.android.tariff.cpx.configure.advance.items.chips.a;
import eC0.f;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import uZ.C49004a;

/* compiled from: CpxConfigureAdvanceMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB0/b;", "LkB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42565b implements InterfaceC42564a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f406194a;

    @Inject
    public C42565b(boolean z12) {
        this.f406194a = z12;
    }

    @Override // kB0.InterfaceC42564a
    @k
    public final ArrayList a(@k f fVar) {
        com.avito.conveyor_item.a bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.tariff.cpx.configure.advance.items.header.a(fVar.getTitle(), fVar.getDescription()));
        if (this.f406194a) {
            ArrayList arrayList2 = new ArrayList();
            for (eC0.d dVar : fVar.a()) {
                arrayList2.add(new a.b(dVar.getIsSelected(), dVar.getDescription(), dVar.getAdvance(), dVar.getExtraInfo()));
            }
            arrayList2.add(new a.C8994a(fVar.getManualAdvance().getDescription(), fVar.getManualAdvance().getDeeplink()));
            bVar = new com.avito.android.tariff.cpx.configure.advance.items.cards.b("key_cards_item", arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (eC0.d dVar2 : fVar.a()) {
                arrayList3.add(new a.b(dVar2.getDescription().getText(), dVar2.getIsSelected(), dVar2.getAdvance(), dVar2.getExtraInfo()));
            }
            arrayList3.add(new a.C8995a(fVar.getManualAdvance().getDescription().getText(), fVar.getManualAdvance().getDeeplink()));
            bVar = new com.avito.android.tariff.cpx.configure.advance.items.chips.b("key_chips_item", arrayList3);
        }
        arrayList.add(bVar);
        return arrayList;
    }

    @Override // kB0.InterfaceC42564a
    @l
    public final mB0.b b(@l uZ.d dVar) {
        if (dVar == null) {
            return null;
        }
        C49004a button = dVar.getButton();
        return new mB0.b(dVar.getProgress(), button != null ? new mB0.c(button.getTitle(), button.getDeeplink()) : null);
    }
}
