package com.avito.android.mortgage.applications_list.mvi;

import SZ.a;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.acceptance_dialog.model.ButtonStyle;
import com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ApplicationsListActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LSZ/a;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "LSZ/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.a<SZ.a, ApplicationsListInternalAction, SZ.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.applications_list.c f198438a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final QZ.b f198439b;

    @Inject
    public c(@Y61.k com.avito.android.mortgage.applications_list.c cVar, @Y61.k QZ.b bVar) {
        this.f198438a = cVar;
        this.f198439b = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ApplicationsListInternalAction> b(SZ.a aVar, SZ.c cVar) {
        InterfaceC43160i<ApplicationsListInternalAction> c43210w;
        SZ.a aVar2 = aVar;
        if (aVar2 instanceof a.c) {
            PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.mortgage_remove_application_title, new Serializable[0]);
            PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.mortgage_remove_application_description, new Serializable[0]);
            PrintableText printableTextC3 = com.avito.android.printable_text.b.c(R.string.mortgage_remove_application_accept_button_text, new Serializable[0]);
            Parcelable.Creator<ButtonStyle> creator = ButtonStyle.CREATOR;
            c43210w = new C43210w(new ApplicationsListInternalAction.ShowMoreDialog(((a.c) aVar2).f15049a, printableTextC, printableTextC2, printableTextC3, com.avito.android.printable_text.b.c(R.string.mortgage_remove_application_cancel_button_text, new Serializable[0])));
        } else if (aVar2 instanceof a.d) {
            c43210w = new C43210w(ApplicationsListInternalAction.CloseScreen.f198443b);
        } else if (aVar2 instanceof a.e) {
            c43210w = this.f198438a.b();
        } else if (aVar2 instanceof a.b) {
            c43210w = C43175k.G(new a(aVar2, this, null));
        } else {
            if (!(aVar2 instanceof a.C1025a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new ApplicationsListInternalAction.OpenDeeplink(((a.C1025a) aVar2).f15047a));
        }
        return new C43197r1(new b(this, null), c43210w);
    }
}
