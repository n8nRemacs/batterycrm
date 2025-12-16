package com.avito.android.publish.slots;

import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishSlotBadResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/PublishSlotBadResponse;", "Lcom/avito/android/remote/error/ApiError$Custom;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishSlotBadResponse extends ApiError.Custom {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PrintableText f242774c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final PrintableText f242775d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SlotType f242776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishSlotBadResponse(PrintableText printableText, PrintableText printableText2, SlotType slotType, int i12, C42822w c42822w) {
        super(null, 1, null);
        printableText2 = (i12 & 2) != 0 ? null : printableText2;
        this.f242774c = printableText;
        this.f242775d = printableText2;
        this.f242776e = slotType;
    }
}
