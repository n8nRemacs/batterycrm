package com.avito.android.blueprints.radiogroup;

import JO.m;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.snapshots.C22166k;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RadioGroupSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/radiogroup/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/radiogroup/i;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f106574h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106575b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final androidx.appcompat.view.d f106576c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RadioGroup f106577d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f106578e;

    /* renamed from: f, reason: collision with root package name */
    public final int f106579f;

    /* renamed from: g, reason: collision with root package name */
    public final int f106580g;

    /* compiled from: RadioGroupSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106581a;

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
            f106581a = iArr;
        }
    }

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f106575b = aVar;
        this.f106576c = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f106577d = (RadioGroup) view.findViewById(R.id.radio_group);
        this.f106578e = (TextView) view.findViewById(R.id.warning_text);
        this.f106579f = R.dimen.design_radio_group_title_margin_bottom;
        this.f106580g = R.dimen.publish_radio_group_title_padding_bottom_redesign;
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void S4(int i12) {
        this.f106577d.a(i12);
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void Ya() {
        this.f106577d.setOnCheckedChangeListener(null);
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void b3(@l String str) {
        if (str == null) {
            return;
        }
        this.f106577d.setTitleStyle(com.avito.android.lib.util.f.r(this.f106576c, str));
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void gn(@k List<m> list, @l m mVar, boolean z12, @k Y41.l<? super DeepLink, G0> lVar, @k p<? super String, ? super Boolean, G0> pVar) {
        G0 g02;
        ListItemRadio.RadioButtonPosition radioButtonPosition;
        int i12 = z12 ? this.f106580g : this.f106579f;
        RadioGroup radioGroup = this.f106577d;
        radioGroup.b();
        radioGroup.a(-1);
        radioGroup.setTitleBottomMargin(i12);
        Context context = z12 ? this.f106576c : radioGroup.getContext();
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            m mVar2 = (m) obj;
            ListItemRadio listItemRadio = new ListItemRadio(context, null);
            listItemRadio.setTag(mVar2.f8961b);
            listItemRadio.setId(i13);
            listItemRadio.setTitle(mVar2.f8962c);
            String str = mVar2.f8963d;
            if (str != null) {
                listItemRadio.setSubtitle(str);
            }
            DeepLink deepLink = mVar2.f8966g;
            if (deepLink != null) {
                String str2 = mVar2.f8967h;
                if (str2 != null) {
                    Integer numA = q.a(str2);
                    listItemRadio.setImageDrawable(numA != null ? C35835l0.h(numA.intValue(), context) : null);
                }
                listItemRadio.setImageColor(C35835l0.d(R.attr.gray28, listItemRadio.getContext()));
                listItemRadio.setImageClickedListener(new XA0.c(lVar, deepLink, 4));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                listItemRadio.setImageDrawable(null);
            }
            boolean z13 = !mVar2.f8968i;
            listItemRadio.setClickable(z13);
            listItemRadio.setEnabled(z13);
            SelectParameter.Displaying.LabelPosition labelPosition = mVar2.f8976q;
            int i15 = labelPosition == null ? -1 : a.f106581a[labelPosition.ordinal()];
            if (i15 == -1) {
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179560b;
            } else if (i15 != 1) {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179560b;
            } else {
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179561c;
            }
            listItemRadio.setRadioButtonPositionNonUdf(radioButtonPosition);
            listItemRadio.setRightAlignmentNonUdf(BaseListItem.Alignment.f179501c);
            radioGroup.addView(listItemRadio);
            if (L.f(mVar2.f8961b, mVar != null ? mVar.f8961b : null)) {
                radioGroup.a(i13);
            }
            i13 = i14;
        }
        s8(pVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Ya();
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void k(@l AttributedText attributedText) {
        this.f106577d.setSubtitle(this.f106575b.c(this.f106576c, attributedText));
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void k0(@l CustomPaddings customPaddings) {
        Integer bottom;
        Integer top;
        RadioGroup radioGroup = this.f106577d;
        radioGroup.getRootView().setPadding(0, (customPaddings == null || (top = customPaddings.getTop()) == null) ? radioGroup.getPaddingTop() : y6.d(top.intValue()), 0, (customPaddings == null || (bottom = customPaddings.getBottom()) == null) ? radioGroup.getPaddingBottom() : y6.d(bottom.intValue()));
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void s(@l String str) {
        this.f106577d.setTag(str);
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void s8(@k p<? super String, ? super Boolean, G0> pVar) {
        this.f106577d.setOnCheckedChangeListener(new C22166k(2, pVar));
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void setError(@l String str) {
        this.f106577d.setHint(str);
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void setTitle(@l CharSequence charSequence) {
        this.f106577d.setTitle(charSequence);
    }

    @Override // com.avito.android.blueprints.radiogroup.i
    public final void um(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f106578e, attributedText, null);
    }
}
