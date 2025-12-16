package com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapter", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapterFactory implements r {

    /* compiled from: CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapterFactory$CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a$a;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapter extends TypeAdapter<a.C6414a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<DeepLink> f213918a;

        public CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapter(@k TypeAdapter<DeepLink> typeAdapter) {
            this.f213918a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.C6414a read(com.google.gson.stream.a aVar) {
            return new a.C6414a(this.f213918a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a.C6414a c6414a) {
            DeepLink nextStepLink = c6414a.getNextStepLink();
            if (nextStepLink == null) {
                return;
            }
            this.f213918a.write(cVar, nextStepLink);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.C6414a.class)) {
            return new CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapter(gson.g(DeepLink.class));
        }
        return null;
    }
}
