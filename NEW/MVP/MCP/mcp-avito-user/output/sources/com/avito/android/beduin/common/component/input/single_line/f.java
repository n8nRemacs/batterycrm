package com.avito.android.beduin.common.component.input.single_line;

import Y41.l;
import android.text.InputFilter;
import com.avito.android.beduin.common.component.input.single_line.i;
import com.avito.android.beduin.common.utils.w;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.o;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SingleLineInputComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/Input;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/input/Input;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements l<Input, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f101586l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.input.g f101587m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, com.avito.android.beduin.common.component.input.g gVar) {
        super(1);
        this.f101586l = hVar;
        this.f101587m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Input input) {
        FormatterType formatterType;
        FormatterType formatterTypeC;
        Input input2 = input;
        h hVar = this.f101586l;
        BeduinFormatterType formatter = hVar.f101593g.getFormatter();
        SingleLineInputModel singleLineInputModel = hVar.f101593g;
        if (formatter != null) {
            switch (i.a.f101595b[singleLineInputModel.getFormatter().ordinal()]) {
                case 1:
                    FormatterType.f179288e.getClass();
                    formatterTypeC = FormatterType.a.c();
                    break;
                case 2:
                    FormatterType.f179288e.getClass();
                    formatterTypeC = FormatterType.f179290g;
                    break;
                case 3:
                    FormatterType.f179288e.getClass();
                    formatterTypeC = FormatterType.a.d();
                    break;
                case 4:
                    FormatterType.f179288e.getClass();
                    formatterTypeC = FormatterType.f179289f;
                    break;
                case 5:
                    FormatterType.f179288e.getClass();
                    formatterTypeC = FormatterType.a.b();
                    break;
                case 6:
                    FormatterType.f179288e.getClass();
                    formatterTypeC = FormatterType.f179291h;
                    break;
                case 7:
                    FormatterType.f179288e.getClass();
                    formatterTypeC = FormatterType.f179292i;
                    break;
                case 8:
                    FormatterType.f179288e.getClass();
                    formatterTypeC = FormatterType.f179295l;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            input2.setFormatterType(formatterTypeC);
        } else {
            KeyboardType keyboard = singleLineInputModel.getKeyboard();
            int i12 = keyboard == null ? -1 : i.a.f101594a[keyboard.ordinal()];
            if (i12 == 1) {
                FormatterType.f179288e.getClass();
                formatterType = FormatterType.f179292i;
            } else if (i12 == 2) {
                FormatterType.f179288e.getClass();
                formatterType = FormatterType.f179290g;
            } else if (i12 != 3) {
                FormatterType.f179288e.getClass();
                formatterType = FormatterType.f179289f;
            } else {
                FormatterType.f179288e.getClass();
                formatterType = FormatterType.f179289f;
            }
            input2.setFormatterType(formatterType);
        }
        Boolean allCaps = singleLineInputModel.getAllCaps();
        com.avito.android.beduin.common.component.input.g gVar = this.f101587m;
        gVar.getClass();
        boolean zF2 = L.f(allCaps, Boolean.TRUE);
        Input input3 = gVar.f101549c;
        if (zF2) {
            input3.a(new InputFilter.AllCaps());
        } else {
            InputFilter[] filters = input3.getFilters();
            ArrayList arrayList = new ArrayList();
            for (InputFilter inputFilter : filters) {
                if (!(inputFilter instanceof InputFilter.AllCaps)) {
                    arrayList.add(inputFilter);
                }
            }
            input3.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
        if (L.f(singleLineInputModel.getOnlyLettersAndNumbers(), Boolean.TRUE)) {
            input3.a(new o.b());
        } else {
            InputFilter[] filters2 = input3.getFilters();
            ArrayList arrayList2 = new ArrayList();
            for (InputFilter inputFilter2 : filters2) {
                if (!(inputFilter2 instanceof o.b)) {
                    arrayList2.add(inputFilter2);
                }
            }
            input3.setFilters((InputFilter[]) arrayList2.toArray(new InputFilter[0]));
        }
        Integer maxLength = singleLineInputModel.getMaxLength();
        input3.setMaxLength(maxLength != null ? maxLength.intValue() : Integer.MAX_VALUE);
        Input.t(input2, singleLineInputModel.getText(), false, 6);
        input2.setHint(singleLineInputModel.getPlaceholder());
        Boolean boolIsEnabled = singleLineInputModel.isEnabled();
        input2.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        w.a(gVar);
        return G0.f406611a;
    }
}
