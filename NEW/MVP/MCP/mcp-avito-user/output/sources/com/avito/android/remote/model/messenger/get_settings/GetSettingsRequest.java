package com.avito.android.remote.model.messenger.get_settings;

import Y61.k;
import Y61.l;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetSettingsRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0007R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/messenger/get_settings/GetSettingsRequest;", "", LocalPublishState.FIELDS, "", "", "getFields", "()Ljava/util/List;", "ForAutoReplies", "Lcom/avito/android/remote/model/messenger/get_settings/GetSettingsRequest$ForAutoReplies;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface GetSettingsRequest {

    /* compiled from: GetSettingsRequest.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/messenger/get_settings/GetSettingsRequest$ForAutoReplies;", "Lcom/avito/android/remote/model/messenger/get_settings/GetSettingsRequest;", "()V", LocalPublishState.FIELDS, "", "", "getFields", "()Ljava/util/List;", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForAutoReplies implements GetSettingsRequest {

        @k
        public static final ForAutoReplies INSTANCE = new ForAutoReplies();

        @k
        private static final List<String> fields = Collections.singletonList(GetSettingsResponse.AUTO_REPLIES_URL);

        private ForAutoReplies() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof ForAutoReplies);
        }

        @Override // com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest
        @k
        public List<String> getFields() {
            return fields;
        }

        public int hashCode() {
            return -1735371261;
        }

        @k
        public String toString() {
            return "ForAutoReplies";
        }
    }

    @k
    List<String> getFields();
}
