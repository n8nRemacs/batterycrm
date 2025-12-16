package com.avito.android.lib.deprecated_design.radio_button;

import Au.C13079a;
import Y41.l;
import Y41.p;
import android.widget.CompoundButton;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.sx_address.new_address.view.G;
import com.avito.android.util.D6;
import com.avito.android.verification.inn.list.checkbox.i;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBoolFieldView;
import ru.cyberity.cbr.presentation.consent.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f178075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f178076d;

    public /* synthetic */ c(int i12, Object obj, Object obj2) {
        this.f178074b = i12;
        this.f178075c = obj;
        this.f178076d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
        Object obj = this.f178076d;
        Object obj2 = this.f178075c;
        switch (this.f178074b) {
            case 0:
                ((N) obj2).invoke((d) obj, Boolean.valueOf(z12));
                break;
            case 1:
                int i12 = ListItemCheckbox.f179513B;
                ((C13079a) obj2).a((ListItemCheckbox) obj, z12);
                break;
            case 2:
                int i13 = ListItemCheckmark.f179533x;
                ((C13079a) obj2).a((ListItemCheckmark) obj, z12);
                break;
            case 3:
                int i14 = ListItemRadio.f179549A;
                ((C13079a) obj2).a((ListItemRadio) obj, z12);
                break;
            case 4:
                int i15 = ListItemSwitcher.f179564z;
                ((C13079a) obj2).a((ListItemSwitcher) obj, z12);
                break;
            case 5:
                int i16 = com.avito.android.lib.design.list_item.b.f179576C;
                com.avito.android.lib.design.list_item.b bVar = (com.avito.android.lib.design.list_item.b) obj2;
                RadioButton radio = bVar.getRadio();
                if (radio != null) {
                    radio.setChecked(!z12);
                }
                ((C13079a) obj).a(bVar, z12);
                break;
            case 6:
                ((p) obj2).invoke(Boolean.valueOf(z12), ((G) obj).f293870b);
                break;
            case 7:
                D6.w(((i) obj2).f323954c);
                ((l) obj).invoke(Boolean.valueOf(z12));
                break;
            case 8:
                CBRApplicantDataBoolFieldView.m302_set_onCheckedChanged_$lambda0((CBRApplicantDataBoolFieldView) obj2, (l) obj, compoundButton, z12);
                break;
            default:
                ru.cyberity.cbr.presentation.consent.a.a((ru.cyberity.cbr.presentation.consent.a) obj2, (b.C12502b) obj, compoundButton, z12);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(p pVar, d dVar) {
        this.f178074b = 0;
        this.f178075c = (N) pVar;
        this.f178076d = dVar;
    }
}
