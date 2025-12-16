package com.avito.android.str_seller_orders_important_to_note.domain;

import com.avito.android.str_seller_orders_important_to_note.generated.api.api_1_str_seller_orders_important_to_note_post.BookingButtonV3;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Api1StrSellerOrdersImportantToNotePostResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-seller-orders-important-to-note_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: Api1StrSellerOrdersImportantToNotePostResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders_important_to_note.domain.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8818a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f291306a;

        static {
            int[] iArr = new int[BookingButtonV3.Preset.values().length];
            try {
                iArr[BookingButtonV3.Preset.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingButtonV3.Preset.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f291306a = iArr;
        }
    }

    @Y61.k
    public static final h a(@Y61.k Zz0.j jVar) {
        i iVar;
        Long id2 = jVar.getId();
        Zz0.k parameters = jVar.getParameters();
        if (parameters != null) {
            iVar = new i(parameters.getIid(), parameters.getActionType(), parameters.getFrom(), parameters.getFromPage(), parameters.getOrderidString(), parameters.getType());
        } else {
            iVar = null;
        }
        return new h(id2, iVar, jVar.getVersion());
    }
}
