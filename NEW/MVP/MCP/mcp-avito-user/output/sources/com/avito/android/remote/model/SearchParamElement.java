package com.avito.android.remote.model;

import Y61.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchParamsFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/SearchParamElement;", "", "<init>", "()V", "", "paramId", "", "isMultiselectParam", "(Ljava/lang/String;)Z", "name", "value", "Lkotlin/G0;", "add", "(Ljava/lang/String;Ljava/lang/String;)V", "", "index", "get", "(I)Ljava/lang/String;", "", "list", "Ljava/util/List;", "<set-?>", "isMultiselect", "Z", "()Z", "", "getAll", "()Ljava/util/List;", ProfileTab.ALL, "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchParamElement {
    private boolean isMultiselect;

    @k
    private final List<String> list = new ArrayList(1);

    private final boolean isMultiselectParam(String paramId) {
        int length = paramId.length();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (paramId.charAt(i14) == '[') {
                i12++;
            }
            if (paramId.charAt(i14) == ']') {
                i13++;
            }
            if (i13 > i12) {
                return false;
            }
        }
        return i12 == i13 && i12 >= 2;
    }

    public final void add(@k String name, @k String value) {
        this.list.add(value);
        boolean z12 = true;
        if (this.list.size() <= 1 && !isMultiselectParam(name)) {
            z12 = false;
        }
        this.isMultiselect = z12;
    }

    @k
    public final String get(int index) {
        return this.list.get(index);
    }

    @k
    public final List<String> getAll() {
        return this.list;
    }

    /* renamed from: isMultiselect, reason: from getter */
    public final boolean getIsMultiselect() {
        return this.isMultiselect;
    }
}
