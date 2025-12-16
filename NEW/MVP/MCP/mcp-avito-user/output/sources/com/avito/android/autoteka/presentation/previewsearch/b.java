package com.avito.android.autoteka.presentation.previewsearch;

import DA.a;
import android.view.KeyEvent;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditFragment;
import com.avito.android.lib.design.input.Input;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.short_term_rent.soft_booking.view.j;
import com.avito.android.util.K2;
import io.reactivex.rxjava3.core.B;
import kotlin.collections.C42756l;
import kotlin.text.C43066x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class b implements TextView.OnEditorActionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97555c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f97556d;

    public /* synthetic */ b(int i12, Object obj, Object obj2) {
        this.f97554b = i12;
        this.f97556d = obj;
        this.f97555c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
        Object obj = this.f97556d;
        Object obj2 = this.f97555c;
        switch (this.f97554b) {
            case 0:
                com.avito.android.autoteka.items.payment.h hVar = AutotekaPreviewSearchActivity.f97529x;
                if (i12 == 3) {
                    ((AutotekaPreviewSearchActivity) obj).a2().accept(new AutotekaPreviewSearchAction.SearchPreview(C43066x.A0(((Input) obj2).getDeformattedText()).toString()));
                    break;
                }
                break;
            case 1:
                PersonalLinkEditFragment.a aVar = PersonalLinkEditFragment.f151444y0;
                if (i12 == 6) {
                    ((PersonalLinkEditFragment) obj).r5().accept(a.b.f3075a);
                    K2.d((Input) obj2, true);
                    break;
                }
                break;
            case 2:
                if (C42756l.G(i12, (int[]) obj) >= 0) {
                    ((B) obj2).onNext(Integer.valueOf(i12));
                    break;
                }
                break;
            default:
                StrSoftBookingContactFieldType strSoftBookingContactFieldType = StrSoftBookingContactFieldType.f282654b;
                j jVar = ((com.avito.android.short_term_rent.soft_booking.view.g) obj2).f282897a;
                if (((StrSoftBookingContactFieldType) obj) == strSoftBookingContactFieldType && i12 == 5) {
                    jVar.V().requestFocus();
                } else if (((Input) textView.getParent()).getId() == R.id.contacts_phone && i12 == 5) {
                    jVar.X().requestFocus();
                } else if (((Input) textView.getParent()).getId() == R.id.contacts_email && i12 == 6) {
                    K2.d(jVar.s(), true);
                }
                break;
        }
        return true;
    }
}
