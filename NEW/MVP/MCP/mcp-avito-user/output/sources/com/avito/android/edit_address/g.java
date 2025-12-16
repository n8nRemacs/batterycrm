package com.avito.android.edit_address;

import com.avito.android.remote.model.extended.modification.ModificationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditAddressInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "Lcom/avito/android/remote/model/extended/modification/ModificationResult$IncorrectValues$FieldError;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class g extends N implements Y41.l<ModificationResult.IncorrectValues.FieldError, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f145933l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(ModificationResult.IncorrectValues.FieldError fieldError) {
        return fieldError.getMessage();
    }
}
