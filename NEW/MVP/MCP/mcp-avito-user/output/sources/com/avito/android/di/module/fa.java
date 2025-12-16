package com.avito.android.di.module;

import com.avito.android.remote.model.common.items.VerificationListItem;
import com.avito.android.remote.model.inn.formatter.VerificationFormatter;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.inn.validation.VerificationValidation;
import com.avito.android.remote.parse.adapter.StatusListItemTypeAdapter;
import com.avito.android.remote.parse.adapter.VerificationFormatterTypeAdapter;
import com.avito.android.remote.parse.adapter.VerificationInnItemTypeAdapter;
import com.avito.android.remote.parse.adapter.VerificationValidationTypeAdapter;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: VerificationJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/module/fa;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class fa implements dagger.internal.h<Set<com.avito.android.util.X5>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final fa f144295a = new fa();

    @Override // javax.inject.Provider
    public final Object get() {
        da.f144275a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new com.avito.android.util.X5(VerificationListItem.class, new StatusListItemTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(VerificationInnItem.class, new VerificationInnItemTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(VerificationValidation.class, new VerificationValidationTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(VerificationFormatter.class, new VerificationFormatterTypeAdapter()));
        return linkedHashSet;
    }
}
