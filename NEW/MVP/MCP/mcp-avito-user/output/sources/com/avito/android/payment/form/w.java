package com.avito.android.payment.form;

import com.avito.android.remote.model.PretendResult;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/PretendResult;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class w<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final w<T> f214473b = new w<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        return ((PretendResult) obj).getSuccess();
    }
}
