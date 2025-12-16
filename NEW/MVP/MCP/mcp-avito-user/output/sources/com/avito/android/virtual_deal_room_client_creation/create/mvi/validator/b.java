package com.avito.android.virtual_deal_room_client_creation.create.mvi.validator;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C5;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: CreateValidator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/validator/b;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/validator/a;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a
    @k
    public final QN0.a a(@k String str) {
        C43059p c43059p = C5.f318568b;
        boolean z12 = !c43059p.e(str);
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.virtual_deal_room_client_creation_client_create_fill_field, new Serializable[0]);
        if (c43059p.e(str)) {
            printableTextC = null;
        }
        return new QN0.a(printableTextC, str, z12);
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a
    public final boolean b(@k String str, @k String str2, @k String str3) {
        return (C43066x.K(str) || C43066x.K(str2) || !C5.f318568b.e(str3)) ? false : true;
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a
    @k
    public final QN0.a c(@k String str, boolean z12) {
        boolean zK2 = C43066x.K(str);
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.virtual_deal_room_client_creation_client_create_fill_field, new Serializable[0]);
        if (!C43066x.K(str) && z12) {
            printableTextC = null;
        }
        return new QN0.a(printableTextC, str, zK2);
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a
    @k
    public final QN0.a d(@k String str) {
        return new QN0.a(str, C43066x.K(str), null, 4, null);
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a
    @k
    public final QN0.a e(@k String str) {
        return new QN0.a(com.avito.android.printable_text.b.c(R.string.virtual_deal_room_client_creation_client_create_client_exists, new Serializable[0]), str, false);
    }
}
