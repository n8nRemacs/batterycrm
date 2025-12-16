package com.avito.android.mortgage.person_form.mvi.mapper;

import Y41.l;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PersonFormDomainToUiMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLZ/c;", "it", "", "invoke", "(LLZ/c;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<LZ.c, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f201272l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(LZ.c cVar) {
        com.avito.android.mortgage.api.model.items.form.d dVar = cVar.f9996b;
        SuggestFormContentItemValue suggestFormContentItemValue = dVar instanceof SuggestFormContentItemValue ? (SuggestFormContentItemValue) dVar : null;
        boolean z12 = false;
        if (suggestFormContentItemValue != null && suggestFormContentItemValue.getIsDisclosed()) {
            z12 = true;
        }
        return Boolean.valueOf(!z12);
    }
}
