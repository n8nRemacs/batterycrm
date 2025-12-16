package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.view.q0;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;
import ru.cyberity.cbr.core.widget.CBRRadioGroup;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;
import xY0.C49898a;

/* compiled from: CBRApplicantDataRadioGroupView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR>\u0010\u000f\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R?\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010)\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R4\u00102\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00105\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(¨\u00066"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataRadioGroupView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Lru/cyberity/cbr/core/data/model/h$e$a$a;", "Lru/cyberity/cbr/core/widget/applicantData/Item;", "value", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "Lkotlin/G0;", "onSelectionChanged", "LY41/l;", "getOnSelectionChanged", "()LY41/l;", "setOnSelectionChanged", "(LY41/l;)V", "Lru/cyberity/cbr/core/widget/CBRRadioGroup;", "getRadioGroup", "()Lru/cyberity/cbr/core/widget/CBRRadioGroup;", "radioGroup", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getSelectedItem", "()Lru/cyberity/cbr/core/data/model/h$e$a$a;", "setSelectedItem", "(Lru/cyberity/cbr/core/data/model/h$e$a$a;)V", "selectedItem", "getError", "setError", "error", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRApplicantDataRadioGroupView extends CBRApplicantDataBaseFieldView {

    @k
    private List<h.e.a.C12451a> items;

    @l
    private Y41.l<? super String, G0> onSelectionChanged;

    public /* synthetic */ CBRApplicantDataRadioGroupView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataRadioGroupViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataRadioGroupView : i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_items_$lambda-4$lambda-3$lambda-2, reason: not valid java name */
    public static final void m306_set_items_$lambda4$lambda3$lambda2(CBRApplicantDataRadioGroupView cBRApplicantDataRadioGroupView, CompoundButton compoundButton, boolean z12) {
        Y41.l<? super String, G0> lVar;
        Object obj = null;
        cBRApplicantDataRadioGroupView.setError(null);
        Iterator<T> it = cBRApplicantDataRadioGroupView.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id2 = ((h.e.a.C12451a) next).getId();
            Object tag = compoundButton.getTag();
            if (L.f(id2, tag instanceof String ? (String) tag : null)) {
                obj = next;
                break;
            }
        }
        h.e.a.C12451a c12451a = (h.e.a.C12451a) obj;
        if (c12451a == null || !z12 || (lVar = cBRApplicantDataRadioGroupView.onSelectionChanged) == null) {
            return;
        }
        lVar.invoke(c12451a.getId());
    }

    private final CBRRadioGroup getRadioGroup() {
        return (CBRRadioGroup) findViewById(R.id.cbr_radiogroup);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
    }

    @k
    public final List<h.e.a.C12451a> getItems() {
        return this.items;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        return (tvLabel$cyberity_mobile_sdk_ui_release == null || (text = tvLabel$cyberity_mobile_sdk_ui_release.getText()) == null) ? "" : text;
    }

    @l
    public final Y41.l<String, G0> getOnSelectionChanged() {
        return this.onSelectionChanged;
    }

    @l
    public final h.e.a.C12451a getSelectedItem() {
        Object objN;
        CBRRadioGroup radioGroup = getRadioGroup();
        Object obj = null;
        if (radioGroup == null || (objN = C43033p.n(new o0(C43033p.i(C43033p.i(q0.a(radioGroup), CBRApplicantDataRadioGroupView$special$$inlined$filterIsInstance$1.INSTANCE), CBRApplicantDataRadioGroupView$selectedItem$1.INSTANCE), CBRApplicantDataRadioGroupView$selectedItem$2.INSTANCE))) == null) {
            return null;
        }
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((h.e.a.C12451a) next).getId(), objN instanceof String ? (String) objN : null)) {
                obj = next;
                break;
            }
        }
        return (h.e.a.C12451a) obj;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @k
    public String getValue() {
        String id2;
        h.e.a.C12451a selectedItem = getSelectedItem();
        return (selectedItem == null || (id2 = selectedItem.getId()) == null) ? "" : id2;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setError(@l CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            s.a(tvError, charSequence);
        }
        CBRRadioGroup radioGroup = getRadioGroup();
        if (radioGroup == null) {
            return;
        }
        CBRStepStateKt.setStepState(radioGroup, (charSequence == null || charSequence.length() == 0) ? CBRStepState.INIT : CBRStepState.REJECTED);
    }

    public final void setItems(@k List<h.e.a.C12451a> list) {
        CBRRadioGroup radioGroup = getRadioGroup();
        if (radioGroup != null) {
            radioGroup.removeAllViews();
        }
        for (h.e.a.C12451a c12451a : list) {
            C49898a c49898a = new C49898a(getContext(), null);
            c49898a.setText(c12451a.getLabel());
            c49898a.setOnCheckedChangeListener(new com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h(this, 10));
            c49898a.setTag(c12451a.getId());
            CBRRadioGroup radioGroup2 = getRadioGroup();
            if (radioGroup2 != null) {
                radioGroup2.addView(c49898a);
            }
            ThemeHelper.INSTANCE.applyTheme(c49898a, CBRTypographyElement.SUBTITLE2, CBRColorElement.CONTENT_NEUTRAL);
        }
        this.items = list;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setLabel(@l CharSequence charSequence) {
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        if (tvLabel$cyberity_mobile_sdk_ui_release != null) {
            s.a(tvLabel$cyberity_mobile_sdk_ui_release, charSequence);
        }
    }

    public final void setOnSelectionChanged(@l Y41.l<? super String, G0> lVar) {
        this.onSelectionChanged = lVar;
    }

    public final void setSelectedItem(@l h.e.a.C12451a c12451a) {
        CBRRadioGroup radioGroup = getRadioGroup();
        if (radioGroup != null) {
            C43025h.a aVar = new C43025h.a(C43033p.i(q0.a(radioGroup), CBRApplicantDataRadioGroupView$special$$inlined$filterIsInstance$2.INSTANCE));
            while (aVar.hasNext()) {
                RadioButton radioButton = (RadioButton) aVar.next();
                Object tag = radioButton.getTag();
                String id2 = null;
                String str = tag instanceof String ? (String) tag : null;
                if (c12451a != null) {
                    id2 = c12451a.getId();
                }
                radioButton.setChecked(L.f(str, id2));
            }
        }
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setValue(@k String str) {
        Object next;
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((h.e.a.C12451a) next).getId(), str)) {
                    break;
                }
            }
        }
        setSelectedItem((h.e.a.C12451a) next);
    }

    @j
    public CBRApplicantDataRadioGroupView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.items = C42784z0.f406748b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRApplicantDataRadioGroupView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRApplicantDataRadioGroupView_cbr_applicantDataRadioGroupLayout, R.layout.cbr_layout_applicant_data_radio_group_view), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
