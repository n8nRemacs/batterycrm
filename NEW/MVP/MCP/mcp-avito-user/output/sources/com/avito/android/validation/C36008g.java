package com.avito.android.validation;

import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import kotlin.Metadata;

/* compiled from: CategoryParameterStringValueConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36008g extends kotlin.jvm.internal.N implements Y41.l<SectionedMultiselectParameter.Value, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final C36008g f319375l = new C36008g();

    public C36008g() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(SectionedMultiselectParameter.Value value) {
        String f156312c = value.getF156312c();
        return f156312c != null ? f156312c : "";
    }
}
