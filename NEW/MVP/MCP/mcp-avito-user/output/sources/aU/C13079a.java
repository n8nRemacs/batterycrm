package Au;

import BI0.a;
import Ky0.b;
import Ui.InterfaceC15523b;
import Y41.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.avito.android.beduin.common.component.switcher.BeduinSwitcherModel;
import com.avito.android.beduin.common.form.transforms.IsSwitchOnTransform;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.blueprint.date.interval.k;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.notifications_settings.toggle.h;
import com.avito.android.personal_filters.filters_change_dialog.PersonalFiltersChangeDialogFragment;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import com.avito.android.profile_settings_extended.adapter.carousel.m;
import com.avito.android.publish.items.iac_for_pro.j;
import com.avito.android.str_calendar.seller.last_minute_offer.ui.LastMinuteOfferFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.C35565c;
import com.avito.android.util.K2;
import com.avito.android.util.p6;
import com.avito.android.util.q6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import lj.d;
import wb0.InterfaceC49590a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Au.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C13079a implements ListItemCompoundButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f667b;

    public /* synthetic */ C13079a(Object obj, int i12) {
        this.f666a = i12;
        this.f667b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
    public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
        C35565c c35565c;
        Object obj = this.f667b;
        switch (this.f666a) {
            case 0:
                DialogC13081c dialogC13081c = (DialogC13081c) obj;
                if (z12) {
                    int i12 = DialogC13081c.f671J;
                    ViewParent parent = listItemCompoundButton.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        Iterator<View> it = new q6(viewGroup).iterator();
                        while (true) {
                            p6 p6Var = (p6) it;
                            if (p6Var.hasNext()) {
                                View view = (View) p6Var.next();
                                if (!view.equals(listItemCompoundButton)) {
                                    ListItemCheckmark listItemCheckmark = view instanceof ListItemCheckmark ? (ListItemCheckmark) view : null;
                                    if (listItemCheckmark != null) {
                                        C13079a c13079a = dialogC13081c.f676I;
                                        listItemCheckmark.j(c13079a);
                                        listItemCheckmark.setChecked(false);
                                        listItemCheckmark.e(c13079a);
                                    }
                                }
                            }
                        }
                    }
                }
                Button button = dialogC13081c.f673F;
                (button != null ? button : null).setEnabled(z12);
                break;
            case 1:
                IsSwitchOnTransform isSwitchOnTransform = new IsSwitchOnTransform(z12);
                com.avito.android.beduin.common.component.switcher.a aVar = (com.avito.android.beduin.common.component.switcher.a) obj;
                BeduinSwitcherModel beduinSwitcherModel = aVar.f102738g;
                aVar.f102737f.h(new d.h(beduinSwitcherModel, beduinSwitcherModel.apply(isSwitchOnTransform)));
                List<BeduinAction> actions = beduinSwitcherModel.getActions();
                InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f102736e;
                if (actions != null) {
                    C28806b.a(interfaceC15523b, actions);
                }
                if (!z12) {
                    List<BeduinAction> onSwitchOffActions = beduinSwitcherModel.getOnSwitchOffActions();
                    if (onSwitchOffActions != null) {
                        C28806b.a(interfaceC15523b, onSwitchOffActions);
                        break;
                    }
                } else {
                    List<BeduinAction> onSwitchOnActions = beduinSwitcherModel.getOnSwitchOnActions();
                    if (onSwitchOnActions != null) {
                        C28806b.a(interfaceC15523b, onSwitchOnActions);
                        break;
                    }
                }
                break;
            case 2:
                l<? super Boolean, G0> lVar = ((k) obj).f105482q;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 3:
                Iterator it2 = ((ListItemCompoundButton) obj).f179544n.iterator();
                while (it2.hasNext()) {
                    ((ListItemCompoundButton.a) it2.next()).a(listItemCompoundButton, z12);
                }
                break;
            case 4:
                int i13 = h.f208195c;
                ((Y41.a) obj).invoke();
                break;
            case 5:
                ((PersonalFiltersChangeDialogFragment) obj).f215707k0 = z12;
                break;
            case 6:
                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                ((PhonesListFragment) obj).D5().accept(new InterfaceC49590a.e(z12));
                break;
            case 7:
                l<? super Boolean, G0> lVar2 = ((m) obj).f229345l;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 8:
                l<? super Boolean, G0> lVar3 = ((com.avito.android.profile_settings_extended.adapter.toggle.h) obj).f229885e;
                if (lVar3 != null) {
                    lVar3.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 9:
                ((j) obj).f236930g.invoke(Boolean.valueOf(z12));
                break;
            case 10:
                LastMinuteOfferFragment.a aVar3 = LastMinuteOfferFragment.f287978s0;
                LastMinuteOfferFragment lastMinuteOfferFragment = (LastMinuteOfferFragment) obj;
                K2.e(lastMinuteOfferFragment);
                lastMinuteOfferFragment.r5().accept(new b.g(z12));
                break;
            default:
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h hVar = (com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h) obj;
                if (hVar.f312816i && (c35565c = hVar.f312822o) != null) {
                    c35565c.a(new a.b(z12));
                    break;
                }
                break;
        }
    }
}
