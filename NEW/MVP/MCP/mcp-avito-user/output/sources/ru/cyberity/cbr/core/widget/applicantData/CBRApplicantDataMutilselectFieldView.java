package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.view.C22829k0;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;
import ru.cyberity.cbr.core.widget.CBRCheckGroup;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;

/* compiled from: CBRApplicantDataMutilselectFieldView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u0016\u0010&\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R(\u0010,\u001a\u0004\u0018\u00010'2\b\u0010\u0010\u001a\u0004\u0018\u00010'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010/\u001a\u0004\u0018\u00010'2\b\u0010\u0010\u001a\u0004\u0018\u00010'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+¨\u00060"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataMutilselectFieldView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "isUpdating", "Z", "", "Lru/cyberity/cbr/core/data/model/h$e$a$a;", "value", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function0;", "Lkotlin/G0;", "onSelectionChanged", "LY41/a;", "getOnSelectionChanged", "()LY41/a;", "setOnSelectionChanged", "(LY41/a;)V", "aValue", "selectedItems", "getSelectedItems", "setSelectedItems", "Lru/cyberity/cbr/core/widget/CBRCheckGroup;", "getCheckGroup", "()Lru/cyberity/cbr/core/widget/CBRCheckGroup;", "checkGroup", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "getError", "setError", "error", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRApplicantDataMutilselectFieldView extends CBRApplicantDataBaseFieldView {
    private boolean isUpdating;

    @k
    private List<h.e.a.C12451a> items;

    @l
    private a<G0> onSelectionChanged;

    @k
    private List<h.e.a.C12451a> selectedItems;

    public /* synthetic */ CBRApplicantDataMutilselectFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataMutilselectFieldViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataMutilselectFieldView : i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_items_$lambda-5$lambda-4$lambda-3, reason: not valid java name */
    public static final void m305_set_items_$lambda5$lambda4$lambda3(CBRApplicantDataMutilselectFieldView cBRApplicantDataMutilselectFieldView, CompoundButton compoundButton, boolean z12) {
        Object obj = null;
        cBRApplicantDataMutilselectFieldView.setError(null);
        String str = (String) compoundButton.getTag();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(cBRApplicantDataMutilselectFieldView.selectedItems);
        C42745f0.l0(new CBRApplicantDataMutilselectFieldView$items$1$1$2$1(str), arrayList);
        if (z12) {
            Iterator<T> it = cBRApplicantDataMutilselectFieldView.items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((h.e.a.C12451a) next).getId(), str)) {
                    obj = next;
                    break;
                }
            }
            h.e.a.C12451a c12451a = (h.e.a.C12451a) obj;
            if (c12451a != null) {
                arrayList.add(c12451a);
            }
        }
        if (cBRApplicantDataMutilselectFieldView.isUpdating) {
            return;
        }
        cBRApplicantDataMutilselectFieldView.setSelectedItems(arrayList);
        a<G0> aVar = cBRApplicantDataMutilselectFieldView.onSelectionChanged;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final CBRCheckGroup getCheckGroup() {
        return (CBRCheckGroup) findViewById(R.id.cbr_checkgroup);
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
    public final a<G0> getOnSelectionChanged() {
        return this.onSelectionChanged;
    }

    @k
    public final List<h.e.a.C12451a> getSelectedItems() {
        return this.selectedItems;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setError(@l CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            s.a(tvError, charSequence);
        }
        CBRCheckGroup checkGroup = getCheckGroup();
        if (checkGroup == null) {
            return;
        }
        CBRStepStateKt.setStepState(checkGroup, (charSequence == null || charSequence.length() == 0) ? CBRStepState.INIT : CBRStepState.REJECTED);
    }

    public final void setItems(@k List<h.e.a.C12451a> list) {
        CBRCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            checkGroup.removeAllViews();
        }
        setSelectedItems(C42784z0.f406748b);
        for (h.e.a.C12451a c12451a : list) {
            MaterialCheckBox materialCheckBox = new MaterialCheckBox(getContext(), null);
            String label = c12451a.getLabel();
            String str = label.length() > 0 ? label : null;
            if (str == null) {
                str = " ";
            }
            materialCheckBox.setText(str);
            materialCheckBox.setOnCheckedChangeListener(new com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h(this, 9));
            ThemeHelper.INSTANCE.applyTheme(materialCheckBox, CBRTypographyElement.SUBTITLE2, CBRColorElement.CONTENT_NEUTRAL);
            materialCheckBox.setTag(c12451a.getId());
            CBRCheckGroup checkGroup2 = getCheckGroup();
            if (checkGroup2 != null) {
                checkGroup2.addView(materialCheckBox);
            }
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

    public final void setOnSelectionChanged(@l a<G0> aVar) {
        this.onSelectionChanged = aVar;
    }

    public final void setSelectedItems(@k List<h.e.a.C12451a> list) {
        boolean z12;
        this.isUpdating = true;
        CBRCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            Iterator<View> it = new C22829k0(checkGroup).iterator();
            while (it.hasNext()) {
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) it.next();
                if ((list instanceof Collection) && list.isEmpty()) {
                    z12 = false;
                } else {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (L.f(((h.e.a.C12451a) it2.next()).getId(), materialCheckBox.getTag())) {
                            z12 = true;
                            break;
                        }
                    }
                    z12 = false;
                }
                materialCheckBox.setChecked(z12);
            }
        }
        this.isUpdating = false;
        this.selectedItems = list;
    }

    @j
    public CBRApplicantDataMutilselectFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.items = new ArrayList();
        this.selectedItems = C42784z0.f406748b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRApplicantDataMutilselectFieldView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRApplicantDataMutilselectFieldView_cbr_applicantDataMutilselectFieldViewLayout, R.layout.cbr_layout_applicant_data_multiselect_view), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
