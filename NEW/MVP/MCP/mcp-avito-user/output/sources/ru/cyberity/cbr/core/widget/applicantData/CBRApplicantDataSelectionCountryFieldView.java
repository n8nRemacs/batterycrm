package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.advert.item.equipmentsTile.n;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.u0;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.listener.CBRDefaultCountryPickerKt;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView;
import ru.cyberity.cbr.core.widget.CBRFlagView;
import ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog;

/* compiled from: CBRApplicantDataSelectionCountryFieldView.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R?\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0014\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00102\u001a\u0004\u0018\u00010\u00122\b\u00101\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010\u0011\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionCountryFieldView;", "Lru/cyberity/cbr/core/widget/CBRApplicantDataFieldView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView$Selectable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "setFragmentResultListener", "()Z", "", "getCountryRequestKey", "()Ljava/lang/String;", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "item", "Lkotlin/G0;", "onCountrySelected", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V", "openSelector", "()V", "enabled", "setEnabled", "(Z)V", "", "tag", "setTag", "(Ljava/lang/Object;)V", "", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lkotlin/S;", "name", "country", "onCountrySelectedCallback", "LY41/l;", "getOnCountrySelectedCallback", "()LY41/l;", "setOnCountrySelectedCallback", "(LY41/l;)V", "<set-?>", "selectedCountry", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "getSelectedCountry", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "fragmentListenerSet", "Z", "Ljava/lang/Runnable;", "picker", "Ljava/lang/Runnable;", "Landroid/graphics/drawable/Drawable;", "endIcon", "Landroid/graphics/drawable/Drawable;", "value", "getValue", "setValue", "(Ljava/lang/String;)V", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes9.dex */
public final class CBRApplicantDataSelectionCountryFieldView extends CBRApplicantDataFieldView implements CBRApplicantDataBaseFieldView.Selectable {

    @l
    private Drawable endIcon;
    private boolean fragmentListenerSet;

    @k
    private List<CBRCountryPicker.CountryItem> items;

    @l
    private Y41.l<? super CBRCountryPicker.CountryItem, G0> onCountrySelectedCallback;

    @k
    private final Runnable picker;

    @l
    private CBRCountryPicker.CountryItem selectedCountry;

    /* compiled from: CBRApplicantDataSelectionCountryFieldView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView$3, reason: invalid class name */
    public static final class AnonymousClass3 extends N implements a<G0> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            invoke2();
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ActivityC22955m activityC22955mA;
            FragmentManager supportFragmentManager;
            String countryRequestKey = CBRApplicantDataSelectionCountryFieldView.this.getCountryRequestKey();
            if (countryRequestKey == null || (activityC22955mA = s.a(this.$context)) == null || (supportFragmentManager = activityC22955mA.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.g(countryRequestKey);
        }
    }

