package Ht0;

import Y61.l;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.BeduinV2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2BookingFormResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LHt0/c;", "", "Lcom/avito/android/remote/model/BeduinV2;", "content", "", "", LocalPublishState.FIELDS, "<init>", "(Lcom/avito/android/remote/model/BeduinV2;Ljava/util/List;)V", "Lcom/avito/android/remote/model/BeduinV2;", "a", "()Lcom/avito/android/remote/model/BeduinV2;", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    @com.google.gson.annotations.c("content")
    @l
    private final BeduinV2 content;

    @com.google.gson.annotations.c(LocalPublishState.FIELDS)
    @l
    private final List<String> fields;

    public c(@l BeduinV2 beduinV2, @l List<String> list) {
        this.content = beduinV2;
        this.fields = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final BeduinV2 getContent() {
        return this.content;
    }
}
