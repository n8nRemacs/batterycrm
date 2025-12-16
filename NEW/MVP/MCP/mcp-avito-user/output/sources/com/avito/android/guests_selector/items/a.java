package com.avito.android.guests_selector.items;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.guests_selector.items.adults_stepper.AdultsStepperItem;
import com.avito.android.guests_selector.items.child.ChildItem;
import com.avito.android.guests_selector.items.children_add_button.ChildrenAddButtonItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorItemCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/guests_selector/items/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends C23424o.f<TV0.a> {
    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof AdultsStepperItem) && (aVar4 instanceof AdultsStepperItem)) {
            AdultsStepperItem adultsStepperItem = (AdultsStepperItem) aVar3;
            AdultsStepperItem adultsStepperItem2 = (AdultsStepperItem) aVar4;
            if (!L.f(adultsStepperItem.f161457g, adultsStepperItem2.f161457g) || adultsStepperItem.f161456f != adultsStepperItem2.f161456f) {
                return false;
            }
        } else if ((aVar3 instanceof ChildrenAddButtonItem) && (aVar4 instanceof ChildrenAddButtonItem)) {
            ChildrenAddButtonItem childrenAddButtonItem = (ChildrenAddButtonItem) aVar3;
            ChildrenAddButtonItem childrenAddButtonItem2 = (ChildrenAddButtonItem) aVar4;
            if (!L.f(childrenAddButtonItem.f161490e, childrenAddButtonItem2.f161490e) || childrenAddButtonItem.f161489d != childrenAddButtonItem2.f161489d) {
                return false;
            }
        } else {
            if (!(aVar3 instanceof ChildItem) || !(aVar4 instanceof ChildItem)) {
                return aVar3.equals(aVar4);
            }
            ChildItem childItem = (ChildItem) aVar3;
            ChildItem childItem2 = (ChildItem) aVar4;
            if (!L.f(childItem.f161472c, childItem2.f161472c) || !L.f(childItem.f161473d, childItem2.f161473d)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return ((aVar3 instanceof AdultsStepperItem) && (aVar4 instanceof AdultsStepperItem)) ? L.f(((AdultsStepperItem) aVar3).f161457g, ((AdultsStepperItem) aVar4).f161457g) : ((aVar3 instanceof ChildrenAddButtonItem) && (aVar4 instanceof ChildrenAddButtonItem)) ? L.f(((ChildrenAddButtonItem) aVar3).f161490e, ((ChildrenAddButtonItem) aVar4).f161490e) : !((aVar3 instanceof ChildItem) && (aVar4 instanceof ChildItem)) ? !(aVar3.getF124056b() == aVar4.getF124056b() && aVar3.getClass().equals(aVar4.getClass())) : ((ChildItem) aVar3).f161471b != ((ChildItem) aVar4).f161471b;
    }
}
