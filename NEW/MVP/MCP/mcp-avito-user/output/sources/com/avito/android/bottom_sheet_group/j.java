package com.avito.android.bottom_sheet_group;

import android.content.res.Resources;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.bottom_sheet_group.BottomSheetGroupParameterWrapper;
import com.avito.android.bottom_sheet_group.items.checkable_item.BottomSheetGroupCheckableItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import l41.InterfaceC43543a;

/* compiled from: BottomSheetGroupDialogPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/j;", "Lcom/avito/android/bottom_sheet_group/a;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f107386a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f107387b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final s f107388c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bottom_sheet_group.items.checkable_item.c f107389d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bottom_sheet_group.items.multiselect_item.c f107390e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final w f107391f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final BottomSheetGroupParameterWrapper f107392g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f107393h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public n f107394i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f107395j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f107396k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public BottomSheetGroupFragment f107397l;

    @Inject
    public j(@Y61.k InterfaceC35745a5 interfaceC35745a5, @com.avito.android.bottom_sheet_group.di.c @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k s sVar, @Y61.k com.avito.android.bottom_sheet_group.items.checkable_item.c cVar, @Y61.k com.avito.android.bottom_sheet_group.items.multiselect_item.c cVar2, @Y61.k w wVar, @Y61.k BottomSheetGroupParameterWrapper bottomSheetGroupParameterWrapper) {
        this.f107386a = interfaceC35745a5;
        this.f107387b = hVar;
        this.f107388c = sVar;
        this.f107389d = cVar;
        this.f107390e = cVar2;
        this.f107391f = wVar;
        this.f107392g = bottomSheetGroupParameterWrapper;
        this.f107393h = bottomSheetGroupParameterWrapper.f107184b;
    }

    @Override // com.avito.android.bottom_sheet_group.a
    public final void a(@Y61.k BottomSheetGroupFragment bottomSheetGroupFragment) {
        this.f107397l = bottomSheetGroupFragment;
    }

    @Override // com.avito.android.bottom_sheet_group.a
    public final void b(@Y61.k n nVar) throws Resources.NotFoundException {
        this.f107394i = nVar;
        s sVar = this.f107388c;
        String string = sVar.f107420a.getString(R.string.reset_button_text);
        TextView textView = nVar.f107409c;
        if (textView != null) {
            I5.a(textView, string, false);
        }
        if (textView != null) {
            textView.setOnClickListener(new m(nVar, 1));
        }
        String string2 = sVar.f107420a.getString(R.string.accept_button_text);
        Button button = nVar.f107408b;
        if (button != null) {
            button.setText(string2);
        }
        io.reactivex.rxjava3.core.z<BottomSheetGroupCheckableItem> zVarD = this.f107389d.d();
        InterfaceC35745a5 interfaceC35745a5 = this.f107386a;
        I0 i0J0 = zVarD.j0(interfaceC35745a5.e());
        b bVar = new b(this);
        l41.g<? super Throwable> gVar = c.f107291b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(bVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f107395j;
        cVar.b(dVarV0);
        cVar.b(this.f107390e.w7().j0(interfaceC35745a5.e()).v0(new d(this), e.f107336b, interfaceC43543a));
        io.reactivex.rxjava3.disposables.d dVarV02 = nVar.f107412f.j0(interfaceC35745a5.e()).v0(new f(this), g.f107338b, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar2 = this.f107396k;
        cVar2.b(dVarV02);
        cVar2.b(nVar.f107413g.j0(interfaceC35745a5.e()).v0(new h(this), i.f107340b, interfaceC43543a));
        d();
        c();
    }

    public final void c() {
        BottomSheetGroupParameterWrapper bottomSheetGroupParameterWrapper = this.f107392g;
        boolean zF2 = L.f(bottomSheetGroupParameterWrapper.f107185c, bottomSheetGroupParameterWrapper.f107186d);
        boolean z12 = !zF2;
        n nVar = this.f107394i;
        if (nVar != null) {
            Button button = nVar.f107408b;
            if (button != null) {
                button.setEnabled(z12);
            }
            if (zF2) {
                if (button != null) {
                    button.setOnClickListener(null);
                    D6.w(button);
                }
            } else if (button != null) {
                D6.G(button, true);
                button.setOnClickListener(new m(nVar, 0));
            }
        }
        boolean zIsEmpty = bottomSheetGroupParameterWrapper.f107186d.isEmpty();
        boolean z13 = !zIsEmpty;
        n nVar2 = this.f107394i;
        if (nVar2 != null) {
            TextView textView = nVar2.f107409c;
            if (textView != null) {
                textView.setClickable(z13);
            }
            if (zIsEmpty) {
                Integer num = nVar2.f107415i;
                if (num == null || textView == null) {
                    return;
                }
                textView.setTextColor(num.intValue());
                return;
            }
            Integer num2 = nVar2.f107414h;
            if (num2 == null || textView == null) {
                return;
            }
            textView.setTextColor(num2.intValue());
        }
    }

    @Override // com.avito.android.bottom_sheet_group.a
    public final void c0() {
        this.f107397l = null;
    }

    public final void d() {
        BottomSheetGroupParameterWrapper bottomSheetGroupParameterWrapper = this.f107392g;
        List<MultiselectParameter> parameters = bottomSheetGroupParameterWrapper.f107183a.getParameters();
        this.f107391f.getClass();
        com.avito.konveyor.util.a.a(this.f107387b, w.a(parameters, bottomSheetGroupParameterWrapper.f107187e));
        n nVar = this.f107394i;
        if (nVar != null) {
            nVar.f107416j.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.bottom_sheet_group.a
    @Y61.k
    public final BottomSheetGroupParameterWrapper.ParameterState d0() {
        BottomSheetGroupParameterWrapper bottomSheetGroupParameterWrapper = this.f107392g;
        bottomSheetGroupParameterWrapper.getClass();
        return new BottomSheetGroupParameterWrapper.ParameterState(bottomSheetGroupParameterWrapper.f107183a, bottomSheetGroupParameterWrapper.f107185c, bottomSheetGroupParameterWrapper.f107187e);
    }

    @Override // com.avito.android.bottom_sheet_group.a
    public final void e0() {
        this.f107395j.e();
        this.f107396k.e();
        this.f107394i = null;
    }
}
