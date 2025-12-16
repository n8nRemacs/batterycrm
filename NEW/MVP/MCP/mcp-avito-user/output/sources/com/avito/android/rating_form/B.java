package com.avito.android.rating_form;

import android.content.Intent;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_rating-form_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B {
    @Y61.k
    public static final Intent a(@Y61.l ToastInfo toastInfo, @Y61.l String str, boolean z12) {
        Intent intent = new Intent();
        intent.putExtra("key_toast_info", toastInfo);
        intent.putExtra("key_published_rating_user_key", str);
        intent.putExtra("key_need_to_reload", z12);
        return intent;
    }

    @Y61.k
    public static final String b(int i12, @Y61.k StepIdentifier stepIdentifier) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append('_');
        sb2.append(stepIdentifier);
        return sb2.toString();
    }

    public static final boolean c(@Y61.k List<? extends RatingFormAddValueType.RatingFormItem> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof RatingFormField) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((RatingFormField) it.next()).getViewType() == RatingFormField.ViewType.SCORE) {
                return true;
            }
        }
        return false;
    }
}
