package com.avito.android.publish.slots.imv;

import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import kotlin.Metadata;
import l41.r;

/* compiled from: InstantMarketValueSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "kotlin.jvm.PlatformType", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class e<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final e<T> f244263b = new e<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        return ((EditableParameter) obj) instanceof TextParameter;
    }
}
