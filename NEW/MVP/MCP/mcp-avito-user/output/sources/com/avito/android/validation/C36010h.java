package com.avito.android.validation;

import com.avito.android.remote.model.District;
import kotlin.Metadata;

/* compiled from: CategoryParameterStringValueConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/District;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36010h extends kotlin.jvm.internal.N implements Y41.l<District, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final C36010h f319378l = new C36010h();

    public C36010h() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(District district) {
        return district.getTitle();
    }
}
