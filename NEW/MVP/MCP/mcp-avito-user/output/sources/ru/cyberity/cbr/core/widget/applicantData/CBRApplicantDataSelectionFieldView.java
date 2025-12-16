package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.avito.android.advert.item.equipmentsTile.n;
import com.avito.android.async_phone.impl_module.phone_request_link.confirmation_dialog_fragment.c;
import com.avito.android.publish.start_publish.C;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pY0.C47034b;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView;

/* compiled from: CBRApplicantDataSelectionFieldView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rR6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR?\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010'\u001a\u0004\u0018\u00010\u00142\b\u0010&\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionFieldView;", "Lru/cyberity/cbr/core/widget/CBRApplicantDataFieldView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView$Selectable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/G0;", "showDialog", "()V", "", "enabled", "setEnabled", "(Z)V", "openSelector", "", "Lru/cyberity/cbr/core/data/model/h$e$a$a;", "value", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lkotlin/S;", "name", "item", "onSelectedCallback", "LY41/l;", "getOnSelectedCallback", "()LY41/l;", "setOnSelectedCallback", "(LY41/l;)V", "aValue", "selectedItem", "Lru/cyberity/cbr/core/data/model/h$e$a$a;", "getSelectedItem", "()Lru/cyberity/cbr/core/data/model/h$e$a$a;", "setSelectedItem", "(Lru/cyberity/cbr/core/data/model/h$e$a$a;)V", "Landroid/graphics/drawable/Drawable;", "endIcon", "Landroid/graphics/drawable/Drawable;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes9.dex */
public final class CBRApplicantDataSelectionFieldView extends CBRApplicantDataFieldView implements CBRApplicantDataBaseFieldView.Selectable {

    @l
    private Drawable endIcon;

    @k
    private List<h.e.a.C12451a> items;

    @l
    private Y41.l<? super h.e.a.C12451a, G0> onSelectedCallback;

    @l
    private h.e.a.C12451a selectedItem;

    public /* synthetic */ CBRApplicantDataSelectionFieldView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.cbr_applicantDataFieldViewStyle : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m310_init_$lambda0(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }

    private final void showDialog() {
        C47034b c47034b = new C47034b(getContext());
        List<h.e.a.C12451a> list = this.items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((h.e.a.C12451a) it.next()).getLabel());
        }
        c47034b.setItems((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) new c(this, 2)).setCancelable(true).setOnDismissListener((DialogInterface.OnDismissListener) new C(this, 5)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-3, reason: not valid java name */
    public static final void m311showDialog$lambda3(CBRApplicantDataSelectionFieldView cBRApplicantDataSelectionFieldView, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        cBRApplicantDataSelectionFieldView.setValue(cBRApplicantDataSelectionFieldView.items.get(i12).getLabel());
        cBRApplicantDataSelectionFieldView.setSelectedItem(cBRApplicantDataSelectionFieldView.items.get(i12));
        Y41.l<? super h.e.a.C12451a, G0> lVar = cBRApplicantDataSelectionFieldView.onSelectedCallback;
        if (lVar != null) {
            lVar.invoke(cBRApplicantDataSelectionFieldView.items.get(i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-4, reason: not valid java name */
    public static final void m312showDialog$lambda4(CBRApplicantDataSelectionFieldView cBRApplicantDataSelectionFieldView, DialogInterface dialogInterface) {
        EditText editText;
        TextInputLayout inputLayout = cBRApplicantDataSelectionFieldView.getInputLayout();
        if (inputLayout == null || (editText = inputLayout.getEditText()) == null) {
            return;
        }
        editText.clearFocus();
    }

    @k
    public final List<h.e.a.C12451a> getItems() {
        return this.items;
    }

    @l
    public final Y41.l<h.e.a.C12451a, G0> getOnSelectedCallback() {
        return this.onSelectedCallback;
    }

    @l
    public final h.e.a.C12451a getSelectedItem() {
        return this.selectedItem;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView.Selectable
    public void openSelector() {
        if (this.items.isEmpty()) {
            return;
        }
        showDialog();
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

    public final void setItems(@k List<h.e.a.C12451a> list) {
        if (L.f(this.items, list)) {
            return;
        }
        this.items = list;
        if (list.isEmpty()) {
            enableInput();
        } else {
            disableInput();
        }
    }

    public final void setOnSelectedCallback(@l Y41.l<? super h.e.a.C12451a, G0> lVar) {
        this.onSelectedCallback = lVar;
    }

    public final void setSelectedItem(@l h.e.a.C12451a c12451a) {
        String strD;
        this.selectedItem = c12451a;
        if (c12451a == null || (strD = c12451a.getLabel()) == null) {
            strD = "";
        }
        setValue(strD);
    }

    @j
    public CBRApplicantDataSelectionFieldView(@k Context context, @l AttributeSet attributeSet, int i12) {
        EditText editText;
        super(context, attributeSet, i12, 0, 8, null);
        this.items = new ArrayList();
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(@k MotionEvent e12) {
                this.this$0.openSelector();
                return super.onSingleTapUp(e12);
            }
        });
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.setOnTouchListener(new n(gestureDetector, 2));
        }
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        Drawable drawableResolveIcon = themeHelper.resolveIcon(context, CBRIconHandler.CBRCommonIcons.MORE.getImageName());
        this.endIcon = drawableResolveIcon == null ? themeHelper.resolveIcon(context, CBRIconHandler.CBRCommonIcons.DISCLOSURE.getImageName()) : drawableResolveIcon;
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null) {
            inputLayout2.setEndIconDrawable(this.endIcon);
        }
        onInitializationFinished();
    }
}
