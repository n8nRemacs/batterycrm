package com.avito.android.blueprint.radiogroup;

import JO.m;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishRadioGroupSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/radiogroup/j;", "LHj/c;", "Lcom/avito/android/blueprint/radiogroup/i;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends Hj.c implements i {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f105646q = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final LinearLayout f105647m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final ArrayList f105648n;

    /* renamed from: o, reason: collision with root package name */
    public int f105649o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public N f105650p;

    /* compiled from: PublishRadioGroupSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105651a;

        static {
            int[] iArr = new int[SelectParameter.Displaying.LabelPosition.values().length];
            try {
                iArr[SelectParameter.Displaying.LabelPosition.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectParameter.Displaying.LabelPosition.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105651a = iArr;
        }
    }

    /* compiled from: PublishRadioGroupSelectItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f105653m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12) {
            super(1);
            this.f105653m = i12;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            bool.booleanValue();
            int i12 = j.f105646q;
            j.this.D80(this.f105653m, true);
            return G0.f406611a;
        }
    }

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_radiogroup_content, aVar);
        this.f105647m = (LinearLayout) this.f7656e.findViewById(R.id.radio_group);
        this.f105648n = new ArrayList();
        this.f105649o = -1;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [Y41.p, kotlin.jvm.internal.N] */
    public final void D80(int i12, boolean z12) {
        ?? r52;
        if (i12 == this.f105649o) {
            return;
        }
        ArrayList arrayList = this.f105648n;
        int size = arrayList.size();
        int i13 = this.f105649o;
        if (i13 >= 0 && i13 < size) {
            ((ListItemRadio) arrayList.get(i13)).setChecked(false);
        }
        ((ListItemRadio) arrayList.get(i12)).setChecked(true);
        this.f105649o = i12;
        if (!z12 || (r52 = this.f105650p) == 0) {
            return;
        }
        r52.invoke(((ListItemRadio) arrayList.get(i12)).getTag().toString(), Boolean.TRUE);
    }

    @Override // com.avito.android.blueprint.radiogroup.i
    public final void S4(int i12) {
        if (i12 < 0 || i12 >= this.f105648n.size()) {
            return;
        }
        D80(i12, false);
    }

    @Override // com.avito.android.blueprint.radiogroup.i
    public final void Ya() {
        this.f105650p = null;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f105650p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprint.radiogroup.i
    public final void no(@k List<m> list, @l m mVar, @k Y41.l<? super DeepLink, G0> lVar, @k p<? super String, ? super Boolean, G0> pVar) {
        G0 g02;
        ListItemRadio.RadioButtonPosition radioButtonPosition;
        LinearLayout linearLayout = this.f105647m;
        linearLayout.removeAllViews();
        ArrayList arrayList = this.f105648n;
        arrayList.clear();
        this.f105649o = -1;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            m mVar2 = (m) obj;
            ListItemRadio listItemRadio = new ListItemRadio(this.f7656e.getContext(), null);
            listItemRadio.setTag(mVar2.f8961b);
            listItemRadio.setId(i12);
            DeepLink deepLink = mVar2.f8966g;
            if (deepLink != null) {
                String str = mVar2.f8967h;
                if (str != null) {
                    Integer numA = q.a(str);
                    listItemRadio.setImageDrawable(numA != null ? C35835l0.h(numA.intValue(), listItemRadio.getContext()) : null);
                }
                listItemRadio.setImageColor(C35835l0.d(R.attr.gray28, listItemRadio.getContext()));
                listItemRadio.setImageClickedListener(new XA0.c(lVar, deepLink, 3));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                listItemRadio.setImageDrawable(null);
            }
            SelectParameter.Displaying.LabelPosition labelPosition = mVar2.f8976q;
            int i14 = labelPosition == null ? -1 : a.f105651a[labelPosition.ordinal()];
            if (i14 == -1) {
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179560b;
            } else if (i14 != 1) {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179560b;
            } else {
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179561c;
            }
            ListItemRadio.RadioButtonPosition radioButtonPosition2 = radioButtonPosition;
            boolean zF2 = L.f(mVar2.f8961b, mVar != null ? mVar.f8961b : null);
            b bVar = new b(i12);
            boolean z12 = !mVar2.f8968i;
            listItemRadio.setState((kV.b) new kV.e(mVar2.f8962c, null, mVar2.f8963d, null, null, null, null, false, z12, new ToggleState(bVar, z12, false, z12, zF2 ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 4, null), null, false, BaseListItem.Alignment.f179501c, radioButtonPosition2, 3322, null));
            linearLayout.addView(listItemRadio);
            arrayList.add(listItemRadio);
            listItemRadio.setPadding(0, listItemRadio.getPaddingTop(), 0, listItemRadio.getPaddingBottom());
            if (zF2) {
                this.f105649o = i12;
            }
            i12 = i13;
        }
        this.f105650p = (N) pVar;
    }

    @Override // com.avito.android.blueprint.radiogroup.i
    public final void s(@l String str) {
        this.f105647m.setTag(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprint.radiogroup.i
    public final void s8(@k p<? super String, ? super Boolean, G0> pVar) {
        this.f105650p = (N) pVar;
    }
}
