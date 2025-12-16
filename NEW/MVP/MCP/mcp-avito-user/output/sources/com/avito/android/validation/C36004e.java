package com.avito.android.validation;

import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: CategoryParameterStringValueConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36004e extends kotlin.jvm.internal.N implements Y41.l<SectionedMultiselectParameter.Value, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<String> f319358l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36004e(Set<String> set) {
        super(1);
        this.f319358l = set;
    }

    @Override // Y41.l
    public final Boolean invoke(SectionedMultiselectParameter.Value value) {
        return Boolean.valueOf(this.f319358l.contains(value.getId()));
    }
}
