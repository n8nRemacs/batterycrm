package com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckAccountsMergeabilityApiV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a;", "", "a", "b", "Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a$a;", "Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a$b;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: CheckAccountsMergeabilityApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a$a;", "Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "nextStepLink", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6414a implements a {

        @c("nextStepLink")
        @k
        private final DeepLink nextStepLink;

        public C6414a(@k DeepLink deepLink) {
            this.nextStepLink = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getNextStepLink() {
            return this.nextStepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6414a) && L.f(this.nextStepLink, ((C6414a) obj).nextStepLink);
        }

        public final int hashCode() {
            return this.nextStepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NextStepLink(nextStepLink="), this.nextStepLink, ')');
        }
    }

    /* compiled from: CheckAccountsMergeabilityApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a$b;", "Lcom/avito/android/passport_lib/generated/api/check_accounts_mergeability_api_v_3/a;", "", "emptyBool", "<init>", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getEmptyBool", "()Ljava/lang/Boolean;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        @c("emptyBool")
        @l
        private final Boolean emptyBool;

        public b(@l Boolean bool) {
            this.emptyBool = bool;
        }
    }
}