    @j
    public CBRApplicantDataSelectionCountryFieldView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-5, reason: not valid java name */
    public static final boolean m307_init_$lambda5(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCountryRequestKey() {
        Object tag = getTag();
        Object objQ = tag instanceof h.d ? ((h.d) tag).getName() : tag instanceof h.c ? ((h.c) tag).getName() : null;
        if (objQ == null) {
            return null;
        }
        u0 u0Var = u0.f406856a;
        return String.format("CBRApplicantDataSelectionCountryFieldView_country_picker_request_key_%s", Arrays.copyOf(new Object[]{objQ}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCountrySelected(CBRCountryPicker.CountryItem item) {
        CBRFlagView flagView;
        EditText editText;
        EditText editText2;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText2 = inputLayout.getEditText()) != null) {
            editText2.clearFocus();
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.setText(item.getName());
        }
        TextInputLayout inputLayout3 = getInputLayout();
        CBRFlaggedInputLayout cBRFlaggedInputLayout = inputLayout3 instanceof CBRFlaggedInputLayout ? (CBRFlaggedInputLayout) inputLayout3 : null;
        if (cBRFlaggedInputLayout != null && (flagView = cBRFlaggedInputLayout.getFlagView()) != null) {
            flagView.setImageDrawable(CBRDefaultCountryPickerKt.getFlagDrawable(item, flagView.getContext()));
        }
        this.selectedCountry = item;
        Y41.l<? super CBRCountryPicker.CountryItem, G0> lVar = this.onCountrySelectedCallback;
        if (lVar != null) {
            lVar.invoke(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: picker$lambda-3, reason: not valid java name */
    public static final void m308picker$lambda3(final CBRApplicantDataSelectionCountryFieldView cBRApplicantDataSelectionCountryFieldView, Context context) {
        if (cBRApplicantDataSelectionCountryFieldView.isEnabled()) {
            n0.f432787a.getCountryPicker().pickCountry(context, cBRApplicantDataSelectionCountryFieldView.items, new CBRCountryPicker.CBRCountryPickerCallBack() { // from class: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView$picker$1$1
                @Override // ru.cyberity.cbr.core.data.listener.CBRCountryPicker.CBRCountryPickerCallBack
                public void onDismiss() {
                    EditText editText;
                    TextInputLayout inputLayout = this.this$0.getInputLayout();
                    if (inputLayout == null || (editText = inputLayout.getEditText()) == null) {
                        return;
                    }
                    editText.clearFocus();
                }

                @Override // ru.cyberity.cbr.core.data.listener.CBRCountryPicker.CBRCountryPickerCallBack
                public void onItemSelected(@k CBRCountryPicker.CountryItem item) {
                    this.this$0.onCountrySelected(item);
                }
            }, cBRApplicantDataSelectionCountryFieldView.fragmentListenerSet ? cBRApplicantDataSelectionCountryFieldView.getCountryRequestKey() : null, cBRApplicantDataSelectionCountryFieldView.fragmentListenerSet ? "CBRApplicantDataSelectionCountryFieldView_country_picker_result_key" : null);
        }
    }

    private final boolean setFragmentResultListener() {
        String countryRequestKey = getCountryRequestKey();
        if (countryRequestKey == null) {
            return false;
        }
        Context context = getContext();
        ActivityC22955m activityC22955m = context instanceof ActivityC22955m ? (ActivityC22955m) context : null;
        if (activityC22955m == null) {
            return false;
        }
        activityC22955m.getSupportFragmentManager().p0(countryRequestKey, activityC22955m, new com.my.target.ads.a(this, 24));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setFragmentResultListener$lambda-9$lambda-8, reason: not valid java name */
    public static final void m309setFragmentResultListener$lambda9$lambda8(CBRApplicantDataSelectionCountryFieldView cBRApplicantDataSelectionCountryFieldView, String str, Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("CBRApplicantDataSelectionCountryFieldView_country_picker_result_key");
        CBRPickerDialog.Item item = parcelable instanceof CBRPickerDialog.Item ? (CBRPickerDialog.Item) parcelable : null;
        if (item != null) {
            cBRApplicantDataSelectionCountryFieldView.onCountrySelected(new CBRCountryPicker.CountryItem(item.getId(), item.getTitle()));
        }
    }

    @k
    public final List<CBRCountryPicker.CountryItem> getItems() {
        return this.items;
    }

    @l
    public final Y41.l<CBRCountryPicker.CountryItem, G0> getOnCountrySelectedCallback() {
        return this.onCountrySelectedCallback;
    }

    @l
    public final CBRCountryPicker.CountryItem getSelectedCountry() {
        return this.selectedCountry;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @k
    public String getValue() {
        EditText editText;
        TextInputLayout inputLayout = getInputLayout();
        return String.valueOf((inputLayout == null || (editText = inputLayout.getEditText()) == null) ? null : editText.getText());
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView.Selectable
    public void openSelector() {
        this.picker.run();
    }

    @Override // ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout == null) {
            return;
        }
        inputLayout.setEndIconDrawable(enabled ? this.endIcon : null);
    }

    public final void setItems(@k List<CBRCountryPicker.CountryItem> list) {
        this.items = list;
    }

    public final void setOnCountrySelectedCallback(@l Y41.l<? super CBRCountryPicker.CountryItem, G0> lVar) {
        this.onCountrySelectedCallback = lVar;
    }

    @Override // android.view.View
    public void setTag(@l Object tag) {
        super.setTag(tag);
        this.fragmentListenerSet = setFragmentResultListener();
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setValue(@k String str) {
        Object next;
        CBRFlagView flagView;
        CBRFlagView flagView2;
        EditText editText;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.setText(str);
        }
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String name = ((CBRCountryPicker.CountryItem) next).getName();
            Locale locale = Locale.ROOT;
            if (name.toLowerCase(locale).equals(str.toLowerCase(locale))) {
                break;
            }
        }
        CBRCountryPicker.CountryItem countryItem = (CBRCountryPicker.CountryItem) next;
        if (countryItem != null) {
            TextInputLayout inputLayout2 = getInputLayout();
            CBRFlaggedInputLayout cBRFlaggedInputLayout = inputLayout2 instanceof CBRFlaggedInputLayout ? (CBRFlaggedInputLayout) inputLayout2 : null;
            if (cBRFlaggedInputLayout != null && (flagView2 = cBRFlaggedInputLayout.getFlagView()) != null) {
                flagView2.setImageDrawable(CBRDefaultCountryPickerKt.getFlagDrawable(countryItem, getContext()));
            }
            this.selectedCountry = countryItem;
            return;
        }
        TextInputLayout inputLayout3 = getInputLayout();
        CBRFlaggedInputLayout cBRFlaggedInputLayout2 = inputLayout3 instanceof CBRFlaggedInputLayout ? (CBRFlaggedInputLayout) inputLayout3 : null;
        if (cBRFlaggedInputLayout2 != null && (flagView = cBRFlaggedInputLayout2.getFlagView()) != null) {
            flagView.setImageDrawable(null);
        }
        this.selectedCountry = null;
    }

    public /* synthetic */ CBRApplicantDataSelectionCountryFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataFieldViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataFieldView_Country : i13);
    }

    @j
    public CBRApplicantDataSelectionCountryFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        EditText editText;
        super(context, attributeSet, i12, i13);
        this.items = C42784z0.f406748b;
        this.picker = new com.vk.id.captcha.web.h(24, this, context);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        Drawable drawableResolveIcon = themeHelper.resolveIcon(context, CBRIconHandler.CBRCommonIcons.MORE.getImageName());
        this.endIcon = drawableResolveIcon == null ? themeHelper.resolveIcon(context, CBRIconHandler.CBRCommonIcons.DISCLOSURE.getImageName()) : drawableResolveIcon;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setEndIconDrawable(this.endIcon);
        }
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(@k MotionEvent e12) {
                this.this$0.openSelector();
                return super.onSingleTapUp(e12);
            }
        });
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.setOnTouchListener(new n(gestureDetector, 1));
        }
        TextInputLayout inputLayout3 = getInputLayout();
        EditText editText2 = inputLayout3 != null ? inputLayout3.getEditText() : null;
        if (editText2 != null) {
            editText2.setKeyListener(null);
        }
        setOnClear(new AnonymousClass3(context));
        onInitializationFinished();
    }
}
