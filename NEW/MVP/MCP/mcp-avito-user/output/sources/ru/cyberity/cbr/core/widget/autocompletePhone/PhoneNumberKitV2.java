package ru.cyberity.cbr.core.widget.autocompletePhone;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout;
import ru.cyberity.cbr.core.widget.CBRTextInputEditText;
import ru.cyberity.cbr.core.widget.PhoneKit;
import ru.cyberity.cbr.core.widget.autocompletePhone.util.ExtensionsKt;
import ru.cyberity.log.a;
import ru.cyberity.log.logger.Logger;

/* compiled from: PhoneNumberKitV2.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004j\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/PhoneNumberKitV2;", "Lru/cyberity/cbr/core/widget/PhoneKit;", "Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "input", "", "", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "countries", "Lru/cyberity/cbr/core/data/model/remote/c;", "Lru/cyberity/cbr/core/data/model/PhoneCountryCodeWithMasks;", "phoneMasks", "Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;", "validListener", "", "initialValue", "<init>", "(Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)V", "number", "", "validate", "(Ljava/lang/CharSequence;)Z", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "country", "isUser", "Lkotlin/G0;", "setCountry", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;Z)V", "Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "<set-?>", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "getCountry", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "mask", "Lru/cyberity/cbr/core/data/model/remote/c;", "getMask", "()Lru/cyberity/cbr/core/data/model/remote/c;", "manuallySelectedCountryKey", "Ljava/lang/String;", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText;", "getEditText", "()Lru/cyberity/cbr/core/widget/CBRTextInputEditText;", "editText", "isValid", "()Z", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class PhoneNumberKitV2 extends PhoneKit {

    @k
    private static final Companion Companion = new Companion(null);

    @l
    private CBRCountryPicker.CountryItem country;

    @l
    private final CBRFlaggedInputLayout input;

    @l
    private String manuallySelectedCountryKey;

    @l
    private c mask;

    /* compiled from: PhoneNumberKitV2.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/PhoneNumberKitV2$Companion;", "", "()V", "MAX_PHONE_LENGTH", "", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PhoneNumberKitV2(CBRFlaggedInputLayout cBRFlaggedInputLayout, Map map, Map map2, ValidationListener validationListener, CharSequence charSequence, int i12, C42822w c42822w) {
        this(cBRFlaggedInputLayout, map, map2, (i12 & 8) != 0 ? null : validationListener, (i12 & 16) != 0 ? null : charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-12, reason: not valid java name */
    public static final void m313_init_$lambda12(List list, final List list2, final PhoneNumberKitV2 phoneNumberKitV2, View view) {
        CBRCountryPicker.pickCountry$default(n0.f432787a.getCountryPicker(), view.getContext(), list, new CBRCountryPicker.CBRCountryPickerCallBack() { // from class: ru.cyberity.cbr.core.widget.autocompletePhone.PhoneNumberKitV2$1$1
            @Override // ru.cyberity.cbr.core.data.listener.CBRCountryPicker.CBRCountryPickerCallBack
            public void onItemSelected(@k CBRCountryPicker.CountryItem item) {
                CBRTextInputEditText.Mask mask;
                Editable text;
                Editable text2;
                c cVar;
                String strC;
                Object next;
                List<CBRTextInputEditText.Mask> list3 = list2;
                String strA0 = null;
                if (list3 != null) {
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Object payload = ((CBRTextInputEditText.Mask) next).getPayload();
                        CBRCountryPicker.CountryItem countryItem = payload instanceof CBRCountryPicker.CountryItem ? (CBRCountryPicker.CountryItem) payload : null;
                        if (L.f(countryItem != null ? countryItem.getCode() : null, item.getCode())) {
                            break;
                        }
                    }
                    mask = (CBRTextInputEditText.Mask) next;
                } else {
                    mask = null;
                }
                int length = 0;
                phoneNumberKitV2.setCountry(item, false);
                Object payload2 = mask != null ? mask.getPayload() : null;
                CBRCountryPicker.CountryItem countryItem2 = payload2 instanceof CBRCountryPicker.CountryItem ? (CBRCountryPicker.CountryItem) payload2 : null;
                if (countryItem2 != null) {
                    PhoneNumberKitV2 phoneNumberKitV22 = phoneNumberKitV2;
                    Map phoneMasks = phoneNumberKitV22.getPhoneMasks();
                    if (phoneMasks != null && (cVar = (c) phoneMasks.get(countryItem2.getCode())) != null && (strC = cVar.c()) != null) {
                        strA0 = C43066x.a0(strC, " ", "", false);
                    }
                    CBRTextInputEditText editText = phoneNumberKitV22.getEditText();
                    if (editText != null && (text2 = editText.getText()) != null) {
                        text2.clear();
                    }
                    phoneNumberKitV22.manuallySelectedCountryKey = item.getCode();
                    CBRTextInputEditText editText2 = phoneNumberKitV22.getEditText();
                    if (editText2 != null) {
                        editText2.setText(strA0);
                    }
                    CBRTextInputEditText editText3 = phoneNumberKitV22.getEditText();
                    if (editText3 != null) {
                        CBRTextInputEditText editText4 = phoneNumberKitV22.getEditText();
                        if (editText4 != null && (text = editText4.getText()) != null) {
                            length = text.length();
                        }
                        editText3.setSelection(length);
                    }
                }
            }
        }, null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CBRTextInputEditText getEditText() {
        CBRFlaggedInputLayout cBRFlaggedInputLayout = this.input;
        EditText editText = cBRFlaggedInputLayout != null ? cBRFlaggedInputLayout.getEditText() : null;
        if (editText instanceof CBRTextInputEditText) {
            return (CBRTextInputEditText) editText;
        }
        return null;
    }

    private final boolean validate(CharSequence number) {
        String string;
        if (number == null || (string = number.toString()) == null) {
            return false;
        }
        return ExtensionsKt.isPhoneDigitCountValid(string);
    }

    @Override // ru.cyberity.cbr.core.widget.PhoneKit
    @l
    public CBRCountryPicker.CountryItem getCountry() {
        return this.country;
    }

    @Override // ru.cyberity.cbr.core.widget.PhoneKit
    @l
    public c getMask() {
        return this.mask;
    }

    @Override // ru.cyberity.cbr.core.widget.PhoneKit
    public boolean isValid() {
        CBRTextInputEditText editText = getEditText();
        boolean zValidate = validate(editText != null ? editText.getRawText() : null);
        if (!zValidate) {
            Logger.v$default(a.f436064a, "CBRPhoneNumberKit", f.l("valid=", zValidate), null, 4, null);
        }
        return zValidate;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    @Override // ru.cyberity.cbr.core.widget.PhoneKit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCountry(@Y61.l ru.cyberity.cbr.core.data.listener.CBRCountryPicker.CountryItem r6, boolean r7) {
        /*
            r5 = this;
            ru.cyberity.cbr.core.widget.CBRTextInputEditText r7 = r5.getEditText()
            r0 = 0
            if (r7 == 0) goto Lc
            android.content.Context r7 = r7.getContext()
            goto Ld
        Lc:
            r7 = r0
        Ld:
            if (r7 != 0) goto L10
            return
        L10:
            if (r6 == 0) goto L2b
            android.graphics.drawable.Drawable r7 = ru.cyberity.cbr.core.data.listener.CBRDefaultCountryPickerKt.getFlagDrawable(r6, r7)
            if (r7 == 0) goto L28
            ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout r1 = r5.input
            if (r1 == 0) goto L28
            ru.cyberity.cbr.core.widget.CBRFlagView r1 = r1.getFlagView()
            if (r1 == 0) goto L28
            r1.setImageDrawable(r7)
            kotlin.G0 r7 = kotlin.G0.f406611a
            goto L29
        L28:
            r7 = r0
        L29:
            if (r7 != 0) goto L4e
        L2b:
            ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout r7 = r5.input
            if (r7 == 0) goto L4e
            ru.cyberity.cbr.core.widget.CBRFlagView r7 = r7.getFlagView()
            if (r7 == 0) goto L4e
            android.content.res.Resources r1 = r7.getResources()
            int r2 = ru.cyberity.cbr.core.R.drawable.cbr_ic_flag_placeholder
            android.content.Context r3 = r7.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            java.lang.ThreadLocal<android.util.TypedValue> r4 = androidx.core.content.res.i.f44673a
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2, r3)
            r7.setImageDrawable(r1)
            kotlin.G0 r7 = kotlin.G0.f406611a
        L4e:
            r5.country = r6
            if (r6 == 0) goto L63
            java.util.Map r7 = r5.getPhoneMasks()
            if (r7 == 0) goto L63
            java.lang.String r6 = r6.getCode()
            java.lang.Object r6 = r7.get(r6)
            r0 = r6
            ru.cyberity.cbr.core.data.model.remote.c r0 = (ru.cyberity.cbr.core.data.model.remote.c) r0
        L63:
            r5.mask = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.widget.autocompletePhone.PhoneNumberKitV2.setCountry(ru.cyberity.cbr.core.data.listener.CBRCountryPicker$CountryItem, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PhoneNumberKitV2(@Y61.l ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout r25, @Y61.l java.util.Map<java.lang.String, java.lang.String> r26, @Y61.l java.util.Map<java.lang.String, ru.cyberity.cbr.core.data.model.remote.c> r27, @Y61.l final ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener r28, @Y61.l java.lang.CharSequence r29) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.widget.autocompletePhone.PhoneNumberKitV2.<init>(ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout, java.util.Map, java.util.Map, ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener, java.lang.CharSequence):void");
    }
}
